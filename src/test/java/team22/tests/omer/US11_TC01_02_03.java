package team22.tests.omer;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.omer_bey.AccountPage;
import team22.pages.omer_bey.HomePage;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;


public class US11_TC01_02_03 {


    @Test
    public void Test01_02_03() {
//        siteye a git
//       driver -> Driver.getDriver()
//        ConfigReader.getProperty("amazon_url") -> https://allure2you.com/
//        Driver.getDriver().get(ConfigReader.getProperty("app-url")); //https://allure2you.com/



        HomePage homePage = new HomePage();
        AccountPage accountPage= new AccountPage();

        Driver.getDriver().get(ConfigReader.getProperty("app-url"));
        homePage.signIn.click();
        ReusableMethods.waitFor(2);
        homePage.mailKutusu.sendKeys(ConfigReader.getProperty("vendor-email"));
        ReusableMethods.waitFor(2);
        homePage.passwordKutusu.sendKeys(ConfigReader.getProperty("vendor-pass"));
        ReusableMethods.waitFor(2);
        homePage.signInButton.click();

        ReusableMethods.waitFor(3);
        homePage.myAccount.click();

        Assert.assertTrue(accountPage.myaccounttext.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue(accountPage.storemanager.isDisplayed());

        ReusableMethods.waitFor(1);
        Assert.assertTrue(accountPage.download.isDisplayed());

        ReusableMethods.waitFor(1);
        Assert.assertTrue(accountPage.adresses.isDisplayed());

        ReusableMethods.waitFor(1);
        Assert.assertTrue(accountPage.adresses.isDisplayed());

        ReusableMethods.waitFor(1);
        Assert.assertTrue(accountPage.accountdetails.isDisplayed());

        ReusableMethods.waitFor(1);
        Assert.assertTrue(accountPage.wishlish.isDisplayed());

        ReusableMethods.waitFor(1);
        Assert.assertTrue(accountPage.supporttickets.isDisplayed());

        ReusableMethods.waitFor(1);
        Assert.assertTrue(accountPage.followings.isDisplayed());

        ReusableMethods.waitFor(1);
        Assert.assertTrue(accountPage.logout.isDisplayed());

        ReusableMethods.waitFor(1);
        Assert.assertTrue(accountPage.orders1.isDisplayed());


        ReusableMethods.waitFor(1);
        Assert.assertTrue(accountPage.downloads1.isDisplayed());

        ReusableMethods.waitFor(1);
        Assert.assertTrue(accountPage.addresses1.isDisplayed());

        ReusableMethods.waitFor(1);
        Assert.assertTrue(accountPage.accountdetails1.isDisplayed());

        ReusableMethods.waitFor(1);
        Assert.assertTrue(accountPage.wislish1.isDisplayed());

        ReusableMethods.waitFor(1);
        Assert.assertTrue(accountPage.logout1.isDisplayed());

        ReusableMethods.waitFor(1);
        Driver.closeDriver();



    }}