#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Register
	As a user 
	I want to register a new account
	
	Background: 
	Given when i open Destinate
	
	@tag4
  Scenario: TC_MM_11 - Verify masuk button can navigate user to Login Page
    When i open the register page4
		And click Masuk button
		Then i will redirect to Login page
		
  @tag1
  Scenario: TC_MM_4 - Verify user can register with all valid credentials
    When i open the register page
		And fill valid credentials to register
		Then i will get a success message
		
	@tag2
  Scenario: TC_MM_5 - Verify user cant register with empty credentials
    When i open the register page2
		And fill empty credentials to register
		Then i will get error message that username password cant be empty
		
	@tag3
  Scenario: TC_MM_6 - Verify user cant register when password and confim password is not the same
    When i open the register page3
		And fill different password and confirmation password to register
		Then i will get error message that password is not the same
	
	