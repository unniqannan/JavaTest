@FunctionalLogin
Feature: Validation of Settings Page Functionality 
   
	 Scenario: User would be able to navigate to Settings page from Account menu > Settings   
    Given A User launches application logs in successfully with valid credentials
    And User navigates to Settings page by clicking Account Menu > Settings welcome screen
    Then User should be able to see the Settings page
    And Settings_FunctionalityCheck_Feature_user closes the session  
	  
	  Scenario: User would be able to change the Settings details in Settings page 
    Given User Logs in and navigates to Settings page from Account Menu > Settings 
    Then user without any changes should be able to change the Settings details by clicking Save button
	   And Settings_FunctionalityCheck_Feature_user closes the session  
	   
	  Scenario: User would be able to change the Settings details in Settings page 
    Given User Logs in and navigates to Settings page from Account Menu > Settings 
    Then user does the changes the settings and clicking save button should be able to change the settings 
	  And Settings_FunctionalityCheck_Feature_user closes the session  
	 
  	  Scenario: Verify that the First Name has mandatory checks,max chars in Settings details at Settings page 
    Given User Logs in and navigates to Settings page from Account Menu > Settings 
     And mandatory field check for First Name field if text is not provided
     And Max chars can enter is fifty in the length for First Name field
     And Settings_FunctionalityCheck_Feature_user closes the session
     
	   Scenario: Verify that the Last Name has mandatory checks,max chars in Settings details at Settings page 
    Given User Logs in and navigates to Settings page from Account Menu > Settings 
     And mandatory field check for Last Name field if text is not provided
     And Max chars can enter is fifty in the length for Last Name field   
	   And Settings_FunctionalityCheck_Feature_user closes the session
	      
	 Scenario: Verify warning message shown when not entered in E-mail field as part of mandatory field validation in Settings details at Settings page
   Given User Logs in and navigates to Settings page from Account Menu > Settings 
   Then User provides no emailid and verify warning error message showing up
   And Settings_FunctionalityCheck_Feature_user closes the session
      
   Scenario: Verify proper error message is shown up as part of E-mail invalid field validation in Settings details at Settings page 
   Given User Logs in and navigates to Settings page from Account Menu > Settings 
   Then user provides email text having less than five chars without @ symbol in <Emailid> and verify validation is done for minimum char
    |Emailid	| 
    |a| 
    |ab|
    |abcd| 
   And Settings_FunctionalityCheck_Feature_user closes the session
    
    Scenario: Verify proper error message is shown up as part of E-mail invalid field validation in Settings details at Settings page 
   Given User Logs in and navigates to Settings page from Account Menu > Settings 
   Then user provides email text without @ symbol in <Emailid> and verify validation is done for invalid emailid
    |Emailid	| 
    |a| 
    |ab|
    |abcdsdafdsfdsfdsf| 
    |abcdefegfgdf|
   And Settings_FunctionalityCheck_Feature_user closes the session
     
   Scenario: Verify User can be able to see the English in the Language drop down of Settings details at Settings page
   Given User Logs in and navigates to Settings page from Account Menu > Settings 
   Then User would be able to select the English text in Language drop down
   And Settings_FunctionalityCheck_Feature_user closes the session
   
   Scenario: Verify that save button is disabled if any of the field of firstname,lastname, email is not provided
   Given User Logs in and navigates to Settings page from Account Menu > Settings 
   Then save button is disabled if any of the field of firstname,lastname, email is not provided
   And Settings_FunctionalityCheck_Feature_user closes the session
   
	      
	       