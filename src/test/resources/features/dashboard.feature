Feature: change page dashboard aboutus
  Scenario: change page from dashboard to about us
    Given user in dashboard page
    When page successfully load
    Then user directed to the aboutus page
