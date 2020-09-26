package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DaydemLogin {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        //Locate Username field
        driver.findElement(By.id("username")).sendKeys("davorigaga");
        //Locate password field
        driver.findElement(By.id("password")).sendKeys("PASSWORD");
        //Click on the Sign in button
//        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();

    }
    //Close the browser after
    public static void main(String args[]){
        DaydemLogin test = new DaydemLogin();
        test.setUp();
    }
}
