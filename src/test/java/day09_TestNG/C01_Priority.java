package day09_TestNG;

import Utilies.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_Priority extends TestBase {

//testNG'de birden fazla method varsa isim sirasina gore calisir.
    @Test(priority = -23)
    public void amazonTest(){
        driver.get("https://www.amazon.com");
        String expectedUrlIcerik="amazon";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));
    }
    @Test
    public void youtubeTest(){
        driver.get("https://www.youtube.com");
        String expectedUrlIcerik="youtube";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));
    }

    @Test
    public void facebookTest(){
        driver.get("https://www.facebook.com");
        String expectedUrlIcerik="facebook";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));


    }
}