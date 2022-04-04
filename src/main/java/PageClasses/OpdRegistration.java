package PageClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import baseClasses.Details;
import baseClasses.PageBaseClass;

public class OpdRegistration extends PageBaseClass {

//	public OpdRegistration(WebDriver driver, ExtentTest logger, Properties prop) {
//		super(driver, logger, prop);
//	}
	
	public OpdRegistration() {
		PageFactory.initElements(driver, this);
	}

	Details details = new Details();

	@FindBy(xpath = "//app-header/section[2]/div[1]/div[1]/div[1]/nav[1]/div[4]/ul[1]/li[1]/a[1]")
	private WebElement homeButton;

	@FindBy(xpath = "//span[contains(text(),'Patient Registration Desk')]")
	private WebElement patientRegisDeskMenu;

	@FindBy(xpath = "//mat-radio-button[@id='mat-radio-4']")
	private WebElement patSearchByMobile;

	@FindBy(xpath = "//mat-radio-button[@id='mat-radio-5']")
	private WebElement patSearchByName;

	@FindBy(xpath = "//mat-radio-button[@id='mat-radio-3']")
	private WebElement patSearchByUhid;

	@FindBy(xpath = "//mat-radio-button[@id='mat-radio-2']")
	private WebElement patSearchByHealthId;

	@FindBy(xpath = "//input[@id='mat-input-10']")
	private WebElement patSearchTextBox;

	@FindBy(xpath = "//button[contains(text(),'Search')]")
	private WebElement patSearchButton;

	@FindBy(xpath = "//span[contains(text(),'X')]")
	private WebElement closeButton;

	@FindBy(xpath = "//input[@id='mat-input-1']")
	private WebElement patientMobileInputTextBox;

	@FindBy(xpath = "//div[@id='mat-select-value-73']")
	private WebElement patientTitle;

	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-patientsearch[1]/mat-card[1]/mat-card-content[2]/app-patientregistration[1]/div[1]/div[1]/form[1]/div[2]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement patientFnameTextBox;

	@FindBy(xpath = "//input[@id='mat-input-2']")
	private WebElement patientFirstName;

	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-patientsearch[1]/mat-card[1]/mat-card-content[2]/app-patientregistration[1]/div[1]/div[1]/form[1]/div[2]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement patMobileClick;

	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-patientsearch[1]/mat-card[1]/mat-card-content[2]/app-patientregistration[1]/div[1]/div[1]/form[1]/div[2]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[9]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement patientAddress;

	@FindBy(xpath = "//textarea[@id='mat-input-8']")
	private WebElement patAddress;

	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-patientsearch[1]/mat-card[1]/mat-card-content[2]/app-patientregistration[1]/div[1]/div[1]/form[1]/div[2]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[6]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-datepicker-toggle[1]/button[1]")
	private WebElement openCalender;

	@FindBy(xpath = "//mat-calendar-header/div[1]/div[1]/button[1]/span[1]")
	private WebElement clickforY;

	@FindBy(xpath = "//div[contains(text(),'2020')]")
	private WebElement selectY;

	@FindBy(xpath = "//div[contains(text(),'JUN')]")
	private WebElement selectM;

	@FindBy(xpath = "//div[contains(text(),'11')]")
	private WebElement selectD;

	@FindBy(xpath = "//span[contains(text(),'HARYANA')]")
	public WebElement seletState;

	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-patientsearch[1]/mat-card[1]/mat-card-content[2]/app-patientregistration[1]/div[1]/div[1]/form[1]/div[2]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[11]/mat-form-field[1]/div[1]/div[1]")
	private WebElement clickDist;

	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-patientsearch[1]/mat-card[1]/mat-card-content[2]/app-patientregistration[1]/div[1]/div[1]/form[1]/div[2]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[10]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement clickState;
	
	@FindBy(xpath = "//span[contains(text(),'GURUGRAM')]")
	private WebElement seletdist;
	
	@FindBy(xpath = "//button[contains(text(),'Register')]")
	private WebElement searchButton;
	
	@FindBy(xpath = "//body/app-root[1]/app-sidenav[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/i[1]")
	private WebElement patientRegistrationMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Casualty/Emergency Registration')]")
	private WebElement casualty;
	
	@FindBy(xpath = "//span[contains(text(),'Update Registration')]")
	private WebElement updateRegist;
	
	@FindBy(xpath = "//span[contains(text(),'Reports')]")
	private WebElement reports;
	
	@FindBy(xpath = "//span[contains(text(),'Daily Summary Report')]")
	private WebElement dailySreport;
	
