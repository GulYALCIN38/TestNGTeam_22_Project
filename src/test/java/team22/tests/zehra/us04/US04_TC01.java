package team22.tests.zehra.us04;


import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.zehra_hn.AllureAddProduct;
import team22.pages.zehra_hn.AllureHomePage;
import team22.pages.zehra_hn.AllureMyAccount;
import team22.pages.zehra_hn.AllureStorePage;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class US04_TC01{
//TUM ALANLARIN DOLDURULMASI==>POZITIF TEST



    @Test
    public void TC001(){
        AllureStorePage allureStorePage=new AllureStorePage();
        AllureAddProduct allureAddProduct=new AllureAddProduct();
        AllureMyAccount allureMyAccount=new AllureMyAccount();
        AllureHomePage allureHomePage=new AllureHomePage();
        HomePage homePage=new HomePage();

        //sign-up islemleri

        Faker faker=new Faker();
        String username=faker.name().fullName();
       // ReusableMethods.waitFor(2);
        Driver.getDriver().get(ConfigReader.getProperty("fakemail"));
        ReusableMethods.waitFor(3);
        String mail=allureMyAccount.fakeMail.getText();
        Driver.getDriver().get(ConfigReader.getProperty("app-url"));
        ReusableMethods.clickByJS(homePage.registerButonu);
        homePage.registerUsername.sendKeys(username, Keys.TAB,mail,Keys.TAB,"ZRbam2007!",Keys.ENTER,Keys.SPACE,Keys.ENTER);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS( allureHomePage.myAccount);
       ReusableMethods.clickByJS(allureMyAccount.adres);
      ReusableMethods.clickByJS(allureMyAccount.shippingAdd);
       ReusableMethods.waitFor(2);

//        shipping adres bilgilerinin doldurulmasi

        allureMyAccount.shippingFirstname.sendKeys(faker.name().firstName());
        allureMyAccount.shippingLastname.sendKeys(faker.name().lastName());
       // actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(5);
        Select select=new Select(allureMyAccount.shippingCountry);
        select.selectByVisibleText("Turkey");
        allureMyAccount.streetAdres.sendKeys(faker.address().streetAddress());
       allureMyAccount.postcode.sendKeys("1234");
       allureMyAccount.townCity.sendKeys("isparta");
       Select province=new Select(allureMyAccount.province);
      province.selectByVisibleText("Isparta");
      ReusableMethods.clickByJS(allureMyAccount.saveAdres);
        ReusableMethods.getScreenshot("us04 tc01");
        ReusableMethods.waitFor(2);
        Assert.assertEquals(allureMyAccount.succesMessage.getText(),"Address changed successfully.");
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(allureAddProduct.signOut);
        ReusableMethods.clickByJS(allureAddProduct.logout);
      Driver.closeDriver();















    }
}
