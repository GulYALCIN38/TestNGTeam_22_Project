package team22.tests.sevim.us19;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.gul_hn.HomepageGul;
import team22.pages.sevim_hn.CheckoutPage;
import team22.pages.sevim_hn.HomePage_svm;
import team22.pages.sevim_hn.MyAccountPage;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class TC001 {

    Faker faker=new Faker();
    String firstname=faker.name().firstName();
    String lastname=faker.name().lastName();
    String adresse=faker.address().streetAddress();
    String city=faker.address().city();
    String zip=faker.address().zipCode();
    String phone=faker.phoneNumber().cellPhone();
    String email = ConfigReader.getProperty("vendor-email");
    String state = faker.country().capital();


    @Test
    public void addToCartTest01(){
        HomePage_svm homePage_svm = new HomePage_svm();
        CheckoutPage checkoutPage = new CheckoutPage();
        MyAccountPage myAccountPage=new MyAccountPage();
        HomePage homePage=new HomePage();
        HomepageGul homepageGul=new HomepageGul();

        ReusableMethods.waitFor(3);
        homePage.login(ConfigReader.getProperty("vendor-email"),ConfigReader.getProperty("vendor-pass"));
        ReusableMethods.waitFor(3);
        homePage_svm.searchButton.sendKeys("apple", Keys.ENTER);
        ReusableMethods.clickByJS( homePage_svm.macBook);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage_svm.addToCart);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(homePage_svm.succesMessageForAddCart.isDisplayed());


        ReusableMethods.waitFor(3);
        homePage_svm.searchButton.sendKeys("Kadin Mont", Keys.ENTER);
        ReusableMethods.clickByJS( homePage_svm.mont);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage_svm.addToCart);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(homePage_svm.succesMessageForAddCart.isDisplayed());

        homePage_svm.cartToggle.click();
        homePage_svm.logout();


    }
}
