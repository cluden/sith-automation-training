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
@ContactUs
Feature: tapQA Contact Us page
  Testing functionality of the Contact Us

  @tag1
  Scenario: Request to be contacted
    Given I go to the tapqa homepage
    And I click on the "Contact Us" header link
    When I enter "Chong Xiong" in the Name field
    When I enter "cxiong@tapqa.com" in the Email field
    When I enter "612-444-4545" in the Phone field
    When I select "Other" in the How Did You Hear About Us dropdown
    When I enter "Can you send me an email" in the Message field
    When I click on the Submit button   
    Then I get a confirmation message