package tests.day19_POM;

import Pages.TestOtomasyonuPage;
import Utilies.ConfigReader;
import Utilies.Driver;
import Utilies.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C05_ConfigReaderKullanimi {
    @Test
    public void test01() throws InterruptedException {

        // testotomasyonu.com sayfasina gidin

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        //belirlenmiş aranacak kelime icin arama yapin
        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
        testOtomasyonuPage.aramaKutusu.sendKeys(ConfigReader.getProperty("toAranacakKelime")+ Keys.ENTER);

        //arama islemi sonucunda urun goruntulendigini test edin
        //bu test icin bulunan urunleri bir listeye kaydettik
        //listenin bos olmadigini test ediyoruz

        Assert.assertTrue(testOtomasyonuPage.bulunanUrunlerListesi.size()>0,"aranan urun bulunamadi");

        //sayfayi kapatin

        ReusableMethods.bekle(2);
        Driver.closeDriver();

    }
}
