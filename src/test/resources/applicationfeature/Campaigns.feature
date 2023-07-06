
Feature: Sending Campaigns

@sanity @functional
Scenario: Create campaign
Given User is at campaign page
When User click on create campaign button
And User enters the information
And User click on save button
Then Campaign should get created

@regression
Scenario: Schedule campaign
Given User is at campaign page
When User click on edit campaign 
And User enters the sending information
And User click on schedule button
Then Campaign should get schedule

@functional
Scenario: Send campaign
Given User is at campaign page
When User click on send campaign
Then Campaign status updated by Sent