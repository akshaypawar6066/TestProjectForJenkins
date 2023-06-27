Feature: login functionality
Scenario: Login with correct credentials
Given user is at login page
When user enters username
And user enters password
And user click on login button
Then user redirects to home page