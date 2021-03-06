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

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Page_ng nhp  Sch Mm/input_a ch email_useremail'), 'phivanminh10@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ng nhp  Sch Mm/input_Mt khu_userpassword'), 'MyLUJf0cJdyJRiA4DgiIRw==')

WebUI.click(findTestObject('Object Repository/Page_ng nhp  Sch Mm/input_Qun mt khu_commit'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Lp 12'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Hng dn n tp k thi THPT Quc gia nm hc 2016-2017 mn Ting Anh'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_Assignment'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input__btn btn-primary'))

// Để trống các tất cả các trường, Kiểm tra xem có hiện thông báo không được để trống textfield hay không

WebUI.verifyEqual(WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_This field can not be empty'), 30)
, true)

WebUI.closeBrowser()

