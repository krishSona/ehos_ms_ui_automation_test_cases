package ehosuitestcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageClasses.AdminHome;
import PageClasses.HealthFacilityConfi;
import PageClasses.LandingPage;
import PageClasses.LoginPage;
import PageClasses.ManageUsers;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;

@Listeners(Listerners.TestNGListener.class)
public class HealthFacilityConfigTestCases extends BaseTestClass{
	
	LandingPage landingPage;
	LoginPage loginPage;
	AdminHome adminHome;
	HealthFacilityConfi healthFacilityConfig;
	ManageUsers manageUsers;
	
	@BeforeMethod
	public void setup() throws IOException {
		invokeBrowser();
	}
	
	@AfterMethod
	public void tearDown() {
		flushReport();
	}
	
	@Test(priority=0, enabled=true )
	public void addDepartment() throws InterruptedException, IOException {
		logger = report.createTest("Verify Department Addition Functionality.");
		landingPage=OpenApplication();
		loginPage = landingPage.clickLoginButton();
		Thread.sleep(5000);
		logger.log(Status.PASS, "User Successfully Redirected To Login Page.");
		loginPage.doLogin();
		Thread.sleep(15000);
		loginPage.clickCaptchaTextBox();
		logger.log(Status.INFO, "Clicking Login Button From Login Page.");
		adminHome=loginPage.clickLoginButton();
		Thread.sleep(5000);
		logger.log(Status.PASS, "User Successfully Logged In.");
		logger.log(Status.INFO, "Clicking clickHealthFacilityConfig.");
		healthFacilityConfig=adminHome.clickHealthFacilityConfig();
		logger.log(Status.PASS, "User Redirected To Health Facility Config Page.");
		healthFacilityConfig.selectDepartment();
		healthFacilityConfig.addDepartment();
	}
	
	@Test(priority=1, enabled=true )
	public void addUnit() throws InterruptedException, IOException {
		logger = report.createTest("Verify Unit Addition Functionality.");
		landingPage=OpenApplication();
		loginPage = landingPage.clickLoginButton();
		Thread.sleep(5000);
		logger.log(Status.PASS, "User Successfully Redirected To Login Page.");
		loginPage.doLogin();
		Thread.sleep(15000);
		loginPage.clickCaptchaTextBox();
		logger.log(Status.INFO, "Clicking Login Button From Login Page.");
		adminHome=loginPage.clickLoginButton();
		Thread.sleep(5000);
		healthFacilityConfig=adminHome.clickHealthFacilityConfig();
		healthFacilityConfig.unitAddition();
		Thread.sleep(3000);
	}
	
	@Test(priority=2, enabled=true )
	public void addRegistrationCharge() throws InterruptedException, IOException {
		logger = report.createTest("Verify Registration Charge Addition Functionality.");
		landingPage=OpenApplication();
		loginPage = landingPage.clickLoginButton();
		Thread.sleep(5000);
		logger.log(Status.PASS, "User Successfully Redirected To Login Page.");
		loginPage.doLogin();
		Thread.sleep(15000);
		loginPage.clickCaptchaTextBox();
		logger.log(Status.INFO, "Clicking Login Button From Login Page.");
		adminHome=loginPage.clickLoginButton();
		Thread.sleep(5000);
		healthFacilityConfig=adminHome.clickHealthFacilityConfig();
		healthFacilityConfig.registrationAndLogoConfi();
		Thread.sleep(1000);
		healthFacilityConfig.savaButton();
	}
}
