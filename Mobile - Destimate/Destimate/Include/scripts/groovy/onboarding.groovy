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



class onboarding {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("i have opened the Destimate application")
	def iOpenTheApplication() {
		def appPath = 'C:\\Users\\Angelin\\Downloads\\app-release.apk'
		Mobile.startApplication(appPath, false)
	}



	@When("I slide the slider")
	def iSlideTheSlider() {
		Mobile.tap(findTestObject('Onboarding/pageToSwipe'), 0)

		Mobile.swipe(200, 300, 400, 600)

		Mobile.swipe(200, 300, 200, 300)
	}

	@Then("I verify that slider can redirect to another slides")
	def icanRedirectToOtherSlide() {
		Mobile.verifyElementExist(findTestObject('Onboarding/afterSwipe'), 0)

		Mobile.closeApplication()
	}

	@When("I click the Login button")
	def iClickLogin() {
		Mobile.tap(findTestObject('Onboarding/onboard_Masuk'), 0)
	}

	@Then("I verify that i am on the login page")
	def iAmOnTheLoginPage() {
		Mobile.verifyElementExist(findTestObject('Onboarding/loginText'), 0)

		Mobile.closeApplication()
	}

	@When("I click the Daftar button")
	def iClickRegister() {
		Mobile.tap(findTestObject('Onboarding/onboard_Daftar'), 0)
	}

	@Then("I verify that i am on the daftar page")
	def iAmOnTheRegisterPage() {
		Mobile.verifyElementExist(findTestObject('Onboarding/daftarText'), 0)

		Mobile.closeApplication()
	}
}