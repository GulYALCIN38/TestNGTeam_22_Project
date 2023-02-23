package team22.tests.sevim.us19;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.gul_hn.HomepageGul;
import team22.pages.sevim_hn.CheckoutPage;
import team22.pages.sevim_hn.HomePage_svm;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class TC002 {

    @Test
    public void test2(){
        HomePage_svm homePage_svm = new HomePage_svm();
        CheckoutPage checkoutPage = new CheckoutPage();
        HomepageGul homepageGul=new HomepageGul();
        HomePage homePage=new HomePage();

        ReusableMethods.waitFor(3);
        homePage.login(ConfigReader.getProperty("vendor-email"),ConfigReader.getProperty("vendor-pass"));
        ReusableMethods.waitFor(3);
        homePage_svm.searchButton.sendKeys("apple", Keys.ENTER);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(homePage_svm.macBook);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(homePage_svm.addToCart);
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage_svm.succesMessageForAddCart.isEnabled());

        homePage_svm.searchButton.sendKeys("Kadin Mont", Keys.ENTER);
        ReusableMethods.clickByJS(homePage_svm.mont);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(homePage_svm.addToCart);
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage_svm.succesMessageForAddCart.isEnabled());

        ReusableMethods.clickByJS(homePage_svm.addToCart);

        ReusableMethods.clickByJS(homePage_svm.cartToggle);

        ReusableMethods.clickByJS(homePage_svm.checkoutButton);

        Assert.assertTrue(checkoutPage.productReview.isDisplayed());


    }

}
