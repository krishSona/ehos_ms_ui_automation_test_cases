package ehosuitestcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageClasses.AdminHome;
import PageClasses.LandingPage;
import PageClasses.LoginPage;
import PageClasses.OpdConfig;
import PageClasses.PatientRegistrationForm;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;

public class PatientRegistrationFormTestCases extends BaseTestClass {

	LandingPage landingPage;
	LoginPage loginPage;
	AdminHome adminHome;
	OpdConfig opdConfig;
	PatientRegistrationForm patientRegistraionForm;

	@Test(priority = 0, enabled = true)
	public void patientNewRegiAddEmailField() throws InterruptedException, IOException {
		logger = report.createTest("Manage Users 'Add User Form Reset'");
		invokeBrowser();
		landingPage = OpenApplication();
		Thread.sleep(2000);
		loginPage = landingPage.clickLoginButton();
		Thread.sleep(5000);
		loginPage.doLogin();
		Thread.sleep(10000);
		loginPage.clickCaptchaTextBox();
		adminHome = loginPage.clickLoginButton();
		Thread.sleep(5000);
		opdConfig = adminHome.clickOpdConfig();
		Thread.sleep(2000);
		patientRegistraionForm = opdConfig.clickPatientRegi();
		Thread.sleep(2000);
		patientRegistraionForm.clickEmail();
		Thread.sleep(2000);
		patientRegistraionForm.clickSaveButton();
		Thread.sleep(2000);
	}

	@Test(priority = 1, enabled = true)
	public void patientCasualityRegiAddGuardianDetails() throws InterruptedException, IOException {
		invokeBrowser();
		landingPage = OpenApplication();
		Thread.sleep(2000);
		loginPage = landingPage.clickLoginButton();
		Thread.sleep(5000);
		loginPage.doLogin();
		Thread.sleep(10000);
		loginPage.clickCaptchaTextBox();
		adminHome = loginPage.clickLoginButton();
		Thread.sleep(5000);
		opdConfig = adminHome.clickOpdConfig();
		Thread.sleep(2000);
		patientRegistraionForm = opdConfig.clickPatientRegi();
		Thread.sleep(2000);
		patientRegistraionForm.clickCasualityRegi();
		Thread.sleep(2000);
		patientRegistraionForm.clickGuardianName();
		Thread.sleep(2000);
		patientRegistraionForm.clickGuardianRelation();
		Thread.sleep(2000);
		patientRegistraionForm.clickSaveButton();
		Thread.sleep(2000);
	}
}
