  Feature: Login

  As admin
  I want to login
  So that I can go to the admin dashboard

  Scenario: TC_AA_1 - Login with valid username and password
    Given Admin input valid endpoint to login
    When Admin request with the HTTP method POST and input valid username and password in the request body and click Login Button
    Then Admin receive a response with status code 200 OK
    And receive "Admin login successful" in the response body
  Scenario: TC_AA_2 - Login with valid username and wrong password
    Given Admin input valid endpoint to login
    When Admin request with the HTTP method POST and input valid username and wrong password
    Then Admin receive a response with status code 401 for login with wrong password
    And receive "Password salah" in the response body for TC_MA_2
  Scenario: TC_AA_3 - Login with wrong username and valid password
    Given Admin input valid endpoint to login
    When Admin request with the HTTP method POST and input wrong username and valid password
    Then Admin receive a response with status code 401 for login with wrong username
    And receive "Username salah" in the response body for TC_MA_3
  Scenario: TC_AA_4 - Login with wrong username and wrong password
    Given Admin input valid endpoint to login
    When Admin request with the HTTP method POST and input wrong username and wrong password
    Then Admin receive a response with status code 401 for login with wrong username and password
    And receive "Username salah" in the response body for TC_MA_4
  Scenario: TC_AA_5 - Login with valid username and empty password
    Given Admin input valid endpoint to login
    When Admin request with the HTTP method POST and input valid username and empty password
    Then Admin receive a response with status code 400 for login with wrong username and empty password
    And receive "Password harus dimasukan" in the response body for TC_MA_5
  Scenario: TC_AA_6 - Login with empty username and valid password
    Given Admin input valid endpoint to login
    When Admin request with the HTTP method POST and input empty username and valid password
    Then Admin receive a response with status code 400 for login with empty username and valid password
    And receive "Username harus dimasukan" in the response body for TC_MA_6
  Scenario: TC_AA_7 - Login with empty username and empty password
    Given Admin input valid endpoint to login
    When Admin request with the HTTP method POST and input empty username and empty password
    Then Admin receive a response with status code 400 for login with empty username and empty password
    And receive "Username harus dimasukan" in the response body for TC_MA_7
