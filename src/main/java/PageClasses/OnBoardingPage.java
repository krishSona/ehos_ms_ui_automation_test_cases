package PageClasses;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.BaseTestClass;
import baseClasses.Details;
import baseClasses.PageBaseClass;

public class OnBoardingPage extends BaseTestClass {

	public OnBoardingPage() {
		PageFactory.initElements(driver, this);
	}

	Details details = new Details();

	@FindBy(xpath = "//span[contains(text(),'Track Request Status')]")
	WebElement tOnR;

	@FindBy(xpath = "//app-header/app-hospitalonboard[1]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/mat-card[1]/mat-card-content[1]/div[2]/mat-checkbox[1]/label[1]/span[1]")
	WebElement tncCheckBox;

	@FindBy(xpath = "//app-header/app-hospitalonboard[1]/mat-horizontal-stepper[1]/div[2]/div[1]/form[1]/mat-card[1]/mat-card-content[1]/div[3]/div[1]/button[1]")
	WebElement nextButton;

	@FindBy(xpath = "//app-header/app-hospitalonboard[1]/mat-horizontal-stepper[1]/div[2]/div[2]/form[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/div[1]/mat-checkbox[1]/label[1]/div[1]")
	WebElement moduleCheckBox;

	@FindBy(xpath = "//app-header/app-hospitalonboard[1]/mat-horizontal-stepper[1]/div[2]/div[2]/form[1]/mat-card[1]/mat-card-content[1]/div[1]/div[2]/div[1]/button[1]")
	WebElement nextB;

	@FindBy(xpath = "//input[@formcontrolname='nin_id']")
	WebElement ninTextBox1;

	@FindBy(xpath = "//app-header/app-hospitalonboard[1]/mat-horizontal-stepper[1]/div[2]/div[3]/form[1]/mat-card[1]/mat-card-content[1]/div[1]/div[2]/button[1]")
	WebElement getNinDetailButton;

	@FindBy(xpath = "//app-header/app-hospitalonboard[1]/mat-horizontal-stepper[1]/div[2]/div[3]/form[1]/mat-card[1]/mat-card-content[1]/div[2]/div[7]/button[1]")
	WebElement hFnextButton;

	@FindBy(xpath = "//app-header/app-hospitalonboard[1]/mat-horizontal-stepper[1]/div[2]/div[4]/form[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]")
	WebElement intialsField;

	@FindBy(xpath = "//span[contains(text(),'Dr.')]")
	WebElement intialsValue;

	@FindBy(xpath = "//app-header/app-hospitalonboard[1]/mat-horizontal-stepper[1]/div[2]/div[4]/form[1]/mat-card[1]/mat-card-content[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]")
	WebElement clickFirstName;

	@FindBy(xpath = "//*[@id=\"mat-input-1\"]")
	WebElement firstNameTextBox;

	@FindBy(xpath = "//*[@id=\"mat-input-3\"]")
	WebElement lastNameTextBox;

	@FindBy(xpath = "//*[@id=\"mat-select-value-3\"]/span")
	WebElement designation;

	@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[59]/span[1]")
	WebElement selectDesignation;

	@FindBy(xpath = "//*[@id=\"mat-input-5\"]")
	WebElement mobileNumberTextBox;

	@FindBy(xpath = "//*[@id=\"mat-input-6\"]")
	WebElement emailTextBox;

	@FindBy(xpath = "//app-header/app-hospitalonboard[1]/mat-horizontal-stepper[1]/div[2]/div[4]/form[1]/mat-card[1]/mat-card-content[1]/div[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]")
	WebElement nodalIntials;

	@FindBy(xpath = "//span[contains(text(),'Prof.')]")
	WebElement selectNodalIntials;

	@FindBy(xpath = "//input[@id='mat-input-7']")
	WebElement ndFirstName;

	@FindBy(xpath = "//input[@id='mat-input-9']")
	WebElement ndLastName;

	@FindBy(xpath = "//app-header/app-hospitalonboard[1]/mat-horizontal-stepper[1]/div[2]/div[4]/form[1]/mat-card[1]/mat-card-content[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]")
	WebElement clickNdDegination;

	@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[59]/span[1]")
	WebElement ndDesignation;

	@FindBy(xpath = "//input[@id='mat-input-11']")
	WebElement ndMobileNumber;

	@FindBy(xpath = "//input[@id='mat-input-12']")
	WebElement ndEmail;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement saveButton;

	@FindBy(xpath = "//*[@id=mat-input-13]")
	WebElement verifyMobile;

	@FindBy(xpath = "//span[contains(text(),'Verify OTP')]")
	WebElement verifyButton;

	public void clickTncCheckBox() {
		tncCheckBox.click();
	}

	public void checkNextButtonEnable() {
		Assert.assertEquals(false, nextButton.isEnabled());
	}

	public void clickNextButton() {
		if (nextButton.isEnabled()) {
			nextButton.click();
		}
	}

	public void clickModuleCheckBox() {
		moduleCheckBox.click();
		moduleCheckBox.isSelected();
	}

	public void nextClick() {
		boolean a = nextB.isEnabled();
		if (a == true) {
			nextB.click();
		} else {
			Assert.assertFalse(true);
		}
	}

	public void inputNinId() {
		ninTextBox1.clear();
		details.setNinTextBox("1111147821");
		ninTextBox1.sendKeys(details.getNinTextBox());
	}

	public void clickNinDetailButton() {
		getNinDetailButton.click();
	}

	public void clickHfNextButton() {
		hFnextButton.click();
	}

	public void clickIntialField() {
		intialsField.click();
	}

	public void selectIntialValue() {
		intialsValue.click();
	}

	public void headOfHealthFacilityDetails() {
		clickFirstName.click();
		firstNameTextBox.clear();
		details.setFirstNameTextBox("Ruchit");
		firstNameTextBox.sendKeys(details.getFirstNameTextBox());
		details.setLastNameTextBox("Seth");
		lastNameTextBox.sendKeys(details.getLastNameTextBox());
		designation.click();
		selectDesignation.click();
		details.setMobileNumberTextBox("8130647171");
		mobileNumberTextBox.sendKeys(details.getMobileNumberTextBox());
		details.setEmailTextBox("kali.krishan@sblinfo.com");
		emailTextBox.sendKeys(details.getEmailTextBox());
	}

	public TrackOnBoardRequest verifyTrackRequestStatus() {
		tOnR.click();
//		TrackOnBoardRequest trackOnBoardRequest = new TrackOnBoardRequest(driver, logger, prop);
//		PageFactory.initElements(driver, trackOnBoardRequest);
		return new TrackOnBoardRequest();
	}

	public void ndDetails() {
		nodalIntials.click();
		selectNodalIntials.click();
		ndFirstName.clear();
		details.setNdFirstName("Vaibhav");
		ndFirstName.sendKeys(details.getNdFirstName());
		ndLastName.clear();
		details.setNdLastName("khokhar");
		ndLastName.sendKeys(details.getNdLastName());
		clickNdDegination.click();
		ndDesignation.click();
		ndMobileNumber.clear();
		details.setNdMobileNumber("9529449676");
		ndMobileNumber.sendKeys(details.getNdMobileNumber());
		ndEmail.clear();
		details.setNdEmail("vaibhav.khokhar@nic.in");
		ndEmail.sendKeys(details.getNdEmail());
	}

	public void clickSaveButton() {
		if (saveButton.isEnabled()) {
			saveButton.click();
		}
	}

	public void verifyMnumber() throws InterruptedException {
		verifyMobile.click();
		Thread.sleep(90000);
		verifyButton.click();
	}

}
