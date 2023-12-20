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
Feature: Login feature
  As a user
  I want to log in to my account
	
	Background: 
	Given i have opened the Destimate app
	
  @tag1
  Scenario: TC_MM_12 - Verify user can login with valid username and password
    When i open the login page to login
		And fill valid username and password to login
		Then i will redirect to home page
		
	@tag2
	Scenario: TC_MM_13 - Verify user cant login with empty credentials
		When i open the login page1
		And fill empty username and password to login
		Then i will get error message that email password cant be empty

	@tag3
		Scenario: TC_MM_14 - Verify user cant login with unsigned username
			When i open the login page2
			And fill unisgned username to login
			Then i will get error message that username is invalid

	@tag4
		Scenario: TC_MM_15 - Verify user cant login with valid username and wrong password
			When i open the login page3
			And fill valid username with wrong password to login
			Then i will get error message that password is invalid
			
	@tag5
		Scenario: TC_MM_16 - Verify user cant login with wrong username and wrong password 
			When i open the login page4
			And fill wrong username and password to login
			Then i will get error message that username and password is invalid
					
	@tag6
		Scenario: TC_MM_18 - Verify Daftar button can navigate user to Register Page
			When i open the login page5
			And i click the register button
			Then i will redirect to the register page
		
		
		
		
		
		
		
		
		
		
		
		