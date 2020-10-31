package appsCommon;

import ServiceNow.CHARMS.NativeView.Pages.CHARMSNativeViewPage;
import ServiceNow.CHARMS.Pages.CHARMSHomePage;
import ServiceNow.CHARMS.Pages.ClinicalGeneticsBranchPage;
import ServiceNow.CHARMS.Pages.OKTAloginPage;
import ServiceNow.CHARMS.Pages.ProbandScreenerPage;
import ServiceNow.CHARMS.Steps.ProbandScreenerSubmissionSteps;
import ServiceNow.CHARMS.StepsImplementation.CHARMSHomePageImp;
import ServiceNow.CHARMS.StepsImplementation.ProbandScreenerSubmissionImpl;
import ServiceNow.CHARMS.StepsImplementation.TestAccountResetImpl;
import ServiceNow.COVIDCode.Pages.COVIDCodeLoginPage;
import ServiceNow.COVIDCode.Pages.EnrollmentQuestionnairePage;
import ServiceNow.COVIDCode.Pages.FollowUpFormPage;
import ServiceNow.COVIDCode.Pages.NativeViewEnrollmentViewPage;
import ServiceNow.COVIDCode.Pages.NativeViewEnrollmentsPage;
import ServiceNow.COVIDCode.Pages.ServicePortalSurveyPage;
import ServiceNow.COVIDCode.Pages.SignOutVerificationPage;
import ServiceNow.COVIDCode.StepsImplementation.ServicePortalEQPageImpl;
import ServiceNow.COVIDCode.StepsImplementation.COVIDCodeLoginStepsImpl;
import ServiceNow.COVIDCode.StepsImplementation.FollowUpFormPageImpl;
import ServiceNow.COVIDDash.NativeView.Pages.NativeViewDashboardPage;
import ServiceNow.COVIDDash.Pages.COVIDHomePage;
import ServiceNow.COVIDDash.Pages.SubmissionsPage;
import ServiceNow.COVIDDash.StepsImplementation.COVIDHomePageImpl;
import ServiceNow.DevOpsAutomatedBuilds.Pages.DevOpsLoginPage;
import ServiceNow.DevOpsAutomatedBuilds.Pages.DevOpsNativeViewPage;
import ServiceNow.DevOpsAutomatedBuilds.StepsImplementation.DevOpsAutomatedBuildStepsImplementation;

/**
 * This an initializer class which will initialize all pages classes. Once pages
 * class created, create an object of it here inside the constructor
 */
public class PageInitializer {

	// declare protected static variables of types of all the pages
	/** iTrust instances */
	protected static ITrustLoginPage iTrustloginPage;
	protected static ITrustLoginPageImpl loginImpl;

	/** COVID19 Dashboard instances */
	protected static COVIDHomePage covidHomePage;
	protected static SubmissionsPage submissionPage;
	protected static NativeViewDashboardPage nativeViewDashPage;
	protected static COVIDHomePageImpl covidHomePageImpl;

	/** COVIDcode instances */
	protected static COVIDCodeLoginPage covidCodeLoginPage;
	protected static EnrollmentQuestionnairePage covidCodeEQPage;
	protected static ServicePortalEQPageImpl covidCodeEQPageImpl;
	protected static NativeViewEnrollmentsPage nativeViewEnrollementsPage;
	protected static NativeViewEnrollmentViewPage nativeViewEnrollmentViewPage;
	protected static FollowUpFormPage followUpFormPage;
	protected static FollowUpFormPageImpl followUpFormPageImpl;
	protected static COVIDCodeLoginStepsImpl covidCodeLoginStepsImpl;
	protected static ServicePortalSurveyPage servicePortalSurveyPage;
	protected static SignOutVerificationPage signOutVerificationPage;

	/** Native View instance */
	protected static NativeViewLoginImpl nativeViewLoginImpl;
	protected static NativeViewHomePage nativeViewHomePage;

	/** CHARMS instances */
	protected static CHARMSNativeViewPage charmsNativeViewPage;
	protected static TestAccountResetImpl testAccountResetImpl;
	protected static CHARMSHomePage charmsHomePage;
	protected static OKTAloginPage oktaLoginPage;
	protected static CHARMSHomePageImp charmsHomePageImpl;
	protected static ClinicalGeneticsBranchPage clinicalGeneticsBranchPage;
	protected static ProbandScreenerPage probandScreenerPage;
	protected static ProbandScreenerSubmissionImpl probandScreenerSubmissionImpl;

	/** ServiceNow DevOps instances */
	protected static DevOpsLoginPage devOpsLoginPage;
	protected static DevOpsNativeViewPage devOpsNativeViewPage;
	protected static DevOpsAutomatedBuildStepsImplementation devOpsAutomatedBuildStepsImplementation;

	public static void initializeAllPages() {
		// create instances of all pages and assign them to the variables
		iTrustloginPage = new ITrustLoginPage();
		loginImpl = new ITrustLoginPageImpl();
		covidHomePage = new COVIDHomePage();
		submissionPage = new SubmissionsPage();
		nativeViewDashPage = new NativeViewDashboardPage();
		covidHomePageImpl = new COVIDHomePageImpl();
		covidCodeEQPage = new EnrollmentQuestionnairePage();
		covidCodeEQPageImpl = new ServicePortalEQPageImpl();
		covidCodeLoginPage = new COVIDCodeLoginPage();
		signOutVerificationPage = new SignOutVerificationPage();
		nativeViewEnrollementsPage = new NativeViewEnrollmentsPage();
		nativeViewEnrollmentViewPage = new NativeViewEnrollmentViewPage();
		followUpFormPage = new FollowUpFormPage();
		followUpFormPageImpl = new FollowUpFormPageImpl();
		covidCodeLoginStepsImpl = new COVIDCodeLoginStepsImpl();
		nativeViewLoginImpl = new NativeViewLoginImpl();
		nativeViewHomePage = new NativeViewHomePage();
		charmsNativeViewPage = new CHARMSNativeViewPage();
		testAccountResetImpl = new TestAccountResetImpl();
		servicePortalSurveyPage = new ServicePortalSurveyPage();
		charmsHomePage = new CHARMSHomePage();
		oktaLoginPage = new OKTAloginPage();
		charmsHomePageImpl = new CHARMSHomePageImp();
		clinicalGeneticsBranchPage = new ClinicalGeneticsBranchPage();
		probandScreenerPage = new ProbandScreenerPage();
		probandScreenerSubmissionImpl = new ProbandScreenerSubmissionImpl();
		devOpsLoginPage = new DevOpsLoginPage();
		devOpsNativeViewPage = new DevOpsNativeViewPage();
		devOpsAutomatedBuildStepsImplementation = new DevOpsAutomatedBuildStepsImplementation();
	}

}
