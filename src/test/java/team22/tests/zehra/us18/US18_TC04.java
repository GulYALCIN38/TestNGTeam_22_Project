package team22.tests.zehra.us18;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.zehra_hn.AllureAddProduct;
import team22.pages.zehra_hn.AllureStorePage;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

import java.io.IOException;

public class US18_TC04 {


    @Test
    public void TC004() throws IOException {
        AllureStorePage allureStorePage=new AllureStorePage();
        AllureAddProduct allureAddProduct=new AllureAddProduct();
        HomePage.LoginVendor();
        ReusableMethods.waitFor(5);
        HomePage.goToProduct();
       ReusableMethods.scrollDownActions();
        ReusableMethods.waitFor(2);
        allureStorePage.simpleProduct.click();
        Select simpleDropdown = new Select(allureStorePage.simpleProduct);
        simpleDropdown.selectByVisibleText("External/Affiliate Product");
        allureAddProduct.price.sendKeys("20",Keys.ENTER);
        ReusableMethods.waitFor(5);
        ReusableMethods.scrollDownActions();
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("ekran goruntusu3");
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(allureAddProduct.signOut);
        ReusableMethods.clickByJS(allureAddProduct.logout);
        Driver.closeDriver();
    }
}
