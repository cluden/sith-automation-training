#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Careers
Feature: Careers Page
  Testing functionality of the Careers page

  @tag1
  Scenario: Verifying Check box
    Given I go to the tapqa homepage
    And I click on the "Careers" header link
    When I enter "TapQA" in the Keywords field
		Then the text "TapQA" is displayed in Keywords field
