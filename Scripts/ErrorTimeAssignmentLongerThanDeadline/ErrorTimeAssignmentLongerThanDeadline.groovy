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

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_ng nhp (4)'))

WebUI.setText(findTestObject('Page_ng nhp  Sch Mm/input_a ch email_useremail (3)'), 'phivanminh10@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_ng nhp  Sch Mm/input_Mt khu_userpassword (3)'), 'MyLUJf0cJdyJRiA4DgiIRw==')

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/input_Qun mt khu_commit (3)'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Lp 12 (4)'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Hng dn n tp k thi THPT Quc gia nm hc 2016-2017 mn Ting Anh (4)'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_Assignment (4)'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Chn lp hc_ng-input (2)'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_Lp chng mnh (2)'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Chn nhm_ng-input (2)'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_GO (Lp chng mnh)'))

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Thi gian lm bi (pht)_form-control ng-untouched ng-valid ng-dirty (1)'), 
    '60')

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_S ln lm li_form-control ng-untouched ng-valid ng-dirty (2)'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Deadline exercise_form-control text-center bs-timepicker-field'), 
    '19')

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input__form-control text-center bs-timepicker-field'), 
    '30')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input__btn btn-primary (2)'))

// Kiểm tra xem có hiện thông báo thời gian làm bài dài hơn khoảng thời gian từ bắt đầu làm bài đến deadline hay không

WebUI.verifyEqual(WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Thi gian lm bi qu ln'), 30), true)

WebUI.closeBrowser()

