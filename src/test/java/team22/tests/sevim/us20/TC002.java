package team22.tests.sevim.us20;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.sevim_hn.*;
import team22.utilities.ConfigReader;
import team22.utilities.ReusableMethods;

public class TC002 {


    @Test
    public void minimumSpendTest() {
        HomePage_svm homePage_svm = new HomePage_svm();
        MyAccountPage myAccountPage = new MyAccountPage();
        HomePage homePage = new HomePage();
        MyStorePage myStorePage = new MyStorePage();
        AddCouponsPage addCouponsPage = new AddCouponsPage();
        Faker faker = new Faker();
        homePage.login(ConfigReader.getProperty("vendor-email"), ConfigReader.getProperty("vendor-pass"));
        ReusableMethods.waitForClickablility(homePage_svm.MyAccountButton, 3);
        ReusableMethods.waitFor(4);
        ReusableMethods.clickByJS(homePage_svm.MyAccountButton);
        ReusableMethods.clickByJS(myAccountPage.storeManager);
        ReusableMethods.clickByJS(myStorePage.CouponsButton);
        ReusableMethods.clickByJS(myStorePage.CouponsAddNew);
        ReusableMethods.clickByJS(addCouponsPage.freeShippingOption);
        addCouponsPage.minSpend.sendKeys("yok"); // rakam haric karakter kabul edilmez
        Assert.assertFalse(addCouponsPage.minSpend.getText().contains("yok"));
        homePage_svm.logout();
    }




}


