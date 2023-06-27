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

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/care desk/ticket validation/Page_Dashboard/a_Care Desk'))

WebUI.click(findTestObject('Object Repository/care desk/ticket validation/Page_MyDiary/a_Raise Ticket'))

WebUI.selectOptionByValue(findTestObject('Object Repository/care desk/ticket validation/Page_RaiseTicket/select_--Select an option--                _c26f14'), 
    'Critical', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/care desk/ticket validation/Page_RaiseTicket/select_--Select an option--                _c26f14_1'), 
    'High', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/care desk/ticket validation/Page_RaiseTicket/select_--Select an option--                _16ff32'), 
    '22', true)

WebUI.click(findTestObject('Object Repository/care desk/ticket validation/Page_RaiseTicket/a_Add'))

WebUI.verifyElementVisible(findTestObject('Object Repository/care desk/ticket validation/Page_RaiseTicket/span_This field is required'))

WebUI.click(findTestObject('Object Repository/care desk/ticket validation/Page_RaiseTicket/em__fa fa-calendar'))

WebUI.click(findTestObject('Object Repository/care desk/ticket validation/Page_RaiseTicket/button_Today'))

WebUI.verifyElementVisible(findTestObject('Object Repository/care desk/ticket validation/Page_RaiseTicket/span_This field is required'))

WebUI.verifyElementVisible(findTestObject('Object Repository/care desk/ticket validation/Page_RaiseTicket/span_This field is required'))

WebUI.click(findTestObject('Object Repository/care desk/ticket validation/Page_RaiseTicket/button_Add'))

WebUI.click(findTestObject('Object Repository/care desk/ticket validation/Page_RaiseTicket/a_Add'))

WebUI.verifyElementVisible(findTestObject('Object Repository/care desk/ticket validation/Page_RaiseTicket/span_This field is required'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/care desk/ticket validation/Page_RaiseTicket/a_Cancel'))

WebUI.closeBrowser()

