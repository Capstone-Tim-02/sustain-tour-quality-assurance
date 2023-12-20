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
Feature: Tentang Aplikasi 

  Background: 
	Given i have signed in to my account and i am on the Profile Page to access Tentang Aplikasi page
	
	@tag1
  Scenario: TC_MM_125 - Verify user can open Tentang Aplikasi Page
    When i click Tentang Aplikasi button
		Then i will redirect to Tentang Aplikasi page
		
	@tag2
  Scenario: TC_MM_126 - Verify back button from Tentang Aplikasi Page
    When i am on the Tentang Aplikasi page
    And i click back button
    Then i will redirect to Profile page
	
	