import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("i have opened the Destimate app")
	def iOpenTheApp2() {
		def appPath = 'C:\\Users\\Angelin\\Downloads\\app-release.apk'

		Mobile.startApplication(appPath, false)
	}


	@When("i open the login page to login")
	def iOpenLoginPage() {
		Mobile.tap(findTestObject('Onboarding/onboard_Masuk'), 0)

		Mobile.verifyElementExist(findTestObject('Onboarding/loginText'), 0)
	}

	@And("fill valid username and password to login")
	def iFillValidCredentials() {

		Mobile.tap(findTestObject('Login/nameTextbox'), 0)

		Mobile.setText(findTestObject('Login/nameTextbox'), 'angelinevalencia123', 0)

		Mobile.tap(findTestObject('Login/passwordTextbox'), 0)

		Mobile.setText(findTestObject('Login/passwordTextbox'), 'angeline89', 0)

		Mobile.tap(findTestObject('Login/masukButton2'), 0)
	}

	@Then("i will redirect to home page")
	def iRedirectToHomePage() {

		Mobile.verifyElementExist(findTestObject('home/homePage'), 0)
		//logout
		Mobile.tap(findTestObject('home/profileButton'), 0)

		'Get Device Height and Store in device_height variable'
		int device_Height = Mobile.getDeviceHeight()

		'Get Width Height and Store in device_Width variable'
		int device_Width = Mobile.getDeviceWidth()

		'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
		int startX = device_Width / 2

		'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
		int endX = startX

		'Storing the startY value'
		int startY = device_Height * 0.30

		'Storing the endY value'
		int endY = device_Height * 0.70

		'Swipe Vertical from top to bottom'
		Mobile.swipe(startX, endY, endX, startY)

		Mobile.tap(findTestObject('logout/logoutButton'), 0)

		Mobile.tap(findTestObject('logout/iyaLogout'), 0)

		Mobile.verifyElementExist(findTestObject('Onboarding/onboard_Masuk'), 0)

	}

	//tag2
	@When("i open the login page1")
	def iOpenLoginPage1() {
		Mobile.tap(findTestObject('Onboarding/onboard_Masuk'), 0)

		Mobile.verifyElementExist(findTestObject('Onboarding/loginText'), 0)

	}

	@And("fill empty username and password to login")
	def iFillEmptyCredentials() {

		Mobile.tap(findTestObject('Login/nameTextbox'), 0)

		Mobile.setText(findTestObject('Login/nameTextbox'), '', 0)

		Mobile.tap(findTestObject('Login/passwordTextbox'), 0)

		Mobile.setText(findTestObject('Login/passwordTextbox'), '', 0)

		Mobile.tap(findTestObject('Login/masukButton2'), 0)

	}

	@Then("i will get error message that email password cant be empty")
	def iGetEmptyErrorMessage() {
		Mobile.verifyElementExist(findTestObject('Login/emptyPassword'), 0)

		Mobile.verifyElementExist(findTestObject('Login/emptyPassword'), 0)

		Mobile.closeApplication()


	}

	//tag3
	@When("i open the login page2")
	def iOpenLoginPage2() {

		Mobile.tap(findTestObject('Onboarding/onboard_Masuk'), 0)

		Mobile.verifyElementExist(findTestObject('Onboarding/loginText'), 0)

	}

	@And("fill unisgned username to login")
	def iFillUnsignedUsername() {

		Mobile.tap(findTestObject('Login/nameTextbox'), 0)

		Mobile.setText(findTestObject('Login/nameTextbox'), 'valenciaangeline', 0)

		Mobile.tap(findTestObject('Login/passwordTextbox'), 0)

		Mobile.setText(findTestObject('Login/passwordTextbox'), 'alterra', 0)

		Mobile.tap(findTestObject('Login/masukButton2'), 0)

		Mobile.pressBack()

	}

	@Then("i will get error message that username is invalid")
	def iGetInvalidUsernameErrorMessage() {
		Mobile.verifyElementExist(findTestObject('Login/invalidUsername'), 0)

		Mobile.closeApplication()

	}

	//tag4
	@When("i open the login page3")
	def iOpenLoginPage3() {
		Mobile.tap(findTestObject('Onboarding/onboard_Masuk'), 0)

		Mobile.verifyElementExist(findTestObject('Onboarding/loginText'), 0)
	}

	@And("fill valid username with wrong password to login")
	def iFillWrongPassword() {

		Mobile.tap(findTestObject('Login/nameTextbox'), 0)

		Mobile.setText(findTestObject('Login/nameTextbox'), 'angelinevalencia123', 0)

		Mobile.tap(findTestObject('Login/passwordTextbox'), 0)

		Mobile.setText(findTestObject('Login/passwordTextbox'), 'angeline', 0)

		Mobile.tap(findTestObject('Login/masukButton2'), 0)

		Mobile.pressBack()
	}

	@Then("i will get error message that password is invalid")
	def iGetInvalidPasswordErrorMessage() {
		Mobile.verifyElementExist(findTestObject('Login/invalidPassword'), 0)

		Mobile.closeApplication()

	}

	//tag5
	@When("i open the login page4")
	def iOpenLoginPage4() {
		Mobile.tap(findTestObject('Onboarding/onboard_Masuk'), 0)

		Mobile.verifyElementExist(findTestObject('Onboarding/loginText'), 0)

	}

	@And("fill wrong username and password to login")
	def iFillWrongPasswordUsername() {
		Mobile.tap(findTestObject('Login/nameTextbox'), 0)

		Mobile.setText(findTestObject('Login/nameTextbox'), 'angeline', 0)

		Mobile.tap(findTestObject('Login/passwordTextbox'), 0)

		Mobile.setText(findTestObject('Login/passwordTextbox'), 'angeline', 0)

		Mobile.tap(findTestObject('Login/masukButton2'), 0)

		Mobile.pressBack()
	}

	@Then("i will get error message that username and password is invalid")
	def iGetInvalidUsernamePasswordErrorMessage() {
		Mobile.verifyElementExist(findTestObject('Login/invalidUsername'), 0)

		Mobile.closeApplication()

	}

	//tag6
	@When("i open the login page5")
	def iOpenLoginPage5() {
		Mobile.tap(findTestObject('Onboarding/onboard_Masuk'), 0)

		Mobile.verifyElementExist(findTestObject('Onboarding/loginText'), 0)

	}

	@And("i click the register button")
	def iClickRegister() {

		Mobile.tap(findTestObject('Login/daftarButton'), 0)

	}

	@Then("i will redirect to the register page")
	def iRedirectToRegisterPage() {
		Mobile.verifyElementExist(findTestObject('Onboarding/daftarText'), 0)

		Mobile.closeApplication()

	}






}