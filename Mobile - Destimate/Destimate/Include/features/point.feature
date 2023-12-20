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
Feature: Point

	Background: 
	Given i have signed in to my account and i am on the Point Page
	
  @tag1
  Scenario: TC_MM_36 - Verify point info button can be click
		When i click the Poin Detail button
		Then i will redirect to the poin detail page
		
	@tag2
  Scenario: TC_MM_37 - Verify mengerti button in point info tab can be clicked
		When i click Mengerti button
		Then i will redirect back to the Poin Detail page
		
	@tag3
  Scenario: TC_MM_38 - Verify back button in Rewards Page functionality
		When i click the back button
		Then i will navigate from Point Page to the Home page