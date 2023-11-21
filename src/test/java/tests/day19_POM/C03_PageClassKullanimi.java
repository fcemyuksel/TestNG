package tests.day19_POM;

import Pages.TestOtomasyonuPage;
import Utilies.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_PageClassKullanimi {
    @Test
    public void test01(){
        //test otomasyonu ana sayfaya gidin
        Driver.getDriver().get("https://www.testotomasyonu.com");

        //electronics linkine tiklayin
        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
        testOtomasyonuPage.electronicsLinki.click();

        // sol tarafta cikan kategori listesinde 8 kategori bulundugunu test edin
        int expectedKategoriSayisi=8;
        int actualKategoriSayisi=testOtomasyonuPage.kategoriElementList.size();

        Assert.assertEquals(actualKategoriSayisi,expectedKategoriSayisi);

        //sayfayi kapatin

        Driver.closeDriver();


    }
}
