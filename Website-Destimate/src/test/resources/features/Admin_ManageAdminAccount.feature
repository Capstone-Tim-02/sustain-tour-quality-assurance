Feature: Manage Admin Account (Update Account, Delete Account, Searching Account, Range of Table Results, and Pagination)

  As an user
  I want to manage account admin
  So that the application works according to admin requirements

  @UpdateAccountAdmin
  @TC_AW_144
  Scenario: Update Account Admin [TC_AW_144] - Verify success to update account admin of "Admin Destimate 3" with valid username [Positive 1]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I search the name of the admin whose data I want to edit
    And I go to click the update button or icon on the selected account
    And I edit data admin with valid username
    And I will click Simpan button
    Then Validate success to update admin account with valid username and display message "Berhasil mengupdate data admin"

  @TC_AW_145
  Scenario: Update Account Admin [TC_AW_145] - Verify failed to update account "Admin Destimate 3" because input an existing username [Negative 1]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I search the name of the admin whose data I want to edit
    And I go to click the update button or icon on the selected account
    And I input existing username
    And I will click Simpan button
    Then Validate failed to update admin account because username already registered and display error message "Username sudah digunakan oleh user lain, silahkan coba yang lain"

  @TC_AW_146
  Scenario: Update Account Admin [TC_AW_146] - Verify failed to update account "Admin Destimate 3" because did not input username [Negative 2]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I search the name of the admin whose data I want to edit
    And I go to click the update button or icon on the selected account
    And I edit data admin without username
    And I will click Simpan button
    Then Validate failed to update admin account because did not input username and display error message "Username tidak boleh kosong"

  @TC_AW_147
  Scenario: Update Account Admin [TC_AW_147] - Verify success to update account "Admin Destimate 3" with valid name [Positive 2]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I search the name of the admin whose data I want to edit
    And I go to click the update button or icon on the selected account
    And I edit data admin with valid name
    And I will click Simpan button
    Then Validate success to update admin account with valid name and display message "Berhasil mengupdate data admin"

  @TC_AW_148
  Scenario: Update Account Admin [TC_AW_148] - Verify failed to update account "Admin Destimate 36" because input invalid name [Negative 3]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I search the name of the admin whose data I want to edit
    And I go to click the update button or icon on the selected account
    And I edit data admin with invalid name
    And I will click Simpan button
    Then Validate failed to update admin account because invalid name and display error message "Minimal 3 karakter untuk nama"

  @TC_AW_149
  Scenario: Update Account Admin [TC_AW_149] - Verify failed to update account "Admin Destimate 36" because did not input name [Negative 4]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I search the name of the admin whose data I want to edit
    And I go to click the update button or icon on the selected account
    And I edit data admin without input name
    And I will click Simpan button
    Then Validate failed to update admin account because did not input name and display error message "Nama tidak boleh kosong"

  @TC_AW_150
  Scenario: Update Account Admin [TC_AW_150] - Verify success to update account "Admin Destimate 36" with valid email [Positive 3]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I search the name of the admin whose data I want to edit
    And I go to click the update button or icon on the selected account
    And I edit data admin with valid email
    And I will click Simpan button
    Then Validate success to update admin account with valid email and display message "Berhasil mengupdate data admin"

  @TC_AW_151
  Scenario: Update Account Admin [TC_AW_151] - Verify failed to update account "Admin Destimate 36" because input an existing email [Negative 5]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I search the name of the admin whose data I want to edit
    And I go to click the update button or icon on the selected account
    And I input existing email
    And I will click Simpan button
    Then Validate failed to update admin account because email already registered and display error message "Email sudah digunakan user lain"

  @TC_AW_152
  Scenario: Update Account Admin [TC_AW_152] - Verify failed to update account "Admin Destimate 36" because did not input email [Negative 6]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I search the name of the admin whose data I want to edit
    And I go to click the update button or icon on the selected account
    And I edit data admin without email
    And I will click Simpan button
    Then Validate failed to update admin account because did not input email and display error message "Email tidak boleh kosong"

  @TC_AW_153
  Scenario: Update Account Admin [TC_AW_153] - Verify success to update account "Admin Destimate 36" with valid "no. telepon" [Positive 4]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I search the name of the admin whose data I want to edit
    And I go to click the update button or icon on the selected account
    And I edit data admin with valid no telepon
    And I will click Simpan button
    Then Validate success to update admin account with valid no telepon and display message "Berhasil mengupdate data admin"

  @TC_AW_154
  Scenario: Update Account Admin [TC_AW_154] - Verify failed to update account "Admin Destimate 36" because input invalid "no. telepon" with abjad [Negative 7]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I search the name of the admin whose data I want to edit
    And I go to click the update button or icon on the selected account
    And I edit data admin with invalid no telepon with abjad
    And I will click Simpan button
    Then Validate failed to update admin account because invalid no telepon with abjad and display error message "Masukkan format nomor telepon yang benar"

  @TC_AW_155
  Scenario: Update Account Admin [TC_AW_155] - Verify failed to update account "Admin Destimate 36" because input invalid "no. telepon" which does not consist of 10 digits [Negative 8]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I search the name of the admin whose data I want to edit
    And I go to click the update button or icon on the selected account
    And I edit data admin with invalid no telepon which does not consist of 10 digits
    And I will click Simpan button
    Then Validate failed to update admin account because invalid no telepon less than 10 digits and display error message "No.Telepon harus terdiri dari 10-12 digit angka"

  @TC_AW_156
  Scenario: Update Account Admin [TC_AW_156] - Verify failed to update account "Admin Destimate 36" because did not input "no. telepon" [Negative 9]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I search the name of the admin whose data I want to edit
    And I go to click the update button or icon on the selected account
    And I edit data admin without no telepon
    And I will click Simpan button
    Then Validate failed to update admin account because did not input no telepon and display error message "No.Telepon harus terdiri dari 10-12 digit angka"

  @TC_AW_157
  Scenario: Update Account Admin [TC_AW_157] - Verify success cancels editing of account "Admin Destimate 36" [Positive 5]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I search the name of the admin whose data I want to edit
    And I go to click the update button or icon on the selected account
    And I edit data admin with valid username
    And I go to click cancel button
    Then Validate success to cancel edit admin account







  @DeleteAccountAdmin
  @TC_AW_158
  Scenario: Delete Account Admin [TC_AW_158] - Verify success to delete account "Admin Destimate 36" [Positive 6]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I search the name of the admin whose data I want to delete
    And I click the delete button or icon on the selected account admin
    And I choose the Hapus button
    Then Validate success to delete admin account and display message "Berhasil menghapus data admin"

  @TC_AW_159
  Scenario: Delete Account Admin [TC_AW_159] - Verify success cancel to delete account "Admin Destimate 2" [Positive 7]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I search name of the admin whose data I want to delete
    And I click the delete button or icon on the selected account admin destimate 2
    And I choose the Batal button
    Then Validate success to cancel delete admin account









  @SearchingAccountAdmin
  @TC_AW_160
  Scenario: Searching Account Admin [TC_AW_160] - Verify success to search account for Existing Admin [Positive 8]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I search Admin Destimate 2
    Then Validate success to display the search result for the account Admin Destimate 2

  @TC_AW_161
  Scenario: Searching Account Admin [TC_AW_161] - Verify failed to search account because input Non-Existent Admin [Negative 10]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I search account non existent like Admin CMS
    Then Validate failed to search admin account and display message "Data Tidak Tersedia"













  @RangeOfTableResultsAdmin
  @TC_AW_162
  Scenario: Range of Table Results Admin [TC_AW_162] - Verify success to displays data with a maximum of 50 data results [Positive 9]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I scroll down and click maksimal Tampilan button
    And I choose the option Tampilkan 50 Data Admin
    Then Validate success to display data account admin between 0 to 50 data

  @TC_AW_163
  Scenario: Range of Table Results Admin [TC_AW_163] - Verify success to displays data with a maximum of 100 data results [Positive 10]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I scroll down and click maksimal Tampilan button
    And I choose a option Tampilkan 100 Data Admin
    Then Validate success display data account admin between 0 to 100 data











  @PaginationAdmin
  @TC_AW_164
  Scenario: Pagination Admin [TC_AW_164] - Verify success to displays the next page which also contains admin account data [Positive 11]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I scroll to down and click the next button
    Then Validate success to displays the next page which also contains the admin account

  @TC_AW_65
  Scenario: Pagination Admin [TC_AW_165] - Verify success to displays the previous page which also contains admin account data [Positive 12]
    Given I am login and will be on the dashboard of the Destimate
    When I click menu Admin
    And I scroll to down and click the next button
    And I scrolls to down and click the back button
    Then Validate success to displays the previous page which also contains the admin account

