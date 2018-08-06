
@tag
Feature: Calculator
 I want to do addition


  @tag2
  Scenario Outline: Addition of two numbers
    Given I want to add two numbers
    When to add <a> and <b>
    Then result should be <status>

    Examples: 
      | a 		| b 		| status  |
      | 2			|     5 | 7			  |
      | 5		  |     7 | 12      |
