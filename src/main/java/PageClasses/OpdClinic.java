package PageClasses;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import baseClasses.Details;
import baseClasses.PageBaseClass;

public class OpdClinic extends PageBaseClass {

	Details details = new Details();

//	public OpdClinic(WebDriver driver, ExtentTest logger, Properties prop) {
//		super(driver, logger, prop);
//	}

	public OpdClinic() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//app-header/section[2]/div[1]/div[1]/div[1]/nav[1]/div[4]/ul[1]/li[1]/a[1]")
	private WebElement homeButton;

	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-patientlist[1]/div[1]/mat-card[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]")
	private WebElement clickSearchTextBox;

	@FindBy(xpath = "//input[@id='mat-input-0']")
	private WebElement searchTextBox;

	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-patientlist[1]/div[1]/mat-card[1]/div[1]/mat-table[1]/mat-row[1]/mat-cell[6]/a[1]")
	private WebElement rxButton;

	@FindBy(xpath = "//div[contains(text(),'Vitals')]")
	private WebElement patientVitals;

	@FindBy(xpath = "//div[contains(text(),'Complaints')]")
	private WebElement patientComplaints;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis')]")
	private WebElement patientDiagnosi;

	@FindBy(xpath = "//div[contains(text(),'Investigations')]")
	private WebElement patientInvestigations;

	@FindBy(xpath = "//div[contains(text(),'Allergies')]")
	private WebElement patientAllergies;

	@FindBy(xpath = "//div[contains(text(),'Medications')]")
	private WebElement patientMedications;

	@FindBy(xpath = "//mat-tab-body/div[1]/app-vitals[1]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]")
	private WebElement clickHeight;

	@FindBy(xpath = "//input[@id='mat-input-1']")
	private WebElement heightTextBox;

	@FindBy(xpath = "//mat-tab-body/div[1]/app-vitals[1]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]")
	private WebElement clickWeight;

	@FindBy(xpath = "//input[@id='mat-input-2']")
	private WebElement weightTextBox;

	@FindBy(xpath = "//mat-tab-body/div[1]/app-vitals[1]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]")
	private WebElement clickBodyTemp;

	@FindBy(xpath = "//input[@id='mat-input-4']")
	private WebElement bodyTempTextBox;

	@FindBy(xpath = "//mat-tab-body/div[1]/app-vitals[1]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]")
	private WebElement clickBloodPresure;

	@FindBy(xpath = "//input[@id='mat-input-5']")
	private WebElement bloodPresureSystolicTextBox;

	@FindBy(xpath = "//mat-tab-body/div[1]/app-vitals[1]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[3]/mat-form-field[1]/div[1]/div[1]/div[1]")
	private WebElement clickBloodPresureDiastolic;

	@FindBy(xpath = "//input[@id='mat-input-6']")
	private WebElement bloodPresureDiastolicTextBox;

	@FindBy(xpath = "//mat-tab-body/div[1]/app-vitals[1]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[2]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]")
	private WebElement clickRespirationRate;

	@FindBy(xpath = "//input[@id='mat-input-7']")
	private WebElement respirationRateTextBox;

	@FindBy(xpath = "//mat-tab-body/div[1]/app-vitals[1]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[2]/div[2]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]")
	private WebElement clickPulse;

	@FindBy(xpath = "//input[@id='mat-input-8']")
	private WebElement pulseTextBox;

	@FindBy(xpath = "//mat-tab-body/div[1]/app-vitals[1]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/button[1]")
	private WebElement resetButton;

	@FindBy(xpath = "//mat-tab-body/div[1]/app-vitals[1]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/button[2]")
	private WebElement saveVitalButton;

