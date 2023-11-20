package tests.day19_POM;

import Utilies.Driver;
import Utilies.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;

public class C02_DriverClassIlkTest {
    @Test
    public void test01() throws InterruptedException {

        // testotomasyonu.com anasayfaya gidin
        Driver.getDriver().get("https://testotomasyonu.com/");

        // arama kutusuna phone yazip aratin
        WebElement aramaKutusu=Driver.getDriver().findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone"+ Keys.ENTER);

        // arama sonucunda gelen urunlerden ilkine tiklayin
        Driver.getDriver()
                .findElement(By.xpath("(//div[@class='product-box my-2  py-1'])[1]")).click();

        // urun isim detayinda phone gectigini test edin
        WebElement urunAciklamaElementi = Driver.getDriver()
                .findElement(By.xpath("//div[@class='product-short-desc  my-2']"));

        String urunAciklemasi=urunAciklamaElementi.getText().toLowerCase();

        Assert.assertTrue(urunAciklemasi.contains("phone"));

        ReusableMethods.bekle(2);

        Driver.closeDriver();


    }
}
