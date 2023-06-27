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

WebUI.click(findTestObject('Object Repository/calendar/calendar validation/Page_/a_Add new slot'))

WebUI.click(findTestObject('Object Repository/calendar/calendar validation/Page_/a_Save'))

WebUI.waitForElementVisible(findTestObject('Object Repository/calendar/calendar validation/Page_/span_Required'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/calendar/calendar validation/Page_/span_Required'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/calendar/calendar validation/Page_/span_Required'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/calendar/calendar validation/Page_/a_Cancel'))

WebUI.click(findTestObject('Object Repository/calendar/calendar validation/Page_/i_Add new slot_fa fa-plus'))

WebUI.click(findTestObject('Object Repository/calendar/calendar validation/Page_/button__btn btn-default'))

WebUI.click(findTestObject('Object Repository/calendar/calendar validation/Page_/button_Today'))

WebUI.selectOptionByValue(findTestObject('Object Repository/calendar/calendar validation/Page_/select_--Select an option--                _6eeeee'), 
    '90', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/calendar/calendar validation/Page_/select_Time                                _48fbf9'), 
    '04:00', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/calendar/calendar validation/Page_/select_Option                              _264d98'), 
    'pm', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/calendar/calendar validation/Page_/select_Time                                _48fbf9_1'), 
    '05:00', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/calendar/calendar validation/Page_/select_Option                              _264d98_1'), 
    'pm', true)

WebUI.verifyTextPresent('Time limit not correct', false)

WebUI.takeScreenshot()

WebUI.click(findTestObject('calendar/calendar validation/Page_/a_Cancel'))

WebUI.closeBrowser()

