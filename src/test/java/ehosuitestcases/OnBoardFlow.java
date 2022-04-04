package ehosuitestcases;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageClasses.AdminHome;
import PageClasses.HealthFacilityConfi;
import PageClasses.LandingPage;
import PageClasses.LoginPage;
import PageClasses.OnBoardingPage;
import PageClasses.TrackOnBoardRequest;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;
import utilities.Log;

public class OnBoardFlow extends BaseTestClass {

	LandingPage landingPage;
	LoginPage loginPage;
	OnBoardingPage onboardingPage;
	TrackOnBoardRequest trackOnBoardRequest;
	AdminHome adminHome;
	HealthFacilityConfi healthFacilityConfig;
	
	@BeforeMethod
	public void setup() throws IOException {
		invokeBrowser();
	}
	
	@AfterMethod
	public void tearDown() {
		flushReport();
	}

	@Test(priority = 8, enabled = true)
	public void UserLoginFlow() throws InterruptedException, IOException {

		logger = report.createTest("Login On Ehospital");
		landingPage=OpenApplication();
		landingPage.veryEmail();
		loginPage = landingPage.clickLoginButton();
		loginPage.doLogin();
		Thread.sleep(15000);
		loginPage.clickCaptchaTextBox();
		adminHome = loginPage.clickLoginButton();
	}

	@Test(priority = 7, enabled = true)
	public void eHospitalOnBoarding() throws InterruptedException, IOException {
		logger = report.createTest("Onboarding On Ehospital");
		landingPage = OpenApplication();
		onboardingPage = landingPage.clickEhosOnBoardingButton();
//		Thread.sleep(1000);
//		onboardingPage.checkNextButtonEnable();
//		onboardingPage.clickTncCheckBox();
//		Thread.sleep(1000);
//		onboardingPage.clickNextButton();
//		Thread.sleep(1000);
//		onboardingPage.clickModuleCheckBox();
//		Thread.sleep(1000);
//		onboardingPage.nextClick();
//		Thread.sleep(1000);
//		onboardingPage.clickNinTextBox();
//		Thread.sleep(1000);
//		onboardingPage.inputNinId();
//		Thread.sleep(2000);
//		onboardingPage.clickHfNextButton();
//		onboardingPage.clickIntialField();
//		Thread.sleep(2000);
//		onboardingPage.selectIntialValue();
//		Thread.sleep(2000);
//		onboardingPage.headOfHealthFacilityDetails();
//		Thread.sleep(2000);
//		onboardingPage.ndDetails();
//		Actions scroller = new Actions(driver);
//		scroller.sendKeys(Keys.PAGE_DOWN).build().perform();
//		scroller.sendKeys(Keys.PAGE_DOWN).build().perform();
//		onboardingPage.clickSaveButton();
//		Thread.sleep(2000);
//		onboardingPage.verifyMnumber();
	}

	@Test(priority = 6, enabled = true)
	public void trackRequestStatus() throws InterruptedException, IOException {
		logger = report.createTest("Check Track Request Status");
		landingPage=OpenApplication();
		onboardingPage = landingPage.clickEhosOnBoardingButton();
		trackOnBoardRequest = onboardingPage.verifyTrackRequestStatus();
		trackOnBoardRequest.mobileInput();
		trackOnBoardRequest.clickGetOtpButton();
		trackOnBoardRequest.clickVerifyButton();
	}

	@Test(priority = 0, enabled = true)
	public void supportEmailVerify() throws IOException {
		landingPage = OpenApplication();
		boolean result = landingPage.veryEmail();
		Assert.assertTrue(result);
	}

	@Test(priority = 1, enabled = true)
	public void verifyLoginButton() throws IOException {
		logger = report.createTest("Check Track Request Status");
		landingPage=OpenApplication();
		landingPage.clickLoginButton();
	}

	@Test(priority = 2, enabled = true)
	public void homeLinkVerify() throws IOException {
		landingPage = OpenApplication();
		boolean result= landingPage.verifyHomeLink();
		Assert.assertTrue(result);
	}

	@Test(priority = 3, enabled = true)
	public void verifyEhospitalOnboardLink() throws IOException {
		logger = report.createTest("OnBoarding Flow Test Cases Report");
		landingPage=OpenApplication();
		landingPage.clickEhosOnBoardingButton();
	}

	@Test(priority = 4, enabled = true)
	public void verifyGovtLogo() throws IOException {
		landingPage = OpenApplication();
		boolean result = landingPage.checkGovtLogo();
		Assert.assertTrue(result);
	}

	@Test(priority = 5, enabled = true)
	public void verifyNextGenLogo() {
		Log.startTestCase("verifyNextGenLogo");
		landingPage = OpenApplication();
		boolean result = landingPage.checkNextGenLogo();
		Assert.assertTrue(result);
		landingPage=OpenApplication();
	}
	
}
