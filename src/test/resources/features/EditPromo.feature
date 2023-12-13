  Feature: EditPromo

  As admin
  I want to edit existing promo


  Scenario: TC_AA_52 - Update voucher with valid ID and credentials
    Given Admin input valid endpoint to edit promo
    When Admin request with the HTTP method PUT and input valid ID and credentials in the request body
    Then Admin receive a response with status code 200 for success edit promo
    And Receive "Promo berhasil diperbarui" in the response body for TC_AA_52

  Scenario: TC_AA_53 - Update voucher with valid ID and existing title
    Given Admin input valid endpoint to edit promo with existing title
    When Admin request with the HTTP method PUT and input valid ID and existing title in the request body
    Then Admin receive a response with status code 409 for failed edit promo with existing title
    And Receive "Promo dengan judul ini telah digunakan" in the response body for TC_AA_53

  Scenario: TC_AA_54 - Update voucher with valid ID and existing nama promo
    Given Admin input valid endpoint to edit promo with existing nama
    When Admin request with the HTTP method PUT and input valid ID and existing nama in the request body
    Then Admin receive a response with status code 409 for failed edit promo with existing nama
    And Receive "Promo dengan nama_promo ini telah digunakan" in the response body for TC_AA_54

  Scenario: TC_AA_55 - Update voucher with valid ID and existing kode voucher
    Given Admin input valid endpoint to edit promo with existing kode voucher
    When Admin request with the HTTP method PUT and input valid ID and existing kode voucher in the request body
    Then Admin receive a response with status code 409 for failed edit promo with existing kode voucher
    And Receive "Promo dengan kode_voucher ini telah digunakan" in the response body for TC_AA_55

  Scenario: TC_AA_56 - Update voucher with valid ID and >0 potongan
    Given Admin input valid endpoint to edit promo with >0 potongan
    When Admin request with the HTTP method PUT and input valid ID and >0 potongan in the request body
    Then Admin receive a response with status code 400 for failed edit promo with >0 potongan
    And Receive "JumlahPotonganPersen harus lebih besar dari 0" in the response body for TC_AA_56

  Scenario: TC_AA_57 - Update voucher with invalid ID
    Given Admin input invalid endpoint to edit promo
    When Admin request with the HTTP method PUT and input invalid ID and credentials in the request body
    Then Admin receive a response with status code 404 for failed edit promo with invalid ID
    And Receive "Promo tidak ditemukan" in the response body for TC_AA_57
