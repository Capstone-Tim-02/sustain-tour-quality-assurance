Feature: Manage Promo (Create, Update, Delete, Searching, Virtual Assistant, Range of Table Results, and Pagination)

  As an user
  I want to manage promo
  So that the application works according to admin requirements

#  @CreatePromo
#  @TC_AW_81
#  Scenario: Create Promo [TC_AW_81] - Verify success to create a new promo with valid data [Positive 1]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I input valid data of new promo
#    And I click Tambah Promo option
#    Then Validate success to create a new promo with valid data and display message "Promo berhasil dibuat"
#
#  @TC_AW_82
#  Scenario: Create Promo [TC_AW_82] - Verify failed to create a new promo because did not input Judul Promo [Negative 1]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I did not input Judul promo in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because did not input Judul Promo and display message "Judul promo tidak boleh kosong"
#
#  @TC_AW_83
#  Scenario: Create Promo [TC_AW_83] - Verify failed to create a new promo because did not input Nama Promo [Negative 2]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I did not input Nama promo in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because did not input Nama Promo and display message "Nama promo tidak boleh kosong"
#
#  @TC_AW_84
#  Scenario: Create Promo [TC_AW_84] - Verify failed to create a new promo because did not input Kode Promo [Negative 3]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I did not input Kode Promo in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because did not input Kode Promo and display message "Kode promo tidak boleh kosong"
#
#  @TC_AW_85
#  Scenario: Create Promo [TC_AW_85] - Verify failed to create a new promo because did not input Tanggal Kadaluarsa [Negative 4]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I did not input Tanggal Kadaluarsa in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because did not input Tanggal Kadaluarsa and display message "Tanggal kadaluarsa tidak boleh kosong"
#
#  @TC_AW_86
#  Scenario: Create Promo [TC_AW_86] - Verify failed to create a new promo because did not input Diskon [Negative 5]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I did not input Diskon in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because did not input Diskon and display message "Diskon promo tidak boleh kosong"
#
#  @TC_AW_87
#  Scenario: Create Promo [TC_AW_87] - Verify failed to create a new promo because did not input Deskripsi [Negative 6]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I did not input Deskripsi in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because did not input Deskripsi and display message "Deskripsi promo tidak boleh kosong"
#
#  @TC_AW_88
#  Scenario: Create Promo [TC_AW_88] - Verify failed to create a new promo because did not input "Peraturan" [Negative 7]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I did not input Peraturan in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because did not input Peraturan and display message "Peraturan promo tidak boleh kosong"
#
#  @TC_AW_89
#  Scenario: Create Promo [TC_AW_89] - Verify failed to create a new promo because did not input "Gambar Promo" [Negative 8]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I did not input Gambar Promo in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because did not input Gambar Promo and display message "Gambar tidak boleh kosong"
#
#  @TC_AW_90
#  Scenario: Create Promo [TC_AW_90] - Verify failed to create a new promo because input invalid "Judul Promo" [Negative 9]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I input invalid Judul Promo in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because invalid Judul Promo and display message "Judul promo minimal 5 karakter"
#
#  @TC_AW_91
#  Scenario: Create Promo [TC_AW_91] - Verify failed to create a new promo because input invalid "Nama Promo" [Negative 10]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I input invalid Nama Promo in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because invalid Nama Promo and display message "Nama promo minimal 5 karakter"
#
#  @TC_AW_92
#  Scenario: Create Promo [TC_AW_92] - Verify failed to create a new promo because input invalid "Kode Promo" with 2 character [Negative 11]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I input invalid Kode Promo with 2 character in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because invalid Kode Promo with 2 character and display message "Kode promo minimal 5 karakter"
#
#  @TC_AW_93
#  Scenario: Create Promo [TC_AW_93] - Verify failed to create a new promo because input invalid "Kode Promo" which has a very long promo code [Negative 12]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I input invalid Kode Promo which has a very long promo code in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because invalid Kode Promo which has a very long promo code and display message "Kode promo tidak boleh lebih dari 40 karakter"
#
#  @TC_AW_94
#  Scenario: Create Promo [TC_AW_94] - Verify failed to create a new promo because input invalid "Tanggal Kadaluarsa" where to input the date that has already passed [Negative 13]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I input invalid Tanggal Kadaluarsa in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because invalid Tanggal Kadaluarsa and display message "Kesalahan tanggal_kadaluarsa. Tidak boleh tanggal yang sudah lewat"
#
#  @TC_AW_95
#  Scenario: Create Promo [TC_AW_95] - Verify failed to create a new promo because input invalid "Diskon" with a discount of 0% [Negative 14]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I input invalid Diskon with a discount is 0 in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because Diskon with a discount is 0 and display message "Diskon promo minimal 1%"
#
#  @TC_AW_96
#  Scenario: Create Promo [TC_AW_96] - Verify failed to create a new promo because input invalid "Diskon" with a discount of more than 100% [Negative 15]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I input invalid Diskon with a discount is more than 100% in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because Diskon with a discount is more than 100% and display message "Diskon promo maximal 100%"
#
#  @TC_AW_97
#  Scenario: Create Promo [TC_AW_97] - Verify success to create a new promo even though select status "Tidak Aktif" [Positive 2]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I input status Tidak Aktif of new promo
#    And I click Tambah Promo option
#    Then Validate success to create a new promo with Status Tidak Aktif and display message "Promo berhasil dibuat"
#
#  @TC_AW_98
#  Scenario: Create Promo [TC_AW_98] - Verify failed to create a new promo because input invalid "Description" [Negative 16]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I input invalid Description in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because invalid Description and display message "Deskripsi promo minimal 10 karakter"
#
#  @TC_AW_99
#  Scenario: Create Promo [TC_AW_99] - Verify failed to create a new promo because input invalid "Peraturan" [Negative 17]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I input invalid Peraturan in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because invalid Peraturan and display message "Peraturan promo tidak boleh lebih dari 2000 karakter"
#
#
#  @TC_AW_100
#  Scenario: Create Promo [TC_AW_100] - Verify failed to create a new promo because input invalid "Gambar Promo" [Negative 18]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I input invalid Gambar Promo in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because invalid Gambar Promo and display message "Format file tidak sesuai. Hanya diperbolehkan format JPG, JPEG, PNG."
#
#  @TC_AW_101
#  Scenario: Create Promo [TC_AW_101] - Verify failed to create a new promo because input name of the promo that had already been registered [Negative 19]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I input name of the promo that had already been registered in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because input name of the promo that had already been registered and display message "Promo dengan nama promo ini telah digunakan"
#
#  @TC_AW_102
#  Scenario: Create Promo [TC_AW_102] - Verify failed to create a new promo because input kode of the promo that had already been registered [Negative 20]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I input kode of the promo that had already been registered in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because input kode of the promo that had already been registered and display message "Nama kode voucher telah digunakan oleh promo lainnya, silahkan coba gunakan nama lainnya"
#
#  @TC_AW_103
#  Scenario: Create Promo [TC_AW_103] - Verify failed to create a new promo because input title of the promo that had already been registered [Negative 21]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click Tambah Promo button
#    And I input title of the promo that had already been registered in the form create promo
#    And I click Tambah Promo option
#    Then Validate failed to create a new promo because input title of the promo that had already been registered and display message "Promo dengan judul ini telah digunakan"
#
#
#
#
#
#  @UpdatePromo
#  @TC_AW_104
#  Scenario: Update Promo [TC_AW_104] - Verify success to update promo "Relaxation Retreat" with valid data [Positive 3]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I search the name of the promo that i want to edit
#    And I click the update button or icon on the selected promo
#    And I edit data promo with valid data
#    And I go to click Simpan button
#    Then Validate success to update promo with valid data and display message "Promo berhasil diperbarui"
#
#  @TC_AW_105
#  Scenario: Update Promo [TC_AW_105] - Verify failed to update promo "Relaxation Retreat" because input invalid "Diskon" [Negative 22]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I search the name of the promo that i want to edit
#    And I click the update button or icon on the selected promo
#    And I edit data promo with invalid Diskon
#    And I go to click Simpan button
#    Then Validate failed to update promo because invalid Diskon and display message "Maximum 100%"
#
#  @TC_AW_106
#  Scenario: Update Promo [TC_AW_106] - Verify success to update promo "Relaxation Retreat" with drag christmastEdit.jpg to form [Positive 4]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I search the name of the promo that i want to edit
#    And I click the update button or icon on the selected promo
#    And I edit data promo with drag christmastEdit.jpg to form
#    And I go to click Simpan button
#    Then Validate success to update promo with valid data and display message "Promo berhasil diperbarui"
#
#  @TC_AW_107
#  Scenario: Update Promo [TC_AW_107] - Verify failed to update promo "Relaxation Retreat" because drag file.pdf to form [Negative 23]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I search the name of the promo that i want to edit
#    And I click the update button or icon on the selected promo
#    And I edit data promo with drag file.pdf to form
#    And I go to click Simpan button
#    Then Validate failed to update promo because drag file pdf and display message "Format file tidak sesuai. Hanya diperbolehkan format JPG, JPEG, PNG."
#
#
#
#
#
#
#

  @DeletePromo
  @TC_AW_108
  Scenario: Delete Promo [TC_AW_108] - Verify success to delete promo [Positive 5]
    Given I have to login and already on the dashboard of the Destimate
    When I click menu Promo
    And I search the Promo Family Package
    And I click delete button or icon on the selected promo
    And I choose Hapus button to delete the promo
    Then Validate success to delete promo and display message "Promo berhasil dihapus"

  @TC_AW_109
  Scenario: Delete Promo [TC_AW_109] - Verify success cancel to delete promo [Positive 6]
    Given I have to login and already on the dashboard of the Destimate
    When I click menu Promo
    And I search the name of promo NEWYEAR2024
    And I click delete button or icon on the selected promo
    And I choose the Cancel button
    Then Validate success cancel for delete promo

