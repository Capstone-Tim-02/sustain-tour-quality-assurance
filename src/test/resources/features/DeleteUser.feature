  Feature: Delete User

  As admin
  I want to delete user

  Scenario: TC_AA_50 - Delete user with valid user ID
    Given Admin input valid endpoint to delete user
    When Admin request with the HTTP method DELETE and input valid user ID in the request body
    Then Admin receive a response with status code 200 OK for success delete user
    And receive "Berhasil menghapus data user" in the response body for TC_AA_50
  Scenario: TC_AA_51 - Delete user with invalid user ID
    Given Admin input invalid endpoint to delete user
    When Admin request with the HTTP method DELETE and input invalid user ID in the request body
    Then Admin receive a response with status code 404 not found for failed delete user
    And receive "User tidak ditemukan" in the response body for TC_AA_51