	@FindBy(xpath = "//span[contains(text(),'Patient Visit Summary Report')]")
	private WebElement pVsReport;
	
	@FindBy(xpath = "//span[contains(text(),'Daily Collection Report')]")
	private WebElement dCreport;
	
	public void searchByUhid() {
		String parent = driver.getWindowHandle();
		patSearchByUhid.click();
		details.setPatSearchByUhid("20210000004");
		patSearchTextBox.sendKeys(details.getPatSearchByUhid());
		patSearchButton.click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();
		while (iterator.hasNext()) {
			String child_window = iterator.next();
			if (parent.equalsIgnoreCase(child_window)) {
				driver.switchTo().window(child_window);
			}

			closeButton.click();
		}
	}

	public void searchByHealthId() {
		patSearchByHealthId.click();
		details.setPatSearchByHealthId("");
		patSearchTextBox.sendKeys(details.getPatSearchByHealthId());
		patSearchButton.click();
	}

	public void searchByMobile() {
		String parent = driver.getWindowHandle();
		patSearchByMobile.click();
		details.setPatSearchByMobile("8130647171");
		patSearchTextBox.sendKeys(details.getPatSearchByMobile());
		patSearchButton.click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();
		while (iterator.hasNext()) {
			String child_window = iterator.next();
			if (parent.equalsIgnoreCase(child_window)) {
				driver.switchTo().window(child_window);
			}

			closeButton.click();
		}
	}

	public void searchByName() {
		String parent = driver.getWindowHandle();
		patSearchByName.click();
		details.setPatSearchByName("Mashruf Khan");
		patSearchTextBox.sendKeys(details.getPatSearchByName());
		patSearchButton.click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();
		while (iterator.hasNext()) {
			String child_window = iterator.next();
			if (parent.equalsIgnoreCase(child_window)) {
				driver.switchTo().window(child_window);
			}

			closeButton.click();
		}
	}

	public void patientMobile() {
		patMobileClick.click();
		details.setPatMobileInputTextBox("8130647171");
		patientMobileInputTextBox.sendKeys(details.getPatMobileInputTextBox());
	}

	public void patientFname() {
		patientFnameTextBox.click();
		details.setPatientFirstName("rahul");
		patientFirstName.sendKeys(details.getPatientFirstName());
	}

	public void patientDob() {
		openCalender.click();
		clickforY.click();
		selectY.click();
		selectM.click();
		selectD.click();
	}

	public void patientAddres() {
		patientAddress.click();
		details.setPatAddress("Gurgaon");
		patAddress.sendKeys(details.getPatAddress());
	}

	public void selectState() {
		clickState.click();
		seletState.click();
		
	}
	
	public void selectDist() throws InterruptedException {
		clickDist.click();
		Thread.sleep(1000);
		seletdist.click();
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
	
	public CasualtyRegistration emergencyRegistrationMenu() {
//		patientRegistrationMenu.click();
		casualty.click();
//		CasualtyRegistration casualtyRegistration = new CasualtyRegistration(driver, logger, prop);
//		PageFactory.initElements(driver, casualtyRegistration);
		return new CasualtyRegistration();
	}
	
	public UpdateRegistration updateRegistrationMenu() {
		patientRegistrationMenu.click();
		updateRegist.click();
//		UpdateRegistration updateRegistration = new UpdateRegistration(driver, logger, prop);
//		PageFactory.initElements(driver, updateRegistration);
		return new UpdateRegistration();
	}
	
	public DailySummaryReport dailySummaryReport() {
		patientRegistrationMenu.click();
		reports.click();
		dailySreport.click();
//		DailySummaryReport dailySummaryReport = new DailySummaryReport(driver, logger, prop);
//		PageFactory.initElements(driver, dailySummaryReport);
		return new DailySummaryReport();
	}
	
	public PatientVisitSummaryReport patientVisitSummryReport() {
		patientRegistrationMenu.click();
		reports.click();
		pVsReport.click();
//		PatientVisitSummaryReport patientVisitSummaryReport = new PatientVisitSummaryReport(driver, logger, prop);
//		PageFactory.initElements(driver, patientVisitSummaryReport);
		return new PatientVisitSummaryReport();
	}
	
	public DailyCollectionReport dailyCreport() {
		patientRegistrationMenu.click();
		reports.click();
		dCreport.click();
//		DailyCollectionReport dailyCollectionReport = new DailyCollectionReport(driver, logger, prop);
//		PageFactory.initElements(driver, dailyCollectionReport);
		return new DailyCollectionReport();
	}
}
