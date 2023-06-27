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

WebUI.enableSmartWait()

WebUI.waitForElementVisible(findTestObject('sort by and filter/Page_Dashboard/button_Filter By'), 5)

WebUI.click(findTestObject('Object Repository/sort by and filter/Page_Dashboard/button_Filter By'))

WebUI.getText(findTestObject('sort by and filter/Page_Dashboard/filter drop down'))

WebUI.click(findTestObject('Object Repository/sort by and filter/Page_Dashboard/a_PartnerOnboarding'))

WebUI.verifyTextPresent('Partner Onboarding', false)

WebUI.verifyElementText(findTestObject('Object Repository/sort by and filter/Page_Dashboard/button_Partner Onboarding'), 
    'Partner Onboarding')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/sort by and filter/Page_Dashboard/button_Partner Onboarding'))

WebUI.click(findTestObject('Object Repository/sort by and filter/Page_Dashboard/a_ParticipantOnboarding'))

WebUI.verifyTextPresent('Participant Onboarding', false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/sort by and filter/Page_Dashboard/button_Participant Onboarding'))

WebUI.click(findTestObject('Object Repository/sort by and filter/Page_Dashboard/a_EmployerOnboarding'))

WebUI.verifyTextPresent('Employer Onboarding', false)

WebUI.verifyElementText(findTestObject('Object Repository/sort by and filter/Page_Dashboard/button_Employer Onboarding'), 
    'Employer Onboarding')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/sort by and filter/Page_Dashboard/button_Employer Onboarding'))

WebUI.click(findTestObject('Object Repository/sort by and filter/Page_Dashboard/a_Placement'))

WebUI.verifyTextPresent('Placement', false)

WebUI.verifyElementText(findTestObject('Object Repository/sort by and filter/Page_Dashboard/button_Placement'), 'Placement')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/sort by and filter/Page_Dashboard/button_Placement'))

WebUI.click(findTestObject('Object Repository/sort by and filter/Page_Dashboard/a_PostPlacement'))

WebUI.verifyTextPresent('PostPlacement', false)

WebUI.verifyElementText(findTestObject('Object Repository/sort by and filter/Page_Dashboard/button_PostPlacement'), 'PostPlacement')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/sort by and filter/Page_Dashboard/a_View All Tasks'))

WebUI.getText(findTestObject('sort by and filter/Page_Dashboard/Page_Dashboard/h3_Welcome Here is your task list                            06192023  403 PM'))

WebUI.takeScreenshot(null)

WebUI.closeBrowser()

