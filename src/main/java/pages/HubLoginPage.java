package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HubLoginPage extends BasePage {

    public HubLoginPage(WebDriver driver) {
        super(driver);
    }

    //Locators (finding part)

    @FindBy(css = "input[formcontrolname='username']")
    private WebElement usernameLocator;

    @FindBy(css = " input[formcontrolname='password']")
    private WebElement passwordLocator;

    @FindBy(css = "button[class='btn btn-primary']")
    private WebElement loginButtonLocator;

    @FindBy(css="select[formcontrolname ='site']") private WebElement selectYourOrganisationLocator;
   // @FindBy(css = "div[class='ng-star-inserted']")
    //private WebElement horizonRestaurantMessage;


    // Methods (doing part)
    public void enterUserName(String username) {
        usernameLocator.sendKeys("Testqaa");
    }

    public void enterPassword(String password) {
        passwordLocator.sendKeys("Testqaa");

    }

    public void clickOnLoginButton() {
        loginButtonLocator.click();
    }

    public void SelectYourOrganisation(){
        selectYourOrganisationLocator.click();
    }
    //public String getMessage(){
       // return horizonRestaurantMessage.getText();
    }


