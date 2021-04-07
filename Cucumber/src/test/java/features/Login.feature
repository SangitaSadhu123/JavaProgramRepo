Feature: Application Login

Scenario: Home page default login
Given User is on NetBanking login page
When User login into application with "john" and password "1234"
Then Home page is populated 
And Cards dispalyed are "True"



Scenario: Home page default login
Given User is on NetBanking login page
When User login into application with "abc" and password "56878"
Then Home page is populated 
And Cards dispalyed are "False" 