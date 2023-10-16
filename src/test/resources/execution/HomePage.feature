Feature: Home page functionality

@sanity
Scenario: validation of title
Given User is at landing page
Then Page title should contains "Shoppingg"

@functional
Scenario: verify cart icon
Given User is at landing page
Then Cart icon should get displayed

@regression
Scenario: Checkout the deals section
Given User is at landing page
When User click on smart phones deal
Then deal sectio should get open

@sanity
Scenario: Login to application
Given User is at landing page
When User enters the username as "8176867662"
And User enters the password as "123456"


	