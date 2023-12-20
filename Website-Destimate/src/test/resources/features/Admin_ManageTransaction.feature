Feature: Manage Transaction (Update, Searching, See Details, Range of Table Results, and Pagination)

  As an user
  I want to manage transaction
  So that the application works according to admin requirements



  @UpdateTransaction
  @TC_AW_120
  Scenario: Update Transaction [TC_AW_120] - Verify success to update transaction (ID Order 1701396764-262) with status "Sudah Bayar" [Positive 1]
    Given I am login and already on the dashboard Destimate
    When I click menu Transaksi
    And I search the id transaction 1701396764-262
    And I click the update button or icon on the selected transaction
    And I edit data transaction with choose status Sudah Bayar
    And I go to click the Simpan button
    Then Validate success to update transaction and display message "Status pembayaran berhasil di konfirmasi"

  @TC_AW_121
  Scenario: Update Transaction [TC_AW_121] - Verify success to update transaction (ID Order 1701396764-262) with status not yet paid [Positive 2]
    Given I am login and already on the dashboard Destimate
    When I click menu Transaksi
    And I search the id transaction 1701396764-262
    And I click the update button or icon on the selected transaction
    And I edit data transaction with choose status Belum Bayar
    And I go to click the Simpan button
    Then Validate success to update transaction and display message "Status pembayaran berhasil di konfirmasi"










  @SearchingTransaction
  @TC_AW_122
  Scenario: Searching Transaction [TC_AW_122] - Verify success to search transaction for Existing data [Positive 3]
    Given I am login and already on the dashboard Destimate
    When I click menu Transaksi
    And I search the id transaction 1700673264-203
    Then Validate success to display the search result for the transaction

  @TC_AW_123
  Scenario: Searching Transaction [TC_AW_123] - Verify failed to search transaction because input Non-Existent Data [Negative 1]
    Given I am login and already on the dashboard Destimate
    When I click menu Transaksi
    And I input non existent transaction like id 1699737028-105 in the search field
    Then Validate failed to search transaction and display message "Data Tidak Tersedia"
















  @SeeDetailsTransaction
  @TC_AW_124
  Scenario: See Details of Transaction [TC_AW_124] - Verify success to see details of transaction with status "Selesai" [Positive 4]
    Given I am login and already on the dashboard Destimate
    When I click menu Transaksi
    And I search the id transaction 1700579240-327
    And I click eyes button or icon on the selected transaction to see the details
    Then Validate success to display detail of the transaction with status "Transaksi Selesai"

  @TC_AW_125
  Scenario: See Details of Transaction [TC_AW_125] - Verify success to see details of transaction in status "Tertunda" [Positive 5]
    Given I am login and already on the dashboard Destimate
    When I click menu Transaksi
    And I search the id transaction 1700579294-882
    And I click eyes button or icon on the selected transaction to see the details
    Then Validate success to display detail the transaction with status "Transaksi Tertunda"

  @TC_AW_126
  Scenario: See Details of Transaction [TC_AW_126] - Verify success to see details of transaction with status "Batal" [Positive 6]
    Given I am login and already on the dashboard Destimate
    When I click menu Transaksi
    And I search the id transaction 1700582320-491
    And I click eyes button or icon on the selected transaction to see the details
    Then Validate success to display detail a transaction with status "Transaksi Batal"










  @RangeOfTableResultsTransaction
  @TC_AW_127
  Scenario: Range of Table Results Transaction [TC_AW_127] - Verify success to displays data with a maximum of 50 data results [Positive 7]
    Given I am login and already on the dashboard Destimate
    When I click menu Transaksi
    And I scroll to down in the menu transaction and then click maksimal Tampilan button
    And I am choose the option Tampilkan 50 Data
    Then Validate success to display the data transaction between 0 to 50 data

  @TC_AW_128
  Scenario: Range of Table Results Transaction [TC_AW_128] - Verify success to displays data with a maximum of 100 data results [Positive 8]
    Given I am login and already on the dashboard Destimate
    When I click menu Transaksi
    And I scroll to down in the menu transaction and then click maksimal Tampilan button
    And I am choose the option Tampilkan 100 Data
    Then Validate success to display data transaction between 0 to 100 data











  @PaginationTransaction
  @TC_AW_129
  Scenario: Pagination Transaction [TC_AW_129] - Verify success to displays the next page which also contains other transaction [Positive 9]
    Given I am login and already on the dashboard Destimate
    When I click menu Transaksi
    And I scrolls to down and I click the next button
    Then Validate success to displays the next page which also contains the other transaction

  @TC_AW_130
  Scenario: Pagination Transaction [TC_AW_130] - Verify success to displays the previous page which also contains other transaction [Positive 10]
    Given I am login and already on the dashboard Destimate
    When I click menu Transaksi
    And I scrolls to down and I click the next button
    And I click back button
    Then Validate success to displays the previous page which also contains the transaction
