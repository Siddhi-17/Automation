Feature: This feature file is for testing of SWAG LAB order placements

Background: 
Scenario: Check produts are getting added into cart or not
Given user is already loggin in SwagLab application
When user selected two products and added them into the cart
And click on cart icon
Then validate same products with price are getting displayed in checkout page

Scenario: Check overview page
When user clicks on checkout button
And user provides information for delivery
And user clicks on continue button
Then validate added products with price are getting displayed 
Scenario: Check order confirmation
When user clicks on finish button 
Then user should be able to see "Thank you for your order!"