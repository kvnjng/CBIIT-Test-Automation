package AnalysisTools.CEDCD.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.WebDriverUtils;

public class CEDCDAdminPage {
	
	public CEDCDAdminPage(){
		
		PageFactory.initElements(WebDriverUtils.webDriver, this);
		
	}
	
	/**================================================= Public Site Login Webelements =======================================================*/
	
	/** NIH Login Button */
	@FindBy(linkText = "NIH Login")
	public WebElement nihLoginBtn; 
	
	/** External Login Button */
	@FindBy(linkText = "External Login")
	public WebElement extLoginBtn;
	
	
	/**================================================= Internal Login Page WebElements =======================================================*/
	
	
	/** Username Textbox */
	@FindBy(id="USER")
	public WebElement internalUsernameTxtBox; 
	
	/** Password Textbox */
	@FindBy(id="PASSWORD")
	public WebElement internalPasswordTxtBox; 
	
	/** Submit Button */
	@FindBy(xpath = "//*[@type='submit']")
	public WebElement loginSubmitBtn; 
	
	/**================================================= Manage Cohort Page WebElements =======================================================*/
	
	/** Add New Cohort Hyperlink */
	@FindBy(linkText = "Add New Cohort")
	public WebElement addNewCohortlnk; 
	
	
	/**================================================= Add New Cohort Page WebElements =======================================================*/
	
	/** Cohort Name Textbox */
	@FindBy(xpath= "(//*[@class='form-control'])[1]")
	public WebElement cohortNameTxtBox; 
	
	/** Cohort Acroynm Textbox */
	@FindBy(xpath = "(//*[@class='form-control'])[2]")
	public WebElement cohortAcroynmTxtBox; 
	
	/** Cohort Owner Textbox */
	@FindBy(xpath = "//*[@class=' css-1hwfws3']")
	public WebElement cohortOwnerTxtBox; 
	 
	/** Notes Textbox */
	@FindBy(id = "cu_message")
	public WebElement notesTxtBox; 
	
	/** Submit Button */
	@FindBy(linkText = "Submit")
	public WebElement cohortSubmitBtn; 
	
	
	
}
