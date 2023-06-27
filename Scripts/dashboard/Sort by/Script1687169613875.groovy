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

WebUI.waitForElementVisible(findTestObject('Object Repository/sort by and filter/Page_Dashboard/button_Sort By'), 0)

WebUI.click(findTestObject('Object Repository/sort by and filter/Page_Dashboard/button_Sort By'))

WebUI.getText(findTestObject('sort by and filter/Page_Dashboard/sort by dropdown'))

WebUI.click(findTestObject('Object Repository/sort by and filter/Page_Dashboard/a_Latest To Oldest'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/sort by and filter/Page_Dashboard/i_Latest To Oldest_fa fa-caret-down m-l-10'))

WebUI.click(findTestObject('Object Repository/sort by and filter/Page_Dashboard/a_Oldest To Latest'))

WebUI.takeScreenshot()

