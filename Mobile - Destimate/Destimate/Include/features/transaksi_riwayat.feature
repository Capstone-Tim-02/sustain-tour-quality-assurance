
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
Feature: Riwayat

	Background: 
	Given i have signed in to my account to view my transaction history
	
  @tag1
  Scenario: TC_MM_71 - Verify user can view Invoice Detail
		When i click ticket button71
		And i click Riwayat tab71
		And i click one of the ordered ticket71
		Then i will view detail of the Transaction71
		
	@tag2
  Scenario: TC_MM_75 - Verify user can click back button
		When i click ticket button75
		And i click Riwayat tab75
		And i click one of the ordered ticket75
		And i view detail of the Transaction75
		And i click back button from ticket history
		Then i will redirect back to the ticket page
