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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://jiffyinterntraineeweb.azurewebsites.net/#/Login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/tracker/participant filter/Page_Login/input_Username_email'), 'optisol.dwat@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/tracker/participant filter/Page_Login/input_Password_password'), 
    'MHSUC33hkPmEvh0ovFgCGQ==')

WebUI.click(findTestObject('Object Repository/tracker/participant filter/Page_Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/tracker/participant filter/Page_Dashboard/a_Onboarding'))

WebUI.click(findTestObject('Object Repository/tracker/participant filter/Page_Dashboard/a_Participants'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/tracker/participant filter/Page_/label_For Approval'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/tracker/participant filter/Page_/input_For Approval_196'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/tracker/participant filter/Page_/span_Rejected'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/tracker/participant filter/Page_/input_Rejected_200'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/tracker/participant filter/Page_/input_New_202'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/tracker/participant filter/Page_/input_Archived_204'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/tracker/participant filter/Page_/a_Dashboard'))

