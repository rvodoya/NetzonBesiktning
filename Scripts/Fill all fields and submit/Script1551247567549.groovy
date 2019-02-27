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

WebUI.setText(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/input_Namn_ng-untouched ng-val (1) (1) (1) (1) (1) (1) (1) (1) (1)'), 
    'John Tra')

WebUI.setText(findTestObject('Besikning/Postut Textbox'), 'Volt a ')

WebUI.setText(findTestObject('Besikning/Postadress textbox'), '131')

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/i_keyboard_arrow_down (2) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/span_Pontus Asp (1) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Besikning/Besik Arrow down'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_16 (1) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.setText(findTestObject('Besikning/Bygg textbox'), 'Lorem ipsum dolor sit amet')

WebUI.setText(findTestObject('Besikning/Forsark Textbox'), 'Lorem ipsum dolor sit amet')

WebUI.setText(findTestObject('Besikning/Personnummer textbox'), '950721-0285')

WebUI.setText(findTestObject('Besikning/Besikning address'), 'Lorem ipsum dolor sit amet')

WebUI.setText(findTestObject('Besikning/Telefon textbox'), '0290-6894181')

WebUI.setText(findTestObject('Besikning/E-post textbox'), 'carina.aman@dodgit.com')

WebUI.click(findTestObject('Besikning/Beg Datum textbox'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_16 (1) (1) (1) (1) (1) (1) (1) (1)'))

WebUI.click(findTestObject('Besikning/Nasta Button'))

WebUI.click(findTestObject('Kok/Diskmaskin arrow down'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Okulrt besiktigat (1) (1) (1) (1) (1) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Kok/KylAndFrys'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Anmrkning1 (1) (1) (1) (1) (1) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Kok/Rorledningar arrowdown'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_tgrd rekommenderas (1) (1) (1) (1) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Kok/Vatensakrat'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Pgende skada. Erstts inte2 (1) (1) (1) (1) (1)'))

WebUI.setText(findTestObject('Kok/Anteckinar textbox'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit.')

WebUI.uploadFile(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/input_Ladda upp bild_file (1) (1) (1) (1)'), 
    'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\busan.jpg')

WebUI.delay(1)

WebUI.click(findTestObject('Kok/Nasta button2'))

WebUI.click(findTestObject('Vatrum1/Tatskikt golv'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Anmrkning1 (3) (1) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Vatrum1/Tatskikt Valg'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Ingen anmrkning (1) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Vatrum1/Golvbrunn'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Pgende skada. Erstts inte2 (2) (1) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Vatrum1/Rorledningar'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Anmrkning1 (3) (1) (1)'))

WebUI.setText(findTestObject('Vatrum1/Anteckningar textbox'), 'Lorem ipsum dolor sit amet')

WebUI.uploadFile(findTestObject('Vatrum1/LaddaUpBuild'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\rialto.jpg')

WebUI.click(findTestObject('Vatrum1/NastaBut'))

WebUI.click(findTestObject('Vatrum2/Tatkikt golv'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Anmrkning1 (4) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Vatrum2/Tatskikt Valg'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Okulrt besiktigat (3) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Vatrum2/Golvbrunn'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Pgende skada. Erstts inte2 (3) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Vatrum2/Rorledningar'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Anmrkning1 (4) (1)'))

WebUI.setText(findTestObject('Vatrum2/Anteckningar textbox'), 'Lorem ipsum dolor sit amet')

WebUI.uploadFile(findTestObject('Vatrum2/LaddaUpBuild'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\ayutthaya.jpg')

WebUI.click(findTestObject('Vatrum2/NastaBut'))

WebUI.click(findTestObject('Tvattstuga/Tatkikt golv'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Okulrt besiktigat (3) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Tvattstuga/Tatskikt Valg'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Anmrkning1 (4) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Tvattstuga/Golvbrunn'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Ingen anmrkning (1) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Tvattstuga/Rorledningar'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Okulrt besiktigat (3) (1)'))

WebUI.setText(findTestObject('Tvattstuga/Anteckningar textbox'), 'Lorem ipsum dolor sit amet')

WebUI.uploadFile(findTestObject('Tvattstuga/LaddaUpBuild'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\petra.jpg')

WebUI.click(findTestObject('Tvattstuga/NastaBut'))

WebUI.setText(findTestObject('Huvuduppvarmning/Modell'), 'Lorem ipsum dolor sit amet')

WebUI.click(findTestObject('Huvuduppvarmning/Varmeledningar'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_tgrd rekommenderas (2) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Huvuduppvarmning/Expansionskarl'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Ingen anmrkning (1) (1)'))

WebUI.setText(findTestObject('Huvuduppvarmning/Anteckningar textbox'), 'Lorem ipsum dolor sit amet')

WebUI.uploadFile(findTestObject('Huvuduppvarmning/LaddaUpBuild'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\junkertown.jpg')

WebUI.click(findTestObject('Huvuduppvarmning/NastaBut'))

WebUI.click(findTestObject('Ovrigt/Huvudavstngningsventil'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Anmrkning1 (4) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Ovrigt/Vaggvattenutkastare'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Okulrt besiktigat (3) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Ovrigt/VVB'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Anmrkning1 (4) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Ovrigt/Annat'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Ingen anmrkning (1) (1)'))

WebUI.setText(findTestObject('Ovrigt/Anteckningar textbox'), 'Lorem ipsum dolor sit amet')

WebUI.uploadFile(findTestObject('Ovrigt/LaddaUpBuild'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\busan.jpg')

WebUI.click(findTestObject('Ovrigt/NastaBut'))

WebUI.click(findTestObject('Sakerhet/barndvarnare'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Ja (1) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Sakerhet/brandslackare'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Nej (tgrd rekommenderas) (1) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Sakerhet/joldfresbytare'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Ja (1) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Sakerhet/villalarm'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Ja (1) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Sakerhet/laskrav'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Godknt (1) (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Sakerhet/vattenfelsbytare'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Nej (tgrd rekommenderas) (1) (1)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Sakerhet/Anteckningar textbox'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.uploadFile(findTestObject('Sakerhet/LaddaUpBuild'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\petra.jpg')

WebUI.click(findTestObject('Sakerhet/NastaBut'))

WebUI.click(findTestObject('Allmant/Husgrundstyp'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Suterrng (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Allmant/Husgrundens status'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Pgende skada. Erstts inte2 (3) (1)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Allmant/Anteckningar textbox'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.uploadFile(findTestObject('Allmant/LaddaUpBuild'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\busan.jpg')

WebUI.click(findTestObject('Allmant/NastaBut'))

WebUI.click(findTestObject('Lokala/Antal'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_3'))

WebUI.delay(1)

WebUI.click(findTestObject('Lokala/Utfors'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Vet ej'))

WebUI.delay(1)

WebUI.click(findTestObject('Lokala/Saker'))

WebUI.click(findTestObject('Object Repository/Page_Skadefrebyggande besiktningspr/div_Pltkrl med lock_1'))

WebUI.delay(1)

WebUI.setText(findTestObject('Lokala/Anteckningar textbox'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.uploadFile(findTestObject('Lokala/LaddaUpBuild'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\rialto.jpg')

WebUI.click(findTestObject('Lokala/NastaBut'))

WebUI.setText(findTestObject('Almanna/Almanna'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.delay(1)

WebUI.click(findTestObject('Besikning/Skicka in'))

WebUI.setText(findTestObject('Besikning/Ort och datum'), 'Lorem ipsum dolor sit amet')

WebUI.setText(findTestObject('Besikning/Namn Textbox'), 'Lorem ipsum dolor sit amet')

WebUI.click(findTestObject('Besikning/Skicka In Popup'))

WebUI.click(findTestObject('Tillbaka till start'))

WebUI.closeBrowser()

