package team22.tests.huseyin.US14;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.huseyin_bey.AddProduct;
import team22.pages.zehra_hn.AllureAddProduct;
import team22.pages.zehra_hn.AllureStorePage;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class TC05_Slelectbrands {

    AddProduct addProduct = new AddProduct();//  new oject is created from the Addprocudt page class
    HomePage homePage = new HomePage(); //  new oject is created from the HomePage  page class


    @Test
    public void test3() {
        HomePage.LoginVendor();// login
        ReusableMethods.waitFor(3);
        HomePage.goToProduct();
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollDownActions();
        Faker faker= new Faker();
        String firstname=     faker.name().firstName();
        double price    =     faker.number().randomDouble(5, 5, 100);
        String email    =     faker.internet().emailAddress();
        String text     =     faker.lorem().sentence(30);
        addProduct.productTittleWrite.sendKeys(faker.commerce().productName());
        ReusableMethods.waitFor(2);
        addProduct.checkbox.click();
        Driver.closeDriver();


    }
}
