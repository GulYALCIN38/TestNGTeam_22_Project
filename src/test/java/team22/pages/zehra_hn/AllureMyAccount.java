package team22.pages.zehra_hn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team22.utilities.Driver;

public class AllureMyAccount {
    public AllureMyAccount(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//*[text()='Store Manager']")
    public WebElement storeManager;

    @FindBy(xpath="//a[text()='Addresses']")
    public WebElement adres;

    @FindBy(xpath="(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public WebElement shippingAdd;

    @FindBy(xpath="//*[@id='shipping_first_name']")
    public WebElement shippingFirstname;

    @FindBy(xpath="//input[@id='shipping_last_name']")
    public WebElement shippingLastname;
    @FindBy(xpath="//input[@id='shipping_company']")
    public WebElement companyName;

    @FindBy(id="select2-shipping_country-container")
    public WebElement shippingCountry;

    @FindBy(id="select2-search__field")
    public WebElement shippingCountry2;

    @FindBy(xpath="//input[@id='shipping_address_1']")
    public WebElement streetAdres;

    @FindBy(xpath="//input[@id='shipping_postcode']")
    public WebElement postcode;

    @FindBy(xpath="//input[@id='shipping_city']")
    public WebElement townCity;

    @FindBy(xpath="//span[@id='select2-shipping_state-container']")
    public WebElement province;



}
