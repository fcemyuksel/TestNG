package day09_TestNG;

import Utilies.TestBase;
import Utilies.TestBase_BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_DependsOnMethods extends TestBase_BeforeClass {
    @Test(priority = 1)
    public void amazonTest() {
// amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        // url'in amazon icerdigini test edin ve screenshot alin
        String expectedUrlIcerik="amazon";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));

    }

    @Test(dependsOnMethods = "amazonTest")
    public void NutellaTest() {
        // Nutella icin arama yapin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        // ilk urune tiklayin
        driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")).click();
        // urun isminin Nutella icerdigini test edin ve screenshot alin
        WebElement sonucYaziElementi=driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String expectedIcerik="Nutella";
        String actualSonucYazisi=sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

    }

    @Test(dependsOnMethods = "nutellaTest")
    public void ilkUrunTest() {
        driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-square-aspect'])[1]"))
                .click();
// urun isminin Nutella icerdigini test edin ve screenshot alin

        WebElement urunIsmiElementi= driver.findElement(By.xpath("//h1[@id='title']"));

        String expectedUrunIcerik="Nutella";
        String actualUrunIsmi=urunIsmiElementi.getText();

        Assert.assertTrue(actualUrunIsmi.contains(expectedUrunIcerik));


    }
}