package team22.pages.sevim_hn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import team22.utilities.Driver;

import java.util.List;

public class HomePage_svm {


    public HomePage_svm() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "(//*[@class='wolmart-icon-list-item'])[1]")
    public WebElement categoriesButton ;

    @FindBy(xpath = "//*[text()='Women']")
    public WebElement womenCategorie;

    @FindBy(xpath = "(//input[@type='search'])[1]")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@class='product-loop product-default content-center product type-product post-15307 status-publish instock product_cat-women has-post-thumbnail shipping-taxable purchasable product-type-simple']")
    public WebElement sweatShirtLosAngeles;

    @FindBy(xpath = "//*[@name='add-to-cart']")
    public WebElement addToCart;

    @FindBy(xpath = "(//img[@class='zoomImg'])[1]")
    public WebElement mont;

    @FindBy(xpath = "//*[@class='dropdown mini-basket-dropdown cart-dropdown block-type badge-type  cart-offcanvas']")
    public WebElement cartToggle;


    @FindBy(xpath = "(//li[@class='woocommerce-mini-cart-item mini-item mini_cart_item'])[1]")
    public WebElement cartProduct1;

    @FindBy(xpath = "(//li[@class='woocommerce-mini-cart-item mini-item mini_cart_item'])[2]")
    public WebElement cartProduct2;




}
