package team22.tests.zehra.us16;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.zehra_hn.*;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

import java.io.IOException;

public class US16_TC07 {


    @Test
    public void TC007() throws IOException {
        AllureStorePage allureStorePage = new AllureStorePage();
        AllureAddProduct allureAddProduct = new AllureAddProduct();
        AllureMyAccount allureMyAccount=new AllureMyAccount();
        AllureSimpleProduct allureSimpleProduct=new AllureSimpleProduct();
        HomePage.LoginVendor();
        ReusableMethods.waitFor(5);
        HomePage.goToProduct();
        Assert.assertTrue(allureStorePage.simpleProduct.isDisplayed());
        allureSimpleProduct.proTitle.sendKeys("CANTA");
        allureSimpleProduct.price.sendKeys("20");
        allureSimpleProduct.salePrice.sendKeys("15");
        ReusableMethods.scrollDownActions();
        ReusableMethods.waitFor(2);
        allureAddProduct.buyukFoto.click();
        ReusableMethods.waitFor(2);
        allureAddProduct.selectFiles.click();
        Zehra.uploadFilePath("\\Users\\Gebruiker\\Desktop\\CANTA.png");
        ReusableMethods.waitFor(2);
        allureAddProduct.selectButton.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(allureAddProduct.kucukFoto);
        allureAddProduct.uploadFiles.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(allureAddProduct.selectFiles);
        Zehra.uploadFilePath("\\Users\\Gebruiker\\Desktop\\CANTA.png");
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(allureAddProduct.addToGallery);
        ReusableMethods.clickByJS(allureAddProduct.categories);
        ReusableMethods.clickByJS(allureAddProduct.submitButton);
        Assert.assertTrue(allureAddProduct.succesMessage2.isDisplayed());
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(allureAddProduct.signOut);
        ReusableMethods.clickByJS(allureAddProduct.logout);
        Driver.closeDriver();

    }




}
