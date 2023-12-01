  Feature: EditTNC

  As admin
  I want to edit existing TNC


  Scenario: TC_AA_58 - Update TNC with valid ID and credentials
    Given Admin input valid endpoint to edit TNC
    When Admin request with the HTTP method PUT and input valid TNC ID and credentials in the request body
    Then Admin receive a response with status code 200 for success edit TNC
    And Receive "Syarat Ketentuan berhasil diupdate" in the response body for TC_AA_58

  Scenario: TC_AA_59 - Update TNC  with valid ID and existing title
    Given Admin input valid endpoint to edit TNC with existing title
    When Admin request with the HTTP method PUT and input valid TNC ID and existing title in the request body
    Then Admin receive a response with status code 409 for failed edit TNC with existing title
    And Receive "Syarat Ketentuan dengan nama ini sudah ada" in the response body for TC_AA_59

  Scenario: TC_AA_61 - Update TNC with invalid ID
    Given Admin input invalid endpoint to edit TNC
    When Admin request with the HTTP method PUT and input invalid TNC ID in the request body
    Then Admin receive a response with status code 404 for failed invalid edit TNC
    And Receive "Syarat Ketentuan tidak ditemukan" in the response body for TC_AA_61
