package team22.pages.gul_hn;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team22.pages.HomePage;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class HomepageGul {
    HomePage homePage=new HomePage();
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

    @FindBy(xpath = "//*[@id='billing_city']")
    public WebElement city;

    @FindBy(xpath = "//*[@id='billing_postcode']")
    public WebElement zip;

    @FindBy(xpath = "//*[@id='billing_phone']")
    public WebElement phone;

    @FindBy(id = "billing_email")
    public WebElement email;
    @FindBy(xpath = "//*[@name='save_address']")
    public WebElement saveAdresse;

    @FindBy(xpath = "//ul[@class='woocommerce-error']//li[@class=' alert alert-simple alert-icon alert-close-top alert-danger']")
    public WebElement ereurMessage;

    @FindBy(xpath = "//div[@class='woocommerce-notices-wrapper']//div[@class='woocommerce-message alert alert-simple alert-icon alert-close-top alert-success']")
    public WebElement succesfulllymessage;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement fakemail;

    public void ilkAdimlar(){

        homePage.login(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));
        ReusableMethods.waitFor(3);

        //Kullanici, My Account butonuna tiklar
        myAccount.click();
        ReusableMethods.waitFor(3);


        //Kullanici Addresse bolumune tiklar.
        ReusableMethods.clickByJS(adresse);

      /*  JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",homepageGul.adresse);*/

        //Kullanici 'Biling Adress' bolumunu gorur
        assert bilingAdresse.isDisplayed();

        //Kullanici, add butonuna tiklar
        ReusableMethods.clickByJS(add);




    }

}