package team22.tests.zehra;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.zehra_hn.AllureAddProduct;
import team22.pages.zehra_hn.AllureMyAccount;
import team22.pages.zehra_hn.AllureStorePage;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

import java.io.IOException;

public class US18_TC06 {
   AllureStorePage allureStorePage = new AllureStorePage();
    AllureAddProduct allureAddProduct = new AllureAddProduct();
AllureMyAccount allureMyAccount=new AllureMyAccount();
    @Test
    public void TC006() throws IOException {
        HomePage.LoginVendor();
        ReusableMethods.waitFor(5);
        HomePage.goToProduct();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        allureStorePage.simpleProduct.click();
        Select simpleDropdown = new Select(allureStorePage.simpleProduct);
        simpleDropdown.selectByVisibleText("External/Affiliate Product");
       allureAddProduct.productTitle.sendKeys("gold kolye");
       allureAddProduct.url.sendKeys("abc@abc.com");
       allureAddProduct.buttonText.sendKeys("super urun");
       allureAddProduct.price.sendKeys("20");
       allureAddProduct.salePrice.sendKeys("19");
       allureAddProduct.buyukFoto.click();
       allureAddProduct.mediaLibrary.click();
        ReusableMethods.waitFor(2);
      ReusableMethods.clickByJS(allureAddProduct.kolyeFoto);
        ReusableMethods.waitFor(2);
       allureAddProduct.selectButton.click();
        ReusableMethods.waitFor(2);
     ReusableMethods.clickByJS(allureAddProduct.kucukFoto);
     ReusableMethods.clickByJS(allureAddProduct.kolyeFoto2);
        ReusableMethods.waitFor(2);
      ReusableMethods.clickByJS(allureAddProduct.addToGallery);
      ReusableMethods.clickByJS(allureAddProduct.categories);
      ReusableMethods.clickByJS(allureAddProduct.submitButton);
        Assert.assertTrue(allureAddProduct.succesMessage2.isDisplayed());
        Driver.closeDriver();
    }
}