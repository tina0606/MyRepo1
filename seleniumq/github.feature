Feature: GitHub
  As a user
  I want to login into my  GitHub account
  

  Scenario: Correct username and password
    Given I have a github login account
    When I give correct username and password
    Then the result should be logged in page

  #Scenario: Correct emailId and  wrong password
    #Given  I have a login account
    #When I give correct emailId and wrong password
    #Then the result should be invalid credentials
#
  #Scenario: Wrong emailId and  correct password
    #Given I have a login account
    #When I give wrong emailId and correct password
    #Then the result should be invalid credentials
#
  #Scenario: Wrong emailId and  wrong password
    #Given I have a login account
    #When I give wrong emailId and wrong password
    #Then the result should be invalid credentials