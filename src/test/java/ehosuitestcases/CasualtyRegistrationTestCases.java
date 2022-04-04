package ehosuitestcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageClasses.AdminHome;
import PageClasses.CasualtyRegistration;
import PageClasses.LandingPage;
import PageClasses.LoginPage;
import PageClasses.OpdRegistration;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;

public class CasualtyRegistrationTestCases extends BaseTestClass {

	LandingPage landingPage;
	LoginPage loginPage;
	AdminHome adminHome;
	OpdRegistration opdRegistration;
	CasualtyRegistration casualtyRegistration;

	@Test(priority = 0, enabled = true)
	public void ClickOpdRegistrationSearchByMobile() throws InterruptedException, IOException {
		logger = report.createTest("OPD Registration : Search Patient By Mobile");
		invokeBrowser();
		landingPage = OpenApplication();
		Thread.sleep(2000);
		loginPage = landingPage.clickLoginButton();
		Thread.sleep(2000);
		loginPage.doLogin();
		Thread.sleep(15000);
		loginPage.clickCaptchaTextBox();
		adminHome = loginPage.clickLoginButton();
		Thread.sleep(2000);
		opdRegistration = adminHome.clickOpdRegistration();
		Thread.sleep(2000);
		casualtyRegistration = opdRegistration.emergencyRegistrationMenu();
		Thread.sleep(2000);
		casualtyRegistration.casualtyPatientDetail();
		Thread.sleep(30000);
	}
	
	@Test(priority=1, enabled=false)
	public void verifyCasualtyDept() throws IOException, InterruptedException {
		logger = report.createTest("OPD Registration : Search Patient By Mobile");
		invokeBrowser();
		landingPage = OpenApplication();
		loginPage = landingPage.clickLoginButton();
		loginPage.doLogin();
		Thread.sleep(15000);
		loginPage.clickCaptchaTextBox();
		adminHome = loginPage.clickLoginButton();
		opdRegistration = adminHome.clickOpdRegistration();
		casualtyRegistration = opdRegistration.emergencyRegistrationMenu();
		casualtyRegistration.selectCasualtyDept();
	}

}
