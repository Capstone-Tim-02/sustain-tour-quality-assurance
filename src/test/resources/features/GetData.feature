  Feature: GetData

  As admin
  I want to get data

  Scenario: TC_AA_19 - Get all user data
    Given Admin input valid endpoint to get user data
    When Admin request to get all user data with the HTTP GET method
    Then Admin receive a response with status code 200 for success get all user data
    And Verify user data is not empty
  Scenario: TC_AA_20 - Get all booking data
    Given Admin input valid endpoint to get booking data
    When Admin request to get all booking data with the HTTP GET method
    Then Admin receive a response with status code 200 for success get all booking data
    And Verify booking data is not empty
  Scenario: TC_AA_21 - Get total carbon footprint
    Given Admin input valid endpoint to get total carbon footprint data
    When Admin request to get total carbon footprint data with the HTTP GET method
    Then Admin receive a response with status code 200 for success get total carbon footprint data
  Scenario: TC_AA_22 - Get total wisata
    Given Admin input valid endpoint to get total wisata data
    When Admin request to get total wisata data with the HTTP GET method
    Then Admin receive a response with status code 200 for success get total wisata data
  Scenario: TC_AA_23 - Get total user
    Given Admin input valid endpoint to get total user data
    When Admin request to get total user data with the HTTP GET method
    Then Admin receive a response with status code 200 for success get total user data
  Scenario: TC_AA_24 - Get total transaction
    Given Admin input valid endpoint to get total transaction data
    When Admin request to get total transaction data with the HTTP GET method
    Then Admin receive a response with status code 200 for success get total transaction data
  Scenario: TC_AA_25 - Get total monthly revenue
    Given Admin input valid endpoint to get total monthly revenue  data
    When Admin request to get total monthly revenue data with the HTTP GET method
    Then Admin receive a response with status code 200 for success get total monthly revenue data
  Scenario: TC_AA_26 - Get total monthly revenue with invalid format
    Given Admin input invalid endpoint to get total monthly revenue data
    When Admin send invalid request to get total monthly revenue data with the HTTP GET method
    Then Admin receive a response with status code 404 for failed request to get total monthly revenue data
