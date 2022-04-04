package PageClasses;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import baseClasses.Details;
import baseClasses.PageBaseClass;

public class TrackOnBoardRequest extends PageBaseClass {

//	public TrackOnBoardRequest(WebDriver driver, ExtentTest logger, Properties prop) {
//		super(driver, logger, prop);
//	}
	
	public TrackOnBoardRequest() {
		PageFactory.initElements(driver, this);
	}

	Details details = new Details();

	@FindBy(xpath = "//input[starts-with(@id,'mat-input-')]")
	WebElement mobileTextBox;

	@FindBy(xpath = "//button[contains(text(),'Get OTP')]")
	WebElement getOtpButton;

	@FindBy(xpath = "//*[contains(@id, 'mat-input-')")
	WebElement otpTextBox;

	@FindBy(xpath = "//button[contains(text(),'Verify')]")
	WebElement verifyButton;

	public void mobileInput() {
		mobileTextBox.clear();
		details.setMobileTextBox("8130647171");
		mobileTextBox.sendKeys(details.getMobileTextBox());
	}

	public void clickGetOtpButton() {
		getOtpButton.click();
	}

	public void mobileOtp(String otp) {
		otpTextBox.sendKeys(otp);
	}

	public void clickVerifyButton() {
		verifyButton.click();
	}
}
