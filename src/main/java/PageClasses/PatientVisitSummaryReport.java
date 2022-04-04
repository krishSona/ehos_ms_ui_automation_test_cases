package PageClasses;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

import baseClasses.Details;
import baseClasses.PageBaseClass;

public class PatientVisitSummaryReport extends PageBaseClass {

//	public PatientVisitSummaryReport(WebDriver driver, ExtentTest logger, Properties prop) {
//		super(driver, logger, prop);
//	}
	
	public PatientVisitSummaryReport() {
		PageFactory.initElements(driver, this);
	}
	
	Details details = new Details();
	
	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-patvisitsummary[1]/div[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[4]")
	private WebElement clickStartDate;
	
	@FindBy(xpath = "//input[@id='mat-input-11']")
	private WebElement startDate;
	
	@FindBy(xpath = "//input[@id='mat-input-11']")
	private WebElement clickEndDate;
	
	@FindBy(xpath = "//input[@id='mat-input-12']")
	private WebElement endDate;
	
	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-patvisitsummary[1]/div[1]/div[1]/form[1]/div[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement clickDepartment;
	
	@FindBy(tagName = "//span[contains(text(),'Cardiology')]")
	private WebElement selectDept;
	
	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-patvisitsummary[1]/div[1]/div[1]/form[1]/div[1]/div[4]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement clickUnit;
	
	@FindBy(xpath = "//span[contains(text(),'Cardio Unit')]")
	private WebElement selectUnit;
	
	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-patvisitsummary[1]/div[1]/div[1]/form[1]/div[1]/div[5]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement clickClinic;
	
	@FindBy(xpath = "//span[contains(text(),'Cardio CliniC A')]")
	private WebElement selectClinic;
	
	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-patvisitsummary[1]/div[1]/div[1]/form[1]/div[1]/div[6]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement clickDr;
	
	@FindBy(xpath = "//span[contains(text(),'Vishal')]")
	private WebElement selectDr;
	
	@FindBy(xpath = "//button[contains(text(),'Generate Summary')]")
	private WebElement genrateButton;
	
	@FindBy(xpath = "//button[contains(text(),'Reset')]")
	private WebElement resetButton;
	
	public void sDateAndEndDate() {
		clickStartDate.click();
		details.setPatientVisitStartDate("01/12/2021");
		startDate.sendKeys(details.getPatientVisitStartDate());
		clickEndDate.click();
		details.setPatientVisitEndDate("26/12/2021");
		endDate.sendKeys(details.getPatientVisitEndDate());
	}
	
	public void patientDept() throws InterruptedException {
		clickDepartment.click();
		Thread.sleep(1000);
		selectDept.click();
	}
	
	public void patientUnit() {
		clickUnit.click();
		selectUnit.click();
	}
	
	public void patientClinic() {
		clickClinic.click();
		selectClinic.click();
	}
	
	public void patientDr() {
		clickDr.click();
		selectDr.click();
	}
	
	public void clickGenerateButton() {
		genrateButton.click();
	}
	
	public void clickReset() {
		resetButton.click();
	}
}
