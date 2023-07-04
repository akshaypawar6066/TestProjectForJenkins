Feature: Orders functionality

	Background:
	Given User should be logged in
	And User should be at orders page
	
	Scenario: Fetch currently placed order information
	When User click on Track order button
	Then user should see status of order
	
	Scenario: Fetch previously placed order information
	When User clicks on history button
	Then user should see previously placed order info
	
	
	Scenario: Fetch cancelled order information
	When User clicks on cancelled order button
	Then user should see cancelled order info
	




