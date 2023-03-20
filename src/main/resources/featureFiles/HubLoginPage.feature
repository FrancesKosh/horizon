Feature: PosLoginPage

  Log in to pos successfully

  @Horizon
  Scenario: Happy Path to log in to hub
    Given I am on the pos home page "https://hub-staging.tissl.com"
    And I enter valid user name
    And I enter valid password
    When I click on the log in button
    Then "I should be on " home " page

