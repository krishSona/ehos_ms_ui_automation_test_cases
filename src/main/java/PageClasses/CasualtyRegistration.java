package PageClasses;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

import baseClasses.Details;
import baseClasses.PageBaseClass;

public class CasualtyRegistration extends PageBaseClass {

//	public CasualtyRegistration(WebDriver driver, ExtentTest logger, Properties prop) {
//		super(driver, logger, prop);
//	}

	public CasualtyRegistration() {
		PageFactory.initElements(driver, this);
	}

	Details details = new Details();

	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-cas-registration[1]/mat-card[1]/div[1]/div[1]/form[1]/div[1]/mat-checkbox[1]/label[1]/span[2]")
	private WebElement addRefferPatientCheckBox;

	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-cas-registration[1]/mat-card[1]/div[1]/div[1]/form[1]/div[1]/mat-checkbox[2]/label[1]/span[2]")
	private WebElement MlcPatientCheckBox;

	@FindBy(xpath = "//input[@id='mat-input-10']")
	private WebElement casualtyPatientMobileTextBox;

	@FindBy(xpath = "//input[@id='mat-input-12' and @formcontrolname='pat_f_name']")
	private WebElement casualtyPatientFirstName;

	@FindBy(xpath = "//input[@id='mat-input-45' and @formcontrolname='patAgeY']")
	private WebElement casualtyPatientAge;

	@FindBy(xpath = "//input[@id='mat-input-11' and @formcontrolname='pat_mobile']")
	private WebElement cPmobileTextBox;

	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-cas-registration[1]/mat-card[1]/div[1]/div[1]/form[1]/div[2]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[8]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement cPaddress;

	@FindBy(xpath = "//textarea[@id='mat-input-18' and @formcontrolname='address_line']")
	private WebElement casualtyPatientAddress;

	@FindBy(xpath = "//div[@id='mat-select-14-panel']")
	private WebElement cPclickState;

	@FindBy(xpath = "//mat-select[@id='mat-select-16' and @formcontrolname='dist_code']")
	private WebElement cPselectDist;

	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-cas-registration[1]/mat-card[1]/div[1]/div[1]/form[1]/div[2]/mat-accordion[1]/mat-expansion-panel[2]/div[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement cPclickDept;

	@FindBy(xpath = "//button[contains(text(),'Register')]")
	private WebElement cPregisterButton;

	@FindBy(xpath = "//button[contains(text(),'Reset')]")
	private WebElement cPresetButtonElement;

	@FindBy(xpath = "//span[contains(text(),'Patient Registration Desk')]")
	private WebElement patientRegistrationMenu;

	@FindBy(xpath = "//span[contains(text(),'Update Registration')]")
	private WebElement updateRegist;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-caspatientsearch[1]/mat-card[1]/mat-card-content[2]/app-cas-registration[1]/div[1]/div[1]/form[1]/div[2]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[5]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-datepicker-toggle[1]/button[1]")
	private WebElement cpCalender;

	@FindBy(xpath = "//mat-calendar-header/div[1]/div[1]/button[1]/span[1]")
	private WebElement clickforY;

	@FindBy(xpath = "//div[contains(text(),'2000')]")
	private WebElement selectY;

	@FindBy(xpath = "//div[contains(text(),'JUL')]")
	private WebElement selectM;

	@FindBy(xpath = "//div[contains(text(),'14')]")
	private WebElement selectD;

	@FindBy(xpath = "//mat-select[@id='mat-select-20' and @formcontrolname='billing_data']")
	private WebElement billingType;

	@FindBy(xpath = "//mat-select[@id='mat-select-28' and @formcontrolname='department_data']")
	private WebElement casualtyDept;

	@FindBy(id = "mat-chip-list-0")
	private WebElement drList;

	public void cPatientDob() {
		cpCalender.click();
		clickforY.click();
		selectY.click();
		selectM.click();
		selectD.click();
	}

	public void casualtyPatientState() throws InterruptedException {

		List<WebElement> as = (List<WebElement>) cPclickState;

	}

	public void casualtyPatientDist() {
		Select distList = new Select(cPselectDist);
		distList.selectByIndex(0);
	}

	public void casualtyPatientBillingType() {
		Select billList = new Select(billingType);
		billList.selectByValue("BPL");
	}

	public void casualtyPatientselectDr() {
		Select doctorList = new Select(drList);
		doctorList.selectByIndex(0);
	}

	public void selectCasualtyDept() {
		casualtyDept.click();
	}

	public void casualtyPatientDetail() throws InterruptedException {
		details.setCpMobileTextBox("9811219731");
		cPmobileTextBox.sendKeys(details.getCpMobileTextBox());
		details.setCasualtyPatientFirstName("Ravi");
		casualtyPatientFirstName.sendKeys(details.getCasualtyPatientFirstName());
		cPatientDob();
		details.setCasualtyPatientAddress("CGO Complex New Delhi");
		casualtyPatientAddress.sendKeys(details.getCasualtyPatientAddress());
		casualtyPatientState();
		Thread.sleep(10000);
//		casualtyPatientDist();
//		casualtyPatientBillingType();
//		selectCasualtyDept();
//		casualtyPatientselectDr();
//		cPregisterButton.click();
	}
}
