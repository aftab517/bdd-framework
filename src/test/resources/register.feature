@register
Feature: Register
  As an end user
  I want to register to site
  So that i can login to my site

  @smoke
  Scenario: In Valid Register
    Given I am on homepage
    When I navigate to "Create Account/Sign In" page
    And I enter user email address
    And I fill the user register details:
      | title | first_name | last_name | password    | confirm_password |
      | Mr    | aftab      | ahmed     | Password123 | Password1234     |
    Then I should see a validation message "The passwords entered do not match."