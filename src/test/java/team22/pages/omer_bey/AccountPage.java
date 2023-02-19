package team22.pages.omer_bey;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team22.utilities.Driver;

public class AccountPage {

    public AccountPage() {

        PageFactory.initElements(Driver.getDriver(), this); // giris baglanti driver icin

    }

    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement myaccounttext;

    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wcfm-store-manager']")
    public WebElement storemanager;

    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--orders']")
    public  WebElement order;

    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--downloads']")
    public  WebElement download;

    @FindBy (xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-address']")
    public WebElement adresses;

    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-account']")
    public  WebElement accountdetails;
    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wishlist']")
    public  WebElement wishlish;

    @FindBy (xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--support-tickets']")
    public  WebElement supporttickets;

    @FindBy (xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--followings']")
    public WebElement followings;

    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--customer-logout']")
    public WebElement logout;

    @FindBy(xpath = "(//*[@class='text-uppercase text-center mb-0'])[1]")
    public WebElement orders1;

    @FindBy(xpath = "(//*[@class='icon-box text-center'])[2]")
    public WebElement downloads1;

    @FindBy(xpath = "(//*[@class='icon-box text-center'])[3]")
    public WebElement addresses1;

    @FindBy(xpath = "(//*[@class='icon-box text-center'])[4]")
    public WebElement accountdetails1;

    @FindBy(xpath = "(//*[@class='icon-box text-center'])[5]")
    public WebElement wislish1;

    @FindBy(xpath = "(//*[@class='icon-box text-center'])[6]")
    public WebElement logout1;

    @FindBy (xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
    public WebElement edit1;
}

//  Driver.getDriver().findElement(By.xpath("(//*[@class='w-icon-account'])[1]")).click();
    // Driver.getDriver().get(ConfigReader.getProperty("proje_Email");
    //   //*[@id='username'] username box
    //   //*[@id='password']  password box
    //    //*[@name='login'] sign in login
    //    //*[@data-id='4f60ebc3'] My Account click yapilacak
    //Store manager xpath i nasil alinir

    //orta bolum orders xpath ==> //*[@class='icon-box-icon icon-orders']
    //orta bolum downloads ==> //*[@class='icon-box-icon icon-downloads']
    //orta bolum address ==>  //*[@class='icon-box-icon icon-addresses']
    // orta bolum account details ==> //*[@class='icon-box-icon icon-account']
    // orta bolum wishlist ==>  //*[@class='icon-box-icon icon-wishlist']
    // orta bolum logout ==>   //*[@class='icon-box-icon icon-logout']

        /*AllureLoginPage allureLoginPage = new AllureLoginPage();
        AllureHomePage allureHomePage = new AllureHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("proje_url"));
       allureLoginPage.username.sendKeys(ConfigReader.getProperty("proje_Email"));
        allureLoginPage.password.sendKeys(ConfigReader.getProperty("proje_Pass"));
       allureLoginPage.submitButton.click();
*/

