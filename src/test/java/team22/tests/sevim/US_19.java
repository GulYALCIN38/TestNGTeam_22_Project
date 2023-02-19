package team22.tests.sevim;

import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.HomePage;
import team22.pages.sevim_hn.CheckoutPage;
import team22.pages.sevim_hn.HomePage_svm;
import team22.pages.sevim_hn.MyAccountPage;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ExcelUtils;
import team22.utilities.ReusableMethods;

import java.security.Key;


public class US_19 {

    HomePage_svm homePage_svm = new HomePage_svm();
    CheckoutPage checkoutPage = new CheckoutPage();
    MyAccountPage myAccountPage=new MyAccountPage();
    HomePage homePage=new HomePage();

    Faker faker=new Faker();
    String firstname=faker.name().firstName();
    String lastname=faker.name().lastName();
    String adresse=faker.address().streetAddress();
    String city=faker.address().city();
    String zip=faker.address().zipCode();
    String phone=faker.phoneNumber().cellPhone();
    String email = ConfigReader.getProperty("vendor-email");
    String state = faker.country().capital();




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
        Assert.assertTrue(checkoutPage.productReview.isDisplayed());
    }

    @Test
    public void test3(){

        homePage.login(ConfigReader.getProperty("vendor-email"),ConfigReader.getProperty("vendor-pass"));
        ReusableMethods.waitFor(3);

        homePage_svm.searchButton.sendKeys("sweatshirt", Keys.ENTER);
        ReusableMethods.waitFor(3);

        homePage_svm.sweatShirtLosAngeles.click();
        ReusableMethods.waitFor(3);

        homePage_svm.addToCart.click();

        homePage_svm.searchButton.sendKeys("Kadin Mont", Keys.ENTER);

        homePage_svm.mont.click();
        ReusableMethods.waitFor(3);

        ReusableMethods.clickByJS(homePage_svm.addToCart);

        homePage_svm.cartToggle.click();

        Assert.assertTrue(homePage_svm.cartProduct1.getText().contains("Sweatshirt"));
        Assert.assertTrue(homePage_svm.cartProduct2.getText().contains("Mont"));

        homePage_svm.checkoutButton.click();
        Assert.assertTrue(checkoutPage.productReview.isDisplayed());


        checkoutPage.FirstName.sendKeys(firstname,Keys.TAB,lastname);
        Select selectCountryRegion = new Select(checkoutPage.countryRegionDropDown);
        selectCountryRegion.selectByIndex(3);

        Select selectCountry = new Select(checkoutPage.countryDropDown);
        selectCountry.selectByIndex(5);

        checkoutPage.zipCode.sendKeys(zip, Keys.TAB,phone);

        ReusableMethods.clickByJS(checkoutPage.differentAdressRadioButton);

        checkoutPage.shippingFirstName.sendKeys(firstname,Keys.TAB,lastname);
        Select selectShippingCountry = new Select(checkoutPage.shippingCountry);
        selectShippingCountry.selectByIndex(8);
        checkoutPage.shippingAdress.sendKeys(adresse,Keys.TAB,Keys.TAB,city,Keys.TAB,state,Keys.TAB,zip);









    }

    @Test
    public void test4(){

        homePage.login(ConfigReader.getProperty("vendor-email"),ConfigReader.getProperty("vendor-pass"));
        ReusableMethods.waitFor(3);

        homePage_svm.searchButton.sendKeys("sweatshirt", Keys.ENTER);
        ReusableMethods.waitFor(3);

        homePage_svm.sweatShirtLosAngeles.click();
        ReusableMethods.waitFor(3);

        homePage_svm.addToCart.click();

        homePage_svm.searchButton.sendKeys("Kadin Mont", Keys.ENTER);

        homePage_svm.mont.click();
        ReusableMethods.waitFor(3);

        ReusableMethods.clickByJS(homePage_svm.addToCart);

        homePage_svm.cartToggle.click();

        Assert.assertTrue(homePage_svm.cartProduct1.getText().contains("Sweatshirt"));
        Assert.assertTrue(homePage_svm.cartProduct2.getText().contains("Mont"));

        homePage_svm.checkoutButton.click();
        Assert.assertTrue(checkoutPage.productReview.isDisplayed());


        checkoutPage.FirstName.sendKeys(firstname,Keys.TAB,lastname);
        Select selectCountryRegion = new Select(checkoutPage.countryRegionDropDown);
        selectCountryRegion.selectByIndex(3);

        Select selectCountry = new Select(checkoutPage.countryDropDown);
        selectCountry.selectByIndex(5);

        checkoutPage.zipCode.sendKeys(zip, Keys.TAB,phone);

        ReusableMethods.clickByJS(checkoutPage.differentAdressRadioButton);

        checkoutPage.shippingFirstName.sendKeys(firstname,Keys.TAB,lastname);
        Select selectShippingCountry = new Select(checkoutPage.shippingCountry);
        selectShippingCountry.selectByIndex(8);
        checkoutPage.shippingAdress.sendKeys(adresse,Keys.TAB,Keys.TAB,city,Keys.TAB,state,Keys.TAB,zip);

        Assert.assertTrue(checkoutPage.amount.isDisplayed());
        checkoutPage.payAtDoor.click();
        checkoutPage.wisePay.click();










    }

    @Test
    public void test5(){

        homePage.login(ConfigReader.getProperty("vendor-email"),ConfigReader.getProperty("vendor-pass"));
        ReusableMethods.waitFor(3);

        homePage_svm.searchButton.sendKeys("sweatshirt", Keys.ENTER);
        ReusableMethods.waitFor(3);

        homePage_svm.sweatShirtLosAngeles.click();
        ReusableMethods.waitFor(3);

        homePage_svm.addToCart.click();

        homePage_svm.searchButton.sendKeys("Kadin Mont", Keys.ENTER);

        homePage_svm.mont.click();
        ReusableMethods.waitFor(3);

        ReusableMethods.clickByJS(homePage_svm.addToCart);

        homePage_svm.cartToggle.click();

        Assert.assertTrue(homePage_svm.cartProduct1.getText().contains("Sweatshirt"));
        Assert.assertTrue(homePage_svm.cartProduct2.getText().contains("Mont"));

        homePage_svm.checkoutButton.click();
        Assert.assertTrue(checkoutPage.productReview.isDisplayed());


        checkoutPage.FirstName.sendKeys(firstname,Keys.TAB,lastname);
        Select selectCountryRegion = new Select(checkoutPage.countryRegionDropDown);
        selectCountryRegion.selectByIndex(3);

        Select selectCountry = new Select(checkoutPage.countryDropDown);
        selectCountry.selectByIndex(5);

        checkoutPage.zipCode.sendKeys(zip, Keys.TAB,phone);

        ReusableMethods.clickByJS(checkoutPage.differentAdressRadioButton);

        checkoutPage.shippingFirstName.sendKeys(firstname,Keys.TAB,lastname);
        Select selectShippingCountry = new Select(checkoutPage.shippingCountry);
        selectShippingCountry.selectByIndex(8);
        checkoutPage.shippingAdress.sendKeys(adresse,Keys.TAB,Keys.TAB,city,Keys.TAB,state,Keys.TAB,zip);

        Assert.assertTrue(checkoutPage.amount.isDisplayed());
        ReusableMethods.clickByJS(checkoutPage.payAtDoor);
        ReusableMethods.clickByJS(checkoutPage.wisePay);

        ReusableMethods.clickByJS(checkoutPage.placeOrderButton);
        Assert.assertTrue(checkoutPage.successMessage.isDisplayed());



    }


    @Test
    public void test6() {

        homePage.login(ConfigReader.getProperty("vendor-email"), ConfigReader.getProperty("vendor-pass"));
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(homePage_svm.MyAccountButton);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(myAccountPage.orderButton);
        Assert.assertTrue(myAccountPage.ordersHeader.isDisplayed());
    }

    }
