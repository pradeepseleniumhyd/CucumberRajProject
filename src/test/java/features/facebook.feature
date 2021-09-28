Feature: To check the fb login functionality

# tags
@smokeTest    
Scenario: Navigate to FB login page
Given Navigate the browser
When User enters the url
Then Fb login page is displayed

@regressionTest123
Scenario: Login with invalid credentials
Given Navigate the browser
When User enters the url "https://en-gb.facebook.com/"
Then Fb login page is displayed
# And user enters username and password
And user enters "pradeep@gmail.com" and "Password@123"

@regressionTest
Scenario Outline: Login with invalid credentials
Given Navigate the browser
When User enters the url "https://en-gb.facebook.com/"
Then Fb login page is displayed
# And user enters username and password
And user enters "<username>" and "<password>"
Examples:
|username|password|
|pradeep@gmail.com|password123|
|raj@gmail.com|raj@123|


@regressionTest1234
Scenario: Login with invalid credentials
Given Navigate the browser
When User enters the url
|http://www.facebook.com|
Then Fb login page is displayed
# And user enters username and password
And user enters username1 and password
|pradeep|pradeep|
|raj|raj123|
|selenium|raj345|


@regressionTest123456
Scenario: Login with invalid credentials
Given Navigate the browser
When User enters the url
|http://www.facebook.com|
Then Fb login page is displayed
# And user enters username and password
And user enters username1 and password123
|username|password|
|pradeep|pradeep|
|raj|raj123|
|selenium|raj345|




