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



class rekomendasi_wisata {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("i have signed in to my account and i am on the Home Page")
	def iHaveSignIn5() {
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



	//tag7
	@When("i click Rekomendasi Wisata button7")
	def iClickRekomendasiWisataButton7() {
		Mobile.tap(findTestObject('home/rekomWisataButton'), 0)
	}

	@And("i redirect to the explore page7")
	def iRedirectToExplore7() {
		Mobile.verifyElementExist(findTestObject('home/explorePage'), 0)
	}

	@And("i click on of the wisata card7")
	def iClickWisataCrad7() {
		Mobile.tap(findTestObject('rekomendasi_wisata/mojaCard'), 0)
	}

	@And("i view detailed information of the choosed wisata7")
	def iViewWisataDetail7() {
		Mobile.verifyElementExist(findTestObject('rekomendasi_wisata/mojaText'), 0)

		Mobile.verifyElementExist(findTestObject('rekomendasi_wisata/detailWisataPage'), 0)

	}

	@And("i click button to select days to book ticket")
	def iSelectDays() {

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

		Mobile.tap(findTestObject('rekomendasi_wisata/day2'), 0)

		Mobile.tap(findTestObject('rekomendasi_wisata/day1'), 0)

		Mobile.tap(findTestObject('rekomendasi_wisata/day3'), 0)
	}

	@Then("i can select days to book ticket")
	def iCanClickAllDaysButton() {
		Mobile.verifyElementExist(findTestObject('rekomendasi_wisata/day3'), 0)

		Mobile.tap(findTestObject('rekomendasi_wisata/backFromDetail'), 0)
		//perlu back
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
	@When("i click Rekomendasi Wisata button8")
	def iClickRekomendasiWisataButton8() {
		Mobile.tap(findTestObject('home/rekomWisataButton'), 0)
	}

	@And("i redirect to the explore page8")
	def iRedirectToExplore8() {
		Mobile.verifyElementExist(findTestObject('home/explorePage'), 0)
	}

	@And("i click on of the wisata card8")
	def iClickWisataCrad8() {
		Mobile.tap(findTestObject('rekomendasi_wisata/mojaCard'), 0)
	}

	@And("i view detailed information of the choosed wisata8")
	def iViewWisataDetail8() {
		Mobile.verifyElementExist(findTestObject('rekomendasi_wisata/mojaText'), 0)

		Mobile.verifyElementExist(findTestObject('rekomendasi_wisata/detailWisataPage'), 0)

	}

	@And("i can select days to book a ticket2")
	def iSelectDaysToBookTicket() {

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

		Mobile.tap(findTestObject('rekomendasi_wisata/day1'), 0)
	}

	@And("click beli / checkout button")
	def iClickBeliButton() {
		Mobile.tap(findTestObject('rekomendasi_wisata/beliButton'), 0)
	}

	@Then("i can redirect to checkout page")
	def iRedirectToCheckoutPage() {
		Mobile.verifyElementExist(findTestObject('checkout/checkoutPage'), 0)

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

	//tag9
	@When("i click Rekomendasi Wisata button9")
	def iClickRekomendasiWisataButton9() {
		Mobile.tap(findTestObject('home/rekomWisataButton'), 0)
	}

	@And("i redirect to the explore page9")
	def iRedirectToExplore9() {
		Mobile.verifyElementExist(findTestObject('home/explorePage'), 0)
	}

	@And("i click the search textbox")
	def iClickTextbox9() {
		Mobile.tap(findTestObject('rekomendasi_wisata/searchTextbox'), 0)
	}


	@And("i click back button9")
	def iClickBackFromRekomendasiWisataPage() {

		Mobile.tap(findTestObject('rekomendasi_wisata/backFromSearch'), 0)
	}

	@Then("i will redirect to explore page")
	def iRedirectBackToHomePage5() {
		Mobile.verifyElementExist(findTestObject('home/explorePage'), 0)

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


	//tag 1
	@When("i click Rekomendasi Wisata button")
	def iClickRekomendasiWisataButton() {
		Mobile.tap(findTestObject('home/rekomWisataButton'), 0)
	}

	@And("i redirect to the explore page")
	def iRedirectToExplore() {
		Mobile.verifyElementExist(findTestObject('home/explorePage'), 0)
	}

	@And("i click search textbox")
	def iClickSearchTextbox() {
		Mobile.tap(findTestObject('rekomendasi_wisata/searchTextbox'), 0)
	}

	@And("fill the search textbox")
	def iFillSearchTextbox() {
		Mobile.setText(findTestObject('rekomendasi_wisata/searchTextbox'), 'museum' + '\\n', 0)
	}

	@Then("i will view the search result")
	def iViewSearchResult() {
		Mobile.verifyElementExist(findTestObject('rekomendasi_wisata/mojaCard'), 0)
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
	@When("i click Rekomendasi Wisata button2")
	def iClickRekomendasiWisataButton2() {
		Mobile.tap(findTestObject('home/rekomWisataButton'), 0)
	}

	@And("i redirect to the explore page2")
	def iRedirectToExplore2() {
		Mobile.verifyElementExist(findTestObject('home/explorePage'), 0)
	}

	@And("i click lokasi button")
	def iClickLokasiButton() {
		Mobile.tap(findTestObject('rekomendasi_wisata/lokasiButton'), 0)
	}

	@And("choose wisata lokasi")
	def iChooseLokasi() {
		Mobile.tap(findTestObject('rekomendasi_wisata/jakartaButton'), 0)
		Mobile.tap(findTestObject('rekomendasi_wisata/simpanButton'), 0)
	}

	@Then("i will view the filtered result based on the selected lokasi")
	def iViewFilteredResultBasedOnSelectedLokasi() {
		Mobile.verifyElementExist(findTestObject('rekomendasi_wisata/mojaCard'), 0)

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
	@When("i click Rekomendasi Wisata button3")
	def iClickRekomendasiWisataButton3() {
		Mobile.tap(findTestObject('home/rekomWisataButton'), 0)
	}

	@And("i redirect to the explore page3")
	def iRedirectToExplore3() {
		Mobile.verifyElementExist(findTestObject('home/explorePage'), 0)
	}

	@And("i click the pills tab option")
	def iClickPillsTabButton() {
		Mobile.tap(findTestObject('rekomendasi_wisata/latestTabPills'), 0)

	}

	@Then("i will view the filtered result based on the selected pills tab")
	def iViewFilteredResultBasedOnSelectedPillsTab() {
		Mobile.verifyElementExist(findTestObject('rekomendasi_wisata/latestTabPillsResult'), 0)

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
	@When("i click Rekomendasi Wisata button4")
	def iClickRekomendasiWisataButton4() {
		Mobile.tap(findTestObject('home/rekomWisataButton'), 0)
	}

	@And("i redirect to the explore page4")
	def iRedirectToExplore4() {
		Mobile.verifyElementExist(findTestObject('home/explorePage'), 0)
	}

	@And("i click multiple pills tab option")
	def iClickMultiplePillsTabButton() {
		Mobile.tap(findTestObject('rekomendasi_wisata/latestTabPills'), 0)
		Mobile.tap(findTestObject('rekomendasi_wisata/latestTabPills2'), 0)

	}

	@Then("i will view the filtered result based on the selected pills tabs")
	def iViewFilteredResultBasedOnSelectedPillsTabs() {
		Mobile.verifyElementExist(findTestObject('rekomendasi_wisata/latestTabPillsResult'), 0)

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
	@When("i click Rekomendasi Wisata button5")
	def iClickRekomendasiWisataButton5() {
		Mobile.tap(findTestObject('home/rekomWisataButton'), 0)
	}

	@And("i redirect to the explore page5")
	def iRedirectToExplore5() {
		Mobile.verifyElementExist(findTestObject('home/explorePage'), 0)
	}

	@And("i click on of the wisata card5")
	def iClickWisataCrad5() {
		Mobile.tap(findTestObject('rekomendasi_wisata/mojaCard'), 0)
	}

	@Then("i will view detailed information of the choosed wisata")
	def iViewWisataDetail() {
		Mobile.verifyElementExist(findTestObject('rekomendasi_wisata/detailWisataText'), 0)

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

	//tag6
	@When("i click Rekomendasi Wisata button6")
	def iClickRekomendasiWisataButton6() {
		Mobile.tap(findTestObject('home/rekomWisataButton'), 0)
	}

	@And("i redirect to the explore page6")
	def iRedirectToExplore6() {
		Mobile.verifyElementExist(findTestObject('home/explorePage'), 0)
	}

	@And("i click on of the wisata card6")
	def iClickWisataCrad6() {
		Mobile.tap(findTestObject('rekomendasi_wisata/mojaCard'), 0)
	}

	@And("i view detailed information of the choosed wisata6")
	def iViewWisataDetail6() {
		Mobile.verifyElementExist(findTestObject('rekomendasi_wisata/mojaText'), 0)

		Mobile.verifyElementExist(findTestObject('rekomendasi_wisata/detailWisataPage'), 0)

	}

	@And("i click carbon emission button")
	def iClickCarbonEmission() {
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


		Mobile.tap(findTestObject('rekomendasi_wisata/emisiKarbonButton'), 0)

	}

	@Then("i will view a new tab about carbon wisata")
	def iViewCarbonWisataDetail() {
		Mobile.verifyElementExist(findTestObject('rekomendasi_wisata/emisiKarbonPage'), 0)

		Mobile.pressBack()

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


}