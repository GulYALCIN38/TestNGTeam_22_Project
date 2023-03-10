package team22.pages.sevim_hn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team22.utilities.Driver;

public class CheckoutPage {

    public CheckoutPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h3[@id='order_review_heading']")
    public WebElement productReview;

    @FindBy(xpath = "//input[@id='billing_first_name']")
    public WebElement FirstName;

    @FindBy(xpath = "//select[@id='billing_state']")
    public WebElement stateDropDown;

    @FindBy(xpath = "//select[@id='billing_country']")
    public WebElement countryRegionDropDown;

    @FindBy(xpath = "//select[@id='billing_state']")
    public WebElement countryDropDown;

    @FindBy(xpath = "//input[@id='billing_postcode']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@id='ship-to-different-address-checkbox']")
    public WebElement differentAdressRadioButton;

    @FindBy(xpath = "//input[@id='shipping_first_name']")
    public WebElement shippingFirstName;

    @FindBy(xpath = "//select[@id='shipping_country']")
    public WebElement shippingCountry;

    @FindBy(xpath = "//*[@id='shipping_city_field']")
    public WebElement shippingCity;

    @FindBy(xpath = "//select[@id='shipping_state']")
    public WebElement shippingState;

    @FindBy(xpath = "//*[@id='shipping_postcode']")
    public WebElement shippingPostcode;

    @FindBy(xpath = "//*[@id='shipping_address_1']")
    public WebElement shippingAdress;

    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[7]")
    public WebElement amount;

    @FindBy(xpath = "//*[@id='payment_method_cod']")
    public WebElement payAtDoor ;

    @FindBy(xpath = "//*[@id='payment_method_bacs']")
    public WebElement wisePay ;

    @FindBy(xpath = "//button[@id='place_order']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//*[@class='woocommerce-error']")
    public WebElement successMessage;

    @FindBy(xpath = "//*[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement orderReceivedMessage;

    @FindBy(xpath = "//a[@class='showcoupon']")
    public WebElement enterYourCode;

    @FindBy(xpath = "//input[@name='coupon_code']")
    public WebElement couponCode;

}
