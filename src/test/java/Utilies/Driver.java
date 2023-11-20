package Utilies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    static WebDriver driver;

    public static WebDriver getDriver(){

        WebDriverManager.chromedriver().setup();

        if (driver==null) {
            driver = new ChromeDriver();
        }else {
            //hicbir sey yapma
            //var olan driver ile devam etme
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;
    }

    public static void closeDriver(){
        driver.close();
        driver=null;
    }
}
