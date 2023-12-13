  Feature: Delete TNC

  As admin
  I want to delete TNC

  Scenario: TC_AA_48 - Delete TNC with valid TNC ID
    Given Admin input valid endpoint to delete TNC
    When Admin request with the HTTP method DELETE and input valid TNC ID in the request body
    Then Admin receive a response with status code 200 OK for success delete TNC
    And receive "Syarat Ketentuan berhasil dihapus" in the response body for TC_AA_48
  Scenario: TC_AA_49 - Delete TNC with invalid TNC ID
    Given Admin input invalid endpoint to delete TNC
    When Admin request with the HTTP method DELETE and input invalid TNC ID in the request body
    Then Admin receive a response with status code 404 not found for failed delete TNC
    And receive "Syarat Ketentuan tidak ditemukan" in the response body for TC_AA_49
