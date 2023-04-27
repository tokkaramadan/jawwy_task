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
@tag
Feature: Verify Jawwy plans

@tag1
 Scenario: Verify the Jawwy plans type, price for the first plan
Given I am on the Jawwy subscription page1
Then I should see the correct plan type, price for the first plan
@tag2
Scenario: Verify the Jawwy plans currency for the first plan
Given I am on the Jawwy subscription page2
Then I should see the correct Currency for the first plan
@tag3
Scenario: Verify the Jawwy plans type, price for the second plan
Given I am on the Jawwy subscription page3
Then I should see the correct plan type, price for the second plan
@tag4
Scenario: Verify the Jawwy plans currency for the second plan
Given I am on the Jawwy subscription page4
Then I should see the correct Currency for the second plan
@tag5
Scenario: Verify the Jawwy plans type, price for the third plan
Given I am on the Jawwy subscription page5
Then I should see the correct plan type, price for the third plan
@tag6
Scenario: Verify the Jawwy plans currency for the third plan
Given I am on the Jawwy subscription page6
Then I should see the correct Currency for the third plan
