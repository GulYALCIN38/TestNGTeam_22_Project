package team22.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team22.pages.zehra_hn.AllureHomePage;
import team22.pages.zehra_hn.AllureMyAccount;
import team22.pages.zehra_hn.AllureStorePage;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class HomePage {


    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='register inline-type']")
    public WebElement registerButonu;

    @FindBy(id = "reg_username")
    public WebElement registerUsername;
    @FindBy(xpath = "//*[text()='Sign In ']")
    public WebElement signinButonu;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;


    public void login(String user_name, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("app-url"));

        ReusableMethods.waitFor(2);

        signinButonu.click();
        ReusableMethods.waitFor(2);
        username.sendKeys(user_name, Keys.TAB, password, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);

    }

    public static void LoginVendor() {
        AllureHomePage allureHomePage = new AllureHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("app-url"));
        ReusableMethods.waitFor(3);
       ReusableMethods.clickByJS( allureHomePage.signIn);
        ReusableMethods.waitFor(3);
        allureHomePage.mailKutusu.sendKeys(ConfigReader.getProperty("vendor-email"));
        ReusableMethods.waitFor(2);
        allureHomePage.passwordKutusu.sendKeys(ConfigReader.getProperty("vendor-pass"));
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(allureHomePage.signInButton);

    }
    public static void goToProduct(){
        AllureHomePage allureHomePage = new AllureHomePage();
        AllureMyAccount allureMyAccount = new AllureMyAccount();
        AllureStorePage allureStorePage = new AllureStorePage();
        ReusableMethods.waitFor(2);
       ReusableMethods.clickByJS(allureHomePage.myAccount);
       ReusableMethods.waitFor(2);
       ReusableMethods.clickByJS(allureMyAccount.storeManager);
        ReusableMethods.waitFor(2);
//        Actions actions=new Actions(Driver.getDriver());
//        ReusableMethods.scrollDownActions();
      ReusableMethods.clickByJS(allureStorePage.product);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(allureStorePage.addNew);
        ReusableMethods.waitFor(2);

    }
    public static void loginKullanici() {
        AllureHomePage allureHomePage = new AllureHomePage();
        AllureMyAccount allureMyAccount = new AllureMyAccount();
        AllureStorePage allureStorePage = new AllureStorePage();
        ReusableMethods.waitFor(2);

        Driver.getDriver().get(ConfigReader.getProperty("app-url"));
        ReusableMethods.clickByJS(allureHomePage.signIn);
        ReusableMethods.waitFor(3);
        allureHomePage.mailKutusu.sendKeys(ConfigReader.getProperty("kul-email"));
        ReusableMethods.waitFor(2);
        allureHomePage.passwordKutusu.sendKeys(ConfigReader.getProperty("kul-pass"));
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(allureHomePage.signInButton);

    }



}