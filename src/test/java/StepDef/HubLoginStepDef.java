package StepDef;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HubLoginPage;


import static org.hamcrest.MatcherAssert.assertThat;

public class HubLoginStepDef extends BaseUtil {
    private BaseUtil base;

    public HubLoginStepDef(BaseUtil base) {
        this.base = base;
    }


    @Given("I am on the hub home page {string}")
    public void i_am_on_the_hub_home_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        base.driver.manage().window().fullscreen();
        base.driver.get("https://hub-staging.tissl.com");
    }
//    @Given("I am on the pos home page {string}")
//    public void i_am_on_the_hub_home_page(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        //throw new io.cucumber.java.PendingException();
//        base.driver.manage().window().fullscreen();
//        base.driver.get("https://hub-staging.tissl.com");
//    }

    @Given("I enter valid user name")
    public void i_enter_valid_user_name(String username) {
        // Write code here that turns the phrase above into concrete actions
        HubLoginPage hubLoginPage = new HubLoginPage(base.driver);
        hubLoginPage.enterUserName(username);
    }

    @Given("I enter valid password")
    public void i_enter_valid_password(String password) {
        // Write code here that turns the phrase above into concrete actions
        HubLoginPage hubLoginPage = new HubLoginPage(base.driver);
        hubLoginPage.enterPassword(password);
    }

    @When("I click on the log in button")
    public void i_click_on_the_log_in_button() {
        // Write code here that turns the phrase above into concrete actions
        HubLoginPage hubLoginPage = new HubLoginPage(base.driver);
        hubLoginPage.clickOnLoginButton();
    }

    @Then("{string} home \" page")
    public void home_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        HubLoginPage hubLoginPage = new HubLoginPage(base.driver);
        //assertThat(hubLoginPage.homePage(screen), is(true));
    }

    @And("I enter valid user name {string}")
    public void iEnterValidUserName(String username) {
        HubLoginPage hubLoginPage = new HubLoginPage(base.driver);
        hubLoginPage.enterUserName(username);
    }

    @And("I enter valid password {string}")
    public void iEnterValidPassword(String password) {
        // Write code here that turns the phrase above into concrete actions
        HubLoginPage hubLoginPage = new HubLoginPage(base.driver);
        hubLoginPage.enterPassword(password);
    }

    @Then("\"I should be on \"home\" page \"HORIZON Restaurant\"")
    public void i_should_be_on_home_page_horizon_restaurant() {
        // Write code here that turns the phrase above into concrete actions
        //assertThat(hubLoginPage.homePage(screen), is(true));
    }
}

