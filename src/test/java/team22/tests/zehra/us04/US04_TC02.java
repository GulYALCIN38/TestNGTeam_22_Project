package team22.tests.zehra.us04;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.zehra_hn.AllureAddProduct;
import team22.pages.zehra_hn.AllureHomePage;
import team22.pages.zehra_hn.AllureMyAccount;
import team22.pages.zehra_hn.AllureStorePage;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class US04_TC02{
    //FIRSTNAME ALANININ BOS BIRAKILMASI



    @Test
    public void TC002() {
        AllureStorePage allureStorePage = new AllureStorePage();
        AllureAddProduct allureAddProduct = new AllureAddProduct();
        AllureMyAccount allureMyAccount = new AllureMyAccount();
        AllureHomePage allureHomePage = new AllureHomePage();
        //login islemleri ve add adrese kadar olan bolum
        HomePage.loginKullanici();
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(allureHomePage.myAccount);
        ReusableMethods.clickByJS(allureMyAccount.adres);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(allureMyAccount.shippingAdd);
        ReusableMethods.waitFor(2);
        //bilgilerin doldurulmasi
        Faker faker = new Faker();
        allureMyAccount.shippingLastname.sendKeys(faker.name().lastName());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(5);
        Select select = new Select(allureMyAccount.shippingCountry);
        select.selectByVisibleText("Turkey");
        allureMyAccount.streetAdres.sendKeys(faker.address().streetAddress());
        allureMyAccount.postcode.sendKeys("1234");
        allureMyAccount.townCity.sendKeys("isparta");
        Select province = new Select(allureMyAccount.province);
        province.selectByVisibleText("Isparta");
        ReusableMethods.clickByJS(allureMyAccount.saveAdres);
        ReusableMethods.getScreenshot("US04 TC02");
        ReusableMethods.waitFor(2);
        String expected="First name is a required field.";
        Assert.assertEquals(allureMyAccount.errorMessage.getText(),"First name is a required field.");
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(allureAddProduct.signOut);
        ReusableMethods.clickByJS(allureAddProduct.logout);
        Driver.closeDriver();


    }
}