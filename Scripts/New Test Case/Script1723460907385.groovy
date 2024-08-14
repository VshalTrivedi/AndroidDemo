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

// Path to your mobile application (.apk or .ipa file)
Mobile.startApplication('D:\\Katalon Studio\\AndroidDemo\\Resources\\General-Store.apk', true)

Mobile.setText(findTestObject('EnterName'), 'Viranga', 10)

Mobile.tap(findTestObject('android.widget.Button - Lets  Shop'), 10)

Mobile.tap(findTestObject('android.widget.TextView - ADD TO CART'), 10)

Mobile.scrollToText('Jordan 6 Rings', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.ImageButton'), 10)

Mobile.tap(findTestObject('android.widget.CheckBox - Send me e-mails on discounts related to selected products in future'), 
    10)

Mobile.tap(findTestObject('android.widget.Button - Visit to the website to complete purchase'), 10)

