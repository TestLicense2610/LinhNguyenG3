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

"Step 2: Click on link academics -> Navigate to page '/academics'"

WebUI.enhancedClick(findTestObject('AI-Generated/Standford University/Page_home/link_academics'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on link academics - Navigate to page academics.png')

"Step 3: Click on link research -> Navigate to page '/research'"

WebUI.enhancedClick(findTestObject('AI-Generated/Standford University/Page_academics/link_research'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link research - Navigate to page research.png')

"Step 4: Click on link healthCare -> Navigate to page '/health-care'"

WebUI.enhancedClick(findTestObject('AI-Generated/Standford University/Page_research/link_healthCare'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on link healthCare - Navigate to page health-care.png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Navigate through Academic and Research Breadcrumbs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}