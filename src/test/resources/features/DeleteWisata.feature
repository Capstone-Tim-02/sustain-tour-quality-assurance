  Feature: Delete Wisata

  As admin
  I want to delete wisata

  Scenario: TC_AA_46 - Delete wisata with valid wisata ID
    Given Admin input valid endpoint to delete wisata
    When Admin request with the HTTP method DELETE and input valid wisata ID in the request body
    Then Admin receive a response with status code 200 OK for success delete wisata
    And receive "Wisata berhasil dihapus" in the response body for TC_AA_46
  Scenario: TC_AA_47 - Delete wisata with invalid wisata ID
    Given Admin input invalid endpoint to delete wisata
    When Admin request with the HTTP method DELETE and input invalid wisata ID in the request body
    Then Admin receive a response with status code 404 not found for failed delete wisata
    And receive "Wisata tidak ditemukan" in the response body for TC_AA_47
