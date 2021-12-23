@google_search
Feature: Search Functionality

  Background: User is on the google home page (like @before method, run before each scenario)
    Given user in on the google page
  #(this Given runs before each Scenario)

#Feature_name- All feature files must start with Feature keyword/ feature means epic. it is a user story/
 # in a feature file there can be multiple scenarios/test cases.

  Scenario:TC01_Iphone Search
 #Scenario_name- this is used to create test scenario/test cases
  #  Given user in on the google page
    And user search for iPhone
    Then verify the result has iPhone
    Then close the application

   #To create another scenario use  Scenario : keyword again
    Scenario: TC02_tea pot Search
#   Given user in on the google page
    And user search for tea pot
    Then verify the result has tea pot
    Then close the application

      #To create another scenario use  Scenario : keyword again
  Scenario: TC03_flower
#   Given user in on the google page
    And user search for flower
    Then verify the result has flower
    Then close the application

