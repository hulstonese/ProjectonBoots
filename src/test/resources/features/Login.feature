Feature: Login BootApp

  This is login page

  Scenario: Valid Login
   Given I navigate to BootApp dev site
    When I click on login link
    And I enter the username
    And I enter the password
    And I click on secure signin button
    Then I should logged in


 # Scenario Outline: Valid Login
  # When I click on login link
    #And I enter the <username>
   # And I enter the <password>
   # And I click on secure signin button
   # Then I should logged in
   # Examples:
   #   | username |password|
     #  |hulstonese@yahoo.com|Iggy09|
  