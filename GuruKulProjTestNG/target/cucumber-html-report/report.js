$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Branches.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Unni Kannan"
    },
    {
      "line": 2,
      "value": "#This feature is about the functionaliy on Branches page of having Title Verification, creating the Branch, Editing the Branch, Deleting the Branch,"
    },
    {
      "line": 3,
      "value": "#Text Field Validations"
    }
  ],
  "line": 5,
  "name": "Branches functionality.  Covering the scnarios of Create, Edit, Delete Branch, Field Validation",
  "description": "",
  "id": "branches-functionality.--covering-the-scnarios-of-create,-edit,-delete-branch,-field-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@BranchFunctionalTesting"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Branches Page Title Verification",
  "description": "",
  "id": "branches-functionality.--covering-the-scnarios-of-create,-edit,-delete-branch,-field-validation;branches-page-title-verification",
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
  "duration": 7276693200,
  "status": "passed"
});
formatter.match({
  "location": "BranchesFunctionality.NavigationToBranchesPage()"
});
formatter.result({
  "duration": 1639454700,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.org.pages.LoginPage.LoginIntoGuruKulPage(LoginPage.java:66)\r\n\tat cucumber.stepdefinitions.BranchesFunctionality.NavigationToBranchesPage(BranchesFunctionality.java:31)\r\n\tat ✽.And User logs in and navigates to Branches page by clicking Account Menu \u003e Branches(Branches.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BranchesFunctionality.BranchesPageTitleValidation()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4636400,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d76.0.3809.100)\nBuild info: version: \u00274.0.0-alpha-1\u0027, revision: \u0027d1d3728cae\u0027, time: \u00272019-04-24T13:42:21\u0027\nSystem info: host: \u0027LAPTOP-A5GJABUP\u0027, ip: \u0027192.168.2.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_212\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.100, chrome: {chromedriverVersion: 75.0.3770.90 (a6dcaf7e3ec6f..., userDataDir: C:\\Users\\unkan\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:52455}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 9a95ce272a50f2294e7cab994b319624\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:190)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:124)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:51)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:577)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:634)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:638)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:298)\r\n\tat cucumber.stepdefinitions.CommonPageStepDefinition.endTest(CommonPageStepDefinition.java:31)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 12,
  "name": "Create Branch page popup Title verification",
  "description": "",
  "id": "branches-functionality.--covering-the-scnarios-of-create,-edit,-delete-branch,-field-validation;create-branch-page-popup-title-verification",
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
