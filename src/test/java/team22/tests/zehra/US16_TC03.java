package team22.tests.zehra;

import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.zehra_hn.AllureAddProduct;
import team22.pages.zehra_hn.AllureSimpleProduct;
import team22.pages.zehra_hn.AllureStorePage;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class US16_TC03 {
    AllureStorePage allureStorePage = new AllureStorePage();
    AllureAddProduct allureAddProduct = new AllureAddProduct();
    AllureSimpleProduct allureSimpleProduct=new AllureSimpleProduct();

    @Test
    public void TC003() {
        HomePage.LoginVendor();
        ReusableMethods.waitFor(5);
        HomePage.goToProduct();
        ReusableMethods.clickByJS(allureSimpleProduct.downloadable);
        Assert.assertTrue(allureSimpleProduct.downloadable.isSelected());
        Driver.closeDriver();

    }
}
