package Pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebdriverUniversityPage {

    public WebdriverUniversityPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Our Products")
    public WebElement ourProduct;

    @FindBy(id = "container-product1")
    public WebElement camerasElementi;

    @FindBy(id = "frame")
    public WebElement iFrameElementi;

    @FindBy(className = "modal-body")
    public WebElement popUpYaziElementi;

    @FindBy(linkText = "//*[text()='Close']")
    public WebElement closeButonElementi;

    @FindBy(linkText = "WebdriverUniversity.com (IFrame)")
    public WebElement webdriveruniversityElementi;
}
