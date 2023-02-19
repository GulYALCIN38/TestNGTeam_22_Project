package team22.pages.sevim_hn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team22.utilities.Driver;

public class MyStorePage {

    public MyStorePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='wcfm_menu_items wcfm_menu_wcfm-coupons']")
    public WebElement CouponsButton;

    @FindBy(xpath = "//*[@class='wcfm_sub_menu_items wcfm_sub_menu_items_coupon_manage moz_class']")
    public WebElement CouponsAddNew;



}

