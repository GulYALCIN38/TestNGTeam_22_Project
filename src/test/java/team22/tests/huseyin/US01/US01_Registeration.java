package team22.tests.huseyin.US01;

import com.beust.ah.A;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.huseyin_bey.AddProduct;
import team22.pages.huseyin_bey.Registeration;
import team22.pages.zehra_hn.AllureAddProduct;
import team22.pages.zehra_hn.AllureHomePage;
import team22.pages.zehra_hn.AllureMyAccount;
import team22.pages.zehra_hn.AllureStorePage;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class US01_Registeration {
    //TUM ALANLARIN DOLDURULMASI==>POZITIF TEST
    HomePage homePage = new HomePage();
    Registeration registeration = new Registeration();
    AddProduct addProduct= new AddProduct();
    @Test
    public void TC001() {

/* enter Username *
 enter Your Email address *
enter Password *
 enter I agree to the privacy policy*/
        Driver.getDriver().get(ConfigReader.getProperty("website-url"));
        Faker faker = new Faker();
        String username = faker.name().fullName();
        String email = faker.internet().emailAddress();
        String paswoord = faker.internet().password();
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage.registerButonu);
        homePage.registerUsername.sendKeys("", Keys.TAB, email, Keys.TAB,paswoord, Keys.ENTER, Keys.SPACE, Keys.ENTER);
        ReusableMethods.waitFor(3);
        addProduct.myAccount.click();
        ReusableMethods.scrollDownActions();
        String expectedTitle = "My Account";
        String actualTitle = registeration.pageTitle.getText();
        Assert.assertNotEquals(actualTitle,expectedTitle,"you didnt see know the page title this means +/n that the test passed but  yo cannnot log int without usrname");

    }
}

