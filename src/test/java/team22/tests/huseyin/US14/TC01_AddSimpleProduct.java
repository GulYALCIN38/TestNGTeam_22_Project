package team22.tests.huseyin.US14;

import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.huseyin_bey.AddProduct;
import team22.pages.zehra_hn.AllureAddProduct;
import team22.pages.zehra_hn.AllureStorePage;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

import java.sql.DriverAction;


public class TC01_AddSimpleProduct  {
/*Steps
Kullanıcı anasayfayı açar
Kullanici my account butonu gorur ve click yapar
Kullanici sales management
Sign in butonu gorulebilir ve click edilir
Click sonrasi anasayfa acilir
Sign in butonu gorulebilir ve click edilir
Kullanici my account sayfasina yonlendirilir
Kullanici Store Manager butonunu gorur ve click eder
Kullanici Store Manager sayfasina yonlendirilir
Kullanici Products butonunu gorur ve click eder
Kullanici Products bolumune yonledirilir
Kullanici Add new butonunu gorur ve click eder
Kullanici simple product butonunu gorur
Kullanici simple product butonna tiklar
Kullanici "Simple Product " Secer
Kullanci produt title kismina  yeni  bir product yazar
Kullanci Price kismina  yeni  bir product fiyat girer
Kullanci  Sales Price kismina  yeni  bir product fiyat girer
Kullanici short description kismina urun description girer
Kullanici media ekler
Kullanici  Hidden yazisini secer*/

    AddProduct addProduct= new AddProduct();//  new oject is created from the Addprocudt page class
    HomePage homePage= new HomePage(); //  new oject is created from the HomePage  page class

    @Test
    public void test1() throws InterruptedException {

         HomePage.LoginVendor();// login
         ReusableMethods.waitFor(3);
         addProduct.myAccount.click();// get to my account
         ReusableMethods.waitFor(3);
         addProduct.menuStoreManager.click();//get to my from te menustoremangement
         Actions actions = new Actions(Driver.getDriver());
         actions.sendKeys(Keys.PAGE_DOWN).perform();
         ReusableMethods.waitFor(3);
         addProduct.products.click();// get to add productpage
         ReusableMethods.waitFor(3);

         actions.sendKeys(Keys.PAGE_DOWN).perform();
         addProduct.addNew.click();// get to
         ReusableMethods.waitFor(3);
         actions.sendKeys(Keys.PAGE_DOWN).perform();
        Select simpleDropdown = new Select(addProduct.productTypeSelect);
        simpleDropdown.selectByVisibleText("Simple Product");
        ReusableMethods.waitFor(1);
         actions.sendKeys(Keys.PAGE_DOWN).perform();
         ReusableMethods.waitFor(1);
         addProduct.productTittleWrite.sendKeys("Auto",Keys.ENTER);// get to

         addProduct.salePrice.sendKeys(
                "500",Keys.TAB,"5000",Keys.TAB, Keys.TAB,
                 "is working better",Keys.ENTER,// write short description
                  Keys.TAB,Keys.TAB,
                 "is working better than expected",Keys.ENTER);// write short descripiton);
        ReusableMethods.waitFor(2);
         // Click Categories
//        Select simpleDropdown = new Select(allureStorePage.simpleProduct);
//        simpleDropdown.selectByVisibleText("External/Affiliate Product");
//        actions.moveToElement(allureAddProduct.kucukFoto).perform();
//        Assert.assertTrue(allureAddProduct.url.isDisplayed());
        Driver.closeDriver();

    }
}


