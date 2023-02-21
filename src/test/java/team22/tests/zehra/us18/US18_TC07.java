package team22.tests.zehra.us18;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.zehra_hn.AllureAddProduct;
import team22.pages.zehra_hn.AllureMyAccount;
import team22.pages.zehra_hn.AllureStorePage;
import team22.pages.zehra_hn.Zehra;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

import java.io.IOException;

public class US18_TC07 {

    @Test
    public void TC007() throws IOException {
        AllureStorePage allureStorePage = new AllureStorePage();
        AllureAddProduct allureAddProduct = new AllureAddProduct();
        AllureMyAccount allureMyAccount=new AllureMyAccount();
        HomePage.LoginVendor();
        ReusableMethods.waitFor(5);
        HomePage.goToProduct();
        ReusableMethods.scrollDownActions();
        ReusableMethods.waitFor(2);
        allureStorePage.simpleProduct.click();
        Select simpleDropdown = new Select(allureStorePage.simpleProduct);
        simpleDropdown.selectByVisibleText("External/Affiliate Product");
        allureAddProduct.productTitle.sendKeys("gold kolye");
        allureAddProduct.url.sendKeys("abc@abc.com");
        allureAddProduct.buttonText.sendKeys("super urun");
        allureAddProduct.price.sendKeys("20");
        allureAddProduct.salePrice.sendKeys("19");
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
