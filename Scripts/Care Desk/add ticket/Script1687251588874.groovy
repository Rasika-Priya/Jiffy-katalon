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

WebUI.setText(findTestObject('login invalid/Page_Login/input_Username_email'), 'optisol.dwat@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login/input_Password_password'), 'MHSUC33hkPmEvh0ovFgCGQ==')

WebUI.click(findTestObject('login invalid/Page_Login/button_Sign in'))

WebUI.waitForElementPresent(findTestObject('Page_Dashboard/span_Optisol Admin'), 0)

WebUI.enableSmartWait()

WebUI.click(findTestObject('care desk/Page_Dashboard/a_Care Desk'))

WebUI.click(findTestObject('Object Repository/care desk/raise ticket/Page_MyDiary/a_Raise Ticket'))

WebUI.selectOptionByValue(findTestObject('Object Repository/care desk/raise ticket/Page_RaiseTicket/select_--Select an option--                _2ebbc3'), 
    '1391', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/care desk/raise ticket/Page_RaiseTicket/select_--Select an option--                _7cd62c'), 
    'Working Condition', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/care desk/raise ticket/Page_RaiseTicket/select_--Select an option--                _c26f14'), 
    'Normal', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/care desk/raise ticket/Page_RaiseTicket/select_--Select an option--                _c26f14_1'), 
    'High', true)

WebUI.setText(findTestObject('Object Repository/care desk/raise ticket/Page_RaiseTicket/textarea__Description'), 'Work is provided more than 8 hrs')

WebUI.selectOptionByValue(findTestObject('Object Repository/care desk/raise ticket/Page_RaiseTicket/select_--Select an option--                _16ff32'), 
    '1332', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/care desk/raise ticket/Page_RaiseTicket/select_--Select an option--                _16ff32'), 
    '22', true)

WebUI.click(findTestObject('Object Repository/care desk/raise ticket/Page_RaiseTicket/em__fa fa-calendar'))

WebUI.click(findTestObject('Object Repository/care desk/raise ticket/Page_RaiseTicket/button_Today'))

WebUI.click(findTestObject('Object Repository/care desk/raise ticket/Page_RaiseTicket/a_Add'))

WebUI.waitForElementVisible(findTestObject('Object Repository/care desk/raise ticket/Page_MyDiary/span_Saved Successfully'), 
    0)

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Object Repository/care desk/raise ticket/Page_MyDiary/span_Working Condition'), 
    0)

WebUI.waitForElementVisible(findTestObject('Object Repository/care desk/raise ticket/Page_MyDiary/span_Vinolin Smith'), 
    0)

WebUI.takeScreenshot()

WebUI.closeBrowser()

