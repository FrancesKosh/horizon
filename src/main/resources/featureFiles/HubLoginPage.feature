Feature: HubLoginPage

  Log in to hub successfully

  @Horizon
  Scenario: Happy Path to log in to hub
    Given I am on the hub home page "https://hub-staging.tissl.com"
    And I enter valid user name "Frances"
    And I enter valid password "Sejlokosh80"
    When I click on the log in button
    Then "I should be on "home" page "HORIZON Restaurant"

