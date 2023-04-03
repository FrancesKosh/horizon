package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class HubAssertionPage extends BasePage {

    public HubAssertionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="navbarDropdown3")
    private WebElement homePageLocator;


    // Methods (doing part)


    public String getMessage() {
        return homePageLocator.getText();
    }

//    public boolean IsMsgDisplayed() {
//        return homePageLocator.isDisplayed();
    }

