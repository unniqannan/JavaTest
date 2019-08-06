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
Feature: Title of your feature
  I want to use this template for my feature file

   
  Scenario: User wil not be able to reset with un registered email
   Given A user launches application and navigates to Reset Password page through Forgot Password link
   Then verify that user is able to navigate to ResetPasswordpage
  
  Scenario: User wil not be able to reset with un registered email
   Given A user launches application and navigates to Reset Password page through Forgot Password link
   Then user provides a unregistered and invalid emailid <Emailid> and verify proper error message is shown
    |Emailid	| 
    |invalid@c.com| 
    |invalid@c| 
    |invalid@com|	 
   
   Scenario: User should be able to set the password with registered email
   Given A user launches application and navigates to Reset Password page through Forgot Password link
   When user provides a valid registered email id "add2kannan@gmail.com"
    
   Scenario: Verify proper error message is shown up as part of E-mail invalid field validation on Reset Password Page. 
   Given A user launches application and navigates to Reset Password page through Forgot Password link
   Then user provides emailid without @ symbol in <Emailid> and verify proper error message is shown
    |Emailid	| 
    |abcde| 
    |12345|
    |abcde12345| 
    
    Scenario: Verify proper error message of entering more than 5 chars is shown up as part of E-mail invalid field validation on Reset Password Page. 
   Given A user launches application and navigates to Reset Password page through Forgot Password link
   Then user provides emailid with less than five chars in <Emailid> and verify proper error message is shown
    |Emailid	| 
    |abc| 
    |abcd|
    |a| 
    |1234| 
    
     Scenario: Verify proper error message when entered more than 50 chars in E-mail as part of invalid field validation on Reset Password Page. 
   Given A user launches application and navigates to Reset Password page through Forgot Password link
   Then user provides emailid with more than fifty chars in <Emailid> and verify proper error message is shown
    |Emailid	| 
    |sfsdfsfsddddddddsafdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd| 
    |sfsdfsfsddddddddsafdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddsdfsdfsdfsfsdfs|
    |sfsdfsfsddddddddsafdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddsdfsdfsdfsfsdfsfsdfsfsdfs|  
    
   Scenario: Verify user defined message shown stating to enter emailid required when not entered in E-mail field as part of invalid field validation on Reset Password Page. 
   Given A user launches application and navigates to Reset Password page through Forgot Password link
   Then user provides no emailid and verify proper error message is shown
    	 
     	  
 
  
   
   
  
