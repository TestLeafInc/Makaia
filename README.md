a) Objective: UI + API Automation (Single United Framework)
b) Components: WebDriver (UI) + RestAssured (API) + Extent Reports (Reports) + TestNg (Driver) + Cucumber (BDD) + WireMock (Mocking API)
c) Maven Project -> Build Tool
d) Flavors : Page/Service Design (Selenium + RestAssured Base) + Cucumber (With Pages) + Independent (Rest + Se + Rest/Se)
e) Test data from external files -> JSON, Xlsx, (DB)


	Library:  Event Listeners + Wrappers + Data + Report 

	1) listeners -> Customized Solutions (Selenium, TestNg, ExtentReport)
	2) rest -> RestAssured Wrapper with Reporting and Exception Handling + PreAndTest (TestNG Annotations)
	3) selenium -> Selenium Wrapper with Reporting and Exception Handling + PreAndPost (TestNG Annotations)
	4) utils -> Reading data from excel or json (DataInputProvider) + Reporter (HTMLReporter)

	Design: Pages (Selenium) + (Cucumber)  => Runner + Features + Hooks 

	1) pages
	2) hooks 

	Tests: Selenium + REST + Mixed 

	1) tests.selenium
	2) tests.rest 


Steps to Implement Makaia for your instance

1) Download https://github.com/TestLeafInc/Makaia
2) Extract to your workspace
3) Import the project (Makaia)
4) Once fully imported, confirm there are no errors !!
5) If there are errors, 

	a) src/test/java -> lib/selenium -> WebDriverServiceImpl.java
	   Go to line 37 -> mouse over -> change JRE 1.7 or above
	b) If there are dependencies related errors, update Maven -> force update 

6) Find the chrome version and download the chromedriver first and put them in drivers folder !
	version: https://chromedriver.chromium.org/
	download locally: zip -> extract it -> chromedriver.exe
	copy it into the drivers folder !!

7) Select the testcase 3 from tests.selenium package and run it to confirm framework is ready

	TC003_CreateIncidentUsingRestAndVerifyUsingSelenium

If this is working fine, the next step will be !

a) Change it to your environment using config.properties
b) Build another test for Create Change Request ..
