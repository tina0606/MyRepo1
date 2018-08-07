@tag
Feature: Login
  I want to login into a site

  @execute
  Scenario: Login into a site
    Given I want to login 
    When I enter valid username and password
    Then the result should be my login home page 
  

 