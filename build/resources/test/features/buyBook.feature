@All
Feature: Make a book purchase
  as user
  I as a user need to purchase a book
  To Verify the process of buying a book

  Background: access the platform
    Given I access the initial platform to register

  @CaseTwo
  Scenario: Validate the and buy a book
    When validate the buy a book
    Then verify the books and the amount of the purchase