#Feature: Manage User Account (Update Account, Delete Account, Searching Account, Range of Table Results, and Pagination)
#
#  As an user
#  I want to manage user data
#  So that the application works according to admin requirements
#
#  @UpdateAccountUser
#  @TC_AW_8
#  Scenario: Update Account User [TC_AW_8] - Verify success to update user account of "Hanna Erita Saragih" with valid username [Positive 1]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I search the name of the user whose data I want to edit
#    And I click the update button or icon on the selected account
#    And I edit data user with valid  username
#    And I click Simpan button
#    Then Validate success to update user account with valid username and display message "Berhasil mengupdate data user"
#
#  @TC_AW_9
#  Scenario: Update Account User [TC_AW_9] - Verify failed to update user account because input invalid username [Negative 1]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I search the name of the user whose data I want to edit
#    And I click the update button or icon on the selected account
#    And I edit data user with invalid username
#    And I click Simpan button
#    Then Validate failed to update user account because invalid username and display error message "Minimal 5 karakter untuk username"
#
#  @TC_AW_10
#  Scenario: Update Account User [TC_AW_10] - Verify failed to update user account because did not input username [Negative 2]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I search the name of the user whose data I want to edit
#    And I click the update button or icon on the selected account
#    And I edit data user without username
#    And I click Simpan button
#    Then Validate failed to update user account because did not input username and display error message "Username tidak boleh kosong"
#
#  @TC_AW_11
#  Scenario: Update Account User [TC_AW_11] - Verify success to update user account with valid name [Positive 2]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I search the name of the user whose data I want to edit
#    And I click the update button or icon on the selected account
#    And I edit data user with valid name
#    And I click Simpan button
#    Then Validate success to update user account with valid name and display message "Berhasil mengupdate data user"
#
#  @TC_AW_12
#  Scenario: Update Account User [TC_AW_12] - Verify failed to update user account because input invalid name [Negative 3]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I search the name of the user whose data I want to edit
#    And I click the update button or icon on the selected account
#    And I edit data user with invalid name
#    And I click Simpan button
#    Then Validate failed to update user account because invalid name and display error message "Minimal 3 karakter untuk nama"
#
#  @TC_AW_13
#  Scenario: Update Account User [TC_AW_13] - Verify failed to update user account because did not input name [Negative 4]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I search the name of the user whose data I want to edit
#    And I click the update button or icon on the selected account
#    And I edit data user without input name
#    And I click Simpan button
#    Then Validate failed to update user account because did not input name and display error message "Nama tidak boleh kosong"
#
#  @TC_AW_14
#  Scenario: Update Account User [TC_AW_14] - Verify success to update user account with valid email [Positive 3]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I search the name of the user whose data I want to edit
#    And I click the update button or icon on the selected account
#    And I edit data user with valid email
#    And I click Simpan button
#    Then Validate success to update user account with valid email and display message "Berhasil mengupdate data user"
#
#  @TC_AW_15
#  Scenario: Update Account User [TC_AW_15] - Verify failed to update user account because input invalid email [Negative 5]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I search the name of the user whose data I want to edit
#    And I click the update button or icon on the selected account
#    And I edit data user with invalid email
#    And I click Simpan button
#    Then Validate failed to update user account because invalid email and display error message "Masukkan format email yang benar"
#
#  @TC_AW_16
#  Scenario: Update Account User [TC_AW_16] - Verify failed to update user account because did not input email [Negative 6]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I search the name of the user whose data I want to edit
#    And I click the update button or icon on the selected account
#    And I edit data user without email
#    And I click Simpan button
#    Then Validate failed to update user account because did not input email and display error message "Email tidak boleh kosong"
#
#  @TC_AW_17
#  Scenario: Update Account User [TC_AW_17] - Verify success to update user account with valid "no. telepon" [Positive 4]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I search the name of the user whose data I want to edit
#    And I click the update button or icon on the selected account
#    And I edit data user with valid no telepon
#    And I click Simpan button
#    Then Validate success to update user account with validno telepon and display message "Berhasil mengupdate data user"
#
#  @TC_AW_18
#  Scenario: Update Account User [TC_AW_18] - Verify failed to update user account because input invalid "no. telepon" with abjad [Negative 7]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I search the name of the user whose data I want to edit
#    And I click the update button or icon on the selected account
#    And I edit data user with invalid no telepon with abjad
#    And I click Simpan button
#    Then Validate failed to update user account because invalid no telepon with abjad and display error message "Masukkan format nomor telepon yang benar"
#
#  @TC_AW_19
#  Scenario: Update Account User [TC_AW_19] - Verify failed to update user account because input invalid "no. telepon" which does not consist of 10 digits [Negative 8]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I search the name of the user whose data I want to edit
#    And I click the update button or icon on the selected account
#    And I edit data user with invalid no telepon which does not consist of 10 digits
#    And I click Simpan button
#    Then Validate failed to update user account because invalid no telepon less than 10 digits and display error message "No.Telepon harus terdiri dari 10-12 digit angka"
#
#  @TC_AW_20
#  Scenario: Update Account User [TC_AW_20] - Verify failed to update user account because did not input "no. telepon" [Negative 9]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I search the name of the user whose data I want to edit
#    And I click the update button or icon on the selected account
#    And I edit data user without no telepon
#    And I click Simpan button
#    Then Validate failed to update user account because did not input no telepon and display error message "No.Telepon harus terdiri dari 10-12 digit angka"
#
#  @TC_AW_21
#  Scenario: Update Account User [TC_AW_21] - Verify success cancels editing of user account [Positive 5]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I search the name of the user whose data I want to edit
#    And I click the update button or icon on the selected account
#    And I click cancel button
#    Then Validate success to cancel edit user account
#
#
#
#
#
#
#
#  @DeleteAccountUser
#  @TC_AW_22
#  Scenario: Delete Account User [TC_AW_22] - Verify success to delete user account "Ana Shn" [Positive 6]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I search the name of the user whose data I want to delete
#    And I click the delete button or icon on the selected account
#    And I click Hapus button
#    Then Validate success to delete user account and display message "Berhasil menghapus data user"
#
#  @TC_AW_23
#  Scenario: Delete Account User [TC_AW_23] - Verify success to cancel delete user account "Putri Ruth Berliana Siahaan" [Positive 7]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I search name of the user whose data I want to delete
#    And I click the delete button or icon on the selected account
#    And I click cancel button
#    Then Validate success to cancel delete user account
#
#
#
#
#
#
#
#
#
#  @SearchingAccountUser
#  @TC_AW_24
#  Scenario: Searching Account User [TC_AW_24] - Verify success to search user account for Existing User [Positive 8]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I input the name in the search field to search user account for Existing User
#    Then Validate success to display the search result for the name
#
#  @TC_AW_25
#  Scenario: Searching Account User [TC_AW_25] - Verify failed to search user account because input Non-Existent User [Negative 10]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I input non existent user in the search field
#    Then Validate failed to search user account and display message "Data Tidak Tersedia"
#
#
#
#
#
#
#
#
#
#
#
#
#
#  @RangeOfTableResults
#  @TC_AW_26
#  Scenario: Range of Table Results [TC_AW_26] - Verify success to displays data with a maximum of 50 data results [Positive 9]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I scrolls down and click maksimal Tampilan button
#    And I choose option Tampilkan 50 Data
#    Then Validate success to display results between 0 to 50 data
#
#  @TC_AW_27
#  Scenario: Range of Table Results [TC_AW_27] - Verify success to displays data with a maximum of 100 data results [Positive 10]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I scrolls down and click maksimal Tampilan button
#    And I choose option Tampilkan 100 Data
#    Then Validate success to display results between 0 to 100 data
#
#
#
#
#
#
#
#
#
#
#
#  @Pagination
#  @TC_AW_28
#  Scenario: Pagination [TC_AW_28] - Verify success to displays the next page which also contains user account data [Positive 11]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I scrolls down and click the next button
#    Then Validate success to displays the next page which also contains the user account
#
#  @TC_AW_29
#  Scenario: Pagination [TC_AW_29] - Verify success to displays the previous page which also contains user account data [Positive 12]
#    Given I login and will be on the dashboard of the Destimate
#    When I click menu Pengguna
#    And I scrolls down and click the next button
#    And I scrolls down and click the back button
#    Then Validate success to displays the previous page which also contains the user account
#
