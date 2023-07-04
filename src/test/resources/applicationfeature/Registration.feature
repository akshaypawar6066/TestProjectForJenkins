Feature: Opening bank account
Scenario: Opening account with nominee
Given User should be at the accounts page
When User enters the following data
| Erin | smith | erin.smith@gmail.com | 9988776655 |
| Robert | Jackson | robert.jackson@gmail.com | 1234567890 |
And User clicks on submit button
Then User should see the account number	