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
Feature: Checkout

	Background: 
	Given i have signed in to my account and checkout wisata ticket
	
	@tag3
  Scenario: TC_MM_131 - Verify user can click the - stepper button
		When i click the - stepper button
		Then my ticket amount will decrease by 1

	@tag4
  Scenario: TC_MM_132 - Verify user cant buy 0 tickets
		When my ticket mount is 1
		And i click the - stepper button2
		Then my ticket will still be 1
	
  @tag1
  Scenario: TC_MM_60 - Verify user can click Back button
		When i click back button from checkout page
		Then i will redirect back to wisata detail5

	@tag2
  Scenario: TC_MM_61 - Verify user can click the + stepper button
		When i click the + stepper button
		Then my ticket amount will increase by 1
		

	
	
	@tag6
  Scenario: TC_MM_63 - Verify user can use user's point
		When i click use point button
		Then i will get discount by using my point
	
	@tag7
  Scenario: TC_MM_70 - Verify user can click Book Now and book Wisata ticket
		When i click book now button
		Then i will get success order message
	
