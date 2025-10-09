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

"Step 2: Click on link moreAboutStanford -> Navigate to page '/about'"

WebUI.enhancedClick(findTestObject('AI-Generated/Standford University/Page_home/link_moreAboutStanford'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on link moreAboutStanford - Navigate to page about.png')

"Step 3: Click on link learnMoreAboutAcademics -> Navigate to page '/academics'"

WebUI.enhancedClick(findTestObject('AI-Generated/Standford University/Page_about/link_learnMoreAboutAcademics'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link learnMoreAboutAcademics - Navigate to page academics.png')

"Step 4: Click on h1 object"

WebUI.enhancedClick(findTestObject('AI-Generated/Standford University/Page_academics/h1_object'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on h1 object.png')

"Step 5: Click on link facultyAndStaff -> Navigate to page '/faculty-staff-gateway'"

WebUI.enhancedClick(findTestObject('AI-Generated/Standford University/Page_academics/link_facultyAndStaff'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link facultyAndStaff - Navigate to page faculty-staff-gateway.png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Access Faculty and Staff Information through Breadcrumbs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}