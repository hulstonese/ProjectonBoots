Feature: Register BootApp

  This is to register people to boot app

  Scenario: Valid Registration
    Given I navigate to BootApp dev site
    When I click on login link
    And I click on Register button
    And I select Title from the dropdown options
    And I enter Firstname and Lastname
    And I enter Email Address
    And I confirm Password
    And I enter Verifypassword
    And I check the agree checkbox
    And I click on Create my account button
    Then new account will be created