  Feature: Delete Ticket

  As admin
  I want to delete ticket

  Scenario: TC_AA_75 - Delete ticket with valid user ID
    Given Admin input valid endpoint to delete ticket
    When Admin request with the HTTP method DELETE and input valid ticket ID in the request body
    Then Admin receive a response with status code 200 OK for success delete ticket
    And receive "Ticket deleted successfully" in the response body for TC_AA_75
  Scenario: TC_AA_76 - Delete ticket with invalid user ID
    Given Admin input invalid endpoint to delete ticket
    When Admin request with the HTTP method DELETE and input invalid ticket ID in the request body
    Then Admin receive a response with status code 404 not found for failed delete ticket
    And receive "Ticket not found" in the response body for TC_AA_76
