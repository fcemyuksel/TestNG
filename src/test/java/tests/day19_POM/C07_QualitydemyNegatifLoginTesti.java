package tests.day19_POM;

import Pages.QualitydemyPage;
import Utilies.ConfigReader;
import Utilies.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C07_QualitydemyNegatifLoginTesti {
    // 1- https://www.qualitydemy.com/ anasayfasina gidin
    // 2- login linkine basin
    // 3- 3 farkli test methodu olusturun
    // - gecerli username, gecersiz password
    // - gecersiz username, gecerli password
    // - gecersiz username, gecersiz password
    //4- Login butonuna basarak login olun
    //5- Basarili olarak giris yapilamadigini test edin

    @Test
    public void yanlisKullaniciAdiTEsti(){

        // 1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        // 2- login linkine basin
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginButonu.click();
        // 3- 3 farkli test methodu olusturun
        // - gecerli username, gecersiz password
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliEmail"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));

        //4- Login butonuna basarak login olun
        qualitydemyPage.ilkLoginButonu.click();
        //5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());

        Driver.closeDriver();

    }

    @Test
    public void gecersizUserNameTesti(){

        // 1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        // 2- login linkine basin
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginButonu.click();
        // 3- 3 farkli test methodu olusturun
        // - gecersiz username, gecerli password
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizEmail"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        //4- Login butonuna basarak login olun
        qualitydemyPage.ilkLoginButonu.click();
        //5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void gecersizUserNameGecersizPasswordTesti(){

        // 1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        // 2- login linkine basin
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginButonu.click();
        // 3- 3 farkli test methodu olusturun
        // - gecersiz username, gecerli password
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizEmail"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));

        //4- Login butonuna basarak login olun
        qualitydemyPage.ilkLoginButonu.click();
        //5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());

        Driver.closeDriver();
    }
}

