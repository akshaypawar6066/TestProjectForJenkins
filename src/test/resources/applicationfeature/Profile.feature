Feature: Profile functionality
Scenario: Add profile
Given User is at the home page
When User clicks on Add Profile button
And User enters information
Then Profile gets created

Scenario: Update profile
Given User is at the home page
When User clicks on edit Profile button
And User updates information
Then Profile gets updated

Scenario: delete profile
Given User is at the home page
When User clicks on delete Profile button
Then Profile gets deleted