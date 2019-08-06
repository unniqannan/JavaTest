@FunctionalLogin
Feature: Title of your feature
   
 
   Scenario: User should not ble able login with invalid credentials
    Given A user launch the Gurukul application
    And User logs in by clicking Login button
    Then User should not be able to login with invalid credentials <username> and <password>
    |username	|password	|
    |admin		|admin1		|
    |admin1		|admin		|	
    |			|admin		|
    |admin		|			|
    | 			| 			|   
    And Login_FunctionalityCheck_Feature_user closes the session
    
    Scenario: Login with Valid user credentials
    Given A user launch the Gurukul application
     And User logs in by clicking Login button
    Then User should be able to login successfully with valid credentials <username> and <password>
    |admin		|admin		|
    And Login_FunctionalityCheck_Feature_user closes the session
   
   Scenario: ForgotPassword Functionality  
    Given A user launch the Gurukul application
     And User logs in by clicking Login button
    Then User should be able to navigate to Reset Password page by clicking Forgot Password link
    And Login_FunctionalityCheck_Feature_user closes the session
 
    Scenario: Registration of New User
    Given A user launch the Gurukul application
     And User logs in by clicking Login button
    Then User clicking on Register new account link should navigate to register new user page
    And Login_FunctionalityCheck_Feature_user closes the session
    
    Scenario: Logout Functionality
    Given A user launch the Gurukul application 
     And User logs in by clicking Login button
	   Then User should be able to login successfully with valid credentials <username> and <password>
    |admin		|admin		|
  	Then user logout button should successfully logout from the application 
  	And Login_FunctionalityCheck_Feature_user closes the session
  	
		Scenario: Clicking Gurukula logo link navigates Home page 
     Given A user launch the Gurukul application 
     And User logs in by clicking Login button
     Then clicking Gurukula logo link navigates to Home page 
     And Login_FunctionalityCheck_Feature_user closes the session
     
      Scenario: User should not remain logged in if remember me checkbox is unchecked
     Given A user launch the Gurukul application 
     And User logs in by clicking Login button
     Then uncheck the remember me checkbox in login page
     Then User should be able to login successfully with valid credentials <username> and <password>
  	 	|admin		|admin		|
  	 And Login_FunctionalityCheck_Feature_user closes the session
  	 
      Given A user launch the Gurukul application 
      Then user should not be logged in the new browser 
      And Login_FunctionalityCheck_Feature_user closes the session	
  
  	Scenario: Clicking Home link navigates Gurukula Home page
     Given A user launch the Gurukul application 
     And User logs in by clicking Login button
     Then clicking Home link navigates to Home page 
     And Login_FunctionalityCheck_Feature_user closes the session
   