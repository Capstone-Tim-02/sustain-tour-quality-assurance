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
Feature: Promo Feature

	Background: 
	Given i have signed in to my account and i am on the Home Page to access Promo Page
	
	
  @tag1
  Scenario: TC_MM_76 - Verify promo card can be clicked
    When i click promo button
		Then i can view detail of the selected promo
    
	@tag2
  Scenario: TC_MM_77 - Verify kode promo copy button can be click
    When i click promo button2
		And i view detail of the selected promo2
		Then i will click button to copy promo code

	@tag3
  Scenario: TC_MM_78 - Verify back button functionality
    When i click promo button3
		And i view detail of the selected promo3
		And i will click back button3
		Then redirect to list promo page
		


	