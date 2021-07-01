package CustomBusinessApp.EIDP.Steps;

import CustomBusinessApp.EIDP.Util.CommonUtil;
import appsCommon.PageInitializer;
import cucumber.api.java.en.When;

public class CareerGoalAndActivitySteps extends PageInitializer{
	

	@When("User fills mandatory fields in career goals page")
	public void fillCareerGoal() throws Exception{
		careerGoalAndActiveStepImpl.fillCarrerGoalActivite();
	}
	
	@When("User fills mandatory fields in career goals page for renew idp")
	public void fillCareerGoalForRenewIdp() throws Exception{
		careerGoalAndActiveStepImpl.fillCarrerGoalActiviteForRenewIdp();
	}
	
	@When("User adds new career training activities")
	public void editTrainning() {
		careerGoalAndActiveStepImpl.markAllExistingCareerGoalsAsCompleted();
		CommonUtil.waitBrowser(3000);
		careerGoalAndActiveStepImpl.addNewCareerGoal();
		CommonUtil.waitBrowser(3000);
		careerGoalAndActiveStepImpl.clickOnSaveAndContinueButton();
		CommonUtil.waitBrowser(5000);
	}
}
