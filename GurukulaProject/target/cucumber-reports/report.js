$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Branches.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    }
  ],
  "line": 5,
  "name": "Branches",
  "description": "",
  "id": "branches",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Navigate to Branches page-User would be able to navigate to Branches page from Account menu \u003e Branches",
  "description": "",
  "id": "branches;navigate-to-branches-page-user-would-be-able-to-navigate-to-branches-page-from-account-menu-\u003e-branches",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Branches Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User logs in and navigates to Branches page by clicking Account Menu \u003e Branches",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be able to see the Branches page",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchesFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 5645463059,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_logs_in_and_navigates_to_Branches_page_by_clicking_Account_Menu_Branches()"
});
formatter.result({
  "duration": 2453605135,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_should_be_able_to_see_the_Branches_page()"
});
formatter.result({
  "duration": 94752837,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1110001268,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Create Branch page Navigation -User should be able to navigate to Create Branch page from \tBranches page",
  "description": "",
  "id": "branches;create-branch-page-navigation--user-should-be-able-to-navigate-to-create-branch-page-from--branches-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Branches Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User logs in and navigates to Branches page by clicking Account Menu \u003e Branches",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User able to click Create a new Branch link",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User should be able to see a popup for creating a Branch",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchesFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4960653191,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_logs_in_and_navigates_to_Branches_page_by_clicking_Account_Menu_Branches()"
});
formatter.result({
  "duration": 2470608560,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_able_to_click_Create_a_new_Branch_link()"
});
formatter.result({
  "duration": 239939219,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_should_be_able_to_see_a_popup_for_creating_a_Branch()"
});
formatter.result({
  "duration": 35912655,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 1187476997,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Save \u003e Branch created Functionality -User would be able to create a new Branch and can see the same created Branch details in the Branches page",
  "description": "",
  "id": "branches;save-\u003e-branch-created-functionality--user-would-be-able-to-create-a-new-branch-and-can-see-the-same-created-branch-details-in-the-branches-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "Branches Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "User logs in and navigates to Branches page by clicking Account Menu \u003e Branches",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User able to click Create a new Branch link",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User provides the details \"NewBranchName\" and \"7777\" in the Create new Branch popup page and clicks Save button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User can see the Branch \"NewBranchName\" and \"7777\" created and listed in the Branches page",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchesFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4392639917,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_logs_in_and_navigates_to_Branches_page_by_clicking_Account_Menu_Branches()"
});
formatter.result({
  "duration": 2399196341,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_able_to_click_Create_a_new_Branch_link()"
});
formatter.result({
  "duration": 215648408,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NewBranchName",
      "offset": 27
    },
    {
      "val": "7777",
      "offset": 47
    }
  ],
  "location": "BranchesFunctionality.user_provides_the_details_and_in_the_Create_new_Branch_popup_page_and_clicks_Save_button(String,String)"
});
formatter.result({
  "duration": 8417415375,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NewBranchName",
      "offset": 25
    },
    {
      "val": "7777",
      "offset": 45
    }
  ],
  "location": "BranchesFunctionality.user_can_see_the_Branch_and_created_and_listed_in_the_Branches_page(String,String)"
});
formatter.result({
  "duration": 87031264,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 3402781306,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Create Branch \u003e Cancel Button -Branch will not be created when user clicks cancel in creating Branch pop up page",
  "description": "",
  "id": "branches;create-branch-\u003e-cancel-button--branch-will-not-be-created-when-user-clicks-cancel-in-creating-branch-pop-up-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "Branches Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "User logs in and navigates to Branches page by clicking Account Menu \u003e Branches",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User able to click Create a new Branch link",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User provides the details \"CancelBranchName\" and \"8888\" in the Create new Branch popup page and clicks Cancel button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User cannot see the Branch \"CancelBranchName\" and \"8888\" in the Branches page as it is cancelled",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchesFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4622165490,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_logs_in_and_navigates_to_Branches_page_by_clicking_Account_Menu_Branches()"
});
formatter.result({
  "duration": 2366928234,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_able_to_click_Create_a_new_Branch_link()"
});
formatter.result({
  "duration": 226898214,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CancelBranchName",
      "offset": 27
    },
    {
      "val": "8888",
      "offset": 50
    }
  ],
  "location": "BranchesFunctionality.user_provides_the_details_and_in_the_Create_new_Branch_popup_page_and_clicks_Cancel_button(String,String)"
});
formatter.result({
  "duration": 649800083,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CancelBranchName",
      "offset": 28
    },
    {
      "val": "8888",
      "offset": 51
    }
  ],
  "location": "BranchesFunctionality.user_cannot_see_the_Branch_and_in_the_Branches_page_as_it_is_cancelled(String,String)"
});
formatter.result({
  "duration": 147066244,
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 3311981481,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Branches page \u003e View -User would be able to see the Branch details by clicking view link",
  "description": "",
  "id": "branches;branches-page-\u003e-view--user-would-be-able-to-see-the-branch-details-by-clicking-view-link",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "Branches Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "User logs in and navigates to Branches page by clicking Account Menu \u003e Branches",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User clicks the view link for the \u003cNewBranchName\u003e code in the webtable",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User can see the Branch details",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchesFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4677555552,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_logs_in_and_navigates_to_Branches_page_by_clicking_Account_Menu_Branches()"
});
formatter.result({
  "duration": 2331679830,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_clicks_the_view_link_for_the_BranchID_in_the_webtable()"
});
formatter.result({
  "duration": 238885824,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_can_see_the_Branch_details()"
});
formatter.result({
  "duration": 33009047,
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "duration": 1049095633,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Branches page \u003e Branch ID -User would be able to see the Branch details by clicking Branch ID link",
  "description": "",
  "id": "branches;branches-page-\u003e-branch-id--user-would-be-able-to-see-the-branch-details-by-clicking-branch-id-link",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 43,
  "name": "Branches Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "User logs in and navigates to Branches page by clicking Account Menu \u003e Branches",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "User clicks the Branch ID of given \u003cNewBranchName\u003e in the webtable",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "User can see the Branch details of \"NewBranchName\" and \"7777\" of the BranchID",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchesFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4336899198,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_logs_in_and_navigates_to_Branches_page_by_clicking_Account_Menu_Branches()"
});
formatter.result({
  "duration": 2423574388,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_clicks_the_Branch_ID_of_given_BranchID_in_the_webtable()"
});
formatter.result({
  "duration": 242191690,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NewBranchName",
      "offset": 36
    },
    {
      "val": "7777",
      "offset": 56
    }
  ],
  "location": "BranchesFunctionality.user_can_see_the_Branch_details_of_and_of_the_BranchID(String,String)"
});
formatter.result({
  "duration": 39720558,
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png");
formatter.after({
  "duration": 1019476552,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "Branch View Page \u003e Back Button functionality - User would be able Navigate to Branches page by clicking Back button in respective Branch page",
  "description": "",
  "id": "branches;branch-view-page-\u003e-back-button-functionality---user-would-be-able-navigate-to-branches-page-by-clicking-back-button-in-respective-branch-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 50,
  "name": "Branches Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "User logs in and navigates to Branches page by clicking Account Menu \u003e Branches",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "User clicks the view link for the \u003cNewBranchName\u003e code in the webtable",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "Back should be available in Branch details page and cicking Back button should navigate to Branches page",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "User should be able to see the Branches page",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchesFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4720664651,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_logs_in_and_navigates_to_Branches_page_by_clicking_Account_Menu_Branches()"
});
formatter.result({
  "duration": 2405069412,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_clicks_the_view_link_for_the_BranchID_in_the_webtable()"
});
formatter.result({
  "duration": 337083649,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.back_should_be_available_in_Branch_details_page_and_cicking_Back_button_should_navigate_to_Branches_page()"
});
formatter.result({
  "duration": 143379503,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_should_be_able_to_see_the_Branches_page()"
});
formatter.result({
  "duration": 24825634,
  "status": "passed"
});
formatter.embedding("image/png", "embedded6.png");
formatter.after({
  "duration": 1037572145,
  "status": "passed"
});
formatter.scenario({
  "line": 57,
  "name": "Create Brach Popup \u003e Name Text field validation \u003eName field in Create Branch popup has mandatory check,minmum char length, max char lenth for Name field",
  "description": "",
  "id": "branches;create-brach-popup-\u003e-name-text-field-validation-\u003ename-field-in-create-branch-popup-has-mandatory-check,minmum-char-length,-max-char-lenth-for-name-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 58,
  "name": "Branches Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 59,
  "name": "User logs in and navigates to Branches page by clicking Account Menu \u003e Branches",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "User able to click Create a new Branch link",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "Name text field has functionality of mandatory check,minmum char length, max char lenth",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchesFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4455979337,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_logs_in_and_navigates_to_Branches_page_by_clicking_Account_Menu_Branches()"
});
formatter.result({
  "duration": 2347509269,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_able_to_click_Create_a_new_Branch_link()"
});
formatter.result({
  "duration": 202930976,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.name_text_field_has_mandatory_check_minmum_char_length_max_char_lenth()"
});
formatter.result({
  "duration": 730517533,
  "status": "passed"
});
formatter.embedding("image/png", "embedded7.png");
formatter.after({
  "duration": 3303625304,
  "status": "passed"
});
formatter.scenario({
  "line": 64,
  "name": "Create Branch Popup \u003e Code Text field validation \u003eCode field in Create Branch popup has mandatory check,only digits can be entered in Code field",
  "description": "",
  "id": "branches;create-branch-popup-\u003e-code-text-field-validation-\u003ecode-field-in-create-branch-popup-has-mandatory-check,only-digits-can-be-entered-in-code-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 65,
  "name": "Branches Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 66,
  "name": "User logs in and navigates to Branches page by clicking Account Menu \u003e Branches",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "User able to click Create a new Branch link",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "Code text field has functionality of mandatory check,only digits can be entered",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchesFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4606785348,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_logs_in_and_navigates_to_Branches_page_by_clicking_Account_Menu_Branches()"
});
formatter.result({
  "duration": 2384837379,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_able_to_click_Create_a_new_Branch_link()"
});
formatter.result({
  "duration": 221817114,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.code_text_field_has_functionality_of_mandatory_check_only_digits_can_be_entered()"
});
formatter.result({
  "duration": 449901574,
  "status": "passed"
});
formatter.embedding("image/png", "embedded8.png");
formatter.after({
  "duration": 3334073418,
  "status": "passed"
});
formatter.scenario({
  "line": 71,
  "name": "Branches \u003e Edit link -Clicking Edit link should navigate to Edit Branch page",
  "description": "",
  "id": "branches;branches-\u003e-edit-link--clicking-edit-link-should-navigate-to-edit-branch-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 72,
  "name": "Branches Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 73,
  "name": "User logs in and navigates to Branches page by clicking Account Menu \u003e Branches",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "User clicks Edit link",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "Name and Code is shown for for \"NewBranchName\" and \"7777\" in Edit Branch page",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchesFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4763656294,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_logs_in_and_navigates_to_Branches_page_by_clicking_Account_Menu_Branches()"
});
formatter.result({
  "duration": 2399066626,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_clicks_Edit_link_for_and()"
});
formatter.result({
  "duration": 230471775,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NewBranchName",
      "offset": 32
    },
    {
      "val": "7777",
      "offset": 52
    }
  ],
  "location": "BranchesFunctionality.name_and_Code_should_be_shown_in_Edit_Branch_page(String,String)"
});
formatter.result({
  "duration": 52741893,
  "status": "passed"
});
formatter.embedding("image/png", "embedded9.png");
formatter.after({
  "duration": 1180202440,
  "status": "passed"
});
formatter.scenario({
  "line": 78,
  "name": "Branches \u003e Edit link \u003e Cancel -Clicking cancel button should not able to modify the Branch details",
  "description": "",
  "id": "branches;branches-\u003e-edit-link-\u003e-cancel--clicking-cancel-button-should-not-able-to-modify-the-branch-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 79,
  "name": "Branches Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 80,
  "name": "User logs in and navigates to Branches page by clicking Account Menu \u003e Branches",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "User clicks Edit link",
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "User provides the details \"CancelBranchName\" and \"8888\" in the Create new Branch popup page and clicks Cancel button",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "User cannot see the Branch \"CancelBranchName\" and \"8888\" in the Branches page as it is cancelled",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchesFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4760260056,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_logs_in_and_navigates_to_Branches_page_by_clicking_Account_Menu_Branches()"
});
formatter.result({
  "duration": 2513296301,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_clicks_Edit_link_for_and()"
});
formatter.result({
  "duration": 271395684,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CancelBranchName",
      "offset": 27
    },
    {
      "val": "8888",
      "offset": 50
    }
  ],
  "location": "BranchesFunctionality.user_provides_the_details_and_in_the_Create_new_Branch_popup_page_and_clicks_Cancel_button(String,String)"
});
formatter.result({
  "duration": 603388540,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CancelBranchName",
      "offset": 28
    },
    {
      "val": "8888",
      "offset": 51
    }
  ],
  "location": "BranchesFunctionality.user_cannot_see_the_Branch_and_in_the_Branches_page_as_it_is_cancelled(String,String)"
});
formatter.result({
  "duration": 181455967,
  "status": "passed"
});
formatter.embedding("image/png", "embedded10.png");
formatter.after({
  "duration": 1072752127,
  "status": "passed"
});
formatter.scenario({
  "line": 86,
  "name": "Branches \u003e Edit link \u003e Save -Clicking cancel button should not able to modify the Branch details",
  "description": "",
  "id": "branches;branches-\u003e-edit-link-\u003e-save--clicking-cancel-button-should-not-able-to-modify-the-branch-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 87,
  "name": "Branches Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 88,
  "name": "User logs in and navigates to Branches page by clicking Account Menu \u003e Branches",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "User clicks Edit link",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "User provides the details \"EditedBranchName\" and \"8888\" in the Create new Branch popup page and clicks save button",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "User can see the Branch \"EditedBranchName\" and \"8888\" created and listed in the Branches page",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchesFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4549593538,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_logs_in_and_navigates_to_Branches_page_by_clicking_Account_Menu_Branches()"
});
formatter.result({
  "duration": 2413432429,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_clicks_Edit_link_for_and()"
});
formatter.result({
  "duration": 327171469,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EditedBranchName",
      "offset": 27
    },
    {
      "val": "8888",
      "offset": 50
    }
  ],
  "location": "BranchesFunctionality.user_provides_the_details_and_in_the_Create_new_Branch_popup_page_and_clicks_save_button(String,String)"
});
formatter.result({
  "duration": 8455922605,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EditedBranchName",
      "offset": 25
    },
    {
      "val": "8888",
      "offset": 48
    }
  ],
  "location": "BranchesFunctionality.user_can_see_the_Branch_and_created_and_listed_in_the_Branches_page(String,String)"
});
formatter.result({
  "duration": 80783590,
  "status": "passed"
});
formatter.embedding("image/png", "embedded11.png");
formatter.after({
  "duration": 3330572554,
  "status": "passed"
});
formatter.scenario({
  "line": 94,
  "name": "BranchID \u003e Delete \u003e Cancel -Clicking cancel button should not able to delete the Branch details",
  "description": "",
  "id": "branches;branchid-\u003e-delete-\u003e-cancel--clicking-cancel-button-should-not-able-to-delete-the-branch-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 95,
  "name": "Branches Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 96,
  "name": "User logs in and navigates to Branches page by clicking Account Menu \u003e Branches",
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "User clicks the Delete link for \u003cEditedBranchName\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 98,
  "name": "User Clicks the cancel button in popup window",
  "keyword": "And "
});
formatter.step({
  "line": 99,
  "name": "User can see the Branch \"EditedBranchName\" and \"8888\" created and listed in the Branches page",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchesFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4397540272,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_logs_in_and_navigates_to_Branches_page_by_clicking_Account_Menu_Branches()"
});
formatter.result({
  "duration": 2398150072,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_clicks_the_Delete_link_for_Branch_ID()"
});
formatter.result({
  "duration": 245088455,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_Clicks_the_cancel_button_and_seen_that_Branch_ID_is_not_deleted_and_can_be_seen_in_Branch_details_page()"
});
formatter.result({
  "duration": 255491554,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EditedBranchName",
      "offset": 25
    },
    {
      "val": "8888",
      "offset": 48
    }
  ],
  "location": "BranchesFunctionality.user_can_see_the_Branch_and_created_and_listed_in_the_Branches_page(String,String)"
});
formatter.result({
  "duration": 127004694,
  "status": "passed"
});
formatter.embedding("image/png", "embedded12.png");
formatter.after({
  "duration": 1073244187,
  "status": "passed"
});
formatter.scenario({
  "line": 102,
  "name": "BranchID \u003e Delete \u003e Cancel -Clicking cancel button should not able to delete the Branch details",
  "description": "",
  "id": "branches;branchid-\u003e-delete-\u003e-cancel--clicking-cancel-button-should-not-able-to-delete-the-branch-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 103,
  "name": "Branches Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 104,
  "name": "User logs in and navigates to Branches page by clicking Account Menu \u003e Branches",
  "keyword": "And "
});
formatter.step({
  "line": 105,
  "name": "User clicks the Delete link for \u003cEditedBranchName\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 106,
  "name": "User Clicks the Delete button in popup window",
  "keyword": "And "
});
formatter.step({
  "line": 107,
  "name": "User cannot see the Branch \"EditedBranchName\" and \"8888\" created and listed in the Branches page",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchesFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4470421829,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_logs_in_and_navigates_to_Branches_page_by_clicking_Account_Menu_Branches()"
});
formatter.result({
  "duration": 2575391603,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_clicks_the_Delete_link_for_Branch_ID()"
});
formatter.result({
  "duration": 265817393,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.user_Clicks_the_Delete_button_and_seen_that_Branch_ID_is_deleted_and_will_not_be_listed_in_Branch_details_page()"
});
formatter.result({
  "duration": 281478631,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EditedBranchName",
      "offset": 28
    },
    {
      "val": "8888",
      "offset": 51
    }
  ],
  "location": "BranchesFunctionality.user_cannot_see_the_Branch_and_created_and_listed_in_the_Branches_page(String,String)"
});
formatter.result({
  "duration": 20027058147,
  "status": "passed"
});
formatter.embedding("image/png", "embedded13.png");
formatter.after({
  "duration": 3282378365,
  "status": "passed"
});
formatter.uri("SearchBranch.feature");
formatter.feature({
  "line": 2,
  "name": "Search Branch",
  "description": "",
  "id": "search-branch",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Creating multiple Branches to search with the Branch Name",
  "description": "",
  "id": "search-branch;creating-multiple-branches-to-search-with-the-branch-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Search_Branch_Feature_User launches the application and navigates to Account Menu \u003e Branches with default admin login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to Account menu \u003e Branches and create four different Branches  of \u003cName\u003e and \u003cCode\u003e",
  "rows": [
    {
      "cells": [
        "Name",
        "Code"
      ],
      "line": 7
    },
    {
      "cells": [
        "oneBRANCHSELENIUM",
        "77"
      ],
      "line": 8
    },
    {
      "cells": [
        "twoBRANCHSELENIUM",
        "888"
      ],
      "line": 9
    },
    {
      "cells": [
        "threeBRANCHSELENIUM",
        "9999"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user search for the branch using branch name \"oneBRANCHSELENIUM\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "branch details should be shown in the branch list for \"oneBRANCHSELENIUM\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchBranchFunctinality.search_branch_feature_user_launches_the_application()"
});
formatter.result({
  "duration": 6890288950,
  "status": "passed"
});
formatter.match({
  "location": "SearchBranchFunctinality.navigate_to_Account_menu_Branches_and_create_four_different_Branches_of_Name_and_Code(DataTable)"
});
formatter.result({
  "duration": 25559670782,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "oneBRANCHSELENIUM",
      "offset": 46
    }
  ],
  "location": "SearchBranchFunctinality.user_search_for_the_branch_using_branch_name(String)"
});
formatter.result({
  "duration": 1816799303,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "oneBRANCHSELENIUM",
      "offset": 55
    }
  ],
  "location": "SearchBranchFunctinality.branch_details_should_be_shown_in_the_branch_list(String)"
});
formatter.result({
  "duration": 70810117,
  "status": "passed"
});
formatter.embedding("image/png", "embedded14.png");
formatter.after({
  "duration": 1160828519,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Branch details list should be shown when user tries to search with partial branch name",
  "description": "",
  "id": "search-branch;branch-details-list-should-be-shown-when-user-tries-to-search-with-partial-branch-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "Search_Branch_Feature_User launches the application and navigates to Account Menu \u003e Branches with default admin login",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user search for the branch using branch name \"SELENIUM\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "branch details should NOT be shown for \"SELENIUM\" search criteria as it is partinal name",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchBranchFunctinality.search_branch_feature_user_launches_the_application()"
});
formatter.result({
  "duration": 6920449410,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SELENIUM",
      "offset": 46
    }
  ],
  "location": "SearchBranchFunctinality.user_search_for_the_branch_using_branch_name(String)"
});
formatter.result({
  "duration": 1766165912,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SELENIUM",
      "offset": 40
    }
  ],
  "location": "SearchBranchFunctinality.branch_details_should_NOT_be_shown_for_search_criteria_as_it_is_partinal_name(String)"
});
formatter.result({
  "duration": 20022109898,
  "status": "passed"
});
formatter.embedding("image/png", "embedded15.png");
formatter.after({
  "duration": 3287075738,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Branch details should be shown when user search with small case or upper cases as it is not a case sensitive",
  "description": "",
  "id": "search-branch;branch-details-should-be-shown-when-user-search-with-small-case-or-upper-cases-as-it-is-not-a-case-sensitive",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "Search_Branch_Feature_User launches the application and navigates to Account Menu \u003e Branches with default admin login",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user search for the branch using branch name with \u003clowercasesANDuppercases\u003e then branch details should be shown",
  "rows": [
    {
      "cells": [
        "lowercasesANDuppercases"
      ],
      "line": 22
    },
    {
      "cells": [
        "onebranchselenium"
      ],
      "line": 23
    },
    {
      "cells": [
        "ONEBRANCHSELENIUM"
      ],
      "line": 24
    },
    {
      "cells": [
        "ONEbranchSELEnium"
      ],
      "line": 25
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "SearchBranchFunctinality.search_branch_feature_user_launches_the_application()"
});
formatter.result({
  "duration": 7039499045,
  "status": "passed"
});
formatter.match({
  "location": "SearchBranchFunctinality.user_search_for_the_branch_using_branch_name_with_lowercasesANDuppercases_then_branch_details_should_be_shown(DataTable)"
});
formatter.result({
  "duration": 11508138798,
  "status": "passed"
});
formatter.embedding("image/png", "embedded16.png");
formatter.after({
  "duration": 3303889010,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Branch details should be shown when user search with BRANCH CODE      Given Search_Branch_Feature_User launches the application",
  "description": "",
  "id": "search-branch;branch-details-should-be-shown-when-user-search-with-branch-code------given-search-branch-feature-user-launches-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "Search_Branch_Feature_User launches the application and navigates to Account Menu \u003e Branches with default admin login",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "user search for the branch using branch name with \"77\"",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "branch details should be shown for code \"77\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchBranchFunctinality.search_branch_feature_user_launches_the_application()"
});
formatter.result({
  "duration": 6760314508,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "77",
      "offset": 51
    }
  ],
  "location": "SearchBranchFunctinality.user_search_for_the_branch_using_branch_name_with(String)"
});
formatter.result({
  "duration": 1762270202,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "77",
      "offset": 41
    }
  ],
  "location": "SearchBranchFunctinality.branch_details_should_be_shown(String)"
});
formatter.result({
  "duration": 78290221,
  "status": "passed"
});
formatter.embedding("image/png", "embedded17.png");
formatter.after({
  "duration": 3320977676,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Branch details should NOT be shown when user search with BRANCH NAMES BY GIVING SPACES BETWEEN WORDS",
  "description": "",
  "id": "search-branch;branch-details-should-not-be-shown-when-user-search-with-branch-names-by-giving-spaces-between-words",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "Search_Branch_Feature_User launches the application and navigates to Account Menu \u003e Branches with default admin login",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "user search for the branch using branch name with \u003cworkwithspaces\u003e then branch details should NOT be shown",
  "rows": [
    {
      "cells": [
        "workwithspaces"
      ],
      "line": 36
    },
    {
      "cells": [
        "one branchselenium"
      ],
      "line": 37
    },
    {
      "cells": [
        "ONEBRANCHS ELENIUM"
      ],
      "line": 38
    },
    {
      "cells": [
        "ONEbra nchSELEnium"
      ],
      "line": 39
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "SearchBranchFunctinality.search_branch_feature_user_launches_the_application()"
});
formatter.result({
  "duration": 6707763338,
  "status": "passed"
});
formatter.match({
  "location": "SearchBranchFunctinality.user_search_for_the_branch_using_branch_name_with_workwithspaces_then_branch_details_should_NOT_be_shown(DataTable)"
});
formatter.result({
  "duration": 68642819165,
  "status": "passed"
});
formatter.embedding("image/png", "embedded18.png");
formatter.after({
  "duration": 1027841566,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Branch details should be shown when user search with BRANCH ID",
  "description": "",
  "id": "search-branch;branch-details-should-be-shown-when-user-search-with-branch-id",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "Search_Branch_Feature_User launches the application and navigates to Account Menu \u003e Branches with default admin login",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "user search for the branch using branch ID with \"1\"",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "branch details should be shown with \"1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchBranchFunctinality.search_branch_feature_user_launches_the_application()"
});
formatter.result({
  "duration": 6751033225,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 49
    }
  ],
  "location": "SearchBranchFunctinality.user_search_for_the_branch_using_branch_ID_with(String)"
});
formatter.result({
  "duration": 1742528234,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 37
    }
  ],
  "location": "SearchBranchFunctinality.branch_details_should_be_shown_with(String)"
});
formatter.result({
  "duration": 20018549165,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.org.pages.BranchesPage.BranchCheck(BranchesPage.java:201)\r\n\tat cucumber.stepdefinitions.SearchBranchFunctinality.branch_details_should_be_shown_with(SearchBranchFunctinality.java:128)\r\n\tat ✽.Then branch details should be shown with \"1\"(SearchBranch.feature:44)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded19.png");
formatter.after({
  "duration": 1111112536,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Branch details should NOT be shown when user search with criteria of invalid branch code, invalid branch name, partial branch name, partial code",
  "description": "",
  "id": "search-branch;branch-details-should-not-be-shown-when-user-search-with-criteria-of-invalid-branch-code,-invalid-branch-name,-partial-branch-name,-partial-code",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 47,
  "name": "Search_Branch_Feature_User launches the application and navigates to Account Menu \u003e Branches with default admin login",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "user search for \u003cinvalidcharacters\u003e criteria and seen that search page will not shown any results",
  "rows": [
    {
      "cells": [
        "invalidcharacters"
      ],
      "line": 49
    },
    {
      "cells": [
        "@@@\u0026\u0026"
      ],
      "line": 50
    },
    {
      "cells": [
        "!!!"
      ],
      "line": 51
    },
    {
      "cells": [
        "52432424\"£$£\"$fsaf"
      ],
      "line": 52
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "SearchBranchFunctinality.search_branch_feature_user_launches_the_application()"
});
formatter.result({
  "duration": 7003274791,
  "status": "passed"
});
formatter.match({
  "location": "SearchBranchFunctinality.user_search_for_invalidcharacters_criteria_and_seen_that_search_page_will_not_shown_any_results(DataTable)"
});
formatter.result({
  "duration": 68496256099,
  "status": "passed"
});
formatter.embedding("image/png", "embedded20.png");
formatter.after({
  "duration": 1062712229,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "Branch details should be shown when search is clicked with blank criteria",
  "description": "",
  "id": "search-branch;branch-details-should-be-shown-when-search-is-clicked-with-blank-criteria",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 56,
  "name": "Search_Branch_Feature_User launches the application and navigates to Account Menu \u003e Branches with default admin login",
  "keyword": "Given "
});
formatter.step({
  "line": 57,
  "name": "user search for the branch using \"invalid BRANCH\" name where results are not shown",
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "user search by removing the critiera and clicks the search with blank in search text field",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "all branch details should be shown in the branch list",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchBranchFunctinality.search_branch_feature_user_launches_the_application()"
});
formatter.result({
  "duration": 6879645523,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalid BRANCH",
      "offset": 34
    }
  ],
  "location": "SearchBranchFunctinality.user_search_for_the_branch_using_name_where_results_are_not_shown(String)"
});
formatter.result({
  "duration": 1853386758,
  "status": "passed"
});
formatter.match({
  "location": "SearchBranchFunctinality.user_search_by_removing_the_critiera_and_clicks_the_search_with_blank_in_search_text_field()"
});
formatter.result({
  "duration": 1744347943,
  "status": "passed"
});
formatter.match({
  "location": "SearchBranchFunctinality.all_branch_details_should_be_shown_in_the_branch_list()"
});
formatter.result({
  "duration": 62213328,
  "status": "passed"
});
formatter.embedding("image/png", "embedded21.png");
formatter.after({
  "duration": 3345120527,
  "status": "passed"
});
formatter.uri("SearchStaff.feature");
formatter.feature({
  "line": 2,
  "name": "Search Staff",
  "description": "",
  "id": "search-staff",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Creating multiple Staffes to search with the Staff Name",
  "description": "",
  "id": "search-staff;creating-multiple-staffes-to-search-with-the-staff-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Search_Staff_Feature_User launches the application and navigates to Account Menu \u003e Staffes with default admin login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to Account menu \u003e Staffs and create four different Staffs  of \u003cName\u003e and \u003cBranch\u003e",
  "rows": [
    {
      "cells": [
        "Name",
        "Branch"
      ],
      "line": 7
    },
    {
      "cells": [
        "oneSTAFFSELENIUM",
        "oneBRANCHSELENIUM"
      ],
      "line": 8
    },
    {
      "cells": [
        "twoSTAFFSELENIUM",
        "twoBRANCHSELENIUM"
      ],
      "line": 9
    },
    {
      "cells": [
        "THREESTAFFSELENIUM",
        "threeBRANCHSELENIUM"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user search for the Staff using Staff name \"oneStaffSELENIUM\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Staff details should be shown in the Staff list for \"oneStaffSELENIUM\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStaffFunctionality.search_staff_feature_user_launches_the_application_and_navigates_to_Account_Menu_Staffes_with_default_admin_login()"
});
formatter.result({
  "duration": 6864025338,
  "status": "passed"
});
formatter.match({
  "location": "SearchStaffFunctionality.navigate_to_Account_menu_Staffs_and_create_four_different_Staffs_of_Name_and_Branch(DataTable)"
});
formatter.result({
  "duration": 25814426242,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "oneStaffSELENIUM",
      "offset": 44
    }
  ],
  "location": "SearchStaffFunctionality.user_search_for_the_Staff_using_Staff_name(String)"
});
formatter.result({
  "duration": 1825117563,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "oneStaffSELENIUM",
      "offset": 53
    }
  ],
  "location": "SearchStaffFunctionality.staff_details_should_be_shown_in_the_Staff_list_for(String)"
});
formatter.result({
  "duration": 68489796,
  "status": "passed"
});
formatter.embedding("image/png", "embedded22.png");
formatter.after({
  "duration": 3307127310,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Staff details list should not be shown when user tries to search with partial Staff name",
  "description": "",
  "id": "search-staff;staff-details-list-should-not-be-shown-when-user-tries-to-search-with-partial-staff-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "Search_Staff_Feature_User launches the application and navigates to Account Menu \u003e Staffes with default admin login",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user search for the Staff using Staff name \"SELENIUM\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Staff details should NOT be shown for \"SELENIUM\" search criteria as it is partial name",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStaffFunctionality.search_staff_feature_user_launches_the_application_and_navigates_to_Account_Menu_Staffes_with_default_admin_login()"
});
formatter.result({
  "duration": 6913476475,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SELENIUM",
      "offset": 44
    }
  ],
  "location": "SearchStaffFunctionality.user_search_for_the_Staff_using_Staff_name(String)"
});
formatter.result({
  "duration": 1823952414,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SELENIUM",
      "offset": 39
    }
  ],
  "location": "SearchStaffFunctionality.staff_details_should_NOT_be_shown_for_search_criteria_as_it_is_partial_name(String)"
});
formatter.result({
  "duration": 20021155998,
  "status": "passed"
});
formatter.embedding("image/png", "embedded23.png");
formatter.after({
  "duration": 3266975130,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Staff details should be shown when user search with small case or upper cases as it is not a case sensitive",
  "description": "",
  "id": "search-staff;staff-details-should-be-shown-when-user-search-with-small-case-or-upper-cases-as-it-is-not-a-case-sensitive",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "Search_Staff_Feature_User launches the application and navigates to Account Menu \u003e Staffes with default admin login",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user search for the Staff using Staff name with \u003clowercasesANDuppercases\u003e then Staff details should be shown",
  "rows": [
    {
      "cells": [
        "lowercasesANDuppercases"
      ],
      "line": 22
    },
    {
      "cells": [
        "oneStaffselenium"
      ],
      "line": 23
    },
    {
      "cells": [
        "ONEStaffSELENIUM"
      ],
      "line": 24
    },
    {
      "cells": [
        "ONEStaffSELEnium"
      ],
      "line": 25
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "SearchStaffFunctionality.search_staff_feature_user_launches_the_application_and_navigates_to_Account_Menu_Staffes_with_default_admin_login()"
});
formatter.result({
  "duration": 6861928241,
  "status": "passed"
});
formatter.match({
  "location": "SearchStaffFunctionality.user_search_for_the_Staff_using_Staff_name_with_lowercasesANDuppercases_then_Staff_details_should_be_shown(DataTable)"
});
formatter.result({
  "duration": 11554864505,
  "status": "passed"
});
formatter.embedding("image/png", "embedded24.png");
formatter.after({
  "duration": 3281668784,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Staff details should NOT be shown when user search with Staff NAMES BY GIVING SPACES BETWEEN WORDS",
  "description": "",
  "id": "search-staff;staff-details-should-not-be-shown-when-user-search-with-staff-names-by-giving-spaces-between-words",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "Search_Staff_Feature_User launches the application and navigates to Account Menu \u003e Staffes with default admin login",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "user search for the Staff using Staff name with \u003cworkwithspaces\u003e then Staff details should NOT be shown",
  "rows": [
    {
      "cells": [
        "workwithspaces"
      ],
      "line": 30
    },
    {
      "cells": [
        "one Staffselenium"
      ],
      "line": 31
    },
    {
      "cells": [
        "ONEStaffS ELENIUM"
      ],
      "line": 32
    },
    {
      "cells": [
        "ONEbra nchSELEnium"
      ],
      "line": 33
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "SearchStaffFunctionality.search_staff_feature_user_launches_the_application_and_navigates_to_Account_Menu_Staffes_with_default_admin_login()"
});
formatter.result({
  "duration": 7031139164,
  "status": "passed"
});
formatter.match({
  "location": "SearchStaffFunctionality.user_search_for_the_Staff_using_Staff_name_with_workwithspaces_then_Staff_details_should_NOT_be_shown(DataTable)"
});
formatter.result({
  "duration": 71549795664,
  "status": "passed"
});
formatter.embedding("image/png", "embedded25.png");
formatter.after({
  "duration": 3278904013,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Staff details should be shown when user search with Staff ID",
  "description": "",
  "id": "search-staff;staff-details-should-be-shown-when-user-search-with-staff-id",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "Search_Staff_Feature_User launches the application and navigates to Account Menu \u003e Staffes with default admin login",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "user search for the Staff using Staff ID with \"1\"",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "Staff details should be shown with \"1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStaffFunctionality.search_staff_feature_user_launches_the_application_and_navigates_to_Account_Menu_Staffes_with_default_admin_login()"
});
formatter.result({
  "duration": 6851342687,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 47
    }
  ],
  "location": "SearchStaffFunctionality.user_search_for_the_Staff_using_Staff_ID_with(String)"
});
formatter.result({
  "duration": 1779838100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 36
    }
  ],
  "location": "SearchStaffFunctionality.staff_details_should_be_shown_with(String)"
});
formatter.result({
  "duration": 20034753777,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.org.pages.BranchesPage.BranchCheck(BranchesPage.java:201)\r\n\tat cucumber.stepdefinitions.SearchStaffFunctionality.staff_details_should_be_shown_with(SearchStaffFunctionality.java:109)\r\n\tat ✽.Then Staff details should be shown with \"1\"(SearchStaff.feature:38)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded26.png");
formatter.after({
  "duration": 1067556707,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Staff details should NOT be shown when user search with criteria of invalid Staff code, invalid Staff name, partial Staff name, partial code",
  "description": "",
  "id": "search-staff;staff-details-should-not-be-shown-when-user-search-with-criteria-of-invalid-staff-code,-invalid-staff-name,-partial-staff-name,-partial-code",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 41,
  "name": "Search_Staff_Feature_User launches the application and navigates to Account Menu \u003e Staffes with default admin login",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "user search for staff with invalid characters \u003cinvalidcharacters\u003e and see that search page will not shown any results",
  "rows": [
    {
      "cells": [
        "invalidcharacters"
      ],
      "line": 43
    },
    {
      "cells": [
        "@@@\u0026\u0026"
      ],
      "line": 44
    },
    {
      "cells": [
        "!!!"
      ],
      "line": 45
    },
    {
      "cells": [
        "52432424\"£$£\"$fsaf"
      ],
      "line": 46
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "SearchStaffFunctionality.search_staff_feature_user_launches_the_application_and_navigates_to_Account_Menu_Staffes_with_default_admin_login()"
});
formatter.result({
  "duration": 6838474729,
  "status": "passed"
});
formatter.match({
  "location": "SearchStaffFunctionality.user_search_for_staff_with_invalid_characters_invalidcharacters_and_see_that_search_page_will_not_shown_any_results(DataTable)"
});
formatter.result({
  "duration": 68564685171,
  "status": "passed"
});
formatter.embedding("image/png", "embedded27.png");
formatter.after({
  "duration": 3292729862,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
  "name": "Staff details should be shown when search is clicked with blank criteria",
  "description": "",
  "id": "search-staff;staff-details-should-be-shown-when-search-is-clicked-with-blank-criteria",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 49,
  "name": "Search_Staff_Feature_User launches the application and navigates to Account Menu \u003e Staffes with default admin login",
  "keyword": "Given "
});
formatter.step({
  "line": 50,
  "name": "user search for the Staff using \"invalid Staff\" name where results are not shown",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "user clears the search criteria and clicks the search with blank in search text field",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "all Staff details should be shown in the Staff list",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStaffFunctionality.search_staff_feature_user_launches_the_application_and_navigates_to_Account_Menu_Staffes_with_default_admin_login()"
});
formatter.result({
  "duration": 6788965149,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalid Staff",
      "offset": 33
    }
  ],
  "location": "SearchStaffFunctionality.user_search_for_the_Staff_using_name_where_results_are_not_shown(String)"
});
formatter.result({
  "duration": 1794352147,
  "status": "passed"
});
formatter.match({
  "location": "SearchStaffFunctionality.user_clears_the_search_criteria_and_clicks_the_search_with_blank_in_search_text_field()"
});
formatter.result({
  "duration": 1721429538,
  "status": "passed"
});
formatter.match({
  "location": "SearchStaffFunctionality.all_Staff_details_should_be_shown_in_the_Staff_list()"
});
formatter.result({
  "duration": 646255885,
  "status": "passed"
});
formatter.embedding("image/png", "embedded28.png");
formatter.after({
  "duration": 3306256085,
  "status": "passed"
});
formatter.uri("Staff.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    }
  ],
  "line": 4,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Navigate to Staff page-User would be able to navigate to Staff page from Account menu \u003e Staff",
  "description": "",
  "id": "title-of-your-feature;navigate-to-staff-page-user-would-be-able-to-navigate-to-staff-page-from-account-menu-\u003e-staff",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Staff Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User logs in and navigates to Staff page by clicking Account Menu \u003e Staff",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be able to see the Staff page",
  "keyword": "Then "
});
formatter.match({
  "location": "StaffPageFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4566403959,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_logs_in_and_navigates_to_Staff_page_by_clicking_Account_Menu_Staff()"
});
formatter.result({
  "duration": 2446045776,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_should_be_able_to_see_the_Staff_page()"
});
formatter.result({
  "duration": 151857981,
  "status": "passed"
});
formatter.embedding("image/png", "embedded29.png");
formatter.after({
  "duration": 1078699891,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Create Staff page Navigation -User should be able to navigate to Create Staff page from Staff page",
  "description": "",
  "id": "title-of-your-feature;create-staff-page-navigation--user-should-be-able-to-navigate-to-create-staff-page-from-staff-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Staff Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User logs in and navigates to Staff page by clicking Account Menu \u003e Staff",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User able to click Create a new Staff link",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User should be able to see a popup for creating a Staff",
  "keyword": "Then "
});
formatter.match({
  "location": "StaffPageFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4885741247,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_logs_in_and_navigates_to_Staff_page_by_clicking_Account_Menu_Staff()"
});
formatter.result({
  "duration": 2494789898,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_able_to_click_Create_a_new_Staff_link()"
});
formatter.result({
  "duration": 348144727,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_should_be_able_to_see_a_popup_for_creating_a_Staff()"
});
formatter.result({
  "duration": 5026471154,
  "status": "passed"
});
formatter.embedding("image/png", "embedded30.png");
formatter.after({
  "duration": 3326834782,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Create Staff Functionality\u003e Staff created Functionality -User would be able to create a new staff and can see the same created staff details in the staff page",
  "description": "",
  "id": "title-of-your-feature;create-staff-functionality\u003e-staff-created-functionality--user-would-be-able-to-create-a-new-staff-and-can-see-the-same-created-staff-details-in-the-staff-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "Staff Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User logs in and navigates to Staff page by clicking Account Menu \u003e Staff",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "create four different Staffs  of \u003cName\u003e and \u003cBranch\u003e",
  "rows": [
    {
      "cells": [
        "Name",
        "Branch"
      ],
      "line": 22
    },
    {
      "cells": [
        "oneSTAFFSELENIUM",
        "oneBRANCHSELENIUM"
      ],
      "line": 23
    },
    {
      "cells": [
        "twoSTAFFSELENIUM",
        "twoBRANCHSELENIUM"
      ],
      "line": 24
    },
    {
      "cells": [
        "THREESTAFFSELENIUM",
        "threeBRANCHSELENIUM"
      ],
      "line": 25
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "on the same page, user search for the Staff using Staff name \"oneSTAFFSELENIUM\"",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Staff details page should be shown in the Staff list for \"oneSTAFFSELENIUM\" as the staff is created",
  "keyword": "Then "
});
formatter.match({
  "location": "StaffPageFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4445638387,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_logs_in_and_navigates_to_Staff_page_by_clicking_Account_Menu_Staff()"
});
formatter.result({
  "duration": 2610289634,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.create_four_different_Staffs_of_Name_and_Branch(DataTable)"
});
formatter.result({
  "duration": 25797380624,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "oneSTAFFSELENIUM",
      "offset": 62
    }
  ],
  "location": "StaffPageFunctionality.on_the_same_page_user_search_for_the_Staff_using_Staff_name(String)"
});
formatter.result({
  "duration": 1845094157,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "oneSTAFFSELENIUM",
      "offset": 58
    }
  ],
  "location": "StaffPageFunctionality.staff_details_page_should_be_shown_in_the_Staff_list_for_as_the_staff_is_created(String)"
});
formatter.result({
  "duration": 2057051548,
  "status": "passed"
});
formatter.embedding("image/png", "embedded31.png");
formatter.after({
  "duration": 3303168025,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Create Staff \u003e Cancel Button -Staff will not be created when user clicks cancel in creating Staff pop up page",
  "description": "",
  "id": "title-of-your-feature;create-staff-\u003e-cancel-button--staff-will-not-be-created-when-user-clicks-cancel-in-creating-staff-pop-up-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "Staff Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "User logs in and navigates to Staff page by clicking Account Menu \u003e Staff",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User able to click Create a new Staff link",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User provides the details \"CancelStaffName\" and \"oneBRANCHSELENIUM\" in the Create new Staff popup page and clicks Cancel button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User cannot see the Staff \"CancelStaffName\" and \"oneBRANCHSELENIUM\" in the Staffs page as it is cancelled",
  "keyword": "Then "
});
formatter.match({
  "location": "StaffPageFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4395303767,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_logs_in_and_navigates_to_Staff_page_by_clicking_Account_Menu_Staff()"
});
formatter.result({
  "duration": 2419024120,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_able_to_click_Create_a_new_Staff_link()"
});
formatter.result({
  "duration": 359064972,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CancelStaffName",
      "offset": 27
    },
    {
      "val": "oneBRANCHSELENIUM",
      "offset": 49
    }
  ],
  "location": "StaffPageFunctionality.user_provides_the_details_and_in_the_Create_new_Staff_popup_page_and_clicks_Cancel_button(String,String)"
});
formatter.result({
  "duration": 974509829,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CancelStaffName",
      "offset": 27
    },
    {
      "val": "oneBRANCHSELENIUM",
      "offset": 49
    }
  ],
  "location": "StaffPageFunctionality.user_cannot_see_the_Staff_and_in_the_Staffs_page_as_it_is_cancelled(String,String)"
});
formatter.result({
  "duration": 1467393638,
  "status": "passed"
});
formatter.embedding("image/png", "embedded32.png");
formatter.after({
  "duration": 3339833595,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Staff page \u003e View -User would be able to see the Branch details by clicking view link",
  "description": "",
  "id": "title-of-your-feature;staff-page-\u003e-view--user-would-be-able-to-see-the-branch-details-by-clicking-view-link",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 37,
  "name": "Staff Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "User logs in and navigates to Staff page by clicking Account Menu \u003e Staff",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User clicks the view link for the \u003cOneStaffSelenium\u003e code in the webtable",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User can see the Staff details",
  "keyword": "Then "
});
formatter.match({
  "location": "StaffPageFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4339202128,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_logs_in_and_navigates_to_Staff_page_by_clicking_Account_Menu_Staff()"
});
formatter.result({
  "duration": 2412417236,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_clicks_the_view_link_for_the_OneStaffSelenium_code_in_the_webtable()"
});
formatter.result({
  "duration": 388380152,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_can_see_the_Staff_details()"
});
formatter.result({
  "duration": 23568687,
  "status": "passed"
});
formatter.embedding("image/png", "embedded33.png");
formatter.after({
  "duration": 1054986380,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Staff View Page \u003e Back Button functionality - User would be able Navigate to Staff page by clicking Back button in respective Branch page",
  "description": "",
  "id": "title-of-your-feature;staff-view-page-\u003e-back-button-functionality---user-would-be-able-navigate-to-staff-page-by-clicking-back-button-in-respective-branch-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 43,
  "name": "Staff Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "User logs in and navigates to Staff page by clicking Account Menu \u003e Staff",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "User clicks the view link for the \u003cOneStaffSelenium\u003e code in the webtable",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Back should be available in Branch details page and cicking Back button should navigate to Staff page",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "User should be able to see the Staff page",
  "keyword": "Then "
});
formatter.match({
  "location": "StaffPageFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4532216648,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_logs_in_and_navigates_to_Staff_page_by_clicking_Account_Menu_Staff()"
});
formatter.result({
  "duration": 2453605420,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_clicks_the_view_link_for_the_OneStaffSelenium_code_in_the_webtable()"
});
formatter.result({
  "duration": 360067053,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.back_should_be_available_in_Branch_details_page_and_cicking_Back_button_should_navigate_to_Staff_page()"
});
formatter.result({
  "duration": 156528842,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_should_be_able_to_see_the_Staff_page()"
});
formatter.result({
  "duration": 39486787,
  "status": "passed"
});
formatter.embedding("image/png", "embedded34.png");
formatter.after({
  "duration": 1062922053,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "Create Staff Popup \u003e Name Text field validation \u003e Name field in Create Staff popup has mandatory check,minmum char length, max char lenth for Name field",
  "description": "",
  "id": "title-of-your-feature;create-staff-popup-\u003e-name-text-field-validation-\u003e-name-field-in-create-staff-popup-has-mandatory-check,minmum-char-length,-max-char-lenth-for-name-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 50,
  "name": "Staff Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "User logs in and navigates to Staff page by clicking Account Menu \u003e Staff",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "User able to click Create a new Staff link",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "Create_Edit_Staff_Pop_Up_Name text field has functionality of mandatory check,max char lenth",
  "keyword": "Then "
});
formatter.match({
  "location": "StaffPageFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4663174925,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_logs_in_and_navigates_to_Staff_page_by_clicking_Account_Menu_Staff()"
});
formatter.result({
  "duration": 2458415118,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_able_to_click_Create_a_new_Staff_link()"
});
formatter.result({
  "duration": 353357252,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.name_text_field_has_mandatory_check_minmum_char_length_max_char_lenth()"
});
formatter.result({
  "duration": 6600642870,
  "status": "passed"
});
formatter.embedding("image/png", "embedded35.png");
formatter.after({
  "duration": 3288572157,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "Create Staff Functionality\u003e Staff created Functionality -User would be able to create a new staff without the branch selection",
  "description": "",
  "id": "title-of-your-feature;create-staff-functionality\u003e-staff-created-functionality--user-would-be-able-to-create-a-new-staff-without-the-branch-selection",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 56,
  "name": "Staff Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 57,
  "name": "User logs in and navigates to Staff page by clicking Account Menu \u003e Staff",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "create four different Staffs  of \u003cName\u003e and \u003cBranch\u003e",
  "rows": [
    {
      "cells": [
        "Name",
        ""
      ],
      "line": 59
    },
    {
      "cells": [
        "oneSTAFFwithoutBranch",
        ""
      ],
      "line": 60
    },
    {
      "cells": [
        "twoSTAFFnullBranch",
        ""
      ],
      "line": 61
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "on the same page, user search for the Staff using Staff name \"oneSTAFFwithoutBranch\"",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "Staff details page should be shown in the Staff list for \"oneSTAFFwithoutBranch\" as the staff is created",
  "keyword": "Then "
});
formatter.match({
  "location": "StaffPageFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4487246220,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_logs_in_and_navigates_to_Staff_page_by_clicking_Account_Menu_Staff()"
});
formatter.result({
  "duration": 2415644417,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.create_four_different_Staffs_of_Name_and_Branch(DataTable)"
});
formatter.result({
  "duration": 17307683514,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "oneSTAFFwithoutBranch",
      "offset": 62
    }
  ],
  "location": "StaffPageFunctionality.on_the_same_page_user_search_for_the_Staff_using_Staff_name(String)"
});
formatter.result({
  "duration": 1856308897,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "oneSTAFFwithoutBranch",
      "offset": 58
    }
  ],
  "location": "StaffPageFunctionality.staff_details_page_should_be_shown_in_the_Staff_list_for_as_the_staff_is_created(String)"
});
formatter.result({
  "duration": 2058685665,
  "status": "passed"
});
formatter.embedding("image/png", "embedded36.png");
formatter.after({
  "duration": 3291923351,
  "status": "passed"
});
formatter.scenario({
  "line": 65,
  "name": "Staff \u003e Edit link -Clicking Edit link should navigate to Edit Branch page",
  "description": "",
  "id": "title-of-your-feature;staff-\u003e-edit-link--clicking-edit-link-should-navigate-to-edit-branch-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 66,
  "name": "Staff Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 67,
  "name": "User logs in and navigates to Staff page by clicking Account Menu \u003e Staff",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "Name and Branch is shown in Edit Staff page",
  "keyword": "Then "
});
formatter.match({
  "location": "StaffPageFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4667954404,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_logs_in_and_navigates_to_Staff_page_by_clicking_Account_Menu_Staff()"
});
formatter.result({
  "duration": 2421930009,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.name_and_Branch_is_shown_in_Edit_Staff_page()"
});
formatter.result({
  "duration": 442095045,
  "status": "passed"
});
formatter.embedding("image/png", "embedded37.png");
formatter.after({
  "duration": 3538023579,
  "status": "passed"
});
formatter.scenario({
  "line": 70,
  "name": "Staff \u003e Edit link \u003e Cancel -Clicking cancel button should not able to modify the Staff details",
  "description": "",
  "id": "title-of-your-feature;staff-\u003e-edit-link-\u003e-cancel--clicking-cancel-button-should-not-able-to-modify-the-staff-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 71,
  "name": "Staff Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 72,
  "name": "User logs in and navigates to Staff page by clicking Account Menu \u003e Staff",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "User clicks Edit Staff link",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "User provides the details \"CancelStaffName\" in the Create new Staff popup page and clicks Cancel button",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "User cannot see the staff \"CancelStaffName\" in the Staff page as it is cancelled",
  "keyword": "Then "
});
formatter.match({
  "location": "StaffPageFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4440122245,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_logs_in_and_navigates_to_Staff_page_by_clicking_Account_Menu_Staff()"
});
formatter.result({
  "duration": 2403874043,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_clicks_Edit_Staff_link()"
});
formatter.result({
  "duration": 363439058,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CancelStaffName",
      "offset": 27
    }
  ],
  "location": "StaffPageFunctionality.user_provides_the_details_in_the_Create_new_Staff_popup_page_and_clicks_Cancel_button(String)"
});
formatter.result({
  "duration": 1015677487,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CancelStaffName",
      "offset": 27
    }
  ],
  "location": "StaffPageFunctionality.user_cannot_see_the_staff_in_the_Staff_page_as_it_is_cancelled(String)"
});
formatter.result({
  "duration": 1175125617,
  "status": "passed"
});
formatter.embedding("image/png", "embedded38.png");
formatter.after({
  "duration": 3321003334,
  "status": "passed"
});
formatter.scenario({
  "line": 77,
  "name": "Staff \u003e Edit link \u003e Save -Clicking save button should be able to modify the Staff details",
  "description": "",
  "id": "title-of-your-feature;staff-\u003e-edit-link-\u003e-save--clicking-save-button-should-be-able-to-modify-the-staff-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 78,
  "name": "Staff Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 79,
  "name": "User logs in and navigates to Staff page by clicking Account Menu \u003e Staff",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "User clicks Edit Staff link",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "User provides the details \"EditedStaffName\" in the Edit Staff popup page and clicks save button",
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "User can see the Staff \"EditedStaffName\" created and listed in the Staff page",
  "keyword": "Then "
});
formatter.match({
  "location": "StaffPageFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4384549157,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_logs_in_and_navigates_to_Staff_page_by_clicking_Account_Menu_Staff()"
});
formatter.result({
  "duration": 2364043156,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_clicks_Edit_Staff_link()"
});
formatter.result({
  "duration": 356571035,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EditedStaffName",
      "offset": 27
    }
  ],
  "location": "StaffPageFunctionality.user_provides_the_details_and_in_the_Edit_Staf_popup_page_and_clicks_save_button(String)"
});
formatter.result({
  "duration": 8402527008,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EditedStaffName",
      "offset": 24
    }
  ],
  "location": "StaffPageFunctionality.user_can_see_the_Branch_and_created_and_listed_in_the_Staff_page(String)"
});
formatter.result({
  "duration": 257490011,
  "status": "passed"
});
formatter.embedding("image/png", "embedded39.png");
formatter.after({
  "duration": 1083784127,
  "status": "passed"
});
formatter.scenario({
  "line": 84,
  "name": "StaffID \u003e Delete \u003e Cancel -Clicking cancel button should not able to delete the Staff details",
  "description": "",
  "id": "title-of-your-feature;staffid-\u003e-delete-\u003e-cancel--clicking-cancel-button-should-not-able-to-delete-the-staff-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 85,
  "name": "Staff Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 86,
  "name": "User logs in and navigates to Staff page by clicking Account Menu \u003e Staff",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "User clicks the Delete link for \u003cEditedStaffName\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "User Clicks the cancel button in Staff popup window",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "User can see the Staff \"EditedStaffName\" listed in the Staffs page",
  "keyword": "Then "
});
formatter.match({
  "location": "StaffPageFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4544675222,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_logs_in_and_navigates_to_Staff_page_by_clicking_Account_Menu_Staff()"
});
formatter.result({
  "duration": 2545840086,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_clicks_the_Delete_link_for_EditedStaffName()"
});
formatter.result({
  "duration": 352410194,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_Clicks_the_cancel_button_and_seen_that_Branch_ID_is_not_deleted_and_can_be_seen_in_Branch_details_page()"
});
formatter.result({
  "duration": 5156049041,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EditedStaffName",
      "offset": 24
    }
  ],
  "location": "StaffPageFunctionality.user_can_see_the_Staff_listed_in_the_Staffs_page(String)"
});
formatter.result({
  "duration": 555949830,
  "status": "passed"
});
formatter.embedding("image/png", "embedded40.png");
formatter.after({
  "duration": 3300571456,
  "status": "passed"
});
formatter.scenario({
  "line": 92,
  "name": "StaffID \u003e Delete \u003e Cancel -Clicking cancel button should not able to delete the Staff details",
  "description": "",
  "id": "title-of-your-feature;staffid-\u003e-delete-\u003e-cancel--clicking-cancel-button-should-not-able-to-delete-the-staff-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 93,
  "name": "Staff Feature_User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 94,
  "name": "User logs in and navigates to Staff page by clicking Account Menu \u003e Staff",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "User clicks the Delete link for \u003cEditedStaffName\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 96,
  "name": "User Clicks the Delete button in Staff popup window",
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "User cannot see the Staff \"EditedStaffName\" in the Staffs page",
  "keyword": "Then "
});
formatter.match({
  "location": "StaffPageFunctionality.lanuchApplication()"
});
formatter.result({
  "duration": 4628162573,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_logs_in_and_navigates_to_Staff_page_by_clicking_Account_Menu_Staff()"
});
formatter.result({
  "duration": 2441580179,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_clicks_the_Delete_link_for_EditedStaffName()"
});
formatter.result({
  "duration": 363723859,
  "status": "passed"
});
formatter.match({
  "location": "StaffPageFunctionality.user_Clicks_the_Delete_button_and_seen_that_Branch_ID_is_deleted_and_will_not_be_listed_in_Branch_details_page()"
});
formatter.result({
  "duration": 644359204,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EditedStaffName",
      "offset": 27
    }
  ],
  "location": "StaffPageFunctionality.user_cannot_see_the_Staff_in_the_Staffs_page(String)"
});
formatter.result({
  "duration": 1493031198,
  "status": "passed"
});
formatter.embedding("image/png", "embedded41.png");
formatter.after({
  "duration": 3311153874,
  "status": "passed"
});
});