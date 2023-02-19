package team22.pages.sevim_hn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team22.utilities.Driver;

public class MyAccountPage {

    public MyAccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='icon-box-icon icon-orders']")
    public WebElement orderButton;

    @FindBy(xpath = "//*[@class='icon-box-title text-normal']")
    public WebElement ordersHeader;

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManager;




}

