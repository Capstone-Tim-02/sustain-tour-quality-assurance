import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def appPath = 'C:\\Users\\Angelin\\Downloads\\app-release.apk'

Mobile.startApplication(appPath, false)

Mobile.tap(findTestObject('home/homeButton'), 0)

Mobile.tap(findTestObject('home/rekomWisataButton'), 0)

Mobile.verifyElementExist(findTestObject('home/explorePage'), 0)

Mobile.tap(findTestObject('rekomendasi_wisata/mojaCard'), 0)

Mobile.verifyElementExist(findTestObject('rekomendasi_wisata/mojaText'), 0)

Mobile.verifyElementExist(findTestObject('rekomendasi_wisata/detailWisataPage'), 0)

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

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

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('rekomendasi_wisata/beliButton'), 0)

Mobile.verifyElementExist(findTestObject('checkout/checkoutPage'), 0)

Mobile.tap(findTestObject('checkout/bookingSekarangButton'), 0)

Mobile.verifyElementExist(findTestObject('checkout/berhasilCheckout'), 0)

Mobile.tap(findTestObject('checkout/rincianTransaksiButton'), 0)

Mobile.verifyElementExist(findTestObject('detail transaksi/detailTransaksiPage'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

