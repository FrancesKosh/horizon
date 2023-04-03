package pages;

import base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicJournalReportPage extends BasePage {
 public ElectronicJournalReportPage(WebDriver driver){super(driver);}


    @FindBy(css ="div[id='DataTables_Table_1_wrapper']")
    private WebElement electronicJournalReportLocator;



    public boolean IsElectronicJournalReportPageDisplayed() {
        return IsElectronicJournalReportPageDisplayed();


    }
}
