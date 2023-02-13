package team22.tests.zehra;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.zehra_hn.AllureAddProduct;
import team22.pages.zehra_hn.AllureMyAccount;
import team22.pages.zehra_hn.AllureSimpleProduct;
import team22.pages.zehra_hn.AllureStorePage;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

import java.io.IOException;

public class US16_TC07 {

    AllureStorePage allureStorePage = new AllureStorePage();
    AllureAddProduct allureAddProduct = new AllureAddProduct();
    AllureMyAccount allureMyAccount=new AllureMyAccount();
    AllureSimpleProduct allureSimpleProduct=new AllureSimpleProduct();
    @Test
    public void TC007() throws IOException {
        HomePage.LoginVendor();
        ReusableMethods.waitFor(5);
        HomePage.goToProduct();
        Assert.assertTrue(allureStorePage.simpleProduct.isDisplayed());
        allureSimpleProduct.proTitle.sendKeys("CANTA");
        allureSimpleProduct.price.sendKeys("20");
        allureSimpleProduct.salePrice.sendKeys("15");
        allureAddProduct.buyukFoto.click();
        allureAddProduct.mediaLibrary.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(allureAddProduct.canta);
        ReusableMethods.waitFor(2);
        allureAddProduct.selectButton.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(allureAddProduct.kucukFoto);
        ReusableMethods.clickByJS(allureAddProduct.canta2);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(allureAddProduct.addToGallery);
        ReusableMethods.clickByJS(allureAddProduct.categories);
        ReusableMethods.clickByJS(allureAddProduct.submitButton);
        Assert.assertTrue(allureAddProduct.succesMessage2.isDisplayed());
        ReusableMethods.clickByJS(allureStorePage.product);
        Assert.assertTrue(allureAddProduct.canta3.isDisplayed());
        Driver.closeDriver();
    }




}
