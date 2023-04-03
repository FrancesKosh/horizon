package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportCentrePage extends BasePage{
    public ReportCentrePage(WebDriver driver){
        super (driver);
    }

    @FindBy(xpath = "(//div[contains(@class,'custom-card-element ng-star-inserted')])[15]")
    private WebElement electronicJournalLocator;


public void clickOnElectronicJournal(){
    electronicJournalLocator.click();
}

}
