Feature: Landing Page

  As an user
  I want to access landing page
  So that I can see the contents of the landing page of Destimate


  @TC_AW_175
  Scenario: Landing Page [TC_AW_175] - Verify successful browsing Home Page with click menu Beranda in header [Positive 1]
    Given I am already on the landing page Destimate
    When I scroll down
    And I click menu Beranda in header
    Then Validate success navigate to page Beranda and display the words "EKSPLORASI KECANTIKAN YANG MEMPESONA"

  @TC_AW_176
  Scenario: Landing Page [TC_AW_176] - Verify successful browsing About Us with click menu Tentang Kami in header [Positive 2]
    Given I am already on the landing page Destimate
    When I click menu Tentang Kami
    Then Validate success navigate to page Tentang kami and display the title "Tentang Kami"

  @TC_AW_177
  Scenario: Landing Page [TC_AW_177] - Verify successful access Contact and send a unique experience in the form with valid Data [Positive 3]
    Given I am already on the landing page Destimate
    When I click menu Kontak
    And I input valid Data in the form
    And I click submit button
    #Then Validate success to send the message cooperation or question and display message "Pesan anda telah berhasil terkirim"

  @TC_AW_178
  Scenario: Landing Page [TC_AW_178] - Verify successful access Contact but failed to send a unique experience because did not input Nama Depan [Negative 1]
    Given I am already on the landing page Destimate
    When I click menu Kontak
    And I did not input Nama Depan in the form
    And I click submit button
    Then Validate failed to send the message cooperation or question and stay in the contact page with message error below first name "Nama depan minimal 3 karakter"

  @TC_AW_179
  Scenario: Landing Page [TC_AW_179] - Verify successful access Contact but failed to send a unique experience even though not input Nama Belakang [Positive 4]
    Given I am already on the landing page Destimate
    When I click menu Kontak
    And I did not input Nama Belakang in the form
    And I click submit button
    Then Validate success to send the message cooperation or question and display message "Pesan anda telah berhasil terkirim"

  @TC_AW_180
  Scenario: Landing Page [TC_AW_180] - Verify successful access Contact but failed to send a unique experience because did not input email [Negative 2]
    Given I am already on the landing page Destimate
    When I click menu Kontak
    And I did not input email in the form
    And I click submit button
    Then Validate failed to send the message cooperation or question and stay in the contact page with message error below email "Kesalahan format email"

  @TC_AW_181
  Scenario: Landing Page [TC_AW_181] - Verify successful access Contact but failed to send a unique experience because did not input message [Negative 3]
    Given I am already on the landing page Destimate
    When I click menu Kontak
    And I did not input message in the form
    And I click submit button
    Then Validate failed to send the message cooperation or question and stay in the contact page with message error below message "Pesan minimal 10 karakter"

  @TC_AW_182
  Scenario: Landing Page [TC_AW_182] - Verify successful access Contact but failed to send a unique experience because did not input no telphone [Negative 4]
    Given I am already on the landing page Destimate
    When I click menu Kontak
    And I did not input no telphone in the form
    And I click submit button
    Then Validate failed to send the message cooperation or question and stay in the contact page with message error below phone number "No. Telephone harus 11-13 karakter"

  @TC_AW_183
  Scenario: Landing Page [TC_AW_183] - Verify successful access Contact but failed to send a unique experience because input invalid "Nama Depan" with 1 character [Negative 5]
    Given I am already on the landing page Destimate
    When I click menu Kontak
    And I input invalid Nama Depan with 1 character in the form
    And I click submit button
    Then Validate failed to send the message cooperation or question and stay in the contact page with message error below first name "Nama depan minimal 3 karakter"

  @TC_AW_184
  Scenario: Landing Page [TC_AW_184] - Verify successful access Contact but failed to send a unique experience because input invalid email [Negative 6]
    Given I am already on the landing page Destimate
    When I click menu Kontak
    And I input invalid Email in the form
    And I click submit button
    Then Validate failed to send the message cooperation or question and stay in the contact page with message error below email "Kesalahan format email"

  @TC_AW_185
  Scenario: Landing Page [TC_AW_185] - Verify successful access Contact but failed to send a unique experience because input invalid phone number [Negative 7]
    Given I am already on the landing page Destimate
    When I click menu Kontak
    And I input invalid phone number in the form
    And I click submit button
    Then Validate failed to send the message cooperation or question and stay in the contact page with error message below phone number "No. Telephone harus dimulai dengan angka 0"

  @TC_AW_186
  Scenario: Landing Page [TC_AW_186] - Verify successful access Contact but failed to send a unique experience because input invalid message [Negative 8]
    Given I am already on the landing page Destimate
    When I click menu Kontak
    And I input invalid message in the form
    And I click submit button
    Then Validate failed to send the message cooperation or question and stay in the contact page with message error below message "Pesan minimal 10 karakter"

    @TC_AW_187
  Scenario: Landing Page [TC_AW_187] - Verify successful access Contact but failed to send a unique experience because input first name only with spaces [Negative 9]
    Given I am already on the landing page Destimate
    When I click menu Kontak
    And I input first name only with spaces in the form
    And I click submit button
    Then Validate failed to send the message cooperation or question and stay in the contact page with message error below first name "Nama Depan tidak boleh diawali dengan spasi"

  @TC_AW_188
  Scenario: Landing Page [TC_AW_188] - Verify successful access Contact but failed to send a unique experience because input message only with spaces [Negative 10]
    Given I am already on the landing page Destimate
    When I click menu Kontak
    And I input messages only with spaces in the form
    And I click submit button
    Then Validate failed to send the message cooperation or question and stay in the contact page with message error below message "Pesan tidak boleh diawali dengan spasi"



  @PaginationLandingPage
  @TC_AW_189
  Scenario: Pagination Landing Page[TC_AW_189] - Verify success to displays the next page which also contains other destination [Positive 5]
    Given I am already on the landing page Destimate
    When I scroll down and navigate to page Temukan Destinasi Impianmu dengan Destimate!
    And I am click the next button
    Then Validate success to displays the next page which also contains the other of destination

  @TC_AW_190
  Scenario: Pagination Landing Page [TC_AW_190] - Verify success to displays the previous page which also contains other destination [Positive 6]
    Given I am already on the landing page Destimate
    When I scroll down and navigate to page Temukan Destinasi Impianmu dengan Destimate!
    And I am click the next button
    And I am click back button
    Then Validate success to displays the previous page which also contains a destination




  @ArrowReturnsToTopOfPage
  @TC_AW_191
  Scenario: Arrow Returns To Top Of Page [TC_AW_191] - Verify success return to the top of the page [Positive 7]
    Given I am already on the landing page Destimate
    When I scroll down and navigate to page Temukan Destinasi Impianmu dengan Destimate!
    And I click the up arrow button
    Then Validate success to displays the top page which have the words "EKSPLORASI KECANTIKAN YANG MEMPESONA"



  @BerandaMenuInTheFooter
  @TC_AW_192
  Scenario: Landing Page [TC_AW_192] - Verify success browsing Home Page with click menu Beranda in the footer [Positive 8]
    Given I am already on the landing page Destimate
    When I scroll down and navigate to the footer page
    And I click menu Beranda in the footer
    Then Validate success navigate to page Beranda and display the words "EKSPLORASI KECANTIKAN YANG MEMPESONA"

  @TC_AW_193
  Scenario: Landing Page [TC_AW_193] - Verify success browsing About Us with click menu Tentang Kami in the footer [Positive 9]
    Given I am already on the landing page Destimate
    When I scroll down and navigate to the footer page
    And I click menu Tentang Kami in the footer
    Then Validate success navigate to page Tentang kami and display the title "Tentang Kami"

  @TC_AW_194
  Scenario: Landing Page [TC_AW_194] - Verify success browsing Contact with click menu Kontak in the footer [Positive 10]
    Given I am already on the landing page Destimate
    When I scroll down and navigate to the footer page
    And I click menu Kontak in the footer
    Then Validate success navigate to page Kontak and display the title "Kontak Kami"




  @RegisterTheDestination
  @TC_AW_195
  Scenario: Landing Page [TC_AW_195] - Verify success to click button Daftar Sekarang [Positive 11]
    Given I am already on the landing page Destimate
    When I scroll down and navigate to the page Daftarkan Wisatamu
    And I click button Daftar Sekarang
    Then Validate success to click button Daftar Sekarang
