import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://staging.besiktningsprotokoll.netzon.se/#/checklist')

WebUI.setText(findTestObject('Page_Skadefrebyggande besiktningspr/input_Namn_ng-untouched ng-val (1)'), 'John Tra')

WebUI.setText(findTestObject('Postut Textbox'), 'Volt a ')

WebUI.setText(findTestObject('Postadress textbox'), '131')

WebUI.click(findTestObject('Page_Skadefrebyggande besiktningspr/i_keyboard_arrow_down'))

WebUI.click(findTestObject('Page_Skadefrebyggande besiktningspr/span_Pontus Asp'))

WebUI.delay(2)

WebUI.click(findTestObject('Besik Arrow down'))

WebUI.click(findTestObject('Page_Skadefrebyggande besiktningspr/div_16'))

WebUI.setText(findTestObject('Object Repository/Bygg textbox'), 'Lorem ipsum dolor sit amet')

WebUI.setText(findTestObject('Forsark Textbox'), 'Lorem ipsum dolor sit amet')

WebUI.setText(findTestObject('Object Repository/Personnummer textbox'), '950721-0285')

WebUI.setText(findTestObject('Besikning address'), 'Lorem ipsum dolor sit amet')

WebUI.setText(findTestObject('Telefon textbox'), '0290-6894181')

WebUI.setText(findTestObject('E-post textbox'), 'carina.aman@dodgit.com')

WebUI.click(findTestObject('Beg Datum textbox'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Skadefrebyggande besiktningspr/div_16'))

WebUI.click(findTestObject('Nasta Button'))

WebUI.click(findTestObject('Skicka in'))

WebUI.setText(findTestObject('Ort och datum'), 'Lorem ipsum dolor sit amet')

WebUI.setText(findTestObject('Namn Textbox'), 'Lorem ipsum dolor sit amet')

WebUI.click(findTestObject('Skicka In Popup'))

WebUI.closeBrowser()
