  Feature: Delete Promo

  As admin
  I want to delete promo

  Scenario: TC_AA_71 - Delete promo with valid user ID
    Given Admin input valid endpoint to delete promo
    When Admin request with the HTTP method DELETE and input valid promo ID in the request body
    Then Admin receive a response with status code 200 OK for success delete promo
    And receive "Promo berhasil dihapus" in the response body for TC_AA_71
  Scenario: TC_AA_72 - Delete user with invalid promo ID
    Given Admin input invalid endpoint to delete promo
    When Admin request with the HTTP method DELETE and input invalid promo ID in the request body
    Then Admin receive a response with status code 404 not found for failed delete promo
    And receive "Promo tidak ditemukan" in the response body for TC_AA_72
