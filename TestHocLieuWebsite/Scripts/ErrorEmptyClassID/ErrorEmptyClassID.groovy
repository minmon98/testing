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

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_ng nhp (5)'))

WebUI.setText(findTestObject('Page_ng nhp  Sch Mm/input_a ch email_useremail (4)'), 'phivanminh7@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_ng nhp  Sch Mm/input_Mt khu_userpassword (4)'), '3+lYVVTSLh6WINX1sduPvw==')

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/input_Qun mt khu_commit (4)'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_My class (2)'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Join class'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Code_btn btn-primary'))

// Kiểm tra xem để trống mã lớp học khi muốn tham gia lớp học, có hiện thông báo không được để trống mã lớp hay không

WebUI.verifyEqual(WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_This field can not be empty (1)'), 30), true)

WebUI.closeBrowser()

