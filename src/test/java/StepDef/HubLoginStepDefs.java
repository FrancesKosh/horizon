package StepDef;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.*;
//import utilities.PropertyReader;

import java.io.IOException;
import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasValue;

public class HubLoginStepDefs extends BaseUtil {
    private BaseUtil base;
    private HubLoginPage hubLoginPage;
    private HubAssertionPage hubAssertionPage;
//    private PropertyReader propertyReader;

    public HubLoginStepDefs(BaseUtil base) {
        this.base = base;
    }

    public void initPages() {
        hubLoginPage = new HubLoginPage(base.driver);
        hubAssertionPage = new HubAssertionPage(base.driver);

    }

    @Given("I am on the hub home page   {string}")
    public void i_am_on_the_hub_home_page(String Url) {
        //base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        PropertyReader propertyReader = new PropertyReader();
//        base.driver.get(propertyReader.getHubUrl());
        base.driver.manage().window().maximize();
        base.driver.get("https://hub-staging.tissl.com");

    }

    @Given("I am on the hub home page")
    public void i_am_on_the_hub_home_page() {
        base.driver.manage().window().maximize();
        base.driver.get("https://hub-staging.tissl.com");
    }

    @Then("I verify that homepage is visible successfully")
    public void iVerifyThatHomepageIsVisibleSuccessfully() {
        HomePage homePage = new HomePage(base.driver);
        assertThat(homePage.IsHomePageDisplayed(), equalTo(true));
    }

    @Given("I enter valid user name {string}")
    public void i_enter_valid_user_name(String username) {
        HubLoginPage hubLoginPage = new HubLoginPage(base.driver);
        hubLoginPage.enterUserName(username);
    }

    @Given("I enter valid password {string}")
    public void i_enter_valid_password(String password) {
        HubLoginPage hubLoginPage = new HubLoginPage(base.driver);
        hubLoginPage.enterPassword(password);
    }

    @When("I click on the log in button")
    public void i_click_on_the_log_in_button() {
        HubLoginPage hubLoginPage = new HubLoginPage(base.driver);
        hubLoginPage.clickOnLoginButton();
    }

    @And("I select Gordon Ramsey Holding - Street Burger")
    public void iSelectGordonRamseyHoldingStreetBurger() {
        // HubLoginPage hubLoginPage = new HubLoginPage(base.driver);
        Select select = new Select(hubLoginPage.SelectYourOrganisation(),
                //base.driver.findElement(By.cssSelector("div[class ='middle-content ng-tns-c71-1']")));
               hubLoginPage.SelectYourOrganisation().selectByValue("1"));
    }
    @Then("{string} should be displayed")
    public void shouldBeDisplayed(String Testqaa) {
        HubAssertionPage hubAssertionPage = new HubAssertionPage(base.driver);
        hubAssertionPage.getMessage();
        // assertThat(hubAssertionPage.getMessage(),equalTo(true));
        assertThat(hubAssertionPage.getMessage().contains(Testqaa), equalTo(true));

        // Then "Gordon Ramsay Holdings - Street Burger" should be displayed

//        @Then("confirmation page is displayed with my {string}")
//        public void confirmation_page_is_displayed_with_my(String username) {
//            NewtoursRegisterConfirmationPage newtoursRegisterConfirmationPage = new NewtoursRegisterConfirmationPage(base.driver);
//            System.out.println(newtoursRegisterConfirmationPage.getNoteMsg());
//            assertThat(newtoursRegisterConfirmationPage.getNoteMsg().contains(username),equalTo(true ));
//        }
    }

    //////////////////////////////////////////////////////////////////////////////


//
//
//
//
//
//    @When("I click on Reportcentre button in home page")
//    public void i_click_on_reportcentre_button_in_home_page() {
//        HomePage homePage = new HomePage(base.driver);
//        homePage.clickOnReportCentre();
//    }
//
//    @When("click on Electronic journal in report centre")
//    public void click_on_electronic_journal_in_report_centre() {
//        ReportCentrePage reportCentrePage = new ReportCentrePage(base.driver);
//        reportCentrePage.clickOnElectronicJournal();
//    }
//
//    @When("select site relationship field")
//    public void select_site_relationship_field() {
//        SiteRelationshipPage siteRelationshipPage = new SiteRelationshipPage(base.driver);
//        siteRelationshipPage.selectSiteRelationship();
//        siteRelationshipPage.clickDateRange();
//        siteRelationshipPage.clickTodayButton();
//        siteRelationshipPage.clickApplyButton();
//        siteRelationshipPage.clickViewButton();
//    }
//
    @When("select the first listing")
    public void select_the_first_listing() {
        SiteRelationshipPage siteRelationshipPage = new SiteRelationshipPage(base.driver);
      Select select = new Select(siteRelationshipPage.);

//    }
//
//    @When("set Date range to Today")
//    public void set_date_range_to_today() {
//
//    }
//
//    @When("click view button")
//    public void click_view_button() {
//
//    }
//
//    @Then("Electronic Journal reports should display.")
//    public void electronic_journal_reports_should_display() {
//
//    }


    ///////////////////////////////////


    @And("I enter valid {string}")
    public void iEnterValid(String arg0) {

    }


}