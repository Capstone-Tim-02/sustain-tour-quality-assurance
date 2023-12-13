  Feature: CreateCategory

  As admin
  I want to create category
  For wisata destination

  Scenario: TC_AA_16 - Create category with valid name
    Given Admin input valid endpoint to create category
    When Admin request with the HTTP method POST and input valid category name in the request body
    Then Admin receive a response with status code 201 for create valid category


  Scenario: TC_AA_17 - Create category with used name
    Given Admin input valid endpoint to create category
    When Admin request with the HTTP method POST and input used category nama in the request body
    Then Admin receive a response with status code 409 for create promo with used category nama
    And Receive "Kategori ini sudah ada" in the response body for TC_AA_17

  Scenario: TC_AA_18 - Create category with empty name fields
    Given Admin input valid endpoint to create category
    When Admin request with the HTTP method POST and input empty category nama in the request body
    Then Admin receive a response with status code 400 for create promo with empty category name
    And Receive "Nama category minimal terdiri dari 5 karakter" in the response body for TC_AA_18
