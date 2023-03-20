Feature: PosLoginPage

  Log in to pos successfully

  @Horizon
  Scenario: Happy Path to log in to pos
    Given I am on the pos home page "https://pos-staging.tissl.com/#/pos/login"
    And I enter valid user name
    And I enter valid password
    And I click on the log in button
    And make not changes to preference on the preference page
    When I click done button on the preference page
    Then "I should be on on order standard" page

