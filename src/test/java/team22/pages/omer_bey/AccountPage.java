package team22.pages.omer_bey;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team22.utilities.Driver;

public class AccountPage {

    public AccountPage() {

        PageFactory.initElements(Driver.getDriver(), this); // giris baglanti driver icin

    }

    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement myaccounttext;

}

//  Driver.getDriver().findElement(By.xpath("(//*[@class='w-icon-account'])[1]")).click();
    // Driver.getDriver().get(ConfigReader.getProperty("proje_Email");
    //   //*[@id='username'] username box
    //   //*[@id='password']  password box
    //    //*[@name='login'] sign in login
    //    //*[@data-id='4f60ebc3'] My Account click yapilacak
    //Store manager xpath i nasil alinir

    //orta bolum orders xpath ==> //*[@class='icon-box-icon icon-orders']
    //orta bolum downloads ==> //*[@class='icon-box-icon icon-downloads']
    //orta bolum address ==>  //*[@class='icon-box-icon icon-addresses']
    // orta bolum account details ==> //*[@class='icon-box-icon icon-account']
    // orta bolum wishlist ==>  //*[@class='icon-box-icon icon-wishlist']
    // orta bolum logout ==>   //*[@class='icon-box-icon icon-logout']

        /*AllureLoginPage allureLoginPage = new AllureLoginPage();
        AllureHomePage allureHomePage = new AllureHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("proje_url"));
       allureLoginPage.username.sendKeys(ConfigReader.getProperty("proje_Email"));
        allureLoginPage.password.sendKeys(ConfigReader.getProperty("proje_Pass"));
       allureLoginPage.submitButton.click();
*/

