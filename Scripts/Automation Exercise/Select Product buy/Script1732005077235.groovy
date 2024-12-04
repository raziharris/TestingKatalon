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
import java.util.Random as Random

String screenshotBasePath = "C:\\Katalon Studio\\ParaBank Testing\\Checkpoints\\Screenshot"

int SSC = 1

WebUI.openBrowser('https://automationexercise.com/login')

String screenshotPath1 = screenshotBasePath + "_" + SSC + ".png"
WebUI.sendKeys(findTestObject('Relogin/Keys_Email'), findTestData('New Test Data').getValue(1, 1))
WebUI.sendKeys(findTestObject('Relogin/Keys_Password'), 'Testing123')
WebUI.takeScreenshot(screenshotPath1)

SSC++

String screenshotPath2 = screenshotBasePath + "_" + SSC + ".png"
WebUI.click(findTestObject('Relogin/Button_Login'))
WebUI.takeScreenshot(screenshotPath2)






