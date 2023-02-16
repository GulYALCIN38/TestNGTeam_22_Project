package team22.tests.huseyin.US01;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.pages.huseyin_bey.Registeration;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

import java.time.Duration;

public class TC02_RegsiterationNoEmail {
    Registeration registeration = new Registeration();
    HomePage homePage= new HomePage();


/*Username *
Your Email address *
Password *
Signup as a vendor?
I agree to the privacy policy*/

    @Test
    public void TC002() {
        Driver.getDriver().get(ConfigReader.getProperty("app-url"));
        registeration.registerButonu.click();
        ReusableMethods.waitFor(3);
        registeration.signUp.click();
        ReusableMethods.waitFor(2);
        Faker faker = new Faker();
        String username = faker.name().fullName();
        String email = faker.internet().emailAddress();
        String paswoord = faker.internet().password();
        homePage.registerUsername.sendKeys("", Keys.TAB, email, Keys.TAB,paswoord, Keys.ENTER, Keys.SPACE, Keys.ENTER);
        ReusableMethods.waitFor(2);





    }
}

