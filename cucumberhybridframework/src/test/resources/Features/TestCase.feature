@orangeHRM
Feature: orangeHrm website

@tc_01_login
Scenario Outline: validate the login functionality

Given launch the browser and enter the url
When login page is opened
Then enter the "<username>" and "<password>"
Then click the login button
Then take screenshot and close the browser

Examples:
|username   |password |
|Admin        |admin123 |
|admin        |Admin124 |


@tc_02_admin
Scenario: Validate admin functionality

Given launch orangehrm application 
When login page openes
Then enter the "<username>" and "<password>"
Then login button is clicked
Then  Click on admin
Then type name
Then select userrole 
Then enter Employeename 
Then select status 
Then click on the search button
Then close the browser

@tc_03_recruitment

Scenario: validate recruitment functionality
Given launch the orangehrm website and login









