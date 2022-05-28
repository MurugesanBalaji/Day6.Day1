Feature: Check Leaftaps login Functionality

Scenario Outline: Login with positive Credential

Given Open the Chrome Browser
And Load the application url
And Enter the Username as <username>
And Enter the Password as <password>
When click on login button
Then Homepage should be displayed

Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

Scenario: Login with Negative Credential

Given Open the Chrome Browser
And Load the application url
And Enter the Username as 'DemoSalesManager'
And Enter the Password as 'crmsfa'
When click on login button
Then Error Message should be displayed