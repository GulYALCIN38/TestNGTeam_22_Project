package team22.tests.sevim.us22;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.sevim_hn.CheckoutPage;
import team22.pages.sevim_hn.HomePage_svm;
import team22.pages.sevim_hn.MyAccountPage;
import team22.utilities.ConfigReader;
import team22.utilities.ReusableMethods;

public class TC001 {

    HomePage_svm homePage_svm = new HomePage_svm();
    CheckoutPage checkoutPage = new CheckoutPage();
    MyAccountPage myAccountPage=new MyAccountPage();
    HomePage homePage=new HomePage();

    Faker faker=new Faker();
    String firstname=faker.name().firstName();
    String lastname=faker.name().lastName();
    String adresse=faker.address().streetAddress();
    String city=faker.address().city();
    String zip=faker.address().zipCode();
    String phone=faker.phoneNumber().cellPhone();
    String email = ConfigReader.getProperty("vendor-email");
    String state = faker.country().capital();
    @Test(retryAnalyzer = team22.utilities.ListenersRetry.class)
    public void couponlaAlisveris(){

        HomePage_svm homePage_svm = new HomePage_svm();
        CheckoutPage checkoutPage = new CheckoutPage();
        HomePage homePage=new HomePage();

        homePage_svm.login();
        ReusableMethods.waitFor(3);

        homePage_svm.searchButton.sendKeys("apple", Keys.ENTER);
        ReusableMethods.waitFor(3);

        ReusableMethods.clickByJS(homePage_svm.macBook);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(homePage_svm.addToCart);
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage_svm.succesMessageForAddCart.isEnabled());


        homePage_svm.searchButton.sendKeys("Kadin Mont", Keys.ENTER);
        homePage_svm.mont.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(homePage_svm.addToCart);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(homePage_svm.succesMessageForAddCart.isDisplayed());
        ReusableMethods.clickByJS(homePage_svm.cartToggle);



        ReusableMethods.clickByJS(homePage_svm.checkoutButton);
        Assert.assertTrue(checkoutPage.productReview.isDisplayed());

        ReusableMethods.clickByJS(checkoutPage.enterYourCode);
        checkoutPage.couponCode.sendKeys(ConfigReader.getProperty("coupon-name"));

        checkoutPage.FirstName.sendKeys(firstname,Keys.TAB,lastname);
        Select selectCountryRegion = new Select(checkoutPage.countryRegionDropDown);
        selectCountryRegion.selectByIndex(3);

        Select selectCountry = new Select(checkoutPage.countryDropDown);
        selectCountry.selectByIndex(5);

        checkoutPage.zipCode.sendKeys(zip, Keys.TAB,phone);

        ReusableMethods.clickByJS(checkoutPage.payAtDoor);
        ReusableMethods.clickByJS(checkoutPage.wisePay);

        ReusableMethods.clickByJS(checkoutPage.placeOrderButton);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(checkoutPage.orderReceivedMessage.isDisplayed());
        ReusableMethods.waitFor(2);
        homePage_svm.logout();
    }
}
