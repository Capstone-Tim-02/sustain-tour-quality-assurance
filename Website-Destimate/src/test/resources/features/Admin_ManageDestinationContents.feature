#Feature: Manage Destination Contents (Create, Update, Delete, Searching, See Details, Range of Table Results, and Pagination)
#
#  As an user
#  I want to manage destination contents
#  So that the application works according to admin requirements
#
#  @CreateDestination
#  @TC_AW_48
#  Scenario: Create Destination Contents [TC_AW_48] - Verify success to create a new destination with valid data [Positive 1]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I click Tambah Destinasi button
#    And I input valid data of new destination
#    And I click Tambah Destinasi option
#    Then Validate success to create a new destination with valid data and display message "Wisata berhasil dibuat"
#
#  @TC_AW_49
#  Scenario: Create Destination Contents [TC_AW_49] - Verify failed to create a new destination because did not input Destinasi Kode [Negative 1]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I click Tambah Destinasi button
#    And I did not input Destinasi Kode in the form create destination
#    And I click Tambah Destinasi option
#    Then Validate failed to create a new destination because did not input Destinasi Kode and display message "Destinasi Kode tidak boleh kosong"
#
#  @TC_AW_50
#  Scenario: Create Destination Contents [TC_AW_50] - Verify failed to create a new destination because did not input "Nama Destinasi" [Negative 2]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I click Tambah Destinasi button
#    And I did not input Nama Destinasi in the form create destination
#    And I click Tambah Destinasi option
#    Then Validate failed to create a new destination because did not input Nama Destinasi and display message "Nama Destinasi tidak boleh kosong"
#
#  @TC_AW_51
#  Scenario: Create Destination Contents [TC_AW_51] - Verify failed to create a new destination because did not input "Lokasi Kota" [Negative 3]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I click Tambah Destinasi button
#    And I did not input Lokasi Kota in the form create destination
#    And I click Tambah Destinasi option
#    Then Validate failed to create a new destination because did not input Lokasi Kota and display message "Lokasi Kota tidak boleh kosong"
#
#  @TC_AW_52
#  Scenario: Create Destination Contents [TC_AW_52] - Verify failed to create a new destination because did not input "Alamat Peta" [Negative 4]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I click Tambah Destinasi button
#    And I did not input Alamat Peta in the form create destination
#    And I click Tambah Destinasi option
#    Then Validate failed to create a new destination because did not input Alamat Peta and display message "URL Peta tidak boleh kosong"
#
#  @TC_AW_53
#  Scenario: Create Destination Contents [TC_AW_53] - Verify failed to create a new destination because did not input "Alamat" [Negative 5]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I click Tambah Destinasi button
#    And I did not input Alamat in the form create destination
#    And I click Tambah Destinasi option
#    Then Validate failed to create a new destination because did not input Alamat and display message "Alamat tidak boleh kosong"
#
#  @TC_AW_54
#  Scenario: Create Destination Contents [TC_AW_54] - Verify failed to create a new destination because did not input "Latitute Peta" [Negative 6]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I click Tambah Destinasi button
#    And I did not input Latitude Peta in the form create destination
#    And I click Tambah Destinasi option
#    Then Validate failed to create a new destination because did not input Latitute Peta and display message "Latitude Peta tidak boleh kosong"
#
#  @TC_AW_55
#  Scenario: Create Destination Contents [TC_AW_55] - Verify failed to create a new destination because did not input "Longitude Peta" [Negative 7]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I click Tambah Destinasi button
#    And I did not input Longitude Peta in the form create destination
#    And I click Tambah Destinasi option
#    Then Validate failed to create a new destination because did not input Longitude Peta and display message "Longitude Peta tidak boleh kosong"
#
#  @TC_AW_56
#  Scenario: Create Destination Contents [TC_AW_56] - Verify failed to create a new destination because did not input "Highlight" [Negative 8]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I click Tambah Destinasi button
#    And I did not input Highlight in the form create destination
#    And I click Tambah Destinasi option
#    Then Validate failed to create a new destination because did not input Highlight and display message "Highlight tidak boleh kosong"
#
#  @TC_AW_57
#  Scenario: Create Destination Contents [TC_AW_57] - Verify failed to create a new destination because did not input "Jumlah Stok Tiket" [Negative 9]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I click Tambah Destinasi button
#    And I did not input Jumlah Stok Tiket in the form create destination
#    And I click Tambah Destinasi option
#    Then Validate failed to create a new destination because did not input Jumlah Stok Tiket and display message "Jumlah Stok Tiket tidak boleh kosong"
#
#  @TC_AW_58
#  Scenario: Create Destination Contents [TC_AW_58] - Verify failed to create a new destination because did not input "Harga Tiket" [Negative 10]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I click Tambah Destinasi button
#    And I did not input Harga Tiket in the form create destination
#    And I click Tambah Destinasi option
#    Then Validate failed to create a new destination because did not input Harga Tiket and display message "Harga Tiket tidak boleh kosong"
#
#  @TC_AW_59
#  Scenario: Create Destination Contents [TC_AW_59] - Verify failed to create a new destination because did not choose "Status" and do not input "Deskripsi" [Negative 11]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I click Tambah Destinasi button
#    And I did not choose Status and empty Deskripsi in the form create destination
#    And I click Tambah Destinasi option
#    Then Validate failed to create a new destination because did not choose Status and empty Deskripsi and display message "Status tidak boleh kosong" and "Deskripsi tidak boleh kosong"
#
#  @TC_AW_60
#  Scenario: Create Destination Contents [TC_AW_60] - Verify failed to create a new destination because did not choose "Kategori" and did not input "Fasilitas Lokal" [Negative 12]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I click Tambah Destinasi button
#    And I did not choose Kategori and empty Fasilitas Lokal in the form create destination
#    And I click Tambah Destinasi option
#    Then Validate failed to create a new destination because did not choose Kategori and empty Fasilitas Lokal and display message "Kategori tidak boleh kosong" and "Fasilitas lokal tidak boleh kosong"
#
#  @TC_AW_61
#  Scenario: Create Destination Contents [TC_AW_61] - Verify failed to create a new destination because did not input the picture [Negative 13]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I click Tambah Destinasi button
#    And I did not input Picture in the form create destination
#    And I click Tambah Destinasi option
#    Then Validate failed to create a new destination because did not input Picture and display message "Gambar Destinasi tidak boleh kosong"
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
#  @UpdateDestination
#  @TC_AW_62
#  Scenario: Update Destination Contents [TC_AW_62] - Verify success to update destination "Pantai Bulbul" with valid data [Positive 2]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I search the name of the destination that i want to edit
#    And I click the update button or icon on the selected category
#    And I edit data destination with valid data
#    And I am click Simpan button
#    Then Validate success to update destination with valid data and display message "Data wisata berhasil di update"
#
#  @TC_AW_63
#  Scenario: Update Destination Contents [TC_AW_63] - Verify failed to update destination because input invalid Destinasi Kode [Negative 14]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I search the name of the destination that i want to edit
#    And I click the update button or icon on the selected category
#    And I edit data destination with invalid Destinasi Kode
#    And I am click Simpan button
#    Then Validate failed to update destination because invalid Destinasi Kode and display message "Destinasi Kode minimal 3 karakter"
#
#  @TC_AW_64
#  Scenario: Update Destination Contents [TC_AW_64] - Verify failed to update destination because input invalid "Nama Destinasi" [Negative 15]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I search the name of the destination that i want to edit
#    And I click the update button or icon on the selected category
#    And I edit data destination with invalid Nama Destinasi
#    And I am click Simpan button
#    Then Validate failed to update destination because invalid Nama Destinasi and display message "Nama Destinasi minimal 8 karakter"
#
#  @TC_AW_65
#  Scenario: Update Destination Contents [TC_AW_65] - Verify failed to update destination because input invalid "Lokasi Kota" [Negative 16]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I search the name of the destination that i want to edit
#    And I click the update button or icon on the selected category
#    And I edit data destination with invalid Lokasi Kota
#    And I am click Simpan button
#    Then Validate failed to update destination because invalid Lokasi Kota and display message "Lokasi Kota minimal 4 karakter"
#
#  @TC_AW_66
#  Scenario: Update Destination Contents [TC_AW_66] - Verify failed to update destination because input invalid "Alamat Peta" [Negative 17]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I search the name of the destination that i want to edit
#    And I click the update button or icon on the selected category
#    And I edit data destination with invalid Alamat Peta
#    And I am click Simpan button
#    Then Validate failed to update destination because invalid Alamat Peta and display message "URL peta harus minimal terdiri dari 5 huruf"
#
#  @TC_AW_67
#  Scenario: Update Destination Contents [TC_AW_67] - Verify failed to update destination because input invalid "Alamat" [Negative 18]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I search the name of the destination that i want to edit
#    And I click the update button or icon on the selected category
#    And I edit data destination with invalid Alamat
#    And I am click Simpan button
#    Then Validate failed to update destination because invalid Alamat and display message "Alamat minimal 8 karakter"
#
#  @TC_AW_68
#  Scenario: Update Destination Contents [TC_AW_68] - Verify failed to update destination because input invalid "Latitude Peta" [Negative 19]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I search the name of the destination that i want to edit
#    And I click the update button or icon on the selected category
#    And I edit data destination with invalid Latitude Peta
#    And I am click Simpan button
#    Then Validate failed to update destination because invalid Latitude Peta and display message "Kesalahan nilai latitude peta"
#
#  @TC_AW_69
#  Scenario: Update Destination Contents [TC_AW_69] - Verify failed to update destination because input invalid "Longitude Peta" [Negative 20]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I search the name of the destination that i want to edit
#    And I click the update button or icon on the selected category
#    And I edit data destination with invalid Longitude Peta
#    And I am click Simpan button
#    Then Validate failed to update destination because invalid Longitude Peta and display message "Kesalahan nilai longitude peta"
#
#  @TC_AW_70
#  Scenario: Update Destination Contents [TC_AW_70] - Verify failed to update destination because input invalid "Jumlah Stok Tiket" [Negative 21]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I search the name of the destination that i want to edit
#    And I click the update button or icon on the selected category
#    And I edit data destination with invalid Jumlah Stok Tiket
#    And I am click Simpan button
#    Then Validate failed to update destination because invalid Jumlah Stok Tiket and display message "Minimal Jumlah Stock Tiket 1"
#
#  @TC_AW_71
#  Scenario: Update Destination Contents [TC_AW_71] - Verify failed to update destination because input invalid Harga Tiket [Negative 22]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I search the name of the destination that i want to edit
#    And I click the update button or icon on the selected category
#    And I edit data destination with invalid Harga Tiket
#    And I am click Simpan button
#    Then Validate failed to update destination because invalid Harga Tiket and display message "price min Rp. 1"
#
#
#
#
#  @DeleteDestination
#  @TC_AW_72
#  Scenario: Delete Destination [TC_AW_72] - Verify success to delete destination "Pantai Bulbul" [Positive 3]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I search destination Pantai Bulbul with the aim to remove it
#    And I click delete button or icon on the selected destination
#    And I choose Hapus button
#    Then Validate success to delete destination and display message "Wisata berhasil dihapus"
#
#  @TC_AW_73
#  Scenario: Delete Destination [TC_AW_73] - Verify success cancel to delete user destination [Positive 4]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I search destination Kebun Raya Bogor
#    And I click delete button or icon on the selected destination
#    And I choose Cancel button
#    Then Validate success to cancel delete destination
#
#
#
#
#
#
#
#
#
#  @SearchingDestination
#  @TC_AW_74
#  Scenario: Searching Category [TC_AW_74] - Verify success to search category for existing name [Positive 5]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I search destination Kebun Raya Bogor
#    Then Validate success to display the search result for the destination
#
#  @TC_AW_75
#  Scenario: Searching Category [TC_AW_75] - Verify failed to search category because input Non-Existent name [Negative 23]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I input non existent destination like Kebun Binatang in the search field
#    Then Validate failed to search destination and display message "Data Tidak Tersedia"
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
#  @SeeDetailsDestination
#  @TC_AW_76
#  Scenario: See Details of Destination [TC_AW_76] - Verify success to see details of destination [Positive 6]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I search destination Kebun Raya Bogor
#    And I click eyes button or icon on the selected destination to see the details
#    Then Validate success to display detail of the destination
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
#  @RangeOfTableResultsDestination
#  @TC_AW_77
#  Scenario: Range of Table Results [TC_AW_77] - Verify success to displays data with a maximum of 50 data results [Positive 7]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I will scrolls down and then click maksimal Tampilan button
#    And I want to choose the option Tampilkan 50 Data
#    Then Validate success to display data destination between 0 to 50 data
#
#  @TC_AW_78
#  Scenario: Range of Table Results [TC_AW_78] - Verify success to displays data with a maximum of 100 data results [Positive 8]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I will scrolls down and then click maksimal Tampilan button
#    And I want to choose the option Tampilkan 100 Data
#    Then Validate success to display of data destination between 0 to 100 data
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
#  @PaginationDestination
#  @TC_AW_79
#  Scenario: Pagination [TC_AW_79] - Verify success to displays the next page which also contains other destination [Positive 9]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I will scrolls down and then click the next button
#    Then Validate success to displays the next page which also contains the other destination
#
#  @TC_AW_80
#  Scenario: Pagination [TC_AW_80] - Verify success to displays the previous page which also contains other destination [Positive 10]
#    Given I am login and already on the dashboard of the Destimate
#    When I click menu Destination
#    And I will scrolls down and then click the next button
#    And I click the back button
#    Then Validate success to displays the previous page which also contains the destination
