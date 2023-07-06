Feature: Home page functionality
Scenario: validation of title
Given User is at landing page
Then Page title should contains "Shopping"


Scenario: verify cart icon
Given User is at landing page
Then Cart icon should get displayed

Scenario: Checkout the deals section
Given User is at landing page
When User click on smart phones deal
Then deal sectio should get open

Scenario: Login to application
Given User is at landing page
When user clicks on signin button
And User enters the username
And User enters the password
And User confirms signin

	