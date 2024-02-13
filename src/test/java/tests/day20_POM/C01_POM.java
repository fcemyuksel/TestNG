package tests.day20_POM;

import Pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_POM {

    @Test
    public void test01(){

        // driver class'indaki Driver methodu private oldugu icin
        // bunu kullanamayiz ==>  Driver driver=new Driver();

        // testotomasyonu ana sayfaya gidin

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        //dress icin arama yapin
        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
        testOtomasyonuPage.aramaKutusu.sendKeys("dress"+ Keys.ENTER);

        // arama sonucunda urun bulunabildigini test edin
        int bulunanUrunSayisi=testOtomasyonuPage.bulunanUrunlerListesi.size();
        Assert.assertTrue(bulunanUrunSayisi>0);
        // sayfayi kapatin
        Driver.closeDriver();
    }
}
