Feature: HubLoginPage

  Log in to hub successfully

  @Horizon
  Scenario Outline: Happy Path to log in to hub
    Given I am on the hub home page
   Then I verify that homepage is visible successfully
    And I enter valid username
    And I enter valid password
    And I select Gordon Ramsey Holding - Street Burger
    When I click on the log in button
    Then "Testqaa" should be displayed
    Examples:
      | username | password |
      | Testqaa  | Testqaa  |

#  Scenario: 2. Generate Electronic Journal reports in HUB
#    Given I am on the hub home page   "https://hub-staging.tissl.com"
#    Given I am on the hub home page
#    And I enter valid user name "Frances"
#    And I enter valid password "Sejlokosh80"
#    When I click on the log in button
#    And I click on Reportcentre button in home page
#    And click on Electronic journal in report centre
#    And select site relationship field
#    And select the first listing
#    And set Date range to Today
#    And click view button
#    Then Electronic Journal reports should display.



