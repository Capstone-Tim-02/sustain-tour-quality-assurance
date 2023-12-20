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

Mobile.tap(findTestObject('Onboarding/onboard_Daftar'), 0)

Mobile.verifyElementExist(findTestObject('Onboarding/daftarText'), 0)

Mobile.tap(findTestObject('register/texfieldNamaLengkap'), 0)

Mobile.setText(findTestObject('register/texfieldNamaLengkap'), 'Angeline', 0)

Mobile.tap(findTestObject('register/textfieldUsername'), 0)

Mobile.setText(findTestObject('register/textfieldUsername'), 'angeline123', 0)

Mobile.tap(findTestObject('register/textfieldNo'), 0)

Mobile.setText(findTestObject('register/textfieldNo'), '0823713242', 0)

Mobile.tap(findTestObject('register/textfieldEmail'), 0)

Mobile.setText(findTestObject('register/textfieldEmail'), 'angeline.v21@gmail.com', 0)

Mobile.tap(findTestObject('register/textfieldPassword'), 0)

Mobile.setText(findTestObject('register/textfieldPassword'), 'alterra123', 0)

Mobile.tap(findTestObject('register/textfieldConfirmPassword'), 0)

Mobile.setText(findTestObject('register/textfieldConfirmPassword'), 'alterra123', 0)

Mobile.tap(findTestObject('register/daftarButton'), 0)

Mobile.verifyElementExist(findTestObject('register/berhasilTab'), 0, FailureHandling.STOP_ON_FAILURE)

