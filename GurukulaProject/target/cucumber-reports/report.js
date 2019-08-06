$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/featuresFile/Settings.feature");
formatter.feature({
  "line": 2,
  "name": "Validation of Settings Page Functionality",
  "description": "",
  "id": "validation-of-settings-page-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@RSettingsPage"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "User would be able to navigate to Settings page from Account menu \u003e Settings",
  "description": "",
  "id": "validation-of-settings-page-functionality;user-would-be-able-to-navigate-to-settings-page-from-account-menu-\u003e-settings",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "A User launches application logs in successfully with valid credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User navigates to Settings page by clicking Account Menu \u003e Settings welcome screen",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should be able to see the Settings page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Settings_FunctionalityCheck_Feature_user closes the session",
  "keyword": "And "
});
formatter.match({
  "location": "SettingsPageFunctionality.a_User_launches_application_logs_in_successfully_with_valid_credentials()"
});
formatter.result({
  "duration": 10833896400,
  "status": "passed"
});
formatter.match({
  "location": "SettingsPageFunctionality.user_navigates_to_Settings_page_by_clicking_Account_Menu_Settings_welcome_screen()"
});
formatter.result({
  "duration": 2010225100,
  "status": "passed"
});
formatter.match({
  "location": "SettingsPageFunctionality.user_should_be_able_to_see_the_Settings_page()"
});
formatter.result({
  "duration": 313094900,
  "status": "passed"
});
formatter.match({
  "location": "SettingsPageFunctionality.closeBrowser()"
});
formatter.result({
  "duration": 1213293100,
  "status": "passed"
});
formatter.after({
  "duration": 184500,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User would be able to change the Settings details in Settings page",
  "description": "",
  "id": "validation-of-settings-page-functionality;user-would-be-able-to-change-the-settings-details-in-settings-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "User Logs in and navigates to Settings page from Account Menu \u003e Settings",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user without any changes should be able to change the Settings details by clicking Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Settings_FunctionalityCheck_Feature_user closes the session",
  "keyword": "And "
});
formatter.match({
  "location": "SettingsPageFunctionality.user_Logs_in_and_navigates_to_Settings_page_from_Account_Menu_Settings()"
});
formatter.result({
  "duration": 9002098700,
  "status": "passed"
});
formatter.match({
  "location": "SettingsPageFunctionality.user_should_be_able_to_change_the_Settings_details_by_clicking_Save_button()"
});
formatter.result({
  "duration": 666402600,
  "status": "passed"
});
formatter.match({
  "location": "SettingsPageFunctionality.closeBrowser()"
});
formatter.result({
  "duration": 1127347600,
  "status": "passed"
});
formatter.after({
  "duration": 189500,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User would be able to change the Settings details in Settings page",
  "description": "",
  "id": "validation-of-settings-page-functionality;user-would-be-able-to-change-the-settings-details-in-settings-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "User Logs in and navigates to Settings page from Account Menu \u003e Settings",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "user does the changes the settings and clicking save button should be able to change the settings",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Settings_FunctionalityCheck_Feature_user closes the session",
  "keyword": "And "
});
formatter.match({
  "location": "SettingsPageFunctionality.user_Logs_in_and_navigates_to_Settings_page_from_Account_Menu_Settings()"
});
