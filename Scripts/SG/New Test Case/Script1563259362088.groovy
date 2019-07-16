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

WebUI.navigateToUrl('https://uniqlosguat4.specom.io/sg/store/')

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Mega Menu/Page_Home page  UNIQLO/span_WOMEN'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Home page  UNIQLO/a_flagship exclusive'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/New Folder/Page_FLAGSHIP EXCLUSIVE - Featured - MEN  UNIQLO/a_WOMEN'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/New Folder/Page_FLAGSHIP EXCLUSIVE - Featured - WOMEN  UNIQLO/a_UT Collection'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Graphic T-shirts For Women Men Kids and Babies  XS  3XL Online UNIQLO Singapore  UNIQLO/img'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Disney Magic For All  XS  XXL Online  UNIQLO Singapore  UNIQLO Singapore/img_Sale_lazy'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/New Folder/Page_BABIES TODDLER Mickey Blue Cropped Leggings - Bottoms - TODDLERS - BABIES  UNIQLO Singapore/span_Button Label'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/New Folder/Page_BABIES TODDLER Mickey Blue Cropped Leggings - Bottoms - TODDLERS - BABIES  UNIQLO Singapore/div_Maybe later'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/New Folder/Page_BABIES TODDLER Mickey Blue Cropped Leggings - Bottoms - TODDLERS - BABIES  UNIQLO Singapore/a_90cm'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/New Folder/Page_BABIES TODDLER Mickey Blue Cropped Leggings - Bottoms - TODDLERS - BABIES  UNIQLO Singapore/button_Add To Bag'))

