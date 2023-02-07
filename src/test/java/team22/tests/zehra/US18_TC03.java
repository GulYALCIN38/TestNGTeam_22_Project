package team22.tests.zehra;

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

public class US18_TC03 {
    AllureStorePage allureStorePage = new AllureStorePage();
    AllureAddProduct allureAddProduct = new AllureAddProduct();

    @Test
    public void TC003() throws IOException {
        HomePage.LoginVendor();
        ReusableMethods.waitFor(5);
        HomePage.goToProduct();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        allureStorePage.simpleProduct.click();
        Select simpleDropdown = new Select(allureStorePage.simpleProduct);
        simpleDropdown.selectByVisibleText("External/Affiliate Product");
        actions.moveToElement(allureAddProduct.kucukFoto).perform();
        allureAddProduct.buttonText.sendKeys("super",Keys.ENTER);
        actions.moveToElement(allureAddProduct.kucukFoto).perform();
        ReusableMethods.getScreenshot("ekran goruntusu2");
        Driver.closeDriver();
    }
}
