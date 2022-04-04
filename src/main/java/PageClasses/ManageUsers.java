package PageClasses;

import org.openqa.selenium.support.*;

import java.util.Properties;

import org.openqa.selenium.*;
import org.testng.Assert;
import baseClasses.Details;

import com.aventstack.extentreports.ExtentTest;

import baseClasses.PageBaseClass;

public class ManageUsers extends PageBaseClass {
	
	Details details = new Details();
	
	public ManageUsers() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-employee-registration[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/form[1]/mat-accordion[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]")
	private WebElement title;

	@FindBy(xpath = "//span[contains(text(),'Dr.')]")
	private WebElement selectTitle;

	@FindBy(xpath = "//*[@id=\"mat-input-5\"]")
	private WebElement fNameTextBox;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-employee-registration[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/form[1]/mat-accordion[1]/div[1]/div[5]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]")
	private WebElement gender;

	@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]")
	private WebElement selectGender;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-employee-registration[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/form[1]/mat-accordion[1]/div[1]/div[6]/mat-form-field[1]/div[1]/div[1]/div[4]")
	private WebElement dateOfBirth;
	
	@FindBy(xpath = "//input[@id='mat-input-6']")
	private WebElement dobTxtBox;

	@FindBy(xpath = "//tbody/tr[3]/td[3]/div[1]")
	private WebElement dobDate;

	@FindBy(xpath = "//mat-calendar-header/div[1]/div[1]/button[1]/span[1]")
	private WebElement year;

	@FindBy(xpath = "//div[contains(text(),'2005')]")
	private WebElement yearSelection;

	@FindBy(xpath = "//div[contains(text(),'JUN')]")
	private WebElement monthSelection;

	@FindBy(xpath = "//div[contains(text(),'14')]")
	private WebElement daySelection;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-employee-registration[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/form[1]/mat-accordion[1]/div[1]/div[7]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement userType;

	@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[3]/span[1]")
	private WebElement selectUserType;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-employee-registration[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/form[1]/mat-accordion[1]/div[1]/div[8]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement mobile1;

	@FindBy(xpath = "//input[@id='mat-input-9' and @formcontrolname='mobile_no']")
	private WebElement mobile;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-employee-registration[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/form[1]/mat-accordion[1]/div[1]/div[8]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement qualification;

	@FindBy(xpath = "//span[contains(text(),'MBBS')]")
	private WebElement selectQualification;

	@FindBy(xpath = "//span[contains(text(),'Auto Generate')]")
	private WebElement autoGenerate;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-employee-registration[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/form[1]/mat-accordion[1]/div[1]/div[11]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement dept;

	@FindBy(xpath = "//span[contains(text(),'Cardiology')]")
	private WebElement depart;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement saveButton;

	@FindBy(xpath = "//button[contains(text(),'Reset')]")
	private WebElement reSetButton;
	
	@FindBy(xpath = "//body/div[2]/div[1]")
	private WebElement singleClick;
	
	@FindBy(xpath = "//input[@id='mat-input-14' and @placeholder='Start searching']")
	private WebElement searchInputTextBox;

	@FindBy(xpath = "//span[contains(text(),'Building Configuration')]")
	private WebElement buildingConfig;

	@FindBy(xpath = "//tbody/tr[3]/td[9]/span[1]/mat-slide-toggle[1]/label[1]/div[1]/div[1]/div[1]")
	private WebElement statusToggle;

	public void genderSelection() {
		gender.click();
		selectGender.click();
	}

	public void titleSelection() {
		title.click();
		selectTitle.click();
	}

	public void dateOfBirth() {
		dateOfBirth.click();
		year.click();
		yearSelection.click();
		monthSelection.click();
		daySelection.click();
	}

	public void addNewUser() throws InterruptedException {
		userType.click();
		selectUserType.click();
//		Thread.sleep(2000);
//		mobile1.click();
		Thread.sleep(2000);
		mobileNumber();
		Thread.sleep(2000);
		autoGenerate.click();
		Thread.sleep(2000);
		dept.click();
		Thread.sleep(1000);
		depart.click();
		Thread.sleep(1000);
		saveButton.click();
	}

	public void firstName() {
		details.setfNameTextBox("Aman");
		fNameTextBox.sendKeys(details.getfNameTextBox());
	}

	public void dobSelection() {
		dateOfBirth.click();
		dobDate.click();
	}

	public void NewUserFormReset() throws InterruptedException {
		userType.click();
		selectUserType.click();
		mobileNumber();
		Thread.sleep(1000);
		autoGenerate.click();
		Thread.sleep(1000);
		dept.click();
		Thread.sleep(1000);
		depart.click();
		Thread.sleep(1000);
		reSetButton.click();
	}

	@FindBy(xpath = "//tbody/tr[2]/td[10]/button[1]")
	private WebElement userUpdateButton;

	public void userUpdate() {
		Boolean checkButtonPresence = userUpdateButton.isDisplayed();
		Assert.assertTrue(checkButtonPresence);
		userUpdateButton.click();
	}

	public void statusTogle() {
		Boolean as = statusToggle.isDisplayed();
		statusToggle.click();
	}

	public BuildingConfiguration clickBuildingConfiguration() {
		buildingConfig.click();
//		BuildingConfiguration buildingConfiguration = new BuildingConfiguration(driver, logger, prop);
//		PageFactory.initElements(driver, buildingConfiguration);
		return new BuildingConfiguration();
	}
	
	public void clickSearchInputTextBox() {
		details.setSearchInputTextBox("Amandeep");
		searchInputTextBox.sendKeys(details.getSearchInputTextBox());
	}
	
	public void mobileNumber() {
		details.setManageUserPage_mobile_number("8130647171");
		mobile.sendKeys(details.getManageUserPage_mobile_number());
	}
	
	

}
