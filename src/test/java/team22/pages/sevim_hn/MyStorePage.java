package team22.pages.sevim_hn;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import team22.utilities.Driver;

public class MyStorePage {

    public MyStorePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='wcfm_menu_items wcfm_menu_wcfm-coupons']/a")
    public WebElement CouponsButton;

    @FindBy(xpath = "//*[@id='add_new_coupon_dashboard']")
    public WebElement CouponsAddNew;





}

