package team22.tests.gul.us_3;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.gul_hn.HomepageGul;
import team22.utilities.ReusableMethods;

public class TC_04 {
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
    //Kullanici Street Adress alanini bos birakir
    //Kullanici Town / City alanina valid bir deger girer.
    //Kullanici ZIP code alanina valid bir deger girer.
    //Kullanici Phone bolumune  valid bir numara girer
    //Kullanici email adrsinin otomatik geldigini gorur
    //Kullanici SAVE ADDRESS alanina tiklar .
    //Kullanici "Street address  is a required field." mesajini gorur.
    HomepageGul homepageGul=new HomepageGul();
    @Test
    public void testAdres_NegativeTest() {
        homepageGul.ilkAdimlar();

        Faker faker=new Faker();
        String firstname=faker.name().firstName();
        String lastname=faker.name().lastName();
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

        //Kullanici Street Adress alanini bos birakir

        //Kullanici Town / City alanina valid bir deger girer.
        homepageGul.city.sendKeys(city);

        //Kullanici ZIP code alanina valid bir deger girer.
        homepageGul.zip.sendKeys(zip);

        //Kullanici Phone bolumune  valid bir numara girer
        homepageGul.phone.sendKeys(phone);

        //Kullanici email adrsinin otomatik geldigini gorur
        ReusableMethods.verifyElementDisplayed(homepageGul.email);

        //Kullanici SAVE ADDRESS alanina tiklar .
        ReusableMethods.clickByJS(homepageGul.saveAdresse);

        //Kullanici "Street address  is a required field." mesajini gorur.
        ReusableMethods.getScreenshot("NegativeAdress");
        ReusableMethods.waitFor(2);
        Assert.assertEquals(homepageGul.ereurMessage.getText(),"Street address is a required field.");




    }
}
