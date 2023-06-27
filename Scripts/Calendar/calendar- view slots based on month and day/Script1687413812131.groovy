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

WebUI.setText(findTestObject('Object Repository/calendar view/Page_Login/input_Username_email'), 'optisol.dwat@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/calendar view/Page_Login/input_Password_password'), 'MHSUC33hkPmEvh0ovFgCGQ==')

WebUI.click(findTestObject('Object Repository/calendar view/Page_Login/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/calendar view/Page_Dashboard/a_My Calendar'))

WebUI.waitForElementVisible(findTestObject('Object Repository/calendar view/Page_/img_1'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/calendar view/Page_/img'), 0)

WebUI.click(findTestObject('Object Repository/calendar view/Page_/img'))

WebUI.selectOptionByValue(findTestObject('Object Repository/calendar view/Page_/select_Month                               _d53c4c'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/calendar view/Page_/select_Month                               _d53c4c'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/calendar view/Page_/select_Year                                _78bea1'), 
    '2023', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/calendar view/Page_/select_Year                                _78bea1'), 
    '2023', true)

WebUI.click(findTestObject('Object Repository/calendar view/Page_/a_Go'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/calendar view/Page_/div_Clear'))

WebUI.click(findTestObject('Object Repository/calendar view/Page_/img_1'))

WebUI.takeScreenshot()

