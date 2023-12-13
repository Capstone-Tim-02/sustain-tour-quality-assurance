  Feature: CreatePromo

  As admin
  I want to create promo
  So that promo can appear on user's app

  Scenario: TC_AA_8 - Create promo with empty title
    Given Admin input valid endpoint to create promo
    When Admin request with the HTTP method POST and input empty title in the request body
    Then Admin receive a response with status code 400 for create promo with empty title
    And Receive "Judul minimal 5 karakter" in the response body

  Scenario: TC_AA_9 - Create promo with empty nama voucher
    Given Admin input valid endpoint to create promo
    When Admin request with the HTTP method POST and input empty nama voucher in the request body
    Then Admin receive a response with status code 400 for create promo with empty nama voucher
    And Receive "Nama Promo minimal 5 karakter" in the response body for TC_AA_9

  Scenario: TC_AA_10 - Create promo voucher with empty kode voucher
    Given Admin input valid endpoint to create promo
    When Admin request with the HTTP method POST and input empty kode voucher in the request body
    Then Admin receive a response with status code 400 for create promo with empty kode voucher
    And Receive "Kode voucher minimal 5 karakter" in the response body for TC_AA_10

  Scenario: TC_AA_11 - Create promo voucher with valid credentials
    Given Admin input valid endpoint to create promo
    When Admin request with the HTTP method POST and input valid credentials in the request body
    Then Admin receive a response with status code 200 for create promo with valid credentials
    And Receive "Promo berhasil dibuat" in the response body for TC_AA_11

  Scenario: TC_AA_12 - Create promo voucher with 0% discount
    Given Admin input valid endpoint to create promo
    When Admin request with the HTTP method POST and input 0 discount nominal in the request body
    Then Admin receive a response with status code 400 for create promo with 0 discount nominal
    And Receive "Kesalahan jumlah_potongan_persen" in the response body for TC_AA_12

  Scenario: TC_AA_13 - Create promo voucher with used title
    Given Admin input valid endpoint to create promo
    When Admin request with the HTTP method POST and input used title in the request body
    Then Admin receive a response with status code 409 for create promo with used title
    And Receive "Promo dengan judul ini telah digunakan" in the response body for TC_AA_13

  Scenario: TC_AA_14 - Create promo voucher with used nama promo
    Given Admin input valid endpoint to create promo
    When Admin request with the HTTP method POST and input used nama promo in the request body
    Then Admin receive a response with status code 400 for create promo with used nama promo
    And Receive "Promo dengan nama promo ini telah digunakan" in the response body for TC_AA_14

  Scenario: TC_AA_15 - Create promo voucher with used kode promo
    Given Admin input valid endpoint to create promo
    When Admin request with the HTTP method POST and input used kode promo in the request body
    Then Admin receive a response with status code 400 for create promo with used kode promo
    And Receive "Nama kode voucher telah digunakan oleh promo lainnya, silahkan coba gunakan nama lainnya" in the response body for TC_AA_15