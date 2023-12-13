  Feature: CreateTNC

  As admin
  I want to create Terms and Condition

  Scenario: TC_AA_36 - Create TNC with valid credentials
    Given Admin input valid endpoint to create TNC
    When Admin request with the HTTP method POST and input valid TNC credentials on the request body
    Then Admin receive a response with status code 201 for create valid TNC

  Scenario: TC_AA_37 - Create TNC with used TNC Name
    Given Admin input valid endpoint to create TNC
    When Admin request with the HTTP method POST and input used TNC nama in the request body
    Then Admin receive a response with status code 409 for create TNC with used TNC nama
    And Receive "Syarat Ketentuan dengan nama ini sudah ada" in the response body for TC_AA_37

  Scenario: TC_AA_38 - Create TNC with empty TNC Name
    Given Admin input valid endpoint to create TNC
    When Admin request with the HTTP method POST and input empty TNC nama in the request body
    Then Admin receive a response with status code 400 for create TNC with empty TNC name
    And Receive "Nama Syarat Ketentuan minimal 5 karakter" in the response body for TC_AA_38

  Scenario: TC_AA_39 - Create TNC with empty Description
    Given Admin input valid endpoint to create TNC
    When Admin request with the HTTP method POST and input empty TNC description in the request body
    Then Admin receive a response with status code 400 for create TNC with empty TNC description
    And Receive "Deskripsi minimal 10 karakter" in the response body for TC_AA_39

  Scenario: TC_AA_40 - Create TNC with all empty fields
    Given Admin input valid endpoint to create TNC
    When Admin request with the HTTP method POST and input empty TNC nama and description in the request body
    Then Admin receive a response with status code 400 for create promo with empty TNC name and description
    And Receive "Nama Syarat Ketentuan minimal 5 karakter" in the response body for TC_AA_40
