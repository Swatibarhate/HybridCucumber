@orangeHRM
Feature: orangeHrmAdmin website

@tc_01_admin
Scenario: Validate admin functionality

Given launch orangehrm application 
When login page is opened
Then enter the "<username>" and "<password>"
Then click the login butto
Then  Click on admin
Then enter uesrname
Then select userrole
Then enter Employeename
Then select status
Then click on the search button
Then take screenshot and close the browser


