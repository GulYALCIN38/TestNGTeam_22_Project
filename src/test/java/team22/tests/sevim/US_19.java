package team22.tests.sevim;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.sevim_hn.HomePage_svm;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

import static team22.pages.HomePage.LoginVendor;

public class US_19 {

    HomePage_svm homePage_svm = new HomePage_svm();
    Actions actions = new Actions(Driver.getDriver());



    @Test
    public void addToCartTest01(){

        //Kullanici anasayfayı açar
        Driver.getDriver().get(ConfigReader.getProperty("app-url"));
        //Kullanici uygulamaya login olur
       // LoginVendor();
        //Kullanici search alanina ürün adi girer
        homePage_svm.searchButton.sendKeys("sweatshirt", Keys.ENTER);
        ReusableMethods.waitFor(3);

        //Kullanici bir ürün secer ve ürüne tiklar
        homePage_svm.sweatShirtLosAngeles.click();
        ReusableMethods.waitFor(3);
        //Kullanici add to cart butonuna tiklar
        homePage_svm.addToCart.click();
        //Kullanici search alanina ürün adi girer
        homePage_svm.searchButton.sendKeys("Kadin Mont", Keys.ENTER);
        //Kullanici bir ürün secer ve ürüne tiklar:1.ürün
        homePage_svm.mont.click();
        ReusableMethods.waitFor(3);
        //Kullanici add to cart butonuna tiklar
        homePage_svm.addToCart.click();
        //Kullanici "cart" butonuna tiklar
        homePage_svm.cartToggle.click();
        //Ürünlerin sepette oldugu dogrulanir
        Assert.assertTrue(homePage_svm.cartProduct1.getText().contains("Sweatshirt"));
        Assert.assertTrue(homePage_svm.cartProduct2.getText().contains("Mont"));
    }
}
