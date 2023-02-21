package team22.pages.zehra_hn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team22.utilities.Driver;

public class AllureStorePage {
    public AllureStorePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="(//span[@class='text'])[4]")
    public WebElement product;


    @FindBy(xpath="(//*[text()='Add New'])[1]")
    public WebElement addNew;

    @FindBy(xpath = "//select[@id='product_type']")
    public  WebElement  simpleProduct;

}