#
#
#
#
#
#
#
#
#  @SearchingPromo
#  @TC_AW_110
#  Scenario: Searching Promo [TC_AW_110] - Verify success to search promo for Existing in the table data promo [Positive 7]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I search name promo November
#    Then Validate success to display the search result for the promo
#
#  @TC_AW_111
#  Scenario: Searching Promo [TC_AW_111] - Verify failed to search promo because input Non-Existent in the table data promo [Negative 24]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I input non existent promo like Desember ceria in the search field
#    Then Validate failed to search promo and display message "Data Tidak Tersedia"
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
#
#
#  @VirtualAssistantPromo
#  @TC_AW_112
#  Scenario: Virtual Assistant Promo [TC_AW_112] - Verify success to ask in virtual assistant with valid question where related about promo [Positive 8]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click icon icon virtual assistant
#    And  I input valid questions about the promo
#    Then Validate success to getting answer for questions
#
#  @TC_AW_113
#  Scenario: Virtual Assistant Promo [TC_AW_113] - Verify failed to ask in virtual assistant because did not input question [Negative 25]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click icon icon virtual assistant
#    And  I did not input question
#    Then Validate failed to getting answer and display error message "Pertanyaan tidak berkaitan dengan promo tiket wisata"
#
#  @TC_AW_114
#  Scenario: Virtual Assistant Promo [TC_AW_114] - Verify failed to ask in virtual assistant because input invalid question which is not related to the promo [Negative 26]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click icon icon virtual assistant
#    And  I input invalid question which is not related to the promo
#    Then Validate failed to getting answer and display error message "Pertanyaan tidak berkaitan dengan promo tiket wisata"
#
#  @TC_AW_115
#  Scenario: Virtual Assistant Promo [TC_AW_115] - Verify success to clear history of questions that have been asked successfully [Positive 9]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I click icon icon virtual assistant
#    And  I input valid questions about the promo
#    And I click reload button to clear history of questions
#    Then Validate success to clear the history of previous Q&A interactions
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
#
#  @RangeOfTableResultsPromo
#  @TC_AW_116
#  Scenario: Range of Table Results Promo [TC_AW_116] - Verify success to displays data with a maximum of 50 data results [Positive 10]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I will scrolls down in the menu promo and then click maksimal Tampilan button
#    And I want to choose option Tampilkan 50 Data
#    Then Validate success to display data promo between 0 to 50 data
#
#  @TC_AW_117
#  Scenario: Range of Table Results Promo [TC_AW_117] - Verify success to displays data with a maximum of 100 data results [Positive 11]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I will scrolls down in the menu promo and then click maksimal Tampilan button
#    And I want to choose option Tampilkan 100 Data
#    Then Validate success to display a data promo between 0 to 100 data
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
#  @PaginationPromo
#  @TC_AW_118
#  Scenario: Pagination Promo [TC_AW_118] - Verify success to displays the next page which also contains other promo [Positive 12]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I will scrolls down and I click the next button
#    Then Validate success to displays the next page which also contains the other promo
#
#  @TC_AW_119
#  Scenario: Pagination Promo [TC_AW_119] - Verify success to displays the previous page which also contains other promo [Positive 13]
#    Given I have to login and already on the dashboard of the Destimate
#    When I click menu Promo
#    And I will scrolls down and I click the next button
#    And I click a back button
#    Then Validate success to displays the previous page which also contains the promo
