Feature: Login Admin
  Scenario: Admin login to dashboard admin
    Given admin is on the login page
    When admin enters username "admin" and password "rahasia123"
    Then admin must be directed to the admin dashboard