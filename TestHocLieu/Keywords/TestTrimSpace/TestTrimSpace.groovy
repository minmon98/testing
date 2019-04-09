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

WebUI.setText(findTestObject('Page_ng nhp  Sch Mm/input_a ch email_useremail'), 'phivanminh7@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_ng nhp  Sch Mm/input_Mt khu_userpassword'), '3+lYVVTSLh6WINX1sduPvw==')

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/input_Qun mt khu_commit'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_My class'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Lp chng mnh'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Messager'))

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/textarea_s              s_message_content'), '   hello hi    ')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/i_Gi_fa fa-paper-plane'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_hello hi                                              1 minute ago'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_hello hi'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/blockquote_hello hi                                              1 minute ago'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_hello hi'))

WebUI.closeBrowser()

