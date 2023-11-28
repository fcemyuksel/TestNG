package tests.day20_POM;

import Pages.TestOtomasyonuPage;
import Utilies.ConfigReader;
import Utilies.Driver;
import Utilies.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_PozitifLoginTesti {
    @Test
    public void pozifirLoginTesti() throws InterruptedException {

        //1- htps://www.testotomasyonu.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        //2- account linkine tiklayin
        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
        testOtomasyonuPage.accountLinki.click();
        //3- kullanici emaili olarak gecerli email girin
        testOtomasyonuPage.signInEmailKutusu.sendKeys(ConfigReader.getProperty("toGecerliEmail"));
        //4- kullanici sifresi olarak gecerli password girin
        testOtomasyonuPage.signInPasswordKutusu.sendKeys(ConfigReader.getProperty("toGecerliPassword"));
        //5- sign in tusuna basarak login olun
        testOtomasyonuPage.signInFormuSubmitButonu.submit();
        //6- Basarili olarak giris yapildigini test edin
        ReusableMethods.bekle(2);

        Assert.assertTrue(testOtomasyonuPage.logoutButonu.isDisplayed());

        //7- sayfayi kapatin

        Driver.closeDriver();


    }
}
