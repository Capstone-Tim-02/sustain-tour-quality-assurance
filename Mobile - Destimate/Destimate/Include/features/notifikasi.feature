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
Feature: Notifikasi

	Background: 
	Given i have signed in to my account and i am on the Notifikasi Page
	
  @tag1
  Scenario: TC_MM_39 - Verify notifikasi card can be click
    When i click one of the Notification card
		Then i will view the details of the notification
  
  @tag2
  Scenario: TC_MM_40 - Verify back button in Notification Page functionality
    When i click back button from Notification Page
		Then i will navigate from notification Page to the Home page
		
		