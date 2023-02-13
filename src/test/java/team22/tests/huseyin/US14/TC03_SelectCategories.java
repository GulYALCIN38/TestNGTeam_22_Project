package team22.tests.huseyin.US14;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.huseyin_bey.AddProduct;
import team22.pages.zehra_hn.AllureAddProduct;
import team22.pages.zehra_hn.AllureStorePage;
import team22.utilities.ReusableMethods;

public class TC03_SelectCategories {
    AddProduct addProduct= new AddProduct();//  new oject is created from the Addprocudt page class
    HomePage homePage= new HomePage(); //  new oject is created from the HomePage  page class
    AllureStorePage allureStorePage = new AllureStorePage();
    AllureAddProduct allureAddProduct = new AllureAddProduct();
@Test
    public void test1() {
        HomePage.LoginVendor();// login
        ReusableMethods.waitFor(3);
        HomePage.goToProduct();
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollDownActions();
        Faker faker = new Faker();
        String firstname = faker.name().firstName();
        addProduct.productTittleWrite.sendKeys(faker.commerce().productName());
        ReusableMethods.waitFor(2);
        allureStorePage.simpleProduct.click();
        Select simpleDropdown = new Select(allureStorePage.simpleProduct);
        simpleDropdown.selectByVisibleText("External/Affiliate Product");
        allureAddProduct.productTitle.sendKeys("gold kolye");
        allureAddProduct.url.sendKeys("abc@abc.com");
        allureAddProduct.buttonText.sendKeys("super urun");
        allureAddProduct.price.sendKeys("20");
        allureAddProduct.salePrice.sendKeys("19");
        Select select2 = new Select(addProduct.catalogVisibility);
        select2.selectByVisibleText("Hidden");
        ReusableMethods.clickByJS(allureAddProduct.categories);
    }
}



