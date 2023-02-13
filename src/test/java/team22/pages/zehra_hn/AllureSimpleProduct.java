package team22.pages.zehra_hn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team22.utilities.Driver;

public class AllureSimpleProduct {
    public AllureSimpleProduct(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//input[@id='is_virtual']")
    public WebElement virtual;

    @FindBy(xpath="//*[@id='is_downloadable']")
    public WebElement downloadable;

    @FindBy(xpath="//*[@id='regular_price']")
    public WebElement price;

    @FindBy(xpath="//*[@ID='sale_price']")

    public WebElement salePrice;
    @FindBy(xpath="//*[@id='pro_title']")
    public WebElement proTitle;

}
