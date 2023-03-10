package team22.pages.zehra_hn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team22.utilities.Driver;

public class AllureAddProduct {
    public AllureAddProduct(){ PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//*[@id='product_url']")
    public WebElement productTitle;
    @FindBy(xpath = "//*[@id='product_url']")
    public WebElement url;

    @FindBy(xpath = "//*[@id='button_text']")
    public WebElement buttonText;

    @FindBy(xpath = "//*[@id='regular_price']")
    public WebElement price;

    @FindBy(xpath = "//*[@id='sale_price']")
    public WebElement salePrice;

    @FindBy(id = "featured_img_display")
    public WebElement buyukFoto;

    @FindBy(xpath = "//button[@class='browser button button-hero']")
    public WebElement selectFiles;
    @FindBy(xpath = "(//*[@class='media-menu-item active'])[4]")
    public WebElement uploadFiles;
    @FindBy( id= "gallery_img_gimage_0_display")
    public WebElement kucukFoto;

    @FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[2]/input[1]")
    public WebElement categories;

    @FindBy(id = "menu-item-browse")
    public WebElement mediaLibrary;

    @FindBy(xpath= "//*[@class='button media-button button-primary button-large media-button-select']")
    public WebElement selectButton;


    @FindBy(xpath= "//body/div[@id='__wp-uploader-id-2']/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/button[1]")
    public WebElement addToGallery;

    @FindBy(xpath= "//*[@id='wcfm_bulk_delete']")
    public WebElement delete;

    @FindBy(id= "__wp-uploader-id-1")
    public WebElement selectFile;
    @FindBy(id= "wcfm_products_simple_submit_button")
    public WebElement submitButton;
    @FindBy(xpath= "//body[@data-rsssl='1']")
    public WebElement succesMessage2;

    @FindBy(xpath= "//*[text()='Sign Out']")
    public WebElement signOut;

    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logout;

}




