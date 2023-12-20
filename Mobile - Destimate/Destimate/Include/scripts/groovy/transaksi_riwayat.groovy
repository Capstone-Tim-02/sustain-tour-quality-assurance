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



class transaksi_riwayat {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("i have signed in to my account to view my transaction history")
	def iSignInAndViewTransactionHistory() {
		def appPath = 'C:\\Users\\Angelin\\Downloads\\app-release.apk'

		Mobile.startApplication(appPath, false)

		Mobile.tap(findTestObject('Onboarding/onboard_Masuk'), 0)

		Mobile.verifyElementExist(findTestObject('Onboarding/loginText'), 0)

		Mobile.tap(findTestObject('Login/nameTextbox'), 0)

		Mobile.setText(findTestObject('Login/nameTextbox'), 'angelinevalencia123', 0)

		Mobile.tap(findTestObject('Login/passwordTextbox'), 0)

		Mobile.setText(findTestObject('Login/passwordTextbox'), 'angeline89', 0)

		Mobile.tap(findTestObject('Login/masukButton2'), 0)
	}

	@When("i click ticket button71")
	def iClickTicket71() {
		Mobile.tap(findTestObject('home/homeButton'), 0)

		Mobile.tap(findTestObject('home/ticketButton'), 0)
	}

	@And("i click Riwayat tab71")
	def iClickRiwayatTab71() {
		Mobile.tap(findTestObject('transaksi - riwayat/tabRiwayat'), 0)
	}

	@And("i click one of the ordered ticket71")
	def iClickOrderedTicket71() {
		Mobile.tap(findTestObject('transaksi - riwayat/cardRiwayat'), 0)
	}

	@Then("i will view detail of the Transaction71")
	def iViewDetailTransaction71() {
		Mobile.verifyElementExist(findTestObject('transaksi - dipesan/invoicePage'), 0)

		Mobile.tap(findTestObject('transaksi - riwayat/backButton'), 0)

		//logout
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
	@When("i click ticket button75")
	def iClickTicket75() {
		Mobile.tap(findTestObject('home/homeButton'), 0)

		Mobile.tap(findTestObject('home/ticketButton'), 0)
	}

	@And("i click Riwayat tab75")
	def iClickRiwayatTab75() {
		Mobile.tap(findTestObject('transaksi - riwayat/tabRiwayat'), 0)
	}

	@And("i click one of the ordered ticket75")
	def iClickOrderedTicket75() {
		Mobile.tap(findTestObject('transaksi - riwayat/cardRiwayat'), 0)
	}

	@And("i view detail of the Transaction75")
	def iViewDetailTransaction75() {
		Mobile.verifyElementExist(findTestObject('transaksi - dipesan/invoicePage'), 0)
	}

	@And("i click back button from ticket history")
	def iClickBack75() {
		Mobile.tap(findTestObject('transaksi - riwayat/backButton'), 0)
	}

	@Then("i will redirect back to the ticket page")
	def iRedirectToHome75() {

		Mobile.verifyElementExist(findTestObject('transaksi - riwayat/tabRiwayat'), 0)
		//logout
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