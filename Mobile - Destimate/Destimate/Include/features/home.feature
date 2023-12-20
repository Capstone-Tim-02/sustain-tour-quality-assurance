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
Feature: Home
	
	Background: 
	Given i have sign in to my account
	
  @tag1
  Scenario: TC_MM_27 - Verify button Home functionality
		When i click the home button
		Then i will redirect to the home page
		
	@tag2
  Scenario: TC_MM_28 - Verify button Explore functionality
		When i click the explore button
		Then i will redirect to the explore page
		 
  @tag3
  Scenario: TC_MM_29 - Verify button Promo functionality
		When i click the promo button
		Then i will redirect to the promo page
	
	@tag4
  Scenario: TC_MM_30 - Verify button Tiket functionality
		When i click the tiket button
		Then i will redirect to the tiket page

	@tag5
  Scenario: TC_MM_31 - Verify button Profil functionality
		When i click the profil button
		Then i will redirect to the profil page

  @tag6
  Scenario: TC_MM_32 - Verify button Poin functionality
		When i click the poin button
		Then i will redirect to the poin page
		
	@tag7
  Scenario: TC_MM_33 - Verify notification button functionality
		When i click the notif button
		Then i will redirect to the notif page
   
  @tag8
  Scenario: TC_MM_34 - Verify Voucher button functionality
		When i click the voucher button
		Then i will redirect to the voucher page
	
	@tag9
  Scenario: TC_MM_35 - Verify Rekomendasi Wisata button functionality
		When i click the rekomendasi wisata button
		Then i will redirect to the rekomendasi wisata page
