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
Feature: Terms And Condition Feature

	Background: 
	Given i have signed in to my account and i am on the Profile Page to access Terms & Condition
	
  @tag1
  Scenario: TC_MM_127 - Verify user can open Syarat dan Ketentuan Page
    When I click Terms and condition button
    Then I can redirect to terms and condition page
    
  @tag2
  Scenario: TC_MM_128 - Verify user can open Perjanjian Pengguna Page
    When i click perjanjian pengguna button
    Then i will redirect to perjanjian pengguna page
    
	@tag3
  Scenario: TC_MM_129 - Verify user can open Kebijakan Privasi Page
    When i click kebijakan privasi button
    Then i will redirect to kebijakan privasi page
    
  @tag4
  Scenario: TC_MM_130 - Verify back button from Term and Condition Page
    When I click back button from TNC page
    Then i will redirect to profile page2