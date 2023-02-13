package team22.pages.huseyin_bey;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team22.utilities.Driver;

//You shou first

/*PageFactory >>>>>         class from the Selenium WebDriver
library to initialize the WebElements defined in the class using the @FindBy annotations.
 Driver.getDriver()....>>>> method returns the instance of the WebDriver
  which is being used in the current test execution
  */
public class AddProduct {
    public AddProduct()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //buraya locate ettiklerini yaz
    @FindBy(id= "menu-item-1074")
    public WebElement myAccountButton;

    @FindBy(linkText = "My Account")
    public WebElement myAccount;

    @FindBy(xpath="//*[text()='Store Manager']")
    public WebElement MenustoreManager;


    @FindBy(xpath="//*[text()='Store Manager']")
    public WebElement menuStoreManager;

    // For the element with xpath: //*[@id="wcfm_menu"]/div[5]/a/span[1]
    // @FindBy(xpath = "//a[@href='https://allure2you.com/store-manager/products/']")
    // @FindBy(xpath = "//span[text()='Products']")
    @FindBy(xpath = "//a[contains(@href, 'allure2you.com/store-manager/products/')]")
    public WebElement products;


    // @FindBy(xpath = "//*[@id='add_new_product_dashboard']/span[2]")
    // @FindBy(id = "add_new_product_dashboard")
    @FindBy(xpath = "//a[@id='add_new_product_dashboard']")

   // @FindBy(css = "a#add_new_product_dashboard")
    public WebElement addNew;

    // For the select element with id: "product_type"
    @FindBy(xpath = "//select[@id='product_type']")
    public  WebElement productTypeSelect;

    @FindBy(xpath = "//*[@id='catalog_visibility']")
    public WebElement catalogVisibility;
    @FindBy(id = "pro_title")
    public  WebElement productTittleWrite;
    @FindBy(id =" media-search-input")
    public  WebElement searchinput;

    @FindBy(className = "media-button-insert")
    private WebElement insertIntoPostButton;

    //  verify price elementaddable visible and clickable
    @FindBy(id = "regular_price")
    public  WebElement regularPrice;


    //salePrice
    @FindBy(xpath = "//*[@id='sale_price']")
    public  WebElement salePrice;

    @FindBy(css = ".description.wcfm_ele.simple.external.non-variable-subscription.non-auction.non-redq_rental.non-accommodation-booking.non-lottery.non-pw-gift-card.sales_schedule")
    private WebElement salesScheduleDescription;

    @FindBy(id = "sale_date_from")
    public  WebElement saleDateFrom;

    @FindBy(id = "sale_date_upto")
    public  WebElement saleDateUpto;

    @FindBy(xpath = "//*[@id='insert-media-button']")
    public WebElement FirstinsertMediaButton;

    //   oplouad foto select butonu verify if visible, clickable.
    @FindBy(id = "featured_img_display")
    public WebElement buyukFoto;

    @FindBy( id= "gallery_img_gimage_0_display")
    public WebElement kucukFoto;

//    @FindBy(xpath = "//button[@class='media-button button-primary button-large media-button-insert']")
//    public WebElement insertIntoPostButton;

    @FindBy(id = "__wp-uploader-id-1")
    public  WebElement selectFilesButton;

    //verify if visible
    @FindBy(css = ".upload-dismiss-errors")
    public WebElement dismissErrorsmessage;


    //   seconInsertMediaButton  verify if visible, clickable.
    @FindBy(xpath ="//button[@class='button media-button button-primary button-large media-button-insert']")
    public  WebElement InsertintoButton;

    @FindBy(id = "product_url")
    public  WebElement productUrl;

    @FindBy(id = "button_text")
    public  WebElement buttonText;


//    @FindBy(id ="catalog_visibility")
//    public  WebElement catalogVisibility;

    @FindBy(id="wcfm_products_simple_submit_button")
    public  WebElement submitButton;

    // add a new category link to add new category
    @FindBy(xpath= "p[@class='description wcfm_full_ele wcfm_side_add_new_category wcfm_add_new_category wcfm_add_new_taxonomy']")
    public  WebElement linkAddNewCategory ;

    @FindBy(xpath= "//*[@id='wcfm_new_parent_cat']")
    public  WebElement SelecetParentcategory ;

    @FindBy(xpath="//*[@class='button wcfm_add_category_bt wcfm_add_taxonomy_bt']")
    public  WebElement AfterSelectAddButton ;

    @FindBy(xpath="//*[@id='menu-item-browse']" )
    public  WebElement medialibrary ;

    @FindBy(className = "product_cats_checklist_item checklist_item_298")
    public WebElement checkbox;




}
