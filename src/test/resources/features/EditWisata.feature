  Feature: EditWisata

  As admin
  I want to edit existing wisata


  Scenario: TC_AA_62 - Edit wisata with valid ID and valid credentials to update
    Given Admin input valid endpoint to edit wisata
    When Admin request with the HTTP method PUT and input valid wisata ID and credentials in the request body
    Then Admin receive a response with status code 200 for success edit wisata
    And Receive "Data wisata berhasil di update" in the response body for TC_AA_62

  Scenario: TC_AA_63 - Edit wisata with valid ID and exiting title
    Given Admin input valid endpoint to edit wisata with existing title
    When Admin request with the HTTP method PUT and input valid wisata ID and existing title in the request body
    Then Admin receive a response with status code 400 for failed edit wisata with existing title
    And Receive "Judul sudah ada, pilih judul lain" in the response body for TC_AA_63

  Scenario: TC_AA_64 - Edit wisata with valid ID and empty title
    Given Admin input valid endpoint to edit wisata with empty title
    When Admin request with the HTTP method PUT and input valid wisata ID and empty title in the request body
    Then Admin receive a response with status code 200 for edit wisata with empty title
    And Receive "Data wisata berhasil di update" in the response body for TC_AA_64

  Scenario: TC_AA_65 - Edit wisata with invalid ID
    Given Admin input invalid endpoint to edit wisata
    When Admin request with the HTTP method PUT and input invalid wisata ID in the request body
    Then Admin receive a response with status code 404 for failed invalid edit wisata
    And Receive "Wisata tidak ditemukan" in the response body for TC_AA_65
