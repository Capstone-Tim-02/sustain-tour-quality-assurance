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



class transaksi_dipesan {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("i have signed in to my account to view my ongoing transaction")
	def signInAndViewOngoingTransaction() {
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

	//tag1

	@When("i click ticket button110")
	def iClickTicketButton110() {
		Mobile.tap(findTestObject('home/ticketButton'), 0)

	}

	@And("i click Dipesan tab110")
	def iClickDipesanTab110() {
		Mobile.tap(findTestObject('transaksi - dipesan/tabDipesan'), 0)
	}

	@And("i click one of the ordered ticket110")
	def iClickOrderedTickets110() {
		
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
		int endY = device_Height * 0.50

		'Swipe Vertical from top to bottom'
		Mobile.swipe(startX, endY, endX, startY)

		Mobile.tap(findTestObject('transaksi - dipesan/latestDipesanCard'), 0)
	}

	@Then("i will view detail of the Transaction110")
	def iViewDetailTransaction110() {
		Mobile.verifyElementExist(findTestObject('transaksi - dipesan/invoicePage'), 0)

		Mobile.tap(findTestObject('transaksi - dipesan/backToDIpesan'), 0)

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
	@When("i click ticket button112")
	def iClickTicketButton112() {
		Mobile.tap(findTestObject('home/ticketButton'), 0)

	}

	@And("i click Dipesan tab112")
	def iClickDipesanTab112() {
		Mobile.tap(findTestObject('transaksi - dipesan/tabDipesan'), 0)
	}

	@And("i click one of the ordered ticket112")
	def iClickOrderedTickets112() {
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
		int endY = device_Height * 0.50

		'Swipe Vertical from top to bottom'
		Mobile.swipe(startX, endY, endX, startY)
		
		Mobile.tap(findTestObject('transaksi - dipesan/latestDipesanCard'), 0)
	}

	@And("i click Batalkan Pesanan button112")
	def iClickBatalkanPesanan112() {
		Mobile.tap(findTestObject('transaksi - dipesan/batalkanButton'), 0)
	}

	@And("i click batal112")
	def iClickBatal112() {
		Mobile.tap(findTestObject('transaksi - dipesan/tidakBatalButton'), 0)
	}

	@Then("i will cancel to cancel my order")
	def iCancelBatal112() {
		Mobile.verifyElementExist(findTestObject('transaksi - dipesan/invoicePage'), 0)

		Mobile.tap(findTestObject('transaksi - dipesan/backToDIpesan'), 0)

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
	@When("i click ticket button111")
	def iClickTicketButton111() {
		Mobile.tap(findTestObject('home/ticketButton'), 0)

	}

	@And("i click Dipesan tab111")
	def iClickDipesanTab111() {
		Mobile.tap(findTestObject('transaksi - dipesan/tabDipesan'), 0)
	}

	@And("i click one of the ordered ticket111")
	def iClickOrderedTickets111() {
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
		int endY = device_Height * 0.50

		'Swipe Vertical from top to bottom'
		Mobile.swipe(startX, endY, endX, startY)
		
		Mobile.tap(findTestObject('transaksi - dipesan/latestDipesanCard2'), 0)
	}

	@Then("i click Batalkan Pesanan button")
	def iClickBatalkanPesananButton() {
		Mobile.tap(findTestObject('transaksi - dipesan/batalkanButton'), 0)
		Mobile.tap(findTestObject('transaksi - dipesan/iyaBatalButton'), 0)

	}

	@And("i will cancel my order")
	def iCancelMyOdrer111() {
		Mobile.verifyElementExist(findTestObject('transaksi - riwayat/tabRiwayat'), 0)

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
	@When("i click ticket button113")
	def iClickTicketButton113() {
		Mobile.tap(findTestObject('home/ticketButton'), 0)

	}

	@And("i click Dipesan tab113")
	def iClickDipesanTab113() {
		Mobile.tap(findTestObject('transaksi - dipesan/tabDipesan'), 0)
	}

	@And("i click one of the ordered ticket113")
	def iClickOrderedTickets113() {
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
		int endY = device_Height * 0.50

		'Swipe Vertical from top to bottom'
		Mobile.swipe(startX, endY, endX, startY)
		
		Mobile.tap(findTestObject('transaksi - dipesan/latestDipesanCard'), 0)
	}

	@And("i click Tukar pada kasir button")
	def tukarPadaKasirButton() {
		Mobile.tap(findTestObject('transaksi - dipesan/tukarkanButton'), 0)
	}

	@Then("i will view a tab showing payment tutorial")
	def paymentTutorialTab() {
		Mobile.verifyElementExist(findTestObject('transaksi - dipesan/kasirTab'), 0)

		Mobile.pressBack()

		Mobile.tap(findTestObject('transaksi - dipesan/backToDIpesan'), 0)

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

	//tag5
	@When("i click ticket button115")
	def iClickTicketButton115() {
		Mobile.tap(findTestObject('home/ticketButton'), 0)

	}

	@And("i click Dipesan tab115")
	def iClickDipesanTab115() {
		Mobile.tap(findTestObject('transaksi - dipesan/tabDipesan'), 0)
	}

	@And("i click one of the ordered ticket115")
	def iClickOrderedTickets115() {
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
		int endY = device_Height * 0.50

		'Swipe Vertical from top to bottom'
		Mobile.swipe(startX, endY, endX, startY)
		
		Mobile.tap(findTestObject('transaksi - dipesan/latestDipesanCard'), 0)
		Mobile.verifyElementExist(findTestObject('transaksi - dipesan/invoicePage'), 0)
	}

	@And("i click back button115")
	def clickBack115() {
		Mobile.tap(findTestObject('transaksi - dipesan/backToDIpesan'), 0)
	}

	@Then("i will redirect back to ticket page115")
	def redirectBack115() {

		Mobile.verifyElementExist(findTestObject('transaksi - riwayat/tabRiwayat'), 0)

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