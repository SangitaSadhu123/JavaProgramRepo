Feature: Login into Application 

Scenario Outline: Negative test validation login
Given Initialize the browser with chrome
And Navigate to "http://qaclickacademy.com" site
And Click on Login link in home page to land on Secure sign in page 
When User enters <username> and <password> and logs in
Then Verify that user is not able to logged in
And Close the browser

Examples:
|username                 |password   |
|test@gmail.com           |123456     |
|abc@gmail.com            |1235       |
