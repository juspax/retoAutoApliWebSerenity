@All
Feature: Register at the national bookstore and buy a book
  as user
  I want to register to the national library platform
  To Verify that the user was successfully registered and buy a book

  Background: Register on the main platform
    Given I access the initial platform to register

  @CaseOne
  Scenario: Validate the registration to the platform
    When register on the platform
    Then Verify correct user registration "Bienvenido a tu cuenta"

  @CaseTwo
  Scenario: Validate the and buy a book
    When validate the buy a book
    Then verify the books and the amount of the purchase

