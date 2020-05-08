Feature: Use the website to find restaurants

  Scenario: Search for restaurants in an area
    Given Browser is launched
    And Navigate to Just Eat home page
    When The user enters the area code "AR51 1AA" in the search bar
    Then The user is navigated to restaurant listing page
    And Close the browser

 @Test
 Scenario Outline: Place a food order in my area
    Given Browser is launched
    And Navigate to Just Eat home page
    When The user clicks on Login link
    And The user enters valid username as "<email>" and password as "<password>"
    Then The user has logged in to Just eat
    When The user enters the area code "AR51 1AA" in the search bar
    Then The user is navigated to restaurant listing page
    And Close the browser
   Examples:
     |email  |password|
     |justeat123@yopmail.com|Test@1234|