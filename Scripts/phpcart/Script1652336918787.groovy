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

WebUI.navigateToUrl('https://phptravels.org/login')

WebUI.setText(findTestObject('Object Repository/Page_Login - PHPTRAVELS/input_Email Address_username'), 'parthivajay.vt@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - PHPTRAVELS/input_Forgot_password'), '3j/CWUQj8dO81Ra7+ucQLQ==')

WebUI.click(findTestObject('Object Repository/Page_Login - PHPTRAVELS/div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/Page_Client Area - PHPTRAVELS/a_fsdaaf dsfasf                            _c42f7f'))

WebUI.click(findTestObject('Object Repository/Page_Client Area - PHPTRAVELS/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_Login - PHPTRAVELS/span_View Cart'))

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart - PHPTRAVELS/div_0.00 USD'))

