package team22.tests.gul.us_3;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.gul_hn.HomepageGul;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class TC_10_positive_dynamique {
    HomepageGul homepageGul=new HomepageGul();
    HomePage homePage=new HomePage();

    @Test
    public void test_positive() {
        Faker faker=new Faker();
        String username=faker.name().fullName();
        Driver.getDriver().get(ConfigReader.getProperty("fakemail"));
        ReusableMethods.waitFor(2);
        String mail=homepageGul.fakemail.getText();

        Driver.getDriver().get(ConfigReader.getProperty("app-url"));
        //Kullanici register butonuna tiklar
        homePage.registerButonu.click();

        //Kullanici Username bolumune  bir username girer
        //Kullanici Your Email address bolumune  bir email girer
        //Kullanici Password  bolumune bir username girer
        //Kullanici "I agree to the privacy policy" checkout unu secer
        //Kullanici  "sign up" butonuna tiklar
        homePage.registerUsername.sendKeys(username, Keys.TAB,mail,Keys.TAB,"Endemik38*",Keys.ENTER,Keys.SPACE,Keys.ENTER);
        ReusableMethods.waitFor(2);

        //Kullanici, My Account butonuna tiklar
        homepageGul.myAccount.click();
        ReusableMethods.waitFor(3);


        //Kullanici Addresse bolumune tiklar.
        ReusableMethods.clickByJS( homepageGul.adresse);

      /*  JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",homepageGul.adresse);*/

        //Kullanici 'Biling Adress' bolumunu gorur
        assert  homepageGul.bilingAdresse.isDisplayed();

        //Kullanici, add butonuna tiklar
        ReusableMethods.clickByJS( homepageGul.add);

        String firstname=faker.name().firstName();
        String lastname=faker.name().lastName();
        String adresse=faker.address().streetAddress();
        String city=faker.address().city();
        String zip=faker.address().zipCode();
        String phone=faker.phoneNumber().cellPhone();
        ReusableMethods.waitFor(2);

        //Kullanici First name alanina valid bir deger girer
        //Kullanici Lastname alanina valid bir deger girer
        homepageGul.firstName.sendKeys(firstname, Keys.TAB,lastname);

        //Kullanici Country alaninda cikan dropdowndan ulke secer.
        WebElement w= homepageGul.country;
        Select select=new Select(w);
        select.selectByVisibleText("France");
        ReusableMethods.waitFor(1);

        //Kullanici Street Adress alanina valid bir deger girer.
        homepageGul.streetAdresse.sendKeys(adresse);

        //Kullanici Town / City alanina valid bir deger girer.
        homepageGul.city.sendKeys(city);

        //Kullanici ZIP code alanina valid bir deger girer.
        homepageGul.zip.sendKeys("66450");

        //Kullanici Phone bolumune  valid bir numara girer
        homepageGul.phone.sendKeys(phone);

        //Kullanici email adrsinin otomatik geldigini gorur
        ReusableMethods.verifyElementDisplayed(homepageGul.email);

        //Kullanici SAVE ADDRESS alanina tiklar .
        ReusableMethods.clickByJS(homepageGul.saveAdresse);

        //Kullanici address changed succefully mesajini gorur.
        ReusableMethods.getScreenshot("positifregistre");
        ReusableMethods.waitFor(2);
        Assert.assertEquals(homepageGul.succesfulllymessage.getText(),"Address changed successfully.");




        ReusableMethods.waitFor(2);

        ReusableMethods.clickByJS(homepageGul.logout);




    }
}
