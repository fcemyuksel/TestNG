package tests.day19_POM;

import Pages.WebdriverUniversityPage;
import Utilies.ConfigReader;
import Utilies.Driver;
import Utilies.ReusableMethods;
import org.testng.annotations.Test;

public class C08_WebUniversityTest {
    @Test
    public void test01() throws InterruptedException {
        //http://www.webdriveruniversity.com/IFrame/index.html sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("webuniversityUrl"));

        //"Our Products" butonuna tikla
        WebdriverUniversityPage webdriverUniversityPage=new WebdriverUniversityPage();
        Driver.getDriver().switchTo().frame(webdriverUniversityPage.iFrameElementi);

        webdriverUniversityPage.ourProduct.click();

        //"Cameras product"i tiklayin
        //Driver.getDriver().switchTo().frame(webdriverUniversityPage.iFrameElementi);
        webdriverUniversityPage.camerasElementi.click();
        //Popup mesajini yazdirin
        System.out.println(webdriverUniversityPage.popUpYaziElementi.getText());
        ReusableMethods.bekle(2);
        //"close" butonuna basin
        Driver.getDriver().switchTo().parentFrame().close();
        ReusableMethods.bekle(2);
        webdriverUniversityPage.closeButonElementi.click();
        //"WebdriverUniversity.com(IFrame)" linkini tiklayin

        //http://www.webuniversity.com/index.html adresine gitigini test edin
        webdriverUniversityPage.webdriveruniversityElementi.click();

        ReusableMethods.bekle(3);
        Driver.closeDriver();
    }
}
