package team22.pages.omer_bey;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team22.utilities.Driver;

public class AddressesPage {
    public AddressesPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

        @FindBy (xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
                public WebElement edit1;

    @FindBy(xpath = "//*[@id='billing_first_name']")
    public WebElement firsname;

    @FindBy (xpath = "//*[@id='billing_last_name_field']")
    public  WebElement lastname;


    @FindBy (xpath = "//*[@id='select2-billing_country-container']")
    public WebElement country;

    @FindBy (xpath = "//*[@id='billing_address_1']")
    public WebElement street;

    @FindBy (xpath = "//*[@id='billing_city']")
    public  WebElement city;

    @FindBy(xpath = "//*[@id='select2-billing_state-container']")
    public WebElement state;

    @FindBy(xpath = "//*[@id='billing_postcode']")
    public WebElement postcode;

    @FindBy(xpath = "//*[@id='billing_phone']")
    public WebElement phone;

    @FindBy(xpath = "//*[@id='billing_email']")
    public WebElement email;

    @FindBy(xpath = "//*[@name='save_address']")
    public  WebElement save;

}
