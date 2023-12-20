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



class checkout {

	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("i have signed in to my account and checkout wisata ticket")
	def iSignInAndCheckoutWisaraTicket() {
		def appPath = 'C:\\Users\\Angelin\\Downloads\\app-release.apk'

		Mobile.startApplication(appPath, false)

		Mobile.tap(findTestObject('Onboarding/onboard_Masuk'), 0)

		Mobile.verifyElementExist(findTestObject('Onboarding/loginText'), 0)

		Mobile.tap(findTestObject('Login/nameTextbox'), 0)

		Mobile.setText(findTestObject('Login/nameTextbox'), 'angelinevalencia123', 0)

		Mobile.tap(findTestObject('Login/passwordTextbox'), 0)

		Mobile.setText(findTestObject('Login/passwordTextbox'), 'angeline89', 0)

		Mobile.tap(findTestObject('Login/masukButton2'), 0)

		Mobile.tap(findTestObject('home/exploreButton'), 0)

		Mobile.tap(findTestObject('rekomendasi_wisata/mojaCard'), 0)

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
		int endY = device_Height * 0.90

		'Swipe Vertical from top to bottom'
		Mobile.swipe(startX, endY, endX, startY)

		Mobile.swipe(startX, endY, endX, startY)

		Mobile.tap(findTestObject('rekomendasi_wisata/beliButton'), 0)

		Mobile.verifyElementExist(findTestObject('checkout/checkoutPage'), 0)
	}



	//tag3
	@When("i click the - stepper button")
	def iClickMinButton() {
		Mobile.tap(findTestObject('checkout/stepperMinButton'), 0)

	}

	@Then("my ticket amount will decrease by 1")
	def ticketDecreaseBy1() {
		Mobile.verifyElementExist(findTestObject('checkout/qty1'), 0)

		Mobile.tap(findTestObject('checkout/backButton'), 0)

		Mobile.tap(findTestObject('rekomendasi_wisata/backFromDetail'), 0)


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
		int endY = device_Height * 0.90

		'Swipe Vertical from top to bottom'
		Mobile.swipe(startX, endY, endX, startY)

		Mobile.tap(findTestObject('logout/logoutButton'), 0)

		Mobile.tap(findTestObject('logout/iyaLogout'), 0)

		Mobile.closeApplication()

	}


	//tag4
	@When("my ticket mount is 1")
	def whenMyTicketIs1() {
		Mobile.verifyElementExist(findTestObject('checkout/qty1'), 0)

	}

	@And("i click the - stepper button2")
	def iClickMinButton2() {
		Mobile.tap(findTestObject('checkout/stepperMinButton'), 0)

		Mobile.verifyElementExist(findTestObject('checkout/qty1'), 0)
	}

	@Then("my ticket will still be 1")
	def ticketWillStillBe1() {
		Mobile.verifyElementExist(findTestObject('checkout/qty1'), 0)

		Mobile.tap(findTestObject('checkout/backButton'), 0)

		Mobile.tap(findTestObject('rekomendasi_wisata/backFromDetail'), 0)


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

	//tag1

	@When("i click back button from checkout page")
	def iClickBackFromCheckoutPage() {
		Mobile.tap(findTestObject('checkout/backButton'), 0)
	}

	@Then("i will redirect back to wisata detail5")
	def iRedirectBackToHomeFromCheckout() {
		Mobile.tap(findTestObject('rekomendasi_wisata/backFromDetail'), 0)
		Mobile.tap(findTestObject('home/profileButton'), 0)

		//logout
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
	@When("i click the + stepper button")
	def iClickPlusButton() {
		Mobile.tap(findTestObject('checkout/stepperAddButton'), 0)

	}

	@Then("my ticket amount will increase by 1")
	def ticketIncreaseBy1() {
		Mobile.verifyElementExist(findTestObject('checkout/qty2'), 0)

		Mobile.tap(findTestObject('checkout/backButton'), 0)

		Mobile.tap(findTestObject('rekomendasi_wisata/backFromDetail'), 0)


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
	@When("i click promo button62")
	def iClickPromo62() {
		Mobile.tap(findTestObject('checkout/gunakanPromoButton'), 0)
	}

	@Then("get all promo code information")
	def iGetAllPromoInformation() {
		Mobile.verifyElementExist(findTestObject('checkout/pilihPromoPage'), 0)


		Mobile.tap(findTestObject('checkout/pilihPromoBack'), 0)
		Mobile.tap(findTestObject('checkout/backButton'), 0)
		Mobile.tap(findTestObject('rekomendasi_wisata/backFromDetail'), 0)


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
		int endY = device_Height * 0.90

		'Swipe Vertical from top to bottom'
		Mobile.swipe(startX, endY, endX, startY)

		Mobile.tap(findTestObject('logout/logoutButton'), 0)

		Mobile.tap(findTestObject('logout/iyaLogout'), 0)

		Mobile.closeApplication()

	}

	//tag6
	@When("i click use point button")
	def iClickUsePoint() {
		Mobile.tap(findTestObject('checkout/gunakanPoinButton'), 0)
	}


	@Then("i will get discount by using my point")
	def iWillGetDiscount() {
		//		Mobile.verifyElementExist(findTestObject('checkout/destiPointText'), 0)
		//
		//
		Mobile.tap(findTestObject('checkout/backButton'), 0)
		Mobile.tap(findTestObject('rekomendasi_wisata/backFromDetail'), 0)


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


	//tag7
	@When("i click book now button")
	def iClickBookNowInCheckoutPage() {
		Mobile.tap(findTestObject('checkout/bookingSekarangButton'), 0)
	}


	@Then("i will get success order message")
	def getSuccessOrderMessage() {
		Mobile.verifyElementExist(findTestObject('checkout/berhasilCheckout'), 0)

		Mobile.tap(findTestObject('checkout/suksesCheckoutBack'), 0)



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