#    tambahin and statement buat cek message
  Scenario: TC_AA_27 - Get all category
    Given Admin input valid endpoint to get all cetegory data
    When Admin request to get all category data with the HTTP GET method
    Then Admin receive a response with status code 200 for success get all category data
  Scenario: TC_AA_28 - Get all TNC
    Given Admin input valid endpoint to get all TNC data
    When Admin request to get all TNC data with the HTTP GET method
    Then Admin receive a response with status code 200 for success get all TNC data
  Scenario: TC_AA_29 - Get all wisata data
    Given Admin input valid endpoint to get all wisata data
    When Admin request to get all wisata data with the HTTP GET method
    Then Admin receive a response with status code 200 for success get all wisata data
  Scenario: TC_AA_30 - Get wisata data by ID
    Given Admin input valid endpoint to get wisata data by ID
    When Admin request to get wisata data by ID with the HTTP GET method
    Then Admin receive a response with status code 200 for success get wisata data by ID
    And Verify result to get wisata data by ID is not null

  Scenario: TC_AA_31 - Get wisata data by invalid ID
    Given Admin input invalid endpoint to get wisata data by ID
    When Admin request to get wisata data by invalid ID with the HTTP GET method
    Then Admin receive a response with status code 404 for failed get wisata data by invalid ID
    And Receive "Wisata tidak ditemukan" in the response body for TC_AA_31
  Scenario: TC_AA_32 - Get Total Carbon Footprint By Wisata ID
    Given Admin input valid endpoint to get carbon footprint by wisata data by ID
    When Admin request to get carbon footprint data by valid wisata ID with the HTTP GET method
    Then Admin receive a response with status code 200 for success get total carbon footprint by wisata id
  Scenario: TC_AA_33 - Get Total Carbon Footprint By Invalid Wisata ID
    Given Admin input invalid endpoint to get carbon footprint by wisata data by ID
    When Admin request to get carbon footprint data by invalid wisata ID with the HTTP GET method
    Then Admin receive a response with status code 404 for failed get total carbon footprint by wisata invalid id
    And Receive "Wisata not found" in the response body for TC_AA_33
  Scenario: TC_AA_34 - Get Booking data by Invoice
    Given Admin input invalid endpoint to get booking data by valid invoice
    When Admin request to get booking data data by valid invoice with the HTTP GET method
    Then Admin receive a response with status code 200 for sucess get booking data by valid invoice
  Scenario: TC_AA_35 - Get Booking data by invalid Invoice
    Given Admin input invalid endpoint to get booking data by invalid invoice
    When Admin request to get booking data data by invalid invoice with the HTTP GET method
    Then Admin receive a response with status code 404 for sucess get booking data by invalid invoice
    And Receive "Wisata tidak ditemukan" in the response body for TC_AA_35
  Scenario: TC_AA_86 - Get semua pesan kerjasama atau masukan dari pengunjung web CMS
    Given Admin input valid endpoint to get all pesan kerjasama
    When Admin request to get all pesan kerjasama data with the HTTP GET method
    Then Admin receive a response with status code 200 for success get all pesan kerjasama data
    And Verify pesan kerjasama data is not empty
  Scenario: TC_AA_87 - Get Top 3 Wisata
    Given Admin input valid endpoint to get top 3 wisata
    When Admin request to get top 3 wisata with the HTTP GET method
    Then Admin receive a response with status code 200 for success get top 3 wisata
  Scenario: TC_AA_88 - Get Top 4 User By Carbon Footprint
    Given Admin input valid endpoint to get top 4 user by carbon footprint
    When Admin request to get top 4 user with the HTTP GET method
    Then Admin receive a response with status code 200 for success get top 4 user by carbon footprint
  Scenario: TC_AA_89 - Get Terms and Conditions Data By Valid ID
    Given Admin input valid endpoint to get TNC data by ID
    When Admin request to get TNC data by valid ID with the HTTP GET method
    Then Admin receive a response with status code 200 for success get TNC by valid ID
  Scenario: TC_AA_90 - Get Terms and Conditions Data By Invalid ID
    Given Admin input invalid endpoint to get TNC data by ID
    When Admin request to get TNC by invalid ID with the HTTP GET method
    Then Admin receive a response with status code 404 for failed get TNC by invalid ID
    And Receive "Wisata not found" in the response body for TC_AA_90
  Scenario: TC_AA_91 - Get Grafik Dashboard CMS
    Given Admin input valid endpoint to get grafik dashboard
    When Admin request to get grafik data with the HTTP GET method
    Then Admin receive a response with status code 200 for success get grafik data
    And Verify grafik data is not empty
  Scenario: TC_AA_92 - Get Grafik Indicator For Revenue In six month with only start date
    Given Admin input valid endpoint to get grafik dashboard in six month with only start date
    When Admin request to get grafik data in six month with only start date with the HTTP GET method
    Then Admin receive a response with status code 200 for success get grafik data in six month with only start date
  Scenario: TC_AA_93 - Get Grafik Indicator For Revenue In six month with only end date
    Given Admin input valid endpoint to get grafik dashboard in six month with only end date
    When Admin request to get grafik data in six month with only end date with the HTTP GET method
    Then Admin receive a response with status code 200 for success get grafik data in six month with only end date
  Scenario: TC_AA_94 - Get Grafik Indicator For Revenue In six month with valid start date and end date
    Given Admin input valid endpoint to get grafik dashboard in six month with valid start date and end date
    When Admin request to get grafik data in six month with valid start date and end date with the HTTP GET method
    Then Admin receive a response with status code 200 for success get grafik data in six month with valid start date and end date
    And Verify grafik data in six month with valid start date and end date is not empty
  Scenario: TC_AA_95 - Get Grafik Indicator For Revenue In six month with start date bigger than the end date
    Given Admin input valid endpoint to get grafik dashboard in six month with start date bigger than the end date
    When Admin request to get grafik data in six month with start date bigger than the end date with the HTTP GET method
    Then Admin receive a response with status code 200 for success get grafik data in six month with start date bigger than the end date
    And Verify grafik data in six month with start date bigger than the end date is not empty
  Scenario: TC_AA_96 - Get Grafik Indicator For Revenue In six month with invalid start date format
    Given Admin input valid endpoint to get grafik dashboard in six month with invalid start date format
    When Admin request to get grafik data in six month with invalid start date format with the HTTP GET method
    Then Admin receive a response with status code 400 for failed get grafik data in six month with invalid start date format
    And Receive "Kesalahan format pada start date. Gunakan YYYY-MM-DD" in the response body for TC_AA_96
  Scenario: TC_AA_97 - Get Grafik Indicator For Revenue In six month with invalid end date format
    Given Admin input valid endpoint to get grafik dashboard in six month with invalid end date format
    When Admin request to get grafik data in six month with invalid end date format with the HTTP GET method
    Then Admin receive a response with status code 400 for failed get grafik data in six month with invalid end date format
    And Receive "Kesalahan format end date. Gunakan YYYY-MM-DD" in the response body for TC_AA_97
  Scenario: TC_AA_98 - Get Grafik Indicator For Revenue In six montH with invalid start date and end date format
    Given Admin input valid endpoint to get grafik dashboard in six month with invalid start date and end date format
    When Admin request to get grafik data in six month with invalid start date and end date format with the HTTP GET method
    Then Admin receive a response with status code 400 for failed get grafik data in six month with invalid start date and end date format
    And Receive "Kesalahan format pada start date. Gunakan YYYY-MM-DD" in the response body for TC_AA_98
  Scenario: TC_AA_99 - Get Grafik Indicator For Revenue In six month with valid start date and end date but less than 6 month range
    Given Admin input valid endpoint to get grafik dashboard in six month with valid start date and end date but less than 6 month range
    When Admin request to get grafik data in six month with valid start date and end date but less than 6 month range with the HTTP GET method
    Then Admin receive a response with status code 200 for success get grafik data in six month with valid start date and end date but less than 6 month range
    And Verify grafik data in six month with valid start date and end date but less than 6 month range is not empty
  Scenario: TC_AA_100 - Get Grafik Indicator For Revenue In six month with empty start date and end date
    Given Admin input valid endpoint to get grafik dashboard in six month with with empty start date and end date
    When Admin request to get grafik data in six month with with empty start date and end date with the HTTP GET method
    Then Admin receive a response with status code 200 for success get grafik data in six month with empty start date and end date
    And Verify grafik data in six month with empty start date and end date is not empty
