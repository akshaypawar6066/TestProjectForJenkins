Feature: Signup functionality

Background:
Given user is at the landing page
When User click on create account button

Scenario Outline: Signup to application with different dataset
Given User is at signup
When User enters name "<name>" in the form
And User enters age <age> inside form
And User confirms "<gender>" checkbox
Then User gets created

Examples:
| name | age | gender |
| Eder | 23 | Male |
| Ron | 36 | Male |
| Daniel | 45 | Male |
| Diana | 32 | Female |

