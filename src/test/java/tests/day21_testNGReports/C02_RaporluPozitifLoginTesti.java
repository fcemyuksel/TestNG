package tests.day21_testNGReports;

import Pages.TestOtomasyonuPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C02_RaporluPozitifLoginTesti extends TestBaseRapor {
    @Test
    public void pozifirLoginTesti() throws InterruptedException {
        extentTest=extentReports.createTest("pozitif login testi","Kullanici Gecerli Bilgilerle Login Olabilmeli");
        //1- htps://www.testotomasyonu.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("kullanici testotomasyonu anasayfaya gider");
        //2- account linkine tiklayin
        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
        testOtomasyonuPage.accountLinki.click();
        extentTest.info("account linkine basar");
        //3- kullanici emaili olarak gecerli email girin
        testOtomasyonuPage.signInEmailKutusu.sendKeys(ConfigReader.getProperty("toGecerliEmail"));
        extentTest.info("gecerli email girer");
        //4- kullanici sifresi olarak gecerli password girin
        testOtomasyonuPage.signInPasswordKutusu.sendKeys(ConfigReader.getProperty("toGecerliPassword"));
        extentTest.info("gecerli password girer");
        //5- sign in tusuna basarak login olun
        testOtomasyonuPage.signInFormuSubmitButonu.submit();
        extentTest.info("sign in tusuna basarak login olur");
        //6- Basarili olarak giris yapildigini test edin
        ReusableMethods.bekle(2);

        Assert.assertTrue(testOtomasyonuPage.logoutButonu.isDisplayed());
        extentTest.pass("Basarili olarak giris yapildigini test eder");
        //7- sayfayi kapatin

        Driver.closeDriver();


    }
}

