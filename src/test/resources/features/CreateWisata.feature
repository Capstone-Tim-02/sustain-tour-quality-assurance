  Feature: CreateWisata

  As admin
  I want to create Wisata

  Scenario: TC_AA_41 - Create wisata wih all valid credentials
    Given Admin input valid endpoint to create wisata
    When Admin request with the HTTP method POST and input valid wisata credentials on the request body
    Then Admin receive a response with status code 201 for success create wisata

  Scenario: TC_AA_42 - Create wisata with empty title
    Given Admin input valid endpoint to create wisata
    When Admin request with the HTTP method POST and input empty wisata title in the request body
    Then Admin receive a response with status code 400 for create wisata with empty title
    And Receive "Judul harus minimal 8 huruf" in the response body for TC_AA_42

  Scenario: TC_AA_43 - Create wisata with used title
    Given Admin input valid endpoint to create wisata
    When Admin request with the HTTP method POST and input used wisata title in the request body
    Then Admin receive a response with status code 400 for create wisata with used title
    And Receive "Judul sudah digunakan" in the response body for TC_AA_43

  Scenario: TC_AA_44 - Create wisata with <0 price
    Given Admin input valid endpoint to create wisata
    When Admin request with the HTTP method POST and input >0 wisata price in the request body
    Then Admin receive a response with status code 409 for create wisata with >0 wisata price
    And Receive "Price must be greater than 0" in the response body for TC_AA_44

  Scenario: TC_AA_45 - Create wisata with <0 ticket
    Given Admin input valid endpoint to create wisata
    When Admin request with the HTTP method POST and input >0 wisata ticket in the request body
    Then Admin receive a response with status code 400 for create wisata with >0 wisata ticket
    And Receive "Available Tickets harus lebih dari 0" in the response body for TC_AA_45

  Scenario: TC_AA_101 - Create wisata with empty kode
    Given Admin input valid endpoint to create wisata
    When Admin request with the HTTP method POST and input empty kode in the request body
    Then Admin receive a response with status code 400 for create wisata with empty kode
    And Receive "Kode harus minimal 3 huruf" in the response body for TC_AA_101

  Scenario: TC_AA_102 - Create wisata with used kode
    Given Admin input valid endpoint to create wisata
    When Admin request with the HTTP method POST and input used kode in the request body
    Then Admin receive a response with status code 400 for create wisata with used kode
    And Receive "Kode sudah digunakan" in the response body for TC_AA_102