package ehosuitestcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageClasses.AdminHome;
import PageClasses.LandingPage;
import PageClasses.LoginPage;
import PageClasses.OpdRegistration;
import PageClasses.UpdateRegistration;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;

public class UpdateRegistrationTestCases extends BaseTestClass{
	
	LandingPage landingPage;
	LoginPage loginPage;
	AdminHome adminHome;
	OpdRegistration opdRegistration;
	UpdateRegistration updateRegistration;
		
	@Test(priority = 0, enabled=true)
	public void searchPatientDetails() throws InterruptedException, IOException {
		logger = report.createTest("OPD Registration : Update Patient Details By Mobile Number");
		invokeBrowser();
		landingPage=OpenApplication();
		Thread.sleep(20000);
		loginPage = landingPage.clickLoginButton();
		Thread.sleep(2000);
		loginPage.doLogin();
		Thread.sleep(15000);
		loginPage.clickCaptchaTextBox();
		adminHome = loginPage.clickLoginButton();
		Thread.sleep(2000);
		opdRegistration = adminHome.clickOpdRegistration();
		Thread.sleep(2000);
		updateRegistration=opdRegistration.updateRegistrationMenu();
		Thread.sleep(2000);
		updateRegistration.findPatientDetails();
		Thread.sleep(2000);
		updateRegistration.updateMobileNo();
		Thread.sleep(5000);
	}
}
