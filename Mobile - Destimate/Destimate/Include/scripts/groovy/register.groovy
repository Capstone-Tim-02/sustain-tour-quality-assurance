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



class register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("when i open Destinate")
	def iOpenApp() {
		def appPath = 'C:\\Users\\Angelin\\Downloads\\app-release.apk'
		Mobile.startApplication(appPath, false)
	}
	
	//tag4
	@When("i open the register page4")
	def iOpenRegisterPage4() {
		Mobile.tap(findTestObject('Onboarding/onboard_Daftar'), 0)

		Mobile.verifyElementExist(findTestObject('Onboarding/daftarText'), 0)
	}

	@And("click Masuk button")
	def clickMasukInRegisterPage() {

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

		Mobile.tap(findTestObject('register/masukButton'), 0)

	}

	@Then("i will redirect to Login page")
	def iRedirectToLoginPage() {

		Mobile.verifyElementExist(findTestObject('Onboarding/loginText'), 0)

		Mobile.closeApplication()
	}

	@When("i open the register page")
	def iOpenRegisterPage() {
		Mobile.tap(findTestObject('Onboarding/onboard_Daftar'), 0)

		Mobile.verifyElementExist(findTestObject('Onboarding/daftarText'), 0)
	}

	@And("fill valid credentials to register")
	def iFillValidCredentials() {

		Mobile.tap(findTestObject('register/texfieldNamaLengkap'), 0)

		Mobile.setText(findTestObject('register/texfieldNamaLengkap'), 'Angeline', 0)

		Mobile.tap(findTestObject('register/textfieldUsername'), 0)

		Mobile.setText(findTestObject('register/textfieldUsername'), 'automation12', 0)

		Mobile.tap(findTestObject('register/textfieldNo'), 0)

		Mobile.setText(findTestObject('register/textfieldNo'), '0823713323223', 0)

		Mobile.tap(findTestObject('register/textfieldEmail'), 0)

		Mobile.setText(findTestObject('register/textfieldEmail'), 'automation12@gmail.com', 0)

		Mobile.tap(findTestObject('register/textfieldPassword'), 0)

		Mobile.setText(findTestObject('register/textfieldPassword'), 'alterra123', 0)

		Mobile.tap(findTestObject('register/textfieldConfirmPassword'), 0)

		Mobile.setText(findTestObject('register/textfieldConfirmPassword'), 'alterra123', 0)

		Mobile.pressBack()

		Mobile.tap(findTestObject('register/daftarButton'), 0)
	}

	@Then("i will get a success message")
	def iGetSuccessRegisterMessage() {

		Mobile.verifyElementExist(findTestObject('register/berhasilTab'), 0, FailureHandling.STOP_ON_FAILURE)

		Mobile.closeApplication()
	}

	//tag2
	@When("i open the register page2")
	def iOpenRegisterPage2() {
		Mobile.tap(findTestObject('Onboarding/onboard_Daftar'), 0)

		Mobile.verifyElementExist(findTestObject('Onboarding/daftarText'), 0)
	}

	@And("fill empty credentials to register")
	def iFillEmptyCredentialsToRegister() {

		Mobile.tap(findTestObject('register/texfieldNamaLengkap'), 0)

		Mobile.setText(findTestObject('register/texfieldNamaLengkap'), '', 0)

		Mobile.tap(findTestObject('register/textfieldUsername'), 0)

		Mobile.setText(findTestObject('register/textfieldUsername'), '', 0)

		Mobile.tap(findTestObject('register/textfieldNo'), 0)

		Mobile.setText(findTestObject('register/textfieldNo'), '', 0)

		Mobile.tap(findTestObject('register/textfieldEmail'), 0)

		Mobile.setText(findTestObject('register/textfieldEmail'), '', 0)

		Mobile.tap(findTestObject('register/textfieldPassword'), 0)

		Mobile.setText(findTestObject('register/textfieldPassword'), '', 0)

		Mobile.tap(findTestObject('register/textfieldConfirmPassword'), 0)

		Mobile.setText(findTestObject('register/textfieldConfirmPassword'), '', 0)

		Mobile.pressBack()

		Mobile.tap(findTestObject('register/daftarButton'), 0)

	}

	@Then("i will get error message that username password cant be empty")
	def iGetErrorMessageUsernamePasswordEmpty() {
		Mobile.verifyElementExist(findTestObject('register/namaKosong'), 0, FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('register/usernameKosong'), 0, FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('register/hpKosong'), 0, FailureHandling.STOP_ON_FAILURE)

		Mobile.closeApplication()
	}

	//tag3
	@When("i open the register page3")
	def iOpenRegisterPage3() {
		Mobile.tap(findTestObject('Onboarding/onboard_Daftar'), 0)

		Mobile.verifyElementExist(findTestObject('Onboarding/daftarText'), 0)
	}

	@And("fill different password and confirmation password to register")
	def iFillEmptyCredentials() {

		Mobile.tap(findTestObject('register/texfieldNamaLengkap'), 0)

		Mobile.setText(findTestObject('register/texfieldNamaLengkap'), 'Angeline', 0)

		Mobile.tap(findTestObject('register/textfieldUsername'), 0)

		Mobile.setText(findTestObject('register/textfieldUsername'), 'automation000', 0)

		Mobile.tap(findTestObject('register/textfieldNo'), 0)

		Mobile.setText(findTestObject('register/textfieldNo'), '0823713240003', 0)

		Mobile.tap(findTestObject('register/textfieldEmail'), 0)

		Mobile.setText(findTestObject('register/textfieldEmail'), 'automation000@gmail.com', 0)

		Mobile.tap(findTestObject('register/textfieldPassword'), 0)

		Mobile.setText(findTestObject('register/textfieldPassword'), 'alterra123', 0)

		Mobile.tap(findTestObject('register/textfieldConfirmPassword'), 0)

		Mobile.setText(findTestObject('register/textfieldConfirmPassword'), 'alterra321', 0)

		Mobile.pressBack()

		Mobile.tap(findTestObject('register/daftarButton'), 0)

	}

	@Then("i will get error message that password is not the same")
	def iGetErrorMessageUsernamePasswordWrong() {

		Mobile.verifyElementExist(findTestObject('register/passwordTidakSama'), 0, FailureHandling.STOP_ON_FAILURE)

		Mobile.closeApplication()
	}

	
}