Feature: this feature file is create to cover testing of OrangeHrm login functionality

  #Scenario: Login into OrangeHrm with valid data
  #Given user is on login OrangeHrm login page
  #When user enter a valid username as "Admin"
  #And user enter a valid password as "admin123"
  #And user clicks on login button
  #Then user should should be able to navigate to the Home page of OrangeHrm having "dashboard" in URL
  #And close the browser for OrnageHrm
  Scenario Outline: Test login functionality of OrangeHRM
    Given user is on login OrangeHRM login page
    When user enter a valid username as <username> in OrangeHRM
    And user enter a valid password as <password> in OrangeHRM
    And user click on login button
    Then user should should be able to navigate to the Home page of OrangeHrm having <urlKey> in URL
    And closes the browser for OrnageHRM

    Examples: 
      | username | password | urlKey    |
      | Admin    | admin123 | dashboard |
      | Admin    | admin123 | dashboard |
      | Admin    | admin    | auth      |
      | ""       | ""       | auth      |
