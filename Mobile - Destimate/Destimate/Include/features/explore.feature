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
Feature: Explore

	Background: 
	Given i have signed in to my account and i am on the Explore Page
	
	
	
  @tag1
  Scenario: TC_MM_41 - Verify search functionaliry
    When i click search textbox.
		And fill the search textbox.
		Then i will view the search result.
		
	@tag2
  Scenario: TC_MM_42 - Verify location filter functionality
    When i click lokasi button.
		And choose wisata lokasi.
		Then i will view the filtered result based on the selected lokasi.
	
	@tag3
  Scenario: TC_MM_43 - Verify pills tab filter functionality
    When i click the pills tab option.
		Then i will view the filtered result based on the selected pills tab.
	
	@tag4
  Scenario: TC_MM_118 - Verify user can choose more than 1 pills tab button
    When i click multiple pills tab option.
		Then i will view the filtered result based on the selected pills tabs.
	
	@tag5
  Scenario: TC_MM_44 - Verify wisata card can show wisata detail 
    When i click on of the wisata card5.
		Then i will view detailed information of the choosed wisata.

	@tag6
  Scenario: TC_MM_45 - Verify carbon emission button 
    When i click on of the wisata card6.
		And i view detailed information of the choosed wisata6.
		And i click carbon emission button.
		Then i will view a new tab about carbon wisata.
			
	@tag7
  Scenario: TC_MM_47 - Verify user can select Days option to book ticket
    When i click on of the wisata card7.
		And i view detailed information of the choosed wisata7.
		And i click button to select days to book ticket.
		Then i can select days to book a ticket.
		
	@tag8
  Scenario: TC_MM_48 - Verify user can click Beli Ticket when Days option is choosed
    When i click on of the wisata card8.
		And i view detailed information of the choosed wisata18.
		And i can select days to book ticket.
		And click beli / checkout button.
		Then i can redirect to checkout page.
	
	@tag9
  Scenario: TC_MM_49 - Verify user can redirect back from search page
    When i click on of the search textbox button9.
		And i click back button.
		Then i will redirect to explore page.
		

  