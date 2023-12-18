Feature: Manage Terms and Condition (Update, Range of Table Results, and Pagination)

  As an user
  I want to manage terms and condition
  So that the application works according to admin requirements



  @UpdateTNC
  @TC_AW_131
  Scenario: Update TNC [TC_AW_131] - Verify success to Update Terms and Condition with title "TNC Dummy 1" using valid data (title or description) [Positive 1]
    Given I am login and already on the dashboard of Destimate
    When I click menu Syarat & Ketentuan
    And I click the update button or icon on the tnc dummy
    And I edit data tnc with valid data
    And I want to click the Simpan button
    Then Validate success to update tnc and display message "Syarat Ketentuan berhasil diupdate"

  @TC_AW_132
  Scenario: Update TNC [TC_AW_132] - Verify failed to Update Terms and Condition in the title "Perjanjian Pemilik Wisata" because input existing title [Negative 1]
    Given I am login and already on the dashboard of Destimate
    When I click menu Syarat & Ketentuan
    And I click the update button or icon on the tnc Perjanjian Pemilik Wisata
    And I input the title of the tnc that already exists
    And I want to click the Simpan button
    Then Validate failed to update tnc because the title is already exists and display message "Syarat Ketentuan dengan nama ini sudah ada"

  @TC_AW_133
  Scenario: Update TNC [TC_AW_133] - Verify failed to Update Terms and Condition in the title "Pembelian Tiket" because input title with 1 character [Negative 2]
    Given I am login and already on the dashboard of Destimate
    When I click menu Syarat & Ketentuan
    And I click the update button or icon on the tnc Pembeli Tiket
    And I input invalid data with title 1 character
    And I want to click the Simpan button
    Then Validate failed to update tnc because invalid title and display message "Judul minimal 5 karakter"

  @TC_AW_134
  Scenario: Update TNC [TC_AW_134] - Verify failed to Update Terms and Condition in the title "Pembelian Tiket" because input description with 1 character [Negative 3]
    Given I am login and already on the dashboard of Destimate
    When I click menu Syarat & Ketentuan
    And I click the update button or icon on the tnc Pembeli Tiket
    And I input invalid data with description 1 character
    And I want to click the Simpan button
    Then Validate failed to update tnc because invalid description and display message "Deskripsi minimal 10 karakter"

  @TC_AW_135
  Scenario: Update TNC [TC_AW_135] - Verify failed to Update Terms and Condition in the title "Pembelian Tiket" because edit by not entering the title [Negative 4]
    Given I am login and already on the dashboard of Destimate
    When I click menu Syarat & Ketentuan
    And I click the update button or icon on the tnc Pembeli Tiket
    And I did not input the title
    And I want to click the Simpan button
    Then Validate failed to update tnc because empty title and display message "Judul tidak boleh kosong"

  @TC_AW_136
  Scenario: Update TNC [TC_AW_136] - Verify failed to Update Terms and Condition in the title "Pembelian Tiket" because edit by not entering the description [Negative 5]
    Given I am login and already on the dashboard of Destimate
    When I click menu Syarat & Ketentuan
    And I click the update button or icon on the tnc Pembeli Tiket
    And I did not input the description
    And I want to click the Simpan button
    Then Validate failed to update tnc because empty description and display message "Deskripsi tidak boleh kosong"

  @TC_AW_137
  Scenario: Update TNC [TC_AW_137] - Verify success cancels update Terms and Condition with title "Pembelian Paket" [Positive 2]
    Given I am login and already on the dashboard of Destimate
    When I click menu Syarat & Ketentuan
    And I click the update button or icon on the tnc Pembeli Tiket
    And I edit data tnc with valid data in TNC
    And I choose a Cancel button
    Then Validate success to cancel update tnc and back to display all Terms and Conditions










  @RangeOfTableResultsTNC
  @TC_AW_138
  Scenario: Range of Table Results TNC [TC_AW_138] - Verify success to displays data with a maximum of 50 data results [Positive 3]
    Given I am login and already on the dashboard of Destimate
    When I click menu Syarat & Ketentuan
    And I scroll to down in the menu tnc and then click maksimal Tampilan button
    And I want choose option Tampilkan 50 Data
    Then Validate success to display the data tnc between 0 to 50 data

  @TC_AW_139
  Scenario: Range of Table Results TNC [TC_AW_139] - Verify success to displays data with a maximum of 100 data results [Positive 4]
    Given I am login and already on the dashboard of Destimate
    When I click menu Syarat & Ketentuan
    And I scroll to down in the menu tnc and then click maksimal Tampilan button
    And I want choose the option Tampilkan 100 Data
    Then Validate success to display data tnc between 0 to 100 data











  @PaginationTNC
  @TC_AW_140
  Scenario: Pagination TNC [TC_AW_140] - Verify success to displays the next page which also contains other Terms and Condition [Positive 5]
    Given I am login and already on the dashboard of Destimate
    When I click menu Syarat & Ketentuan
    And I scroll to down and I click the next button
    Then Validate success to displays the next page which also contains the other tnc

  @TC_AW_141
  Scenario: Pagination TNC [TC_AW_141] - Verify success to displays the previous page which also contains other Terms and Condition [Positive 6]
    Given I am login and already on the dashboard of Destimate
    When I click menu Syarat & Ketentuan
    And I scroll to down and I click the next button
    And I am click a back button
    Then Validate success to displays the previous page which also contains the tnc
