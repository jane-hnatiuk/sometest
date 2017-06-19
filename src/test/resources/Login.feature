Feature: Login user into yell.com

  Scenario: Login using correct credentials
    Given Go to the login page https://www-b.yellqatest.com/
    When Enter in email yhnatiuk@pgs-soft.com
    And Enter password PGS123456!
    And Click Login
    Then Should be on the users home page https://www-b.yellqatest.com/reviews/my
    Then Should see Log Out
