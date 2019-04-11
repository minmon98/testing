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

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_ng nhp (2)'))

WebUI.setText(findTestObject('Page_ng nhp  Sch Mm/input_a ch email_useremail (1)'), 'phivanminh10@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_ng nhp  Sch Mm/input_Mt khu_userpassword (1)'), 'MyLUJf0cJdyJRiA4DgiIRw==')

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/input_Qun mt khu_commit (1)'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Lp 12 (2)'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Hng dn n tp k thi THPT Quc gia nm hc 2016-2017 mn Ting Anh (2)'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_Assignment (2)'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_From date'))

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_From date_form-control ng-untouched ng-pristine ng-valid'), 
    'abc')

WebUI.sendKeys(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_From date_form-control ng-untouched ng-pristine ng-valid'), 
    Keys.chord(Keys.ENTER))

// Kiểm tra sau khi nhập sai định dạng ngày tháng bắt đầu làm bài, có hiện text 'Invalid date' không

WebUI.verifyElementText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_From date'), 'Invalid date')

WebUI.closeBrowser()

