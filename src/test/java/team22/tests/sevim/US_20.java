package team22.tests.sevim;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.sevim_hn.*;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class US_20 {

    HomePage_svm homePage_svm = new HomePage_svm();
    CheckoutPage checkoutPage = new CheckoutPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    HomePage homePage = new HomePage();
    MyStorePage myStorePage = new MyStorePage();
    AddCouponsPage addCouponsPage = new AddCouponsPage();
    Faker faker = new Faker();
    @Test
    public void test01() {

            homePage.login(ConfigReader.getProperty("vendor-email"), ConfigReader.getProperty("vendor-pass"));
            ReusableMethods.waitForClickablility(homePage_svm.MyAccountButton, 3);
            ReusableMethods.waitFor(4);
            ReusableMethods.clickByJS(homePage_svm.MyAccountButton);
            ReusableMethods.clickByJS(myAccountPage.storeManager);
            ReusableMethods.clickByJS(myStorePage.CouponsButton);
            ReusableMethods.clickByJS(myStorePage.CouponsAddNew);
            addCouponsPage.codeArea.sendKeys(ConfigReader.getProperty("coupon_code"), Keys.TAB,ConfigReader.getProperty("coupon_description"));
            Select select = new Select(addCouponsPage.discountType);
            select.selectByIndex(0);
            addCouponsPage.couponAmount.clear();
            addCouponsPage.couponAmount.sendKeys(ConfigReader.getProperty("coupon_amount"));
            addCouponsPage.expiryDate.sendKeys(ConfigReader.getProperty("coupon_expiry_date"),Keys.TAB);
            ReusableMethods.clickByJS(addCouponsPage.freeShippingOption);
            Assert.assertTrue(addCouponsPage.freeShippingOption.isSelected());
            ReusableMethods.clickByJS(addCouponsPage.freeShippingOption);
            addCouponsPage.minSpend.sendKeys(ConfigReader.getProperty("minimum_spend"));
            ReusableMethods.clickByJS(addCouponsPage.individualUseOnlyOption);
            Assert.assertTrue(addCouponsPage.individualUseOnlyOption.isSelected());
            ReusableMethods.clickByJS(addCouponsPage.individualUseOnlyOption);
            Assert.assertFalse(addCouponsPage.individualUseOnlyOption.isSelected());
            ReusableMethods.clickByJS(addCouponsPage.individualUseOnlyOption);
            ReusableMethods.clickByJS(addCouponsPage.excludeSaleItemsOption);
            Assert.assertTrue(addCouponsPage.excludeSaleItemsOption.isSelected());
            ReusableMethods.clickByJS(addCouponsPage.excludeSaleItemsOption);

            addCouponsPage.products.sendKeys(ConfigReader.getProperty("productApple"));
            ReusableMethods.waitForVisibility(addCouponsPage.highlightedOption,3);
            ReusableMethods.hover(addCouponsPage.highlightedOption);
            addCouponsPage.highlightedOption.click();

            addCouponsPage.products.sendKeys(ConfigReader.getProperty("productJBL"),Keys.ENTER);
            ReusableMethods.waitForVisibility(addCouponsPage.highlightedOption,3);
            ReusableMethods.hover(addCouponsPage.highlightedOption);
            addCouponsPage.highlightedOption.click();

            addCouponsPage.products.sendKeys(ConfigReader.getProperty("productMat"),Keys.ENTER);
            ReusableMethods.waitForVisibility(addCouponsPage.highlightedOption,3);
            ReusableMethods.hover(addCouponsPage.highlightedOption);
            addCouponsPage.highlightedOption.click();

            addCouponsPage.excludeProducts.sendKeys(ConfigReader.getProperty("excludeProductGold"),Keys.ENTER);
            ReusableMethods.waitForVisibility(addCouponsPage.highlightedOption,3);
            ReusableMethods.hover(addCouponsPage.highlightedOption);
            addCouponsPage.highlightedOption.click();

            addCouponsPage.excludedCategories.sendKeys(ConfigReader.getProperty("excludeCategories"),Keys.ENTER);
            ReusableMethods.waitForVisibility(addCouponsPage.highlightedOption,3);
            ReusableMethods.scrollIntoViewJS(addCouponsPage.highlightedOption);
            ReusableMethods.hover(addCouponsPage.highlightedOption);
            addCouponsPage.highlightedOption.click();


            addCouponsPage.customerEmail.sendKeys(faker.howIMetYourMother().character()+"@email.com");



        }
    }
