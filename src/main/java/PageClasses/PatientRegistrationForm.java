package PageClasses;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import baseClasses.PageBaseClass;

public class PatientRegistrationForm extends PageBaseClass{

//	public PatientRegistrationForm(WebDriver driver, ExtentTest logger, Properties prop) {
//		super(driver, logger, prop);
//	}
	
	public PatientRegistrationForm() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(text(),'New Registration')]")
	private WebElement newRegis;
	
	@FindBy(xpath = "//div[contains(text(),'Casualty Registration')]")
	private WebElement casualityRegis;
	
	@FindBy(xpath = "//div[contains(text(),'Follow Up Registration')]")
	private WebElement followUpRegis;
	
	@FindBy(xpath = "//div[contains(text(),'Registration Level')]")
	private WebElement regiLevel;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement saveButton;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/mat-list-item[1]/div[1]/mat-checkbox[1]/label[1]/span[1]")
	private WebElement newRegiEmail;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/mat-list-item[1]/div[1]/mat-checkbox[1]/label[1]/span[2]")
	private WebElement guardianName;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/mat-list-item[1]/div[1]/mat-checkbox[1]/label[1]/span[2]")
	private WebElement guardianRelation;
	
	@FindBy(xpath = "//span[contains(text(),'Roster Configuration')]")
	private WebElement rosterConfi;
	
	@FindBy(xpath = "//span[contains(text(),'OPD Configuration')]")
	private WebElement opdConfigMenu;
	
	public void clickMenu() {
		opdConfigMenu.click();
	}
	
	public void clickGuardianName() {
		guardianName.click();
	}
	
	public void clickGuardianRelation() {
		guardianRelation.click();
	}
	
	public void clickRegiLevel() {
		regiLevel.click();
	}
	
	public void clickFollowUpRegi() {
		followUpRegis.click();
	}
	
	public void clickCasualityRegi() {
		casualityRegis.click();
	}
	
	public void clickNewPatientRegis() {
		newRegis.click();
	}
	
	public void clickEmail() {
		newRegiEmail.click();
	}
	
	public void clickSaveButton() {
		saveButton.click();
	}
	
	public RosterConfiguration clickRosterConfig() {
		rosterConfi.click();
//		RosterConfiguration rosterConfiguration = new RosterConfiguration(driver, logger, prop);
//		PageFactory.initElements(driver, rosterConfiguration);
		return new RosterConfiguration();
	}

}
