Feature: Login Functionality

Scenario: Verify Login
Given Launch the Browser
And Navigate to the URL
When Enter the username and password
And Click on Login Button
Then Login should be successful

Scenario: Verify Login unsuccessfull
Given Launch the Browser
And Navigate to the URL
When Enter the invalid username and password
And Click on Login Button
Then Login should be unsuccessful
Then Close the browser
