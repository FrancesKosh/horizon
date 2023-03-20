package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PosLoginPage extends BasePage {

    public PosLoginPage(WebDriver driver) {
        super(driver);
    }

    //Locators (finding part)
    @FindBy(css = "input[formcontrolname='username']")
    private WebElement usernameLocator;
    @FindBy(css = " input[formcontrolname='password']")
    private WebElement passwordLocator;
    @FindBy(css = "button['class=next-button']")
    private WebElement nextButtonLocator;
    @FindBy(css = "select['name=organisation']")
    private WebElement gordonRamsayHoldingsLocator;
    @FindBy(css = "select[id='posType']")
    private WebElement fixedPosTerminalLocator;
    @FindBy(css = "select[name='site']")
    private WebElement getGordonRamsayStreetBurgerEdinburghLocator;
    @FindBy(css = "select[id='receiptPrinter']")
    private WebElement receiptWorkshopLocator;
    @FindBy(css = "input[autocomplete='off']")
    private WebElement nameThisDeviceLocator;
    @FindBy(css = "button[class='next-button']")
    private WebElement doneButtonLocator;
    @FindBy(css = "button[type='submit']")
    private WebElement getLoginButtonLocator;
    @FindBy(css = "button[type='submit']")
    private WebElement getDoneButtonLocator;
    @FindBy(css = "button[class='btn btn-primary']")
    private WebElement loginButtonLocator;

    // Methods (doing part)
    public void enterUserName(String username) {
        usernameLocator.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordLocator.sendKeys(password);
    }

    public void clickOnNextButton() {
        nextButtonLocator.click();
    }

    public void selectSite() {
        gordonRamsayHoldingsLocator.isSelected();
    }

    // public void clickOnNextButton(){nextButtonLocator.click();}
    public void selectFixedPosTerminal() {
        fixedPosTerminalLocator.isSelected();
    }

    // public void clickOnNextButton(){nextButtonLocator.click();}
    public void setGetGordonRamsayStreetBurgerEdinburgh() {
        getGordonRamsayStreetBurgerEdinburghLocator.isSelected();
    }

    //public void clickOnNextButton(){nextButtonLocator.click();}
    public void selectReceiptPrinter() {
        receiptWorkshopLocator.isSelected();
    }

    public void enterDeviceName(String devicename) {
        nameThisDeviceLocator.sendKeys(devicename);
    }

    public void clickOnDoneButton() {
        doneButtonLocator.click();
    }
    //public void enterUserName(String username) {usernameLocator.sendKeys(username);}
    // public void enterPassword(String password){ passwordLocator.sendKeys(password);}
    //public void clickOnLoginButton(){loginButtonLocator.click();}


    public void clickOnLoginButton() {
        loginButtonLocator.click();
    }

}
