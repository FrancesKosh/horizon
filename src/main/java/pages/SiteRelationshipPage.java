package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SiteRelationshipPage extends BasePage{
    public SiteRelationshipPage(WebDriver driver){ super (driver);}

    @FindBy (css ="select[formcontrolname ='site']")
    private WebElement siteRelationshipLocator;

    @FindBy (css = "input[placeholder='yyyy-mm-dd']")
    private WebElement dateRangeLocator;

    @FindBy(xpath = "//button[contains(text(),'Today')]")
    private WebElement todayButtonLocator;

    @FindBy (xpath = "//button[contains(text(),'Apply')]")
    private WebElement applyButtonLocator;

//    @FindBy (css = "select[formcontrolname='paymentType']")
//    private WebElement paymentTypeLocator;

    @FindBy (css = "div[class = 'ng-star-inserted']")
    private WebElement viewButtonLocator;



    public void selectSiteRelationship (){
        Select select = new Select(siteRelationshipLocator);
        select.selectByValue("1");
    }
    public void clickDateRange(){
        dateRangeLocator.click();
    }
    public void clickTodayButton(){
        todayButtonLocator.click();
    }
public void clickApplyButton(){
    applyButtonLocator.click();
}
public void clickViewButton(){
    viewButtonLocator.click();
}

}
