package PageClasses;

import java.util.Properties;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.nextgen.actiondriver.Action;

//import ActionDriver.Action;
import baseClasses.BaseTestClass;

//import java.sql.Driver;

public class LandingPage extends BaseTestClass {

//	public ExtentTest logger;

	public LandingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Login')]")
	public WebElement loginButton;

	@FindBy(xpath = "//span[contains(text(),'support-ngehospital@nic.in')]")
	public WebElement supportEmail;

	@FindBy(xpath = "//a[contains(text(),'eHospital Onboard')]")
	public WebElement eHosOnboardingButton;

	@FindBy(xpath = "//app-header/section[2]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	public WebElement homeLink;
	
	@FindBy(xpath = "//app-header/section[2]/div[1]/div[1]/div[1]/nav[1]/a[1]/img[1]")
	private WebElement gLogo;
	
	@FindBy(xpath = "//app-header/section[2]/div[1]/div[1]/div[1]/nav[1]/a[2]/img[1]")
	private WebElement nextGenLogo;
	
	SoftAssert softAssert=new SoftAssert();

	public LoginPage clickLoginButton() {
		Action.click(driver, loginButton);
		softAssert.assertTrue(loginButton.isDisplayed() , "Button is not displayed");
		softAssert.assertTrue(loginButton.isEnabled(), "Login button is not clickable");
		softAssert.assertAll();
		Action.click(driver, loginButton);
		return new LoginPage();
	}

	public boolean veryEmail() {
		return	Action.isDisplayed(driver, supportEmail);
	}

	public boolean verifyHomeLink() {
		Action.isDisplayed(driver, homeLink);
		return Action.isEnabled(driver, homeLink);
//		softAssert.assertTrue(homeLink.isDisplayed(), "Home link is not displayed");
//		softAssert.assertTrue(homeLink.isEnabled(), "Home link is not working");
//		softAssert.assertAll();
	}

	public OnBoardingPage clickEhosOnBoardingButton() {
		softAssert.assertTrue(eHosOnboardingButton.isDisplayed(), "ehospital Onboarding link is not displayed");
		softAssert.assertTrue(eHosOnboardingButton.isEnabled(), "eHospital Onboarding link is not working");
		softAssert.assertAll();
		Action.click(driver,eHosOnboardingButton);
		Set<String> allHandle=driver.getWindowHandles();
		for (String windowHandle:allHandle) {
			driver.switchTo().window(windowHandle);
		}
		return new OnBoardingPage();
	}
	
	public boolean checkGovtLogo() {
		return Action.isDisplayed(driver, gLogo);
	}
	
	public boolean checkNextGenLogo() {
		return Action.isDisplayed(driver, nextGenLogo);
	}
	
	public String getTitle() {
		String nextGenTitle=driver.getTitle();
		return nextGenTitle;
	}
	
}
