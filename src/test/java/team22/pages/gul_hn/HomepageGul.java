package team22.pages.gul_hn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team22.utilities.Driver;

public class HomepageGul {
    public HomepageGul() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='An account is already registered with your email address. ']")
    public WebElement uyariRegister;

    @FindBy(linkText = "My Account")
    public WebElement myAccount;

    @FindBy(xpath = "//a[text()='Addresses']")
    public WebElement adresse;


    @FindBy(xpath = "//h3[.='Billing address']")
    public WebElement bilingAdresse;

    @FindBy(xpath = "(//a[text()='Add'])[1]")
    public WebElement add;
    @FindBy(xpath = "//input[@id='billing_first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='billing_last_name']")
    public WebElement lastName;
    @FindBy(xpath = "//*[@id='billing_country']")
    public WebElement country;
    @FindBy(xpath = "//input[@id='billing_address_1']")
    public WebElement streetAdresse;
    @FindBy(id = "billing_email")
    public WebElement email;
    @FindBy(xpath = "//*[@name='save_address']")
    public WebElement saveAdresse;

    @FindBy(xpath = "//ul[@class='woocommerce-error']//li[@class=' alert alert-simple alert-icon alert-close-top alert-danger']")
    public WebElement ereurMessage;
}