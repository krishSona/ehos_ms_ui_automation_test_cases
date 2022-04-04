package PageClasses;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.nextgen.actiondriver.Action;

//import ActionDriver.Action;
import baseClasses.BaseTestClass;
import baseClasses.Details;
import baseClasses.PageBaseClass;

//import baseClasses.PageBaseClass;

public class LoginPage extends BaseTestClass {
	Details details = new Details();

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "mat-input-0")
	public WebElement userName_textBox;

	@FindBy(xpath = "//input[@id='mat-input-1']")
	public WebElement password_textBox;

	@FindBy(xpath = "//input[@id='mat-input-2']")
	public WebElement captcha_textBox;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	public WebElement loginButton;

	public void clickCaptchaTextBox() {
		Action.click(driver, captcha_textBox);
	}

	public AdminHome clickLoginButton() {
		SoftAssert softAssert = new SoftAssert();
		boolean buttonNew=loginButton.isEnabled();
		if(buttonNew==true) {
			softAssert.assertFalse(false, "Button is enabled");
		}else {
			softAssert.assertFalse(false, "Button is disabled");
		}
		softAssert.assertAll();
		Action.click(driver, loginButton);
		return new AdminHome();
	}

	public void doLogin() {
		details.setUserName_txtBox("Amandeep_13082");
		userName_textBox.sendKeys(details.getUserName_txtBox());
		details.setPassword_txtBox("Ehos@1234");
		password_textBox.sendKeys(details.getPassword_txtBox());
	}

	public void OpdLoginCredential() {
		details.setUserName_txtBox("Vishal_13031");
		userName_textBox.sendKeys(details.getUserName_txtBox());
		details.setPassword_txtBox("Pass@1234");
		password_textBox.sendKeys(details.getPassword_txtBox());
	}

	public void verifyLoginErrorMessage() {
		Assert.assertNotNull(captcha_textBox);
		System.out.println("Captcha validation message is getting displayed");
	}
}
