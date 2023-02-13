package team22.tests.zehra;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.zehra_hn.AllureAddProduct;
import team22.pages.zehra_hn.AllureSimpleProduct;
import team22.pages.zehra_hn.AllureStorePage;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class US16_TC05 {
    AllureStorePage allureStorePage = new AllureStorePage();
    AllureAddProduct allureAddProduct = new AllureAddProduct();
    AllureSimpleProduct allureSimpleProduct=new AllureSimpleProduct();

    @Test
    public void TC005() {
        HomePage.LoginVendor();
        ReusableMethods.waitFor(5);
        HomePage.goToProduct();
        ReusableMethods.clickByJS(allureSimpleProduct.price);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        allureSimpleProduct.salePrice.sendKeys("15");
        ReusableMethods.getScreenshot("us16 tc05");
        Driver.closeDriver();

    }
}
