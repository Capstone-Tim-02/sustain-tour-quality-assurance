#@Login_Admin
#Feature: Login for Admin
#
#  As a admin
#  I want to login
#  so that i can manage wisata in Destimate
#
#
#  @Login_Admin @TC_AW_1
#  Scenario: Login [TC_AW_1]- Verify success login using valid username and valid "kata sandi" [Positive]
#    Given I input valid username
#    When I input valid kata sandi
#    And I click icon show password to see password is correct or not
#    And i click Masuk button
#    Then validate success login and i am on the dashboard Destimate and display message "Admin Berhasil Masuk"
#
#
#  @TC_AW_2
#  Scenario: Login [TC_AW_2]- Verify failed to login because input invalid username [Negative 1]
#    Given I input invalid username
#    When I input valid kata sandi
#    And I click icon show password to see password is correct or not
#    And i click Masuk button
#    Then validate failed login because invalid username and display error message "Username salah"
#
#
#  @TC_AW_3
#  Scenario: Login [TC_AW_3]- Verify failed to login because input invalid "kata sandi" [Negative 2]
#    Given I input valid username
#    When I input invalid kata sandi
#    And i click Masuk button
#    Then validate failed login because invalid password and display error message "Password salah"
#
#
#  @TC_AW_4
#  Scenario: Login [TC_AW_4]- Verify failed to login because input invalid "username" and "kata sandi" [Negative 3]
#    Given I input invalid username
#    When I input invalid kata sandi
#    And i click Masuk button
#    Then validate failed login because invalid username and password and display error message "Username salah"
#
#
#  @TC_AW_5
#  Scenario: Login [TC_AW_5]- Verify failed to login because did not input username [Negative 4]
#    Given I did not input username
#    When I input valid kata sandi
#    And i click Masuk button
#    Then validate failed login because did not input username and display error message "Username tidak boleh kosong"
#
#
#  @TC_AW_6
#  Scenario: Login [TC_AW_6]- Verify failed to login because did not input "kata sandi" [Negative 5]
#    Given I input valid username
#    When I did not input kata sandi
#    And i click Masuk button
#    Then validate failed login because did not input kata sandi and display error message "Kata Sandi tidak boleh kosong"
#
#
#  @TC_AW_7
#  Scenario: Login [TC_AW_7]- Verify failed to login because did not input username and "kata sandi" [Negative 7]
#    Given I did not input username
#    When I did not input kata sandi
#    And i click Masuk button
#    Then validate failed login because did not input username and kata sandi and display error message "Username tidak boleh kosong" and "Kata Sandi tidak boleh kosong"
