package team22.tests.sevim.us19;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.gul_hn.HomepageGul;
import team22.pages.sevim_hn.HomePage_svm;
import team22.pages.sevim_hn.MyAccountPage;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class TC006 {




    @Test(retryAnalyzer = team22.utilities.ListenersRetry.class)
    public void test06() {

        HomePage_svm homePage_svm = new HomePage_svm();
        MyAccountPage myAccountPage=new MyAccountPage();


        homePage_svm.login();
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(homePage_svm.MyAccountButton);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(myAccountPage.orderButton);
        Assert.assertTrue(myAccountPage.ordersHeader.isDisplayed());
        homePage_svm.logout();
        //Driver.getDriver().close();
    }
}
