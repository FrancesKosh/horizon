package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GRHPage extends BasePage {
 public GRHPage(WebDriver driver){super(driver);}


    @FindBy(css ="div[.='middle-content.ng-tns-c71-1']")
    private WebElement grhPageLocator;



    public boolean IsGrhPageDisplayed() {
        return grhPageLocator.isDisplayed();
    }
}
