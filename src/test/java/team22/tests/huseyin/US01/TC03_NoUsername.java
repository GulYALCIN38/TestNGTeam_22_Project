package team22.tests.huseyin.US01;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.huseyin_bey.AddProduct;
import team22.pages.huseyin_bey.Registeration;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class TC03_NoUsername {
    HomePage homePage = new HomePage();
    Registeration registeration = new Registeration();
    AddProduct addProduct= new AddProduct();


    @Test
    public void TC001() {

/* enter Username *
 enter Your Email address *
enter Password *
 enter I agree to the privacy policy*/
        Driver.getDriver().get(ConfigReader.getProperty("app-url"));
        ReusableMethods.waitFor(2);
        Faker faker = new Faker();
        String username = faker.name().fullName();
        String email = faker.internet().emailAddress();
        String paswoord = faker.internet().password();
        Driver.getDriver().get(ConfigReader.getProperty("app-url"));
        ReusableMethods.clickByJS(homePage.registerButonu);
        homePage.registerUsername.sendKeys(username, Keys.TAB, email, Keys.TAB,paswoord, Keys.ENTER, Keys.SPACE, Keys.ENTER);
        ReusableMethods.waitFor(3);
        addProduct.myAccount.click();
        ReusableMethods.scrollDownActions();
        String expectedTitle = "My Account";
        String actualTitle = registeration.pageTitle.getText();
        Assert.assertEquals(actualTitle,expectedTitle);



    }
}

