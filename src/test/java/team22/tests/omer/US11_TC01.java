package team22.tests.omer;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.omer_bey.AccountPage;
import team22.pages.omer_bey.HomePage;
import team22.pages.zehra_hn.AllureStorePage;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;


public class US11_TC01 {


    @Test
    public void Test01() {
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




        // ProjeAllure.myAccount.click();

        // ProjeAllure.signIn.click();
     //   allureHomePage.signIn.click();
        //   ReusableMethods.waitFor(3);

    }}