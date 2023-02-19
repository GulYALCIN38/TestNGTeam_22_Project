package team22.tests.sevim;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.sevim_hn.CheckoutPage;
import team22.pages.sevim_hn.HomePage_svm;
import team22.pages.sevim_hn.MyAccountPage;
import team22.pages.sevim_hn.MyStorePage;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class US_20 {

    HomePage_svm homePage_svm = new HomePage_svm();
    CheckoutPage checkoutPage = new CheckoutPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    HomePage homePage = new HomePage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Actions actions=new Actions(Driver.getDriver());


    @Test
    public void test01() {

            homePage.login(ConfigReader.getProperty("vendor-email"), ConfigReader.getProperty("vendor-pass"));
            ReusableMethods.waitForClickablility(homePage_svm.MyAccountButton, 3);
            ReusableMethods.waitFor(4);
            ReusableMethods.clickByJS(homePage_svm.MyAccountButton);
            ReusableMethods.clickByJS(myAccountPage.storeManager);
            MyStorePage myStorePage = new MyStorePage();
            js.executeScript("");
            ReusableMethods.waitForClickablility(myStorePage.CouponsAddNew,3);
            //ReusableMethods.clickByJS();

        }
    }
