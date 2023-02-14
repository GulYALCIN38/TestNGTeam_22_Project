package team22.tests.gul;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.gul_hn.HomepageGul;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class US2 {
    //Kullanıcı anasayfayı açar
    //Kullanici register butonuna tiklar
    //Kullanici Username bolumune kayitli bir username girer
    //Kullanici Your Email address bolumune kayitli bir email girer
    //Kullanici Password  bolumune kayitli bir username girer
    //Kullanici "I agree to the privacy policy" checkout unu secer
    //Kullanici  "sign up" butonuna tiklar
    //"An account is already registered with your email address." uyarisi gorur
    HomePage homePage=new HomePage();
    HomepageGul homepageGul=new HomepageGul();
    @Test
    public void testName() {
        //Kullanıcı anasayfayı açar
        Driver.getDriver().get(ConfigReader.getProperty("app-url"));
        ReusableMethods.waitFor(2);

        //Kullanici register butonuna tiklar
        homePage.registerButonu.click();

        //Kullanici Username bolumune kayitli bir username girer
        //Kullanici Your Email address bolumune kayitli bir email girer
        //Kullanici Password  bolumune kayitli bir username girer
        //Kullanici "I agree to the privacy policy" checkout unu secer
        //Kullanici  "sign up" butonuna tiklar
        homePage.registerUsername.sendKeys("zeliha yalcin", Keys.TAB,"whichlarge@silenceofthespam.com",Keys.TAB,"Endemik38*",Keys.ENTER,Keys.SPACE,Keys.ENTER);
        ReusableMethods.waitFor(2);

        //"An account is already registered with your email address." uyarisi gorur
        String expeectedResult="An account is already registered with your email address.";
        String actuelResult=homepageGul.uyariRegister.getText();
        System.out.println("actuelResult = " + actuelResult);

        assert actuelResult.contains(expeectedResult);
        ReusableMethods.waitFor(2);

        homepageGul.closeRegister.click();
        ReusableMethods.waitFor(1);




    }

}
