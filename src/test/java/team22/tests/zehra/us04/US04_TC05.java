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

public class US04_TC05 {
    //STREET ADRESS ALANININ BOS BIRAKILMASI



    @Test
    public void TC005() {
        AllureStorePage allureStorePage = new AllureStorePage();
        AllureAddProduct allureAddProduct = new AllureAddProduct();
        AllureMyAccount allureMyAccount = new AllureMyAccount();
        AllureHomePage allureHomePage = new AllureHomePage();
        //login islemleri ve add adrese kadar olan bolum
        HomePage.loginKullanici();
        ReusableMethods.waitFor(3);
        allureHomePage.myAccount.click();
        allureMyAccount.adres.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        allureMyAccount.shippingAdd.click();
        ReusableMethods.waitFor(2);
        //bilgilerin doldurulmasi
        Faker faker = new Faker();
        allureMyAccount.shippingFirstname.sendKeys(faker.name().firstName());
        allureMyAccount.shippingLastname.sendKeys(faker.name().lastName());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(5);
        Select select = new Select(allureMyAccount.shippingCountry);
        select.selectByVisibleText("Turkey");
        allureMyAccount.postcode.sendKeys("1234");
        allureMyAccount.townCity.sendKeys("isparta");
        Select province = new Select(allureMyAccount.province);
        province.selectByVisibleText("Isparta");
        allureMyAccount.saveAdres.click();
        ReusableMethods.getScreenshot("US04 TC05");
        ReusableMethods.waitFor(2);
        Assert.assertEquals(allureMyAccount.errorMessage.getText(),"Street address is a required field.");
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(allureAddProduct.signOut);
        ReusableMethods.clickByJS(allureAddProduct.logout);
        Driver.closeDriver();


    }
}
