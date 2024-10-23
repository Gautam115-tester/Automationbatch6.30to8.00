Feature: Login

  Scenario: verify the functionality of login by using valid data
    Given Launch Chrome Browser.
    And Open SauceDemo site.
    When Enter "standard_user" in username field.
    And Enter "secret_sauce" in password field.
    And Click on Login button.
    Then validate login by checking url.
    And check also swag lab should present.
