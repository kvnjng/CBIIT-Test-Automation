package ServiceNow.COVIDCode.Steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.COVIDCode.Pages.ServicePortalQuestionnairePage;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FollowUpFormSteps extends PageInitializer {

	@Given("a COVIDCode user is on the Follow Up Form to update an existing enrollment")
	public void a_COVIDCode_user_is_on_the_Follow_Up_Form_to_update_an_existing_enrollment() throws TestingException {
		followUpFormPageImpl.accessingFollowUpForm();
	}
	@Then("the user is able to search an existing enrollment by patient ID OR last name OR first name OR NIH Medical Record Number")
	public void the_user_is_able_to_search_an_existing_enrollment_by_patient_ID_OR_last_name_OR_first_name_OR_NIH_Medical_Record_Number() {
		followUpFormPageImpl.searchEnrollmentByPatientIDLastNameFirstNameNIHMedicalRecordNumber();
	}

	@Then("the user is able to search an existing enrollment by patient ID, last name, first name, or NIH Medical Record Number")
	public void the_user_is_able_to_search_an_existing_enrollment_by_patient_ID_last_name_first_name_or_NIH_Medical_Record_Number() {
		followUpFormPageImpl.searchEnrollmentByPatientIDLastNameFirstNameNIHMedicalRecordNumber();
	}

	@When("an enrollment is selected")
	public void an_enrollment_is_selected() {
		followUpFormPageImpl.selectingExistingFollowUPEnrollment();
	}
	
	@Then("selected enrollment is opened")
	public void selected_enrollment_is_opened() {
		servicePortalQuestionnairePage.enrollmentLookUpCreateFollowUpButton.click();
	}

	@When("the user is on the Disease Course section to add information")
	public void the_user_is_on_the_Disease_Course_section_to_add_information() {
		followUpFormPageImpl.accessingFollowUpFormDiseaseCourseSection();
	}

	@Then("the user is able to select multiple symptoms in the symptoms field")
	public void the_user_is_able_to_select_multiple_symptoms_in_the_symptoms_field() {
		followUpFormPage.diseaseCourseSymptomsField.click();
		followUpFormPage.diseasCourseSymptomsDDCoughOption.click();
		followUpFormPage.diseaseCourseSymptomsField.click();
		followUpFormPage.diseasCourseSymptomsDDFeverOption.click();
		CucumberLogUtils.logScreenShot();
	}

	@When("the user selects {string} after having selected multiple symptoms")
	public void the_user_selects_after_having_selected_multiple_symptoms(String string) {
		followUpFormPage.diseaseCourseSymptomsField.click();
		followUpFormPage.diseasCourseSymptomsDDNoneOfTheAboveOption.click();
	}

	@Then("the user sees a pop up with the message {string}")
	public void the_user_sees_a_pop_up_with_the_message(String noneOfTheAboveMessage) {
		Assert.assertTrue(followUpFormPage.diseaseCoursePopUpMessage.getText().contentEquals(noneOfTheAboveMessage));
		CucumberLogUtils.logScreenShot();
	}

	@When("the user selects Yes")
	public void the_user_selects_Yes() {
		followUpFormPage.diseaseCoursePopUpYesButton.click();
	}

	@Then("{string} option displays and replaces all previously selected symptoms")
	public void option_displays_and_replaces_all_previously_selected_symptoms(String noneOfTheAboveAfterSelecting) {
		followUpFormPage.diseaseCourseOptionDisplayeAfterSelecting.getText()
				.contentEquals(noneOfTheAboveAfterSelecting);
		CucumberLogUtils.logScreenShot();
	}

	@When("the user attempts to add a symptom such as {string} after selecting {string} option")
	public void the_user_attempts_to_add_a_symptom_such_as_after_selecting_option(String string, String string2) {
		MiscUtils.sleep(2000);
		followUpFormPage.diseaseCourseSymptomsField.click();
		followUpFormPage.diseasCourseSymptomsDDCoughOption.click();
	}

	@Then("the user sees another pop up with the message {string}")
	public void the_user_sees_another_pop_up_with_the_message(String message) {
		MiscUtils.sleep(3000);
		Assert.assertTrue(followUpFormPage.diseaseCoursePopUpMessage.getText().contentEquals(message));
		CucumberLogUtils.logScreenShot();
	}

	@Then("{string} symptom is displayed")
	public void symptom_is_displayed(String coughOptionAfterSelected) {
		MiscUtils.sleep(2000);
		Assert.assertTrue(followUpFormPage.diseaseCourseOptionDisplayeAfterSelecting.getText()
				.contentEquals(coughOptionAfterSelected));
		CucumberLogUtils.logScreenShot();
	}

	@When("selecting {string} after having selected a symptoms")
	public void selecting_after_having_selected_a_symptoms(String string) {
		MiscUtils.sleep(3000);
		followUpFormPage.diseaseCourseSymptomsField.click();
		followUpFormPage.diseasCourseSymptomsDDdontKnowOption.click();
	}

	@Then("the user is able to see another pop up with the message {string}")
	public void the_user_is_able_to_see_another_pop_up_with_the_message(String message) {
		MiscUtils.sleep(1000);
		Assert.assertTrue(followUpFormPage.diseaseCoursePopUpMessage.getText().contentEquals(message));
		CucumberLogUtils.logScreenShot();
	}

	@Then("{string} option displays")
	public void option_displays(String dontKnowDisplayed) {
		MiscUtils.sleep(5000);
		Assert.assertTrue(
				followUpFormPage.diseaseCourseOptionDisplayeAfterSelecting.getText().contentEquals(dontKnowDisplayed));
		CucumberLogUtils.logScreenShot();
	}

	@Then("the user is able to select multiple treatment items in {string} field")
	public void the_user_is_able_to_select_multiple_treatment_items_in_field(String treatmentItemsField) {
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(followUpFormPage.diseaseCoursetreatmentItemsSectionText);
		Assert.assertTrue(
				followUpFormPage.diseaseCoursetreatmentItemsSectionText.getText().contentEquals(treatmentItemsField));
		followUpFormPage.diseaseCoursetreatmentItemsField.click();
		followUpFormPage.diseasCourseTreatmentItemDDIntubationOption.click();
		CucumberLogUtils.logScreenShot();
	}

	@When("the user selects {string} after having selected multiple treatment items")
	public void the_user_selects_after_having_selected_multiple_treatment_items(String string) {
		followUpFormPage.diseaseCoursetreatmentItemsField.click();
		followUpFormPage.diseasCourseSymptomsDDNoneOfTheAboveOption.click();

	}

	@When("the user adds a symptom such as {string} after selecting {string} option")
	public void the_user_adds_a_symptom_such_as_after_selecting_option(String string, String string2) {
		MiscUtils.sleep(2000);
		followUpFormPage.diseaseCoursetreatmentItemsField.click();
		MiscUtils.sleep(2000);
		followUpFormPage.diseasCourseTreatmentItemDDIntubationOption.click();
		CucumberLogUtils.logScreenShot();
	}

	@Then("{string} symptom is displayed in treatment item field")
	public void symptom_is_displayed_in_treatment_item_field(String intubationOption) {
		MiscUtils.sleep(2000);
		Assert.assertTrue(
				followUpFormPage.diseaseCourseOptionDisplayeAfterSelecting.getText().contentEquals(intubationOption));
		CucumberLogUtils.logScreenShot();
	}

	@When("selecting {string} after having selected a treatment item")
	public void selecting_after_having_selected_a_treatment_item(String string) {
		followUpFormPage.diseaseCoursetreatmentItemsField.click();
		followUpFormPage.diseasCourseSymptomsDDdontKnowOption.click();
	}

	@When("on the {string} section")
	public void on_the_section(String string) {
		JavascriptUtils.scrollIntoView(followUpFormPage.exposuredAndRiskFactorsLabelText);
		followUpFormPage.exposuredAndRiskFactorsLabelText.click();
		MiscUtils.sleep(5000);
	}

	@Then("the following questions should display {string}, {string}, {string}, {string}, {string}, {string},{string}, {string}, {string}, {string}, {string}")
	public void the_following_questions_should_display(String patientsSelfReportedHealth, String medicalConditionsText,
			String patientCancerTypeText, String immunizationsUpToDateText, String patientReceivedVaccinationsText,
			String patientsWalkingPaceText, String hoursSpentSittingText, String patientVapeCigarettesText,
			String patientSmokeAtLeast100cigarettesText, String patientConsumeAlcoholicBeveragesText,
			String hoursSpentExercisingText) {
		followUpFormPageImpl.verifyingExposuresAndRiskFactorsQuestion(patientsSelfReportedHealth, medicalConditionsText,
				patientCancerTypeText, immunizationsUpToDateText, patientReceivedVaccinationsText,
				patientsWalkingPaceText, hoursSpentSittingText, patientVapeCigarettesText,
				patientSmokeAtLeast100cigarettesText, patientConsumeAlcoholicBeveragesText, hoursSpentExercisingText);
	}

	@When("a COVIDCode provider is on the Disease Course section on the Follow Up Form")
	public void a_COVIDCode_provider_is_on_the_Disease_Course_section_on_the_Follow_Up_Form() throws TestingException {
		followUpFormPageImpl.accessingFollowUpFormDiseaseCourseSection();
	}

	@Then("{string} section should display along with the values {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void section_should_display_along_with_the_values(String drugTreatments, String none, String Azithromycin, String Chloroquine, String Corticosteroids, String Hydroxycholoquine, String JAKInhibitor, String Remdesivir, String Tocilizumab, String Other) {
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(followUpFormPage.diseaseCoursetreatmentItemsSectionText);
		MiscUtils.sleep(2000);
		followUpFormPage.diseaseCourseDrugTreatmentsTextField.click();
		MiscUtils.sleep(2000);
		//xpath of "None" drop down option disease course drug treatments 
		CucumberLogUtils.logScreenShot();
		Assert.assertTrue(WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(text(),'None') and @class='select2-result-label']")).getText().contentEquals(none));
		//xpath for Azithromycin drop down option disease course drug treatments
		Assert.assertTrue(WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(text(),'Azithromycin') and @class='select2-result-label']")).getText().contentEquals(Azithromycin));
		//xpath for Chloroquine drop down option disease course drug treatments
		Assert.assertTrue(WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(text(),'Chloroquine') and @class='select2-result-label']")).getText().contentEquals(Chloroquine));
		//xpath for Corticosteroids drop down option disease course drug treatments
		Assert.assertTrue(WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(text(),'Corticosteroids') and @class='select2-result-label']")).getText().contentEquals(Corticosteroids));
		//xpath for Hydroxycholoquine drop down option disease course drug treatments
		Assert.assertTrue(WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(text(),'Hydroxycholoquine') and @class='select2-result-label']")).getText().contentEquals(Hydroxycholoquine));
		//xpath for JAK Inhibitor drop down option disease course drug treatments
		Assert.assertTrue(WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(text(),'JAK Inhibitor') and @class='select2-result-label']")).getText().contentEquals(JAKInhibitor));
		//xpath for Remdesivir drop down option disease course drug treatments
		Assert.assertTrue(WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(text(),'Remdesivir') and @class='select2-result-label']")).getText().contentEquals(Remdesivir));
		//xpath for Tocilizumab drop down option disease course drug treatments
		Assert.assertTrue(WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(text(),'Tocilizumab') and @class='select2-result-label']")).getText().contentEquals(Tocilizumab));
		//xpath for Other drop down option disease course drug treatments
		Assert.assertTrue(WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(text(),'Other') and @class='select2-result-label']")).getText().contentEquals(Other));
	}
	
}
