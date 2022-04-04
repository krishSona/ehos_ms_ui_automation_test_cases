package PageClasses;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import baseClasses.Details;
import baseClasses.PageBaseClass;

public class OpdConfig extends PageBaseClass {

//	public OpdConfig(WebDriver driver, ExtentTest logger, Properties prop) {
//		super(driver, logger, prop);
//	}

	public OpdConfig() {
		PageFactory.initElements(driver, this);
	}

	Details details = new Details();

	@FindBy(xpath = "//app-header/section[2]/div[1]/div[1]/div[1]/nav[1]/div[4]/ul[1]/li[1]/a[1]")
	WebElement homeButton;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-opdclinic[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement dept;

	@FindBy(xpath = "//span[contains(text(),'Cardiology')]")
	private WebElement selectDept;

	@FindBy(xpath = "//input[@id='mat-input-9']")
	private WebElement clinicNameTxtBox;

	@FindBy(xpath = "//textarea[@id='mat-input-10']")
	private WebElement clinicTagLineTxtBox;

	@FindBy(xpath = "//button[contains(text(),'Save Clinic')]")
	private WebElement clinicSaveButton;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	private WebElement okButton;

	@FindBy(xpath = "//span[contains(text(),'OPD Configuration')]")
	private WebElement opdConfigMenu;

	@FindBy(xpath = "//a[contains(text(),'Configure Patient Registration Form')]")
	private WebElement configPatientRegiForm;

	@FindBy(xpath = "//a[contains(text(),'Roster Configuration')]")
	private WebElement rosterConfi;

	public void clickMenu() {
		opdConfigMenu.click();
	}

	public void clickOk() {
		okButton.click();
	}

	public void saveClinic() {
		clinicSaveButton.click();
	}

	public void putTagLine() {
		details.setClinicTagLineTxtBox("Near By Bus Stand");
		clinicTagLineTxtBox.sendKeys(details.getClinicTagLineTxtBox());
	}

	public void clinicName() {
		details.setClinicNameTxtBox(getString());
		clinicNameTxtBox.sendKeys(details.getClinicNameTxtBox());
	}

	public void selectDepartment() {
		dept.click();
		selectDept.click();
	}

	public AdminHome clickHomeButton() {
		homeButton.click();
		return new AdminHome();
	}

	public PatientRegistrationForm clickPatientRegi() {
		configPatientRegiForm.click();
		return new PatientRegistrationForm();
	}

	public RosterConfiguration clickRosterConfig() {
		rosterConfi.click();
		return new RosterConfiguration();
	}

	// Java program generate a random String
	// function to generate a random string of length n
	static String getString() {

		int num=5;
		// chose a Character random from this String
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(num);

		for (int i = 0; i < num; i++) {
			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());
			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}

}
