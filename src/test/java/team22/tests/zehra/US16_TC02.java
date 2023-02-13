package team22.tests.zehra;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.zehra_hn.AllureAddProduct;
import team22.pages.zehra_hn.AllureSimpleProduct;
import team22.pages.zehra_hn.AllureStorePage;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class US16_TC02 {
    AllureStorePage allureStorePage = new AllureStorePage();
    AllureAddProduct allureAddProduct = new AllureAddProduct();
    AllureSimpleProduct allureSimpleProduct=new AllureSimpleProduct();

    @Test
    public void TC002() {
        HomePage.LoginVendor();
        ReusableMethods.waitFor(5);
        HomePage.goToProduct();
        ReusableMethods.clickByJS(allureSimpleProduct.virtual);
        Assert.assertTrue(allureSimpleProduct.virtual.isSelected());
        Driver.closeDriver();

    }
}