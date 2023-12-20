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



class tnc {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("i have signed in to my account and i am on the Profile Page to access Terms & Condition")
	def iWantToAccessTNCPage() {
		def appPath = 'C:\\Users\\Angelin\\Downloads\\app-release.apk'

		Mobile.startApplication(appPath, false)

		Mobile.tap(findTestObject('Onboarding/onboard_Masuk'), 0)

		Mobile.verifyElementExist(findTestObject('Onboarding/loginText'), 0)

		Mobile.tap(findTestObject('Login/nameTextbox'), 0)

		Mobile.setText(findTestObject('Login/nameTextbox'), 'angelinevalencia123', 0)

		Mobile.tap(findTestObject('Login/passwordTextbox'), 0)

		Mobile.setText(findTestObject('Login/passwordTextbox'), 'angeline89', 0)

		Mobile.tap(findTestObject('Login/masukButton2'), 0)

		Mobile.tap(findTestObject('home/profileButton'), 0)
	}

	@When("I click Terms and condition button")
	def iClickTNC() {
		Mobile.tap(findTestObject('tnc/tncButton'), 0)

		Mobile.tap(findTestObject('tnc/snkButton'), 0)

		Mobile.verifyElementExist(findTestObject('tnc/snkPage'), 0)
	}

	@Then("I can redirect to terms and condition page")
	def iRedirectToTnc() {
		Mobile.tap(findTestObject('tnc/backButton'), 0)

		Mobile.tap(findTestObject('tnc/backButton'), 0)

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

		Mobile.closeApplication()

	}



	//tag2
	@When("i click perjanjian pengguna button")
	def iClicKPerjanjianPengguna() {
		Mobile.tap(findTestObject('tnc/tncButton'), 0)

		Mobile.tap(findTestObject('tnc/perjanjianButton'), 0)

	}

	@Then("i will redirect to perjanjian pengguna page")
	def iRedirectToPerjanjianPengguna() {

		Mobile.verifyElementExist(findTestObject('tnc/perjanjianPage'), 0)

		Mobile.tap(findTestObject('tnc/backButton'), 0)

		Mobile.tap(findTestObject('tnc/backButton'), 0)

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

		Mobile.closeApplication()

	}

	//tag3
	@When("i click kebijakan privasi button")
	def iClickKebijakanPrivasi() {
		Mobile.tap(findTestObject('tnc/tncButton'), 0)

		Mobile.tap(findTestObject('tnc/kebijakanButton'), 0)

	}

	@Then("i will redirect to kebijakan privasi page")
	def iRedirectToKebijakanPrivasi() {

		Mobile.verifyElementExist(findTestObject('tnc/kebijakanPage'), 0)

		Mobile.tap(findTestObject('tnc/backButton'), 0)

		Mobile.tap(findTestObject('tnc/backButton'), 0)

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

		Mobile.closeApplication()

	}

	//tag4
	@When("I click back button from TNC page")
	def iClickBackFromTNC() {
		Mobile.tap(findTestObject('tnc/tncButton'), 0)

	}

	@Then("i will redirect to profile page2")
	def iRedirectToProfileFromTNC() {
		Mobile.tap(findTestObject('tnc/backButton'), 0)

		Mobile.verifyElementExist(findTestObject('home/profilePage'), 0)
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

		Mobile.closeApplication()

	}

}