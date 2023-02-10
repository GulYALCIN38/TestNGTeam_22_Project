package team22.tests.zehra;

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

public class US18_TC01 {
    AllureStorePage allureStorePage = new AllureStorePage();
    AllureAddProduct allureAddProduct = new AllureAddProduct();

    @Test
    public void TC001() {
        HomePage.LoginVendor();
        ReusableMethods.waitFor(5);
        HomePage.goToProduct();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        allureStorePage.simpleProduct.click();
        Select simpleDropdown = new Select(allureStorePage.simpleProduct);
        simpleDropdown.selectByVisibleText("External/Affiliate Product");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
       // actions.moveToElement(allureAddProduct.kucukFoto).perform();
        Assert.assertTrue(allureAddProduct.url.isDisplayed());
        Driver.closeDriver();

    }
}