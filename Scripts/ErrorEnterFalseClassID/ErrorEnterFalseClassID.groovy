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

WebUI.navigateToUrl('https://hoclieu.sachmem.vn/folder/0')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_ng nhp (6)'))

WebUI.setText(findTestObject('Page_ng nhp  Sch Mm/input_a ch email_useremail (5)'), 'phivanminh7@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_ng nhp  Sch Mm/input_Mt khu_userpassword (5)'), '3+lYVVTSLh6WINX1sduPvw==')

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/input_Qun mt khu_commit (5)'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_My class (3)'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Join class (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Code_form-control ng-untouched ng-dirty ng-valid'), 
    'abcd')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Code_btn btn-primary (1)'))

// Kiểm tra xem khi nhập mã lớp có hiện thông báo mã lớp sai không

WebUI.verifyEqual(WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_M tham gia khng ng'), 30), true)

WebUI.closeBrowser()

