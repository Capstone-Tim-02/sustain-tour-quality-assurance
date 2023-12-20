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
Feature: Onboarding Feature

	Background: 
	Given i have opened the Destimate application

  @tag1
  Scenario: TC_MM_1 - Verify slider functionality
    When I slide the slider
    Then I verify that slider can redirect to another slides

  @tag2
  Scenario: TC_MM_2 - Verify login button can redirect to login page
    When I click the Login button
    Then I verify that i am on the login page
  
  @tag3
  Scenario: TC_MM_3 - Verify register button can redirect to register page
    When I click the Daftar button
    Then I verify that i am on the daftar page
  