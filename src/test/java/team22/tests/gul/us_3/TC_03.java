package team22.tests.gul.us_3;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import team22.pages.gul_hn.HomepageGul;
import team22.utilities.ReusableMethods;

public class TC_03 {
    //Kullanıcı anasayfayı açar
    //Kullanıcı uygulamaya login olur
    //Kullanici, My Account butonuna tiklar
    //Kullanici Addresse bolumune tiklar.
    //Kullanici 'Biling Adress' bolumunu gorur
    //Kullanici, add butonuna tiklar
    //Kullanici First name alanina valid bir deger girer
    //Kullanici Lastname alanini bos birakir
    //Kullanici Country /Region alanina tiklar.
    //Kullanici Country alaninda cikan dropdowndan ulke secer.
    //Kullanici Street Adress alanina valid bir deger girer.
    //Kullanici Town / City alanina valid bir deger girer.
    //Kullanici ZIP code alanina valid bir deger girer.
    //Kullanici Phone bolumune  valid bir numara girer
    //Kullanici email adrsinin otomatik geldigini gorur
    //Kullanici SAVE ADDRESS alanina tiklar .
    //Kullanici " Last name is a required field." mesajini gorur.
    HomepageGul homepageGul=new HomepageGul();

    @Test
    public void testlastName_negative() {
        homepageGul.ilkAdimlar();


        Faker faker=new Faker();
        String firstname=faker.name().firstName();
        String lastname=faker.name().lastName();
        String adresse=faker.address().streetAddress();
        String city=faker.address().city();
        String zip=faker.address().zipCode();
        String phone=faker.phoneNumber().cellPhone();

        //Kullanici First name alanina valid bir deger girer
        homepageGul.firstName.sendKeys(firstname);

        //Kullanici Lastname alanini bos birakir

        //Kullanici Country /Region alanina tiklar.
        //Kullanici Country alaninda cikan dropdowndan ulke secer.
        WebElement w= homepageGul.country;
        Select select=new Select(w);
        select.selectByVisibleText("France");
        ReusableMethods.waitFor(5);
        //Kullanici Street Adress alanina valid bir deger girer.
        homepageGul.streetAdresse.sendKeys(adresse);

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

        //Kullanici " Last name is a required field." mesajini gorur.
        ReusableMethods.getScreenshot("NegativeLaststname");
        ReusableMethods.waitFor(2);
        Assert.assertEquals(homepageGul.ereurMessage.getText(),"Last name is a required field.");



    }
}
