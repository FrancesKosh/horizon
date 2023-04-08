package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(css="div[class ='first-column']") private WebElement homePageLocator;
    @FindBy(css= "div[class='report-text']")
    private WebElement reportCentreLocator;



    public boolean IsHomePageDisplayed() {
        return homePageLocator.isDisplayed();
    }

    public void clickOnReportCentre(){reportCentreLocator.click();}
}
