package team22.pages.sevim_hn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team22.utilities.Driver;

public class AddCouponsPage {

    public AddCouponsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='title']")
    public WebElement codeArea;

    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement descriptionArea;

    @FindBy(xpath = "//select[@id='discount_type']")
    public WebElement discountType;

    @FindBy(xpath = "//input[@id='coupon_amount']")
    public WebElement couponAmount;

    @FindBy(xpath = "//input[@id='expiry_date']")
    public WebElement expiryDate;

    @FindBy(xpath = "//input[@id='free_shipping']")
    public WebElement freeShippingOption;

    @FindBy(xpath = "//input[@id='show_on_store']")
    public WebElement showOnStoreOption;

    @FindBy(xpath = "//input[@id='minimum_amount']")
    public WebElement minSpend ;

    @FindBy(xpath = "//input[@id='maximum_amount']")
    public WebElement maxSpend ;

    @FindBy(xpath = "//input[@id='individual_use']")
    public WebElement individualUseOnlyOption;

    @FindBy(xpath = "//input[@id='exclude_sale_items']")
    public WebElement excludeSaleItemsOption;

    @FindBy(xpath = "//input[@id='customer_email']")
    public WebElement customerEmail;

    @FindBy(xpath = "(//input[@class='select2-search__field'])[1]")
    public WebElement products;

    @FindBy(xpath = "//li[@class='select2-results__option select2-results__option--highlighted']")
    public WebElement highlightedOption ;

    @FindBy(xpath = "(//*[@class='select2-search__field'])[2]")
    public WebElement excludeProducts;

    @FindBy(xpath = "(//*[@class='select2-search__field'])[3]")
    public WebElement categories;

    @FindBy(xpath = "(//*[@class='select2-search__field'])[4]")
    public WebElement excludedCategories;

    @FindBy(xpath = "(//input[@type='submit']) [1]")
    public WebElement submit;





}
