package Pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QualitydemyPage {

    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Log in")
    public WebElement ilkLoginButonu;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButonu;

    @FindBy(linkText = "My courses")
    public WebElement basariliGirisKontrolElementi;


    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement cockieElementi;

}
