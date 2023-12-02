package tests.day21_testNGReports;

import Pages.TestOtomasyonuPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C01_RaporluIlkTest extends TestBaseRapor{
    /*
       TestNG kendisi raporlama yapamaz
       Avenstack dependency kullanilarak rapor olusturulabilir

       Bunun icin
       1- rapor istedigimiz class'i TestBaseRapor'a extends etmeliyiz
       2- TestBaseRapor'da @BeforeTest bizim rapor olusturabilmemiz icin
          ihtiyac duyduumuz 3 objeyi olusturup
          extentRapor ve extentHtmlReporter objelerine deger atamasi yapar
          eksik kalan extenTest objesine her test method'unun basinda biz atama yapmaliyiz
       3- Test icerisinde raporda cikmasini istedigimiz tum adimlar icin
          extentTest objesi ile bilgi veya test sonucu yazdirin
    */
    @Test
    public void aramaTesti(){
        extentTest=extentReports.createTest("arama testi","kullanicinin aradigi urun stokta olmali");
        // testotomasyon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("kullanici testotomasyunu anasayfaya gider");
        // arama kutusuna phone yazip aratin
        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
        testOtomasyonuPage.aramaKutusu.sendKeys("phone"+ Keys.ENTER);
        extentTest.info("arama kutusuna phone yazip aratir");
        ReusableMethods.bekle(2);
        // arama sonucunda urun bulunabildigini test edin
        int sonucSayisi=  testOtomasyonuPage.bulunanUrunlerListesi.size();
        Assert.assertTrue(sonucSayisi>0);
        extentTest.pass("arama sonucunda urun bulunabidigini tets eder");
        // sayfayi kapatin
        ReusableMethods.bekle(2);
        Driver.closeDriver();
    }
}
