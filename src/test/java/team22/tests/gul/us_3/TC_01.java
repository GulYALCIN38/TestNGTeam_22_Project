package team22.tests.gul.us_3;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.gul_hn.HomepageGul;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

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
    HomePage homePage=new HomePage();
    HomepageGul homepageGul=new HomepageGul();
    @Test
    public void testCountryRegion_negatif() {
        //Kullanıcı anasayfayı açar
        //Kullanıcı uygulamaya login olur
        homePage.login("zeliha yalcin","Endemik38*");
        ReusableMethods.waitFor(3);

        //Kullanici, My Account butonuna tiklar
        homepageGul.myAccount.click();
        ReusableMethods.waitFor(3);


        //Kullanici Addresse bolumune tiklar.
        ReusableMethods.clickByJS(homepageGul.adresse);

      /*  JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",homepageGul.adresse);*/

        //Kullanici 'Biling Adress' bolumunu gorur
        assert homepageGul.bilingAdresse.isDisplayed();

        //Kullanici, add butonuna tiklar
        ReusableMethods.clickByJS(homepageGul.add);
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
        //Kullanici SAVE ADDRESS alanina tiklar .
        ReusableMethods.clickByJS(homepageGul.saveAdresse);

        //Kullanici " Country / Region is a required field." mesajini gorur.


        WebElement w=Driver.getDriver().findElement(By.xpath("//li[.=' Country / Region is a required field.']"));
        ReusableMethods.waitForVisibility(w,5);
        
        assert w.isDisplayed();


    }

    @Test
    public void testName() {
        Faker faker=new Faker();
        String firstname=faker.name().firstName();
        String lastname=faker.name().lastName();
        String adresse=faker.address().streetAddress();
        System.out.println("adresse = " + adresse);
    }
}
