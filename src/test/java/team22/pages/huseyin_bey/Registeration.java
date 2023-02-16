package team22.pages.huseyin_bey;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class Registeration {

    public Registeration() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="(//*[text()='My Account'])[1]")
    public WebElement myAccount;

    @FindBy(xpath = "//*[@class='register inline-type']")
    public WebElement registerButonu;

    @FindBy(xpath = "(//*[@id='signup']/form/button)[1]")
    private WebElement signUpButton;

    @FindBy(xpath ="//*[@href='signup']")
    public WebElement signUp;

    @FindBy(xpath = "//label[@for='register-policy']")
    private WebElement policyAgreementLabel;


    @FindBy(id = "reg_username")
    public WebElement registerUsername;
    @FindBy(xpath = "//*[text()='Sign In ']")
    public WebElement signinButonu;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//h2[@class='page-title']")
    public WebElement pageTitle;


    public void login(String user_name, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("app-url"));
        ReusableMethods.waitFor(2);
        signinButonu.click();
        ReusableMethods.waitFor(2);
        username.sendKeys(user_name, Keys.TAB, password, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);


    }
}


