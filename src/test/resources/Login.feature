Feature: Login user into yell.com
  Scenario: Login using correct credentials
    Given Go to the login page yellqatest.com
    When Fill in Email with yhnatiuk@pgs-soft.com
    And Fill in Password with PGS123456!
    And Click Login
    Then Should be on the users home page
    Then Should see Log Out
