Feature: Verify JPMorghan Chase results found in Google Page

Scenario: Validation of JP Morghan Chase page through google
Given user navigates to the browser
When user enter the url
Then Login page is displayed
And Verify login page



Scenario: Validation of JP Morghan Chase page through google
Given user navigates to the browser
When user enter the url  "http://www.google.com"
Then Login page is displayed
And Verify login page


Scenario Outline: Validation of JP Morghan Chase page through google
Given user navigates to the browser
When user enter the url  "<url>"
Then Login page is displayed
And Verify login page
Examples:
|url|
|http://www.fb.com|
|http://www.toolsqa.com|
|http://www.gmail.com|


Scenario: Validation of JP Morghan Chase page through google
Given user navigates to the browser
When user enter the url and username
|www.fb.com|pradeep|
|www.google.com|raj|
Then Login page is displayed
And Verify login page


Scenario: Validation of JP Morghan Chase page through google
Given user navigates to the browser
When user enter the url and username with maps
|url|username|
|www.fb.com|pradeep|
|www.google.com|raj|
Then Login page is displayed
And Verify login page

