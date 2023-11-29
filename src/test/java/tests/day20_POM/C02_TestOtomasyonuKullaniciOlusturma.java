package tests.day20_POM;

import Pages.TestOtomasyonuPage;
import Utilies.ConfigReader;
import Utilies.Driver;
import Utilies.ReusableMethods;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v115.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class C02_TestOtomasyonuKullaniciOlusturma {
    @Test
    public void kullaniciOlusturmaTesti() throws InterruptedException {

        //1- htps://www.testotomasyonu.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        //2- account linkine tiklayin
        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
        testOtomasyonuPage.accountLinki.click();
        //3- signup linkine tiklayin
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        testOtomasyonuPage.signUpLinki.click();
        //4- ilgili alanlari doldurarak signup tusuna basin

        Faker faker=new Faker();
        testOtomasyonuPage.signUpFirstnameKutusu.click();

        actions .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("toGecerliEmail"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("toGecerliPassword"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("toGecerliPassword"))
                .sendKeys(Keys.TAB)
                .perform();
        ReusableMethods.bekle(2);
        testOtomasyonuPage.signUpFormuSubmit.click();


        ReusableMethods.bekle(2);

    }
}
