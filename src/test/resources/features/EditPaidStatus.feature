  Feature: EditPaidStatus

  As admin
  I want to edit paid status


  Scenario: TC_AA_66 - Update paid status to true with valid ID
    Given Admin input valid endpoint to edit paid status to true
    When Admin request with the HTTP method PUT and input an valid invoice ID
    Then Admin receive a response with status code 200 for success edit paid status to true
    And Receive "Status pembayaran berhasil di konfirmasi" in the response body for TC_AA_66

  Scenario: TC_AA_67 - Update paid status to false with valid ID
    Given Admin input valid endpoint to edit paid status to false
    When Admin request with the HTTP method PUT and input valid invoice ID
    Then Admin receive a response with status code 200 for success edit paid status to false
    And Receive "Status pembayaran berhasil di konfirmasi" in the response body for TC_AA_67

  Scenario: TC_AA_68 - Update paid status to true with invalid ID
    Given Admin input invalid endpoint to edit paid status to true
    When Admin request with the HTTP method PUT and input an invalid invoice ID
    Then Admin receive a response with status code 404 for failed edit paid status with invalid invoice ID
    And Receive "Ticket tidak ditemukan" in the response body for TC_AA_68

  Scenario: TC_AA_69 - Update paid status to false with invalid ID
    Given Admin input invalid endpoint to edit paid status to false
    When Admin request with the HTTP method PUT and input invalid invoice ID
    Then Admin receive a response with status code 404 for failed edit paid status with invalid ID
    And Receive "Ticket tidak ditemukan" in the response body for TC_AA_69

  Scenario: TC_AA_70 - Update paid status to other than boolean with valid ID
    Given Admin input valid endpoint to edit paid status with non boolean
    When Admin request with the HTTP method PUT and fill request body with non boolean
    Then Admin receive a response with status code 400 for failed edit with non boolean
    And Receive "Kesalahan request body" in the response body for TC_AA_70
