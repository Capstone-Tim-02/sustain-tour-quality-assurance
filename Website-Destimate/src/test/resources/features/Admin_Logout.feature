#Feature: Logout
#
#  As a admin
#  I want to logout
#  so that i am on the login page
#
#
#  @Logout_Admin @TC_AW_142
#  Scenario: Logout [TC_AW_142] - Verify success logout from account Destimate [Positive 1]
#    Given I have login and already on the dashboard of the Destimate
#    When I click icon logout
#    And i choose logout option
#    Then validate success logout and display message "Berhasil Keluar"
#
#  @TC_AW_143
#  Scenario: Logout [TC_AW_143] - Verify success cancel to logout [Positive 2]
#    Given I have login and already on the dashboard of the Destimate
#    When I click icon logout
#    And i choose cancel option
#    Then validate success stay on the "Overview" destimates
#
