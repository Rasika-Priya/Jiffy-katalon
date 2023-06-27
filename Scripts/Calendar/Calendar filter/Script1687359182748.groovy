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

WebUI.click(findTestObject('Object Repository/calendar filter/Page_Dashboard/a_My Calendar'))

WebUI.click(findTestObject('Object Repository/calendar filter/Page_/img'))

WebUI.selectOptionByValue(findTestObject('Object Repository/calendar filter/Page_/select_Month                               _d53c4c'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/calendar filter/Page_/select_Year                                _78bea1'), 
    '2023', true)

WebUI.click(findTestObject('Object Repository/calendar filter/Page_/a_Go'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/calendar filter/Page_/select_My Slots                            _49a2ff'), 
    'Other Staff Slots', true)

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/calendar filter/Page_/select_My Slots                            _49a2ff'), 
    'By Positions', true)

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/calendar filter/Page_/select_My Slots                            _49a2ff'), 
    'By Employers', true)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/calendar filter/Page_/img_1'))

WebUI.click(findTestObject('Object Repository/calendar filter/Page_/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/calendar filter/Page_Dashboard/a_My Calendar'))

