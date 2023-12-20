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
Feature: FAQ
	
	Background: 
	Given i have signed in to my account and i am on the Profile Page to access FAQ Page
	
#	
#	@tag5
  #Scenario: TC_MM_83 - Verify user can click OKE in virtual assistance chatbox to end question session
    #When i click Virtual Assistent5
#		And i send a question5
#		And receive answer5
#		And click OK button
#		Then i will end session with VA

  @tag1
  Scenario: TC_MM_79 - Verify user can search FAQ
    When i click FAQ
		And fill search textbox
		Then i will receive FAQ result based on my search
		
	@tag2
  Scenario: TC_MM_80 - Verify user can view FAQ Details
    When i click FAQ2
		And i click the FAQ card
		Then i will view details of teh FAQ  
		
	@tag3
  Scenario: TC_MM_81 - Verify user can send question to chatbot
    When i click Virtual Assistent
		And i send a question
		Then i will receive answer
		
	@tag4
  Scenario: TC_MM_82 - Verify user cant send empty question to chatbox
	  When i click Virtual Assistent2
		And i send a empty question
		Then i will receive error message that question is empty
	
	
	@tag6
  Scenario: TC_MM_84 - Verify back button from FAQ page
    When i am on the FAQ page
		And i click back button from FAQ
		Then i will redirect back to profile
		
	@tag7
  Scenario: TC_MM_85 - Verify back button from Virtual Assistant Page
    When i am on the VA page
		And i click back button from VA
		Then i will redirect back to profile2
			
	@tag8
  Scenario: TC_MM_117 - Verify user get error message if asking question besides Rekomendasi Wisata to Virtual Assistant
    When i click Virtual Assistent8
		And i send a question besides wisata recommendation
		Then i will get error message that question must be about wisata recommendation
