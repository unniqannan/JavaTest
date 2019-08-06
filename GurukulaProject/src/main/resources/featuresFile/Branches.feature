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
@FunctionalLogin
Feature: Branches
  I want to use this template for my feature file
   
	  Scenario: Navigate to Branches page-User would be able to navigate to Branches page from Account menu > Branches   
    Given Branches Feature_User launches the application
    And User logs in and navigates to Branches page by clicking Account Menu > Branches 
    Then User should be able to see the Branches page
    And Branches_FunctionalityCheck_Feature_user closes the session

    Scenario: Create Branch page Navigation -User should be able to navigate to Create Branch page from 	Branches page
    Given Branches Feature_User launches the application
    And User logs in and navigates to Branches page by clicking Account Menu > Branches 
    And  User able to click Create a new Branch link
    Then  User should be able to see a popup for creating a Branch
    And Branches_FunctionalityCheck_Feature_user closes the session
    
    Scenario: Save > Branch created Functionality -User would be able to create a new Branch and can see the same created Branch details in the Branches page   
    Given Branches Feature_User launches the application
    And User logs in and navigates to Branches page by clicking Account Menu > Branches 
    And  User able to click Create a new Branch link
    And User provides the details "NewBranchName" and "7777" in the Create new Branch popup page and clicks Save button
    Then User can see the Branch "NewBranchName" and "7777" created and listed in the Branches page
    
   Scenario: Create Branch > Cancel Button -Branch will not be created when user clicks cancel in creating Branch pop up page 
    Given Branches Feature_User launches the application
    And User logs in and navigates to Branches page by clicking Account Menu > Branches 
    And  User able to click Create a new Branch link
    And User provides the details "CancelBranchName" and "8888" in the Create new Branch popup page and clicks Cancel button
    Then User cannot see the Branch "CancelBranchName" and "8888" in the Branches page as it is cancelled
    And Branches_FunctionalityCheck_Feature_user closes the session
    
   Scenario: Branches page > View -User would be able to see the Branch details by clicking view link   
    Given Branches Feature_User launches the application
    And User logs in and navigates to Branches page by clicking Account Menu > Branches 
    And  	User clicks the view link for the <NewBranchName> code in the webtable
    Then 	User can see the Branch details
    And Branches_FunctionalityCheck_Feature_user closes the session
    
    Scenario: Branches page > Branch ID -User would be able to see the Branch details by clicking Branch ID link   
    Given Branches Feature_User launches the application
    And User logs in and navigates to Branches page by clicking Account Menu > Branches 
    And  	User clicks the Branch ID of given <NewBranchName> in the webtable
    Then 	User can see the Branch details of "NewBranchName" and "7777" of the BranchID 
    And Branches_FunctionalityCheck_Feature_user closes the session
    
    Scenario: Branch View Page > Back Button functionality - User would be able Navigate to Branches page by clicking Back button in respective Branch page   
    Given Branches Feature_User launches the application
    And User logs in and navigates to Branches page by clicking Account Menu > Branches 
    And  	User clicks the view link for the <NewBranchName> code in the webtable
    And  Back should be available in Branch details page and cicking Back button should navigate to Branches page
    Then User should be able to see the Branches page
    
   Scenario: Create Brach Popup > Name Text field validation >Name field in Create Branch popup has mandatory check,minmum char length, max char lenth for Name field   
    Given Branches Feature_User launches the application
    And User logs in and navigates to Branches page by clicking Account Menu > Branches 
    And  User able to click Create a new Branch link
    Then  Name text field has functionality of mandatory check,minmum char length, max char lenth
    And Branches_FunctionalityCheck_Feature_user closes the session
    
   Scenario: Create Brach Popup > Code Text field validation >Code field in Create Branch popup has mandatory check,only digits can be entered in Code field   
    Given Branches Feature_User launches the application
    And User logs in and navigates to Branches page by clicking Account Menu > Branches 
     And  User able to click Create a new Branch link
    Then  Code text field has functionality of mandatory check,only digits can be entered
    And Branches_FunctionalityCheck_Feature_user closes the session
    
     Scenario: Branches > Edit link -Clicking Edit link should navigate to Edit Branch page    
    Given Branches Feature_User launches the application
    And User logs in and navigates to Branches page by clicking Account Menu > Branches 
    And  	User clicks Edit link
    Then  Name and Code is shown for for "NewBranchName" and "7777" in Edit Branch page 
    And Branches_FunctionalityCheck_Feature_user closes the session
     
     Scenario: Branches > Edit link > Cancel -Clicking cancel button should not able to modify the Branch details  
    Given Branches Feature_User launches the application
    And User logs in and navigates to Branches page by clicking Account Menu > Branches 
    And  	User clicks Edit link
    And User provides the details "CancelBranchName" and "8888" in the Create new Branch popup page and clicks Cancel button
    Then User cannot see the Branch "CancelBranchName" and "8888" in the Branches page as it is cancelled
    And Branches_FunctionalityCheck_Feature_user closes the session
    
   Scenario: Branches > Edit link > Save -Clicking cancel button should not able to modify the Branch details  
    Given Branches Feature_User launches the application
    And User logs in and navigates to Branches page by clicking Account Menu > Branches 
     And  	User clicks Edit link
    And User provides the details "EditedBranchName" and "8888" in the Create new Branch popup page and clicks save button
     Then User can see the Branch "EditedBranchName" and "8888" created and listed in the Branches page
     And Branches_FunctionalityCheck_Feature_user closes the session
     
     Scenario: BranchID > Delete > Cancel -Clicking cancel button should not able to delete the Branch details  
    Given Branches Feature_User launches the application
    And User logs in and navigates to Branches page by clicking Account Menu > Branches 
    And  	User clicks the Delete link for <EditedBranchName>
    And  User Clicks the cancel button in popup window 
    Then User can see the Branch "EditedBranchName" and "8888" created and listed in the Branches page
    And Branches_FunctionalityCheck_Feature_user closes the session
    
     Scenario: BranchID > Delete > Cancel -Clicking cancel button should not able to delete the Branch details  
    Given Branches Feature_User launches the application
    And User logs in and navigates to Branches page by clicking Account Menu > Branches 
    And  	User clicks the Delete link for <EditedBranchName>
    And  User Clicks the Delete button in popup window 
    Then User cannot see the Branch "EditedBranchName" and "8888" created and listed in the Branches page
    And Branches_FunctionalityCheck_Feature_user closes the session
  
  