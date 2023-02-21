package team22.tests.zehra.us18;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.zehra_hn.AllureAddProduct;
import team22.pages.zehra_hn.AllureStorePage;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

import java.io.IOException;

public class US18_TC02 {


    @Test
    public void TC002() throws IOException {
        AllureStorePage allureStorePage = new AllureStorePage();
        AllureAddProduct allureAddProduct = new AllureAddProduct();
        HomePage.LoginVendor();
        ReusableMethods.waitFor(5);
        HomePage.goToProduct();
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(allureStorePage.simpleProduct);
        Select simpleDropdown = new Select(allureStorePage.simpleProduct);
        simpleDropdown.selectByVisibleText("External/Affiliate Product");
        ReusableMethods.scrollDownActions();
        ReusableMethods.waitFor(2);
        allureAddProduct.url.sendKeys("abc@abc.com",Keys.ENTER);
        Assert.assertTrue(allureAddProduct.url.isEnabled());
        ReusableMethods.getScreenshot("us18 tc02");
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(allureAddProduct.signOut);
        ReusableMethods.clickByJS(allureAddProduct.logout);
        Driver.closeDriver();
    }



}
