Feature: Login

  Scenario Outline: Verify the functionality of login page.
    Given lauch chrome browser And open saucedemo site in chrome browser.
    When Enter "<username>" in username field And Enter "<password>" in password field And Click on login button.
    Then I verify user is login by checking url of site.

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |
