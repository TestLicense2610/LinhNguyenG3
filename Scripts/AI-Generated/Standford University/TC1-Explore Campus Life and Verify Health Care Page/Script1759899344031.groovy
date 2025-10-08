import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Standford_University.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link campusLife -> Navigate to page '/campus-life'"

WebUI.enhancedClick(findTestObject('AI-Generated/Standford University/Page_home/link_campusLife'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link campusLife - Navigate to page campus-life.png')

"Step 3: Click on link healthCare -> Navigate to page '/health-care'"

WebUI.enhancedClick(findTestObject('AI-Generated/Standford University/Page_campus_life/link_healthCare'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link healthCare - Navigate to page health-care.png')

"Step 4: Click on link research -> Navigate to page '/research'"

WebUI.enhancedClick(findTestObject('AI-Generated/Standford University/Page_health_care/link_research'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on link research - Navigate to page research.png')

"Step 5: Click on link academics -> Navigate to page '/academics'"

WebUI.enhancedClick(findTestObject('AI-Generated/Standford University/Page_research/link_academics'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on link academics - Navigate to page academics.png')

"Step 6: Click on link admission -> Navigate to page '/admission'"

WebUI.enhancedClick(findTestObject('AI-Generated/Standford University/Page_academics/link_admission'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link admission - Navigate to page admission.png')

"Step 7: Click on link about -> Navigate to page '/about'"

WebUI.enhancedClick(findTestObject('AI-Generated/Standford University/Page_admission/link_about'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on link about - Navigate to page about.png')

"Step 8: Click on link news -> Navigate to page '/'"

WebUI.enhancedClick(findTestObject('AI-Generated/Standford University/Page_about/link_news'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link news - Navigate to page .png')

"Step 9: Click on link academics -> Navigate to page '/academics'"

WebUI.enhancedClick(findTestObject('AI-Generated/Standford University/Page_home/link_academics'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on link academics - Navigate to page academics.png')

"Step 10: Click on link research -> Navigate to page '/research'"

WebUI.enhancedClick(findTestObject('AI-Generated/Standford University/Page_academics/link_research'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on link research - Navigate to page research.png')

"Step 11: Click on link healthCare -> Navigate to page '/health-care'"

WebUI.enhancedClick(findTestObject('AI-Generated/Standford University/Page_research/link_healthCare'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on link healthCare - Navigate to page health-care.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Explore Campus Life and Verify Health Care Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}