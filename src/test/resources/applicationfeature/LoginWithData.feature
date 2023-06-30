Feature: login with data functionality
Scenario: Login with data for correct credentials
Given user is at sign in page
When user enters username as "testusername"
And user enters password as "Test@1234"
And user click on submit button number 1
Then user should get logged into application