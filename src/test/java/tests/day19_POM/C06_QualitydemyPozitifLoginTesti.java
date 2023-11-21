package tests.day19_POM;

import Pages.QualitydemyPage;
import Utilies.ConfigReader;
import Utilies.Driver;
import Utilies.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C06_QualitydemyPozitifLoginTesti {
    @Test
    public void pozitifLoginTesti() throws InterruptedException {

        // 1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        // 2- login linkine basin
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginButonu.click();

        qualitydemyPage.cockieElementi.click();

        // 3- Kullanici email'i olarak valid email girin
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliEmail"));

        // 4- Kullanici sifresi olarak valid sifre girin
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        qualitydemyPage.cockieElementi.click();
        // 5- Login butonuna basarak login olun
        qualitydemyPage.loginButonu.click();

        // 6- Basarili olarak giris yapilabildigini test edin
        Assert.assertTrue(qualitydemyPage.basariliGirisKontrolElementi.isDisplayed());

        ReusableMethods.bekle(2);
        Driver.closeDriver();


    }
}
