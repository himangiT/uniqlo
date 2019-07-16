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

WebUI.openBrowser(toString())

WebUI.navigateToUrl('https://uniqlosguat4.specom.io/sg/store/')

WebUI.maximizeWindow()

WebUI.mouseOver(findTestObject('Mega Menu/Page_Home page  UNIQLO/span_WOMEN'))

WebUI.click(findTestObject('Object Repository/Add to Cart/Page_Home page  UNIQLO/a_uniqlo u'))

WebUI.delay(5)

not_run: WebUI.scrollToElement(findTestObject('Add to Cart/Page_Uniqlo U - COLLECTIONS - WOMEN  UNIQLO/span_Quick View'), 
    5)

not_run: WebUI.click(findTestObject('Object Repository/Add to Cart/Page_Uniqlo U - COLLECTIONS - WOMEN  UNIQLO/span_Quick View'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/Add to Cart/Page_Uniqlo U - COLLECTIONS - WOMEN  UNIQLO/em_L'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/Add to Cart/Page_Uniqlo U - COLLECTIONS - WOMEN  UNIQLO/span_ADD TO BAG'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/Add to Cart/Page_Uniqlo U - COLLECTIONS - WOMEN  UNIQLO/div_ACCESSORIES_quickview-close'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Add to Cart/Page_Uniqlo U - COLLECTIONS - WOMEN  UNIQLO/a_Quick View'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/Add to Cart/Page_WOMEN Uniqlo U Cotton Parka - Uniqlo U - COLLECTIONS - WOMEN  UNIQLO/img'))

WebUI.switchToWindowIndex('')

not_run: WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Add to Cart/Page_WOMEN Uniqlo U Cotton Parka - Uniqlo U - COLLECTIONS - WOMEN  UNIQLO/a_L'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Add to Cart/Page_WOMEN Uniqlo U Cotton Parka - Uniqlo U - COLLECTIONS - WOMEN  UNIQLO/span_Add To Bag'))

