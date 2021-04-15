
Feature: Login feature
This feature includes scenario that would validate the following feature
1)Login as Admin
2) Login as linda.anderson
3)Login with Negative data

Background:
Given I am able to navigate onto the login page

#Scenario: Login as Admin
#When I enter the username as "Admin"
#And I enter the password as "admin123"
#And click on submit button
#Then Login should be successfull and see username as "Welcome Paulette"
#
#Scenario: Login as linda.anderson
#When I enter the username as "Admin"
#And I enter the password as "admin123"
#And click on submit button
#Then Login should be successfull and see username as "Welcome Paulette"
@Login
Scenario Outline: Test login with different data
When I enter the username as "<username>"
And I enter the password as "<password>"
And click on submit button 
Then Login should be successfull and see username as "<LoginName>"

Examples:
|username|password|LoginName|
|Admin      |admin123|Welcome Paulette|
|Admin      |admin123|Welcome Paulette|

@InvalidLogin
Scenario: Login with Negative data
When I enter the username as "usha"
And I enter the password as "usha123"
And click on submit button
Then Login should fail and should see error message as "Invalid credentials"

