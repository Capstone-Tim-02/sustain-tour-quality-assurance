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
Feature: Transaksi - Dipesan
	
	Background: 
	Given i have signed in to my account to view my ongoing transaction
	
  @tag1
  Scenario: TC_MM_110 - Verify user can view ordered Tickets
    When i click ticket button110
		And i click Dipesan tab110
		And i click one of the ordered ticket110
		Then i will view detail of the Transaction110
  
  @tag2
  Scenario: TC_MM_112 - Verify user can cancel to cancel their order
		When i click ticket button112
		And i click Dipesan tab112
		And i click one of the ordered ticket112
		And i click Batalkan Pesanan button112
		And i click batal112
		Then i will cancel to cancel my order

  @tag3
  Scenario: TC_MM_111 - Verify user can cancel their oder
    When i click ticket button111
		And i click Dipesan tab111
		And i click one of the ordered ticket111
		Then i click Batalkan Pesanan button
		And i will cancel my order
  
	@tag4
  Scenario: TC_MM_113 - Verify user can click Tukar Pada Kasir button 
		When i click ticket button113
		And i click Dipesan tab113
		And i click one of the ordered ticket113
		And i click Tukar pada kasir button
		Then i will view a tab showing payment tutorial

		
	@tag5
  Scenario: TC_MM_115 - Verify user can click back button
		When i click ticket button115
		And i click Dipesan tab115
		And i click one of the ordered ticket115
		And i click back button115
		Then i will redirect back to ticket page115

		  