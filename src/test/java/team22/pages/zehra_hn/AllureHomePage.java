package team22.pages.zehra_hn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team22.utilities.Driver;

public class AllureHomePage {
    public AllureHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='username']")
    public WebElement mailKutusu;

    @FindBy(xpath="//input[@id='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath="//a[@class='login inline-type']")
    public WebElement signIn;

    @FindBy(xpath="//button[.='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath="(//*[text()='My Account'])[1]")
    public WebElement myAccount;
}
