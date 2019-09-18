@SmokeTestFunSmokeTest
Feature: Login Functionality Check 
   
 
   Scenario: Invalid User Credentials - Login Functionailty Check - User should not ble able login with invalid credentials
    Given A user launch the Gurukul application
    And User logs in by clicking Login button
    Then User should not be able to login with invalid credentials <username> and <password>
    |username	|password	|
    |admin		|admin1		|
    |admin1		|admin		|	
    |			|admin		|
    |admin		|			|
    | 			| 			|   
   
    
    Scenario: Vaild user Credentials - Login with Valid user credentials
    Given A user launch the Gurukul application
     And User logs in by clicking Login button
    Then User should be able to login successfully with valid credentials <username> and <password>
    |admin		|admin		|