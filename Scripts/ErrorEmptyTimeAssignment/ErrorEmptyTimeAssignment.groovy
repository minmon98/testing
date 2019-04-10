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

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/a_ng nhp (3)'))

WebUI.setText(findTestObject('Page_ng nhp  Sch Mm/input_a ch email_useremail (2)'), 'phivanminh10@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_ng nhp  Sch Mm/input_Mt khu_userpassword (2)'), 'MyLUJf0cJdyJRiA4DgiIRw==')

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/input_Qun mt khu_commit (2)'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/a_Lp 12 (3)'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/a_Hng dn n tp k thi THPT Quc gia nm hc 2016-2017 mn Ting Anh (3)'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/span_Assignment (3)'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/div_Chn lp hc_ng-input (1)'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/span_Lp chng mnh (1)'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/div_Chn nhm_ng-input (1)'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/span_GO (Lp chng mnh) (1)'))

WebUI.setText(findTestObject('Page_Hc liu - Sch Mm/input_S ln lm li_form-control ng-untouched ng-valid ng-dirty (1)'), '7')

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/input__btn btn-primary (1)'))

// Kiểm tra xem khi bỏ trống trường thời gian làm bài có thông báo giao bài thành công hay không

WebUI.verifyEqual(WebUI.verifyElementPresent(findTestObject('Page_Hc liu - Sch Mm/div_Giao bi tp thnh cng (1)'), 30), false)

WebUI.closeBrowser()

