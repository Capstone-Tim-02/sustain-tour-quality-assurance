Feature: Overview

  As an user
  I want to manage overview
  So that the application works according to admin requirements



  @TC_AW_166
  Scenario: Overview [TC_AW_166] - Verify success to viewing income data by searching from the calendar for today [Positive 1]
    Given I am login and already on the Overview page
    When I click field pilih rentang tanggal
    And I choose Today to see the income earned today
    And Validate the date in the field rentang tanggal
    And I click overview text to hide the calendar
    Then Validate success to display total income for today

  @TC_AW_167
  Scenario: Overview [TC_AW_167] - Verify success to viewing income data by searching from the calendar for yesterday [Positive 2]
    Given I am login and already on the Overview page
    When I click field pilih rentang tanggal
    And I choose Yesterday to see the income earned for yesterday
    And Validate the date range in the field rentang tanggal
    And I click overview text to hide the calendar
    Then Validate success to display total income for yesterday

  @TC_AW_168
  Scenario: Overview [TC_AW_168] - Verify success to viewing income data by searching from the calendar for This Week [Positive 3]
    Given I am login and already on the Overview page
    When I click field pilih rentang tanggal
    And I choose This Week to see the income earned for this week
    And Validate the date range in field rentang tanggal
    And I click overview text to hide the calendar
    Then Validate success to display total income for this week

  @TC_AW_169
  Scenario: Overview [TC_AW_169] - Verify success to viewing income data by searching from the calendar for Last Week [Positive 4]
    Given I am login and already on the Overview page
    When I click field pilih rentang tanggal
    And I choose This Week to see the income earned for last week
    And Validate the date range in a field rentang tanggal
    And I click overview text to hide the calendar
    Then Validate success to display total income for last week


  @TC_AW_170
  Scenario: Overview [TC_AW_170] - Verify success to viewing income data by searching from the calendar for This Month [Positive 5]
    Given I am login and already on the Overview page
    When I click field pilih rentang tanggal
    And I choose This Month to see the income earned for this month
    And Validate the range date in a field rentang tanggal
    And I click overview text to hide the calendar
    Then Validate success to display total income for this month




  @TC_AW_171
  Scenario: Overview [TC_AW_171] - Verify success to viewing income data by searching from the calendar for Last Month [Positive 6]
    Given I am login and already on the Overview page
    When I click field pilih rentang tanggal
    And I choose Last Month to see the income earned for last month
    And Validate the range date in the field rentang tanggal
    And I click overview text to hide the calendar
    Then Validate success to display total income for last month


  @TC_AW_172
  Scenario: Overview [TC_AW_172] - Verify success to viewing income data by searching from the calendar with input "days up to today" [Positive 7]
    Given I am login and already on the Overview page
    When I click field pilih rentang tanggal
    And I input 4 in the field days up to today to see the income earned
    And Validate a range date in the field rentang tanggal
    And I click overview text to hide the calendar
    Then Validate success to display total income for days up to today



  @TC_AW_173
  Scenario: Overview [TC_AW_173] - Verify success to viewing income data by searching from the calendar with input "days starting today" [Positive 8]
    Given I am login and already on the Overview page
    When I click field pilih rentang tanggal
    And I input total day in the field days starting today to see the income earned
    And Validate a range date in the field of rentang tanggal
    And I click overview text to hide the calendar
    Then Validate success to display total income for days starting today


  @TC_AW_174
  Scenario: Overview [TC_AW_174] - Verify success to viewing income data by selecting a date range on the calendar [Positive 9]
    Given I am login and already on the Overview page
    When I click field pilih rentang tanggal
    And I click back button in calender to choose start date in november
    And I click on November 23rd for start date
    And I click on December 31st for end date
    And I click overview text to hide the calendar
    Then Validate success to display total income with click from calender