package tests.day10_TestNG;

import Utilies.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C02_SoftAssert extends TestBase {
    @Test
    public void amazonTest(){
/*
            TestNG bir method'da birden fazla assertion oldugunda
            tum assertion'lari tek seferde raporlama icin
            bize SoftAssert class'indan method'lar sunmustur.

            SoftAssert ile assertion'lari yapmak icin
            1- softAssert objesi olustur
            2- istenilen tum assertion'lari yap
            3- tum assertion'lar bittikten sonra, sonucu raporlatmak icin sotfAssert.assertAll() kullan
*/

        //amazon ana sayfaya gidin
        //url'in amazon iceridigini test edin

        driver.get("https://www.amazon.com");
        String expectedUrlIcerik="https://www.amazon.com/";
        String actualUrl=driver.getCurrentUrl();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualUrl,expectedUrlIcerik,"url sonucu");
        //Nutella icin arama yapin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //arama sonucunun Nutella icersigini test edin

        WebElement aramaSonucElementi= driver.findElement(By.xpath("//*[@class='a-size-base s-desktop-toolbar a-text-normal']"));;
        String expectedIcerik="Nutella";
        String actualAramaSonucu=aramaSonucElementi.getText();

        softAssert.assertTrue(actualAramaSonucu.contains(expectedIcerik),"nutella arama");


        //ilk urune tiklayin
        driver.findElement(By.xpath("(//*[@class='a-section aok-relative s-image-square-aspect'])[1]")).click();

        // ilk urun isminin Nutella icerdigini test edin
        WebElement ilkUrunIsimElementi= driver.findElement(By.xpath("//span[@id='productTitle']"));
        String expectedUrun="Nutella";
        String actualIlkUrun=ilkUrunIsimElementi.getText();
        softAssert.assertTrue(actualIlkUrun.contains(expectedUrun),"ilk urun isim");

        softAssert.assertAll();

        System.out.println("faild olan assertion olursa bu satir calismaz");
/*
            SoftAssert birden fazla assertion failed olsa da calismaya devam etmesi icin kullanilir
            biz assertAll() kullanincaya kadar, buldugu hatalari kendisi not eder, calismayi durdurmaz

            assertAll() satirina geldiginde tum assertion sonuclarini rapor eder
            ve failed olan assertion varsa assertAll() calistiginda kodun calismasi durur
            ve tum failed olan assertion'lar raporlanir

            assertion'lardan sonra assertAll() yazilmazsa
            failed olan assertion'lar olsa da test passed olur

         */

    }
}
