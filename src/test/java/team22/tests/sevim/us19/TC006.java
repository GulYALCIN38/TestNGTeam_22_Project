package team22.tests.sevim.us19;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.gul_hn.HomepageGul;
import team22.pages.sevim_hn.HomePage_svm;
import team22.pages.sevim_hn.MyAccountPage;
import team22.utilities.ConfigReader;
import team22.utilities.ReusableMethods;

public class TC006 {

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
    public void test6() {

        HomePage_svm homePage_svm = new HomePage_svm();
        MyAccountPage myAccountPage=new MyAccountPage();
        HomePage homePage=new HomePage();
        HomepageGul homepageGul=new HomepageGul();

        homePage.login(ConfigReader.getProperty("vendor-email"), ConfigReader.getProperty("vendor-pass"));
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(homePage_svm.MyAccountButton);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(myAccountPage.orderButton);
        Assert.assertTrue(myAccountPage.ordersHeader.isDisplayed());
        ReusableMethods.clickByJS(homepageGul.logout);
    }
}
