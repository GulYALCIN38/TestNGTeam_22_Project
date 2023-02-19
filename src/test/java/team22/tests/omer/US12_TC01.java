package team22.tests.omer;

import org.testng.annotations.Test;
import team22.pages.omer_bey.AccountPage;
import team22.pages.omer_bey.AddressesPage;
import team22.pages.omer_bey.HomePage;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class US12_TC01 {


    @Test
    public void Test01_02_03() {



        HomePage homePage = new HomePage();
        AccountPage accountPage = new AccountPage();
        AddressesPage addressesPage = new AddressesPage();

        Driver.getDriver().get(ConfigReader.getProperty("app-url"));
        homePage.signIn.click();
        ReusableMethods.waitFor(2);
        homePage.mailKutusu.sendKeys(ConfigReader.getProperty("vendor-email"));
        ReusableMethods.waitFor(2);
        homePage.passwordKutusu.sendKeys(ConfigReader.getProperty("vendor-pass"));
        ReusableMethods.waitFor(2);
        homePage.signInButton.click();

        ReusableMethods.waitFor(2);
        homePage.myAccount.click();

        ReusableMethods.waitFor(1);
        accountPage.addresses1.click();

        ReusableMethods.waitFor(1);
        addressesPage.edit1.click();
    }
}