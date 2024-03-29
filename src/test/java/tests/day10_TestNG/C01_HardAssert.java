package tests.day10_TestNG;

import utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_HardAssert extends TestBase {
    @Test(groups = {"smoke","regresyon","e2e2"})
    public void amazonTest(){
/*
            TestNG JUnit'deki assertion method'larinin tamamina sahiptir
            sadece sirala JUnit'den farklidir

            Assert class'indan method'lar kullanarak yaptigimiz assertion'larda
            failed olan ilk assertion'da class'in calismasi durur
            kod hata verir.

            siz o hatayi duzelttikten sonra yeniden calistirirsaniz
            sonraki hatalari bulabilirsiniz
         */

        //amazon ana sayfaya gidin
        driver.get("https://www.amazon.com");
        //url'in "https://www.amazon.com/" oldugunu test edin
        String expectedUrl="https://www.amazon.com/";
        String actualUrl=driver.getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);
        //Nutella icin arama yapin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //arama sonucunun Nutella icerdigini test edin
        WebElement aramaSonucElementi= driver.findElement(By.xpath("//*[@class='a-size-base s-desktop-toolbar a-text-normal']"));;
        String expectedIcerik="Nutella";
        String actualAramaSonucu=aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));

        //ilk urune tiklayin
        driver.findElement(By.xpath("(//*[@class='a-section aok-relative s-image-square-aspect'])[1]")).click();

        // ilk urun isminin Nutella icerdigini test edin

        WebElement ilkUrunIsimElementi= driver.findElement(By.xpath("//span[@id='productTitle']"));
        String expectedUrun="Nutella";
        String actualIlkUrun=ilkUrunIsimElementi.getText();
        Assert.assertTrue(actualIlkUrun.contains(expectedUrun));

        //hard assert
    }
}
