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

WebUI.setText(findTestObject('Object Repository/reminder/Page_Login/input_Username_email'), 'optisol.dwat@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/reminder/Page_Login/input_Password_password'), 'MHSUC33hkPmEvh0ovFgCGQ==')

WebUI.click(findTestObject('Object Repository/reminder/Page_Login/button_Sign in'))

WebUI.waitForElementPresent(findTestObject('Object Repository/reminder/Page_Dashboard/span_Optisol Admin'), 0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('reminder/Page_Dashboard/button_Add Reminder'))

WebUI.setText(findTestObject('Object Repository/reminder/Page_Dashboard/input_Add Reminder_Title'), 'Weekly meeting')

WebUI.click(findTestObject('Object Repository/reminder/Page_Dashboard/em_Add Reminder_fa fa-calendar'))

WebUI.click(findTestObject('Object Repository/reminder/Page_Dashboard/button_Today'))

WebUI.setText(findTestObject('Object Repository/reminder/Page_Dashboard/textarea_Add Reminder_Notes'), 'Weekly review meeting with staffs')

WebUI.click(findTestObject('Object Repository/reminder/Page_Dashboard/button_Add'))

WebUI.takeFullPageScreenshot()

