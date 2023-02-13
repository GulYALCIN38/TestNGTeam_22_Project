package team22.tests.huseyin.US14;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.huseyin_bey.AddProduct;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class TC02_AddDescription {

    AddProduct addProduct= new AddProduct();//  new oject is created from the Addprocudt page class
    HomePage homePage= new HomePage(); //  new oject is created from the HomePage  page class
    @Test
    public void test1() {
        HomePage.LoginVendor();// login
        ReusableMethods.waitFor(3);
        HomePage.goToProduct();
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollDownActions();
        Select select =new Select(addProduct.productTypeSelect);
        select.selectByVisibleText("Variable Product");
        Faker faker=new Faker();
        String firstname=faker.name().firstName();
        addProduct.productTittleWrite.sendKeys(faker.commerce().productName());
        ReusableMethods.waitFor(2);
        Select select2 =new Select(addProduct.catalogVisibility);
        select2.selectByVisibleText("Hidden");
        addProduct.FirstinsertMediaButton.click();
        addProduct.medialibrary.click();
        ReusableMethods.waitFor(2);
        addProduct.medialibrary.sendKeys(
                Keys.TAB,Keys.TAB,Keys.TAB,
                Keys.TAB,Keys.TAB,Keys.TAB,
                Keys.TAB,Keys.ENTER);
        ReusableMethods.waitFor(5);
        addProduct.searchinput.sendKeys("asd",
                Keys.TAB,
                Keys.TAB,Keys.ENTER);
        ReusableMethods.waitFor(3);
        addProduct.InsertintoButton.click();
        ReusableMethods.waitFor(3);


    }
}
