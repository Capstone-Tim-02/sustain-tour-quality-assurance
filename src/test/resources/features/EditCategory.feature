  Feature: EditCategory

  As admin
  I want to edit wisata category


  Scenario: TC_AA_77 - Update category with valid ID
    Given Admin input valid endpoint to edit category
    When Admin request with the HTTP method PUT and input valid category ID
    Then Admin receive a response with status code 200 for success edit category
    And Receive "Berhasil mengupdate kategori" in the response body for TC_AA_77

  Scenario: TC_AA_78 - Update category with valid ID but used name
    Given Admin input valid endpoint to edit category with used category name
    When Admin request with the HTTP method PUT and input valid category ID and used category name
    Then Admin receive a response with status code 409 for failed edit category with used category name
    And Receive "Kategori sudah ada" in the response body for TC_AA_78

  Scenario: TC_AA_79 - Update category with valid ID but empty name
    Given Admin input valid endpoint to edit category with empty category name
    When Admin request with the HTTP method PUT and input valid category ID and empty category name
    Then Admin receive a response with status code 400 for failed edit category with empty category name
    And Receive "Nama kategori harus minimal 5 karakter" in the response body for TC_AA_79

  Scenario: TC_AA_80 - Update category with invalid ID
    Given Admin input valid inendpoint to edit category
    When Admin request with the HTTP method PUT and input invalid category ID
    Then Admin receive a response with status code 404 for invalid edit category
    And Receive "Kategori tidak ditemukan" in the response body for TC_AA_80
