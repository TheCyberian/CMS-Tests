@GETRequests-Tests
Feature: Valdiating the GET functionality of the REST API

  @GetCustomers
  Scenario: On receiving GET request the API should respond with requested data
    Given User is provided with an end point for customers search
    When User hits the end point with GET request
    Then the API should respond with all the customers data

  @GetCustomersWithCustomerId
  Scenario Outline: On receiving GET request the API should respond with requested data
    Given User is provided with an end point for customers search
    When User hits the end point with GET request with <CustomerID>
    Then the API should respond with all the customers data

    Examples: 
      | CustomerID |
      |          5 |
      |          7 |
