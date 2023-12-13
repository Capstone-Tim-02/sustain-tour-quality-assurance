  Feature: Delete Category

  As admin
  I want to delete category

  Scenario: TC_AA_73 - Delete category with valid category ID
    Given Admin input valid endpoint to delete category
    When Admin request with the HTTP method DELETE and input valid category ID in the request body
    Then Admin receive a response with status code 200 OK for success delete category
    And receive "Kategori berhasil dihapus" in the response body for TC_AA_73
  Scenario: TC_AA_74 - Delete category with invalid category ID
    Given Admin input invalid endpoint to delete category
    When Admin request with the HTTP method DELETE and input invalid category ID in the request body
    Then Admin receive a response with status code 404 not found for failed delete category
    And receive "Kategori tidak ditemukan" in the response body for TC_AA_74
