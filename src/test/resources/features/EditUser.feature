  Feature: EditUser

  As admin
  I want to edit users detail


  Scenario: TC_AA_81 - Edit user data with valid ID and valid credentials
    Given Admin input valid endpoint to edit user
    When Admin request with the HTTP method PUT and input valid user ID
    Then Admin receive a response with status code 200 for success edit user
    And Receive "Berhasil mengupdate data user" in the response body for TC_AA_81

  Scenario: TC_AA_82 - Edit user data with valid ID and used username
    Given Admin input valid endpoint to edit user with used username
    When Admin request with the HTTP method PUT and input valid user ID and used username
    Then Admin receive a response with status code 409 for failed edit user with used username
    And Receive "Username sudah digunakan oleh user lain, silahkan coba yang lain" in the response body for TC_AA_82

  Scenario: TC_AA_83 - Edit user data with valid ID and used email
    Given Admin input valid endpoint to edit user with used email
    When Admin request with the HTTP method PUT and input valid user ID and used email
    Then Admin receive a response with status code 409 for failed edit user with used email
    And Receive "Email sudah digunakan user lain" in the response body for TC_AA_83

  Scenario: TC_AA_84 - Edit user data with valid ID and used phone
    Given Admin input valid endpoint to edit user with used phone
    When Admin request with the HTTP method PUT and input valid user ID and used phone
    Then Admin receive a response with status code 409 for failed edit user with used phone
    And Receive "Nomor telphone telah digunakan oleh user lain" in the response body for TC_AA_84

  Scenario: TC_AA_85 - Edit user data with invalid ID
    Given Admin input invalid endpoint to edit user
    When Admin request with the HTTP method PUT and input invalid user ID
    Then Admin receive a response with status code 404 for failed edit user
    And Receive "User tidak ditemukan" in the response body for TC_AA_85