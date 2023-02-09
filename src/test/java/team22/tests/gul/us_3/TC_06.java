package team22.tests.gul.us_3;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.gul_hn.HomepageGul;
import team22.utilities.ReusableMethods;

public class TC_06 {

    //Kullanıcı anasayfayı açar
    //Kullanıcı uygulamaya login olur
    //Kullanici, My Account butonuna tiklar
    //Kullanici Addresse bolumune tiklar.
    //Kullanici 'Biling Adress' bolumunu gorur
    //Kullanici, add butonuna tiklar
    //Kullanici First name alanina valid bir deger girer
    //Kullanici Lastname alanina valid bir deger girer
    //Kullanici Country /Region alanina tiklar.
    //Kullanici Country alaninda cikan dropdowndan ulke secer.
    //Kullanici Street Adress alanina valid bir deger girer.
    //Kullanici Town / City alanini bos birakir
    //Kullanici ZIP code alanina valid bir deger girer.
    //Kullanici Phone bolumune  valid bir numara girer
    //Kullanici email adrsinin otomatik geldigini gorur
    //Kullanici SAVE ADDRESS alanina tiklar .
    //Kullanici " Town / City is a required field." mesajini gorur.

    HomepageGul homepageGul=new HomepageGul();
    @Test
    public void testCity_negative() {
        homepageGul.ilkAdimlar();

        Faker faker=new Faker();
        String firstname=faker.name().firstName();
        String lastname=faker.name().lastName();
        String adresse=faker.address().streetAddress();
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

        //Kullanici Town / City alanini bos birakir  //----------> tadeo.masir@foundtoo.com//zeliha yalcinn

        //Kullanici ZIP code alanina valid bir deger girer.
        homepageGul.zip.sendKeys("66450");

        //Kullanici Phone bolumune  valid bir numara girer
        homepageGul.phone.sendKeys(phone);

        //Kullanici email adrsinin otomatik geldigini gorur
        ReusableMethods.verifyElementDisplayed(homepageGul.email);

        //Kullanici SAVE ADDRESS alanina tiklar .
        ReusableMethods.clickByJS(homepageGul.saveAdresse);

        //Kullanici " Town / City is a required field." mesajini gorur.
        ReusableMethods.getScreenshot("NegativeCity");
        ReusableMethods.waitFor(2);
        Assert.assertEquals(homepageGul.ereurMessage.getText(),"Town / City is a required field.");


    }
}
