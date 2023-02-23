package team22.pages.sevim_hn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team22.utilities.Driver;

public class CouponsPage {

    public CouponsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//tr[@role='row'])[2]")
    public WebElement lastCreatedCoupon;
}
