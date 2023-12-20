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



class faq {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("i have signed in to my account and i am on the Profile Page to access FAQ Page")
	def iWantToAccessFAQPage() {
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
//	
//	//tag5
//	@When("i click Virtual Assistent5")
//	def iClickVA5() {
//		Mobile.tap(findTestObject('faq/vaButton'), 0)
//	}
//
//	@And("i send a question5")
//	def iSendQuestion5() {
//		Mobile.tap(findTestObject('faq/vaSearchTextbox'), 0)
//
//		Mobile.setText(findTestObject('faq/vaSearchTextbox'), 'rekomendasi wisata di bandung', 0)
//
//		Mobile.tap(findTestObject('faq/vaSendQuestion'), 0, FailureHandling.STOP_ON_FAILURE)
//
//	}
//	
//	@And("receive answer5")
//	def receiveAnswer5() {
//		Mobile.waitForElementPresent(findTestObject('faq/vaAnswerBox'), 0, FailureHandling.STOP_ON_FAILURE)
//	}
//	
//	@And("click OK button")
//	def clickOK() {
//		//end session with VA
//		'Get Device Height and Store in device_height variable'
//		int device_Height = Mobile.getDeviceHeight()
//
//		'Get Width Height and Store in device_Width variable'
//		int device_Width = Mobile.getDeviceWidth()
//
//		'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
//		int startX = device_Width / 2
//
//		'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
//		int endX = startX
//
//		'Storing the startY value'
//		int startY = device_Height * 0.30
//
//		'Storing the endY value'
//		int endY = device_Height * 0.70
//
//		'Swipe Vertical from top to bottom'
//		Mobile.swipe(startX, endY, endX, startY)
//
//		Mobile.tap(findTestObject('faq/okeVAButton'), 0)
//
//		Mobile.tap(findTestObject('faq/faqBackButton'), 0)
//
//	}
//
//	@Then("i will end session with VA")
//	def iEndSession5() {
//
//		
//		Mobile.tap(findTestObject('faq/faqBackButton'), 0)
//		
//		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
//		
//		//logout
//		Mobile.tap(findTestObject('home/profileButton'), 0)
//		
//		'Swipe Vertical from top to bottom'
//		Mobile.swipe(startX, endY, endX, startY)
//
//		Mobile.tap(findTestObject('logout/logoutButton'), 0)
//
//		Mobile.tap(findTestObject('logout/iyaLogout'), 0)
//
//		Mobile.closeApplication()
//	}
	
	
	
	

	
	
	//tag1

	@When("i click FAQ")
	def iClickFAQ() {
		Mobile.tap(findTestObject('faq/pusatBantuanButton'), 0)

		Mobile.tap(findTestObject('faq/faqButton'), 0)

		Mobile.tap(findTestObject('faq/faqSearchTextbox'), 0)
	}

	@And("fill search textbox")
	def iFillSearchTextbox() {
		Mobile.setText(findTestObject('faq/faqSearchTextbox'), 'bagaimana', 0)
	}

	@Then("i will receive FAQ result based on my search")
	def iReceiveFAQResult() {
		Mobile.verifyElementExist(findTestObject('faq/faqCard'), 0)

		Mobile.tap(findTestObject('faq/faqBackButton'), 0)

		Mobile.tap(findTestObject('faq/faqBackButton'), 0)

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
	@When("i click FAQ2")
	def iClickFAQ2() {
		Mobile.tap(findTestObject('faq/pusatBantuanButton'), 0)

		Mobile.tap(findTestObject('faq/faqButton'), 0)
	}


	@And("i click the FAQ card")
	def iClickTheFAQ() {
		Mobile.tap(findTestObject('faq/faqCard'), 0)

	}

	@Then("i will view details of teh FAQ")
	def IwillViewFAQDetails() {

		Mobile.verifyElementExist(findTestObject('faq/faqTextPage'), 0)

		Mobile.tap(findTestObject('faq/faqBackButton'), 0)

		Mobile.tap(findTestObject('faq/faqBackButton'), 0)

		Mobile.tap(findTestObject('faq/faqBackButton'), 0)
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
	@When("i click Virtual Assistent")
	def iClickVA() {
		Mobile.tap(findTestObject('faq/vaButton'), 0)
	}

	@And("i send a question")
	def iSendQuestion() {
		Mobile.tap(findTestObject('faq/vaSearchTextbox'), 0)

		Mobile.setText(findTestObject('faq/vaSearchTextbox'), 'rekomendasi wisata di bandung', 0)

		Mobile.tap(findTestObject('faq/vaSendQuestion'), 0, FailureHandling.STOP_ON_FAILURE)

	}

	@Then("i will receive answer")
	def iReceiveAnswer() {

		Mobile.waitForElementPresent(findTestObject('faq/vaAnswerBox'), 0, FailureHandling.STOP_ON_FAILURE)

		//end session with VA
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

		Mobile.tap(findTestObject('faq/okeVAButton'), 0)

		Mobile.tap(findTestObject('faq/faqBackButton'), 0)

		//logout
		Mobile.tap(findTestObject('home/profileButton'), 0)

		'Swipe Vertical from top to bottom'
		Mobile.swipe(startX, endY, endX, startY)

		Mobile.tap(findTestObject('logout/logoutButton'), 0)

		Mobile.tap(findTestObject('logout/iyaLogout'), 0)

		Mobile.closeApplication()
	}

	//tag4
	@When("i click Virtual Assistent2")
	def iClickVA2() {
		Mobile.tap(findTestObject('faq/vaButton'), 0)
	}

	@And("i send a empty question")
	def iSendEmptyQuestion() {
		Mobile.tap(findTestObject('faq/vaSearchTextbox'), 0)

		Mobile.setText(findTestObject('faq/vaSearchTextbox'), '', 0)

		Mobile.tap(findTestObject('faq/vaSendQuestion'), 0, FailureHandling.STOP_ON_FAILURE)

	}
	
	@Then("i will receive error message that question is empty")
	def iReceiveErrorEmptyQuestion() {

		Mobile.waitForElementPresent(findTestObject('faq/invalidVAQuestion'), 0, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('faq/faqBackButton'), 0)
		
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		//logout
		Mobile.tap(findTestObject('home/profileButton'), 0)

		'Get Device Height and Store in device_height variable'
		int device_Height = Mobile.getDeviceHeight()

		'Get Width Height and Store in device_Width variable'
		int device_Width = Mobile.getDeviceWidth()

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
	
	
	
	
	//tag6
	@When("i am on the FAQ page")
	def iAmOnTheFAQPage() {
		Mobile.tap(findTestObject('faq/pusatBantuanButton'), 0)

		Mobile.tap(findTestObject('faq/faqButton'), 0)
	}

	@And("i click back button from FAQ")
	def iClickBackFromFAQ() {
		Mobile.tap(findTestObject('faq/faqBackButton'), 0)
		Mobile.tap(findTestObject('faq/faqBackButton'), 0)
	}

	@Then("i will redirect back to profile")
	def iRedirectToProfileFromFAQ() {
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
	
	//tag7
	@When("i am on the VA page")
	def iAmOnTheVAPage() {
		Mobile.tap(findTestObject('faq/vaButton'), 0)
	}

	@And("i click back button from VA")
	def iClickBackFromVA() {
		Mobile.tap(findTestObject('faq/faqBackButton'), 0)
	}

	@Then("i will redirect back to profile2")
	def iRedirectToProfileFromVA() {
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
	
	//tag8
	@When("i click Virtual Assistent8")
	def iClickVA8() {
		Mobile.tap(findTestObject('faq/vaButton'), 0)
	}

	@And("i send a question besides wisata recommendation")
	def iSendWrongQuestion() {
		Mobile.tap(findTestObject('faq/vaSearchTextbox'), 0)

		Mobile.setText(findTestObject('faq/vaSearchTextbox'), 'bagaimana cara memesan tiket dengan pembayaran mbanking', 0)

		Mobile.tap(findTestObject('faq/vaSendQuestion'), 0, FailureHandling.STOP_ON_FAILURE)

	}

	@Then("i will get error message that question must be about wisata recommendation")
	def iReceiveErrorWrongQuestion() {

		Mobile.waitForElementPresent(findTestObject('faq/invalidVAQuestion'), 0, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('faq/faqBackButton'), 0)
		
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
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