	@FindBy(xpath = "//mat-tab-body/div[1]/mat-card[1]/form[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement clickEnterComplain;

	@FindBy(xpath = "//input[@id='mat-input-18']")
	private WebElement enterComplainTextBox;

	@FindBy(xpath = "//mat-tab-body/div[1]/mat-card[1]/form[1]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement clickComplainSinceBox;

	@FindBy(xpath = "//input[@id='mat-input-19']")
	private WebElement enterSinceTextBox;

	@FindBy(xpath = "//mat-tab-body/div[1]/mat-card[1]/form[1]/div[1]/div[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement clickComplainDuration;

	@FindBy(xpath = "//span[contains(text(),'Days')]")
	private WebElement selectDuration;

	@FindBy(xpath = "//mat-tab-body/div[1]/mat-card[1]/form[1]/div[1]/div[1]/div[4]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement clickComplainStatus;

	@FindBy(xpath = "//span[contains(text(),'Active')]")
	private WebElement selectStatus;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement complainSaveButton;

	@FindBy(xpath = "//button[contains(text(),'Reset')]")
	private WebElement complainResetButton;

	@FindBy(xpath = "//table[@matsortactive='QUEUENO']")
	private WebElement table;

	@FindBy(xpath = "//th[contains(text(),'REGISTRATION NO.')]")
	private List<WebElement> tableCol;

	public void abd() {
		for (int i = 0; i < tableCol.size(); i++) {
			System.out.println("Total elements present in table are: " + tableCol.size());
			System.out.println("table contents: " + tableCol.get(i).getText());

		}
	}

	public void patientComplaintDetail() {
		patientComplaints.click();
	}

	public AdminHome clickHomeButton() {
		homeButton.click();
//		AdminHome adminHome = new AdminHome(driver, logger, prop);
//		PageFactory.initElements(driver, adminHome);
		return new AdminHome();
	}

	public void searchByUhid() {
		Actions ac = new Actions(driver);
		clickSearchTextBox.click();
		details.setOpdClinicPageSearchTextBox("20220000002");
		searchTextBox.sendKeys(details.getOpdClinicPageSearchTextBox());
	}

	public void checkPatientDetails() {
		Assert.assertEquals(true, rxButton.isDisplayed());
		System.out.println("The Rx Button is present");
		rxButton.click();
	}

	public void vitalHeightDetails() {
		clickHeight.click();
		details.setOpdClinicPageHeightTextBox("175");
		heightTextBox.sendKeys(details.getOpdClinicPageHeightTextBox());
	}

	public void vitalWeightDetails() {
		clickWeight.click();
		details.setOpdClinicPageWeightTextBox("75");
		weightTextBox.sendKeys(details.getOpdClinicPageWeightTextBox());
	}

	public void vitalBodyTempDetails() {
		clickBodyTemp.click();
		details.setOpdClinicPageBodyTempTextBox("95");
		bodyTempTextBox.sendKeys(details.getOpdClinicPageBodyTempTextBox());
	}

	public void vitalBloodPresureSystolicDetail() {
		clickBloodPresure.click();
		details.setOpdClinicPageBpSystolicTextBox("33");
		bloodPresureSystolicTextBox.sendKeys(details.getOpdClinicPageBpSystolicTextBox());
	}

	public void vitalBloodPresureDiastolic() {
		clickBloodPresureDiastolic.click();
		details.setOpdClinicPageBpDiastolicTextBox("10");
		bloodPresureDiastolicTextBox.sendKeys(details.getOpdClinicPageBpDiastolicTextBox());
	}

	public void vitalRespirationRate() {
		clickRespirationRate.click();
		details.setOpdClinicPageRespirationRateTextBox("14");
		respirationRateTextBox.sendKeys(details.getOpdClinicPageRespirationRateTextBox());
	}

	public void vitalPulse() {
		clickPulse.click();
		details.setOpdClinicPagePulseTextBox("55");
		pulseTextBox.sendKeys(details.getOpdClinicPagePulseTextBox());
	}

	public void resetVitalDetail() {
		resetButton.click();
	}

	public void saveVitalDetail() {
		saveVitalButton.click();
	}
}
