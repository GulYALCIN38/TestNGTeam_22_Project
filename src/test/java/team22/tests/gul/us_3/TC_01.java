package team22.tests.gul.us_3;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.gul_hn.HomepageGul;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

import java.time.Duration;

public class TC_01 {
    //Kullanıcı anasayfayı açar
    //Kullanıcı uygulamaya login olur
    //Kullanici, My Account butonuna tiklar
    //Kullanici Addresse bolumune tiklar.
    //Kullanici 'Biling Adress' bolumunu gorur
    //Kullanici, add butonuna tiklar
    //Kullanici First name alanina valid bir deger girer
    //Kullanici Lastname alanina valid bir deger girer
    //Kullanici Country /Region alanini bos birakir
    //Kullanici Street Adress alanina valid bir deger girer.
    //Kullanici Town / City alanina valid bir deger girer.
    //Kullanici ZIP code alanina valid bir deger girer.
    //Kullanici Phone bolumune  valid bir numara girer
    //Kullanici email adrsinin otomatik geldigini gorur
    //Kullanici SAVE ADDRESS alanina tiklar .
    //Kullanici " Country / Region is a required field." mesajini gorur.
    HomepageGul homepageGul=new HomepageGul();
    @Test
    public void testCountryRegion_negatif() {
        homepageGul.ilkAdimlar();


        Faker faker=new Faker();
        String firstname=faker.name().firstName();
        String lastname=faker.name().lastName();
        String adresse=faker.address().streetAddress();
        String city=faker.address().city();
        String zip=faker.address().zipCode();
        String phone=faker.phoneNumber().cellPhone();

        //Kullanici First name alanina valid bir deger girer
        //Kullanici Lastname alanina valid bir deger girer
        homepageGul.firstName.sendKeys(firstname, Keys.TAB,lastname);


        //Kullanici Country /Region alanini bos birakir
        //Kullanici Street Adress alanina valid bir deger girer.
        //Kullanici Town / City alanina valid bir deger girer.
        //Kullanici ZIP code alanina valid bir deger girer.
        //Kullanici Phone bolumune  valid bir numara girer
        homepageGul.streetAdresse.sendKeys(adresse,Keys.TAB,Keys.TAB,city,Keys.TAB,Keys.TAB,zip,Keys.TAB,phone);

        //Kullanici email adrsinin otomatik geldigini gorur
        ReusableMethods.verifyElementDisplayed(homepageGul.email);
        //Kullanici SAVE ADDRESS alanina tiklar .
        ReusableMethods.clickByJS(homepageGul.saveAdresse);
        ReusableMethods.getScreenshot("country_negative");

        //Kullanici " Country / Region is a required field." mesajini gorur.



        WebElement w=homepageGul.ereurMessage;
        assert w.isDisplayed();
        Assert.assertEquals(w.getText(),"Country / Region is a required field.");




    }


}
