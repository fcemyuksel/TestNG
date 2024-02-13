package tests.denemeler;

import Pages.MigrosPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static utilities.TestBase_BeforeClass.driver;


public class Migros01 {
    private double alisverisLimiti;
    private double sepettekiToplamTutar;

    @Test
    public void migrosAlisverisTest() {
        // Kullanıcının Migros sitesine gitme işlemi
        Driver.getDriver().get(ConfigReader.getProperty("migrosUrl"));
        MigrosPage migrosPage=new MigrosPage();
        ReusableMethods.bekle(2);
       // System.out.println("Harcamak istediğiniz tutari giriniz: ");
        // Kullanıcıdan alışveriş limitini belirlemesi istenir
       // alisverisLimiti = 100.0;

        // Kullanıcının pop-up ve çerezleri kapatma işlemi
        migrosPage.cerezReddetElementi.click();

        // Kullanıcının sitenin doğru olduğunu kontrol etme işlemi

        Assert.assertTrue(migrosPage.uyeOlElementi.isDisplayed());
        ReusableMethods.bekle(2);


        // (Adres belirleme işlemi burada gerçekleştirilebilir)
        migrosPage.adresTanimlamaElementi.click();
        migrosPage.adresimeGelsinElementi.click();
        ReusableMethods.bekle(1);
        migrosPage.mevcutKonumuKullan.click();
        migrosPage.konumEkleButonu.click();
        ReusableMethods.bekle(1);
        migrosPage.adresimDogruButonu.click();

        // Kullanıcının Migros Hemen sekmesini seçme işlemi
        ReusableMethods.bekle(2);
        migrosPage.migrosHemenElementi.click();

        // Kullanıcının kategoriler kısmından Temel Gıda'yı seçme işlemi
        String text = migrosPage.getHiddenElementText();

        ReusableMethods.bekle(2);

        // Temel gıdadaki alt kategorilerden rastgele birini seçme işlemi
        migrosPage.getHiddenElementText();
        ReusableMethods.bekle(2);
        migrosPage.hiddenElement.click();
        ReusableMethods.bekle(2);
        Random random = new Random();
        int randomIndex = random.nextInt(migrosPage.temelGidaElementListesi.size());
        WebElement selectedProduct = migrosPage.temelGidaElementListesi.get(randomIndex);
        selectedProduct.click();
        System.out.println(selectedProduct.getText());
        migrosPage.sepeteEkleElementi.click();
        ReusableMethods.bekle(2);


        // Kullanıcıdan alınan tutara kadar rastgele ürün sepete ekleme işlemi
        sepettekiToplamTutar = 0;
        while (sepettekiToplamTutar < alisverisLimiti) {
            // Rastgele bir ürün fiyatı oluşturma
            double urunFiyati = ThreadLocalRandom.current().nextDouble(0.01, 100.00);
            // Sepete ürün ekleme
            sepettekiToplamTutar += urunFiyati;
            // Belirlenen tutarı aşarsa, fazla olan kısmı düzeltme
            if (sepettekiToplamTutar > alisverisLimiti) {
                sepettekiToplamTutar -= (sepettekiToplamTutar - alisverisLimiti);
            }
        }

        // Kullanıcının sepete gitme ve belirlenen tutarı aşmamasını teyit etme işlemi
        Assert.assertTrue(sepettekiToplamTutar <= alisverisLimiti,
                "Sepetteki toplam tutar, belirlenen alışveriş limitini aşmamalıdır.");
    }
}

