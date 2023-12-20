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

Mobile.tap(findTestObject('Onboarding/onboard_Masuk'), 0)

Mobile.verifyElementExist(findTestObject('Onboarding/loginText'), 0)

Mobile.tap(findTestObject('Login/nameTextbox'), 0)

Mobile.setText(findTestObject('Login/nameTextbox'), 'angelinevalencia123', 0)

Mobile.tap(findTestObject('Login/passwordTextbox'), 0)

Mobile.setText(findTestObject('Login/passwordTextbox'), 'angeline89', 0)

Mobile.tap(findTestObject('Login/masukButton2'), 0)

Mobile.verifyElementExist(findTestObject('User Preferences/firstPageQuestion'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('User Preferences/isiPertanyaanButton'), 0)

Mobile.tap(findTestObject('User Preferences/wisataCard'), 0)

Mobile.tap(findTestObject('User Preferences/mulaiButton'), 0)

