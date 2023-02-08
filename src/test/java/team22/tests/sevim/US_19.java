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


        Driver.getDriver().get(ConfigReader.getProperty("app-url"));

        homePage_svm.searchButton.sendKeys("sweatshirt", Keys.ENTER);
        ReusableMethods.waitFor(3);

        homePage_svm.sweatShirtLosAngeles.click();
        ReusableMethods.waitFor(3);

        homePage_svm.addToCart.click();

        homePage_svm.searchButton.sendKeys("Kadin Mont", Keys.ENTER);

        homePage_svm.mont.click();
        ReusableMethods.waitFor(3);

        homePage_svm.addToCart.click();

        homePage_svm.cartToggle.click();

        Assert.assertTrue(homePage_svm.cartProduct1.getText().contains("Sweatshirt"));
        Assert.assertTrue(homePage_svm.cartProduct2.getText().contains("Mont"));
    }

    //Kullanici anasayfayı açar	https://allure2you.com/	Sayfa görüntülenebilmelidir
    //Kullanici uygulamaya login olur	movvpav564@fake-email.net     sifre:fake1234	Login islemi basariyla gerceklesir
    //My Account sayfasi görüntülenir		Sayfa görüntülenebilir olmali
    //Kullanici search alanina aradigi urunu yazar ve enterlar
    //Kullanici bir ürün secer ve ürüne tiklar	Bayan Spor ayakkabisi	Ürün tiklanabilir olmali
    //Kullanici add to cart butonuna tiklar		Webelement tiklanabilir olmali
    //Kullanici search alanina aradigi urunu yazar ve enterlar
    //Kullanici ilk ürüne tiklar	sweatshirt 	Ürün tiklanabilir olmali
    //Kullanici add to cart butonuna tiklar		Webelement tiklanabilir olmali
    //Kullanici "cart" butonuna tiklar		Webelement tiklanabilir olmali
    //Ürünlerin sepette oldugu dogrulanir		Ürünler sepette görüntüleniyor olmali
    //Kullanici Checkout butonuna tiklar		Webelement tiklanabilir olmali
    //Kullanici ürünlerin listelendigini dogrular		Ürünler görüntüleniyor olmali
    @Test
    public void test2(){

        Driver.getDriver().get(ConfigReader.getProperty("app-url"));

        homePage_svm.searchButton.sendKeys("sweatshirt", Keys.ENTER);
        ReusableMethods.waitFor(3);

        homePage_svm.sweatShirtLosAngeles.click();
        ReusableMethods.waitFor(3);

        homePage_svm.addToCart.click();

        homePage_svm.searchButton.sendKeys("Kadin Mont", Keys.ENTER);

        homePage_svm.mont.click();
        ReusableMethods.waitFor(3);

        homePage_svm.addToCart.click();

        homePage_svm.cartToggle.click();

        Assert.assertTrue(homePage_svm.cartProduct1.getText().contains("Sweatshirt"));
        Assert.assertTrue(homePage_svm.cartProduct2.getText().contains("Mont"));

        homePage_svm.checkoutButton.click();
        Assert.assertTrue(homePage_svm.productReview.isDisplayed());
    }
}
