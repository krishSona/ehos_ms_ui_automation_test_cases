package ehosuitestcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageClasses.AdminHome;
import PageClasses.LandingPage;
import PageClasses.LoginPage;
import PageClasses.OpdRegistration;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;

public class OpdRegistrationTestCases extends BaseTestClass {

	LandingPage landingPage;
	LoginPage loginPage;
	AdminHome adminHome;
	OpdRegistration opdRegistration;

	@Test(priority = 0, enabled=false)
	public void ClickOpdRegistrationSearchByMobile() throws InterruptedException, IOException {
		logger = report.createTest("OPD Registration : Search Patient By Mobile");
		invokeBrowser();
		Thread.sleep(2000);
		landingPage=OpenApplication();
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
		opdRegistration.searchByMobile();
		Thread.sleep(3000);
	}
	
	@Test(priority = 1, enabled=false)
	public void ClickOpdRegistSearchByName() throws InterruptedException, IOException {
		logger = report.createTest("OPD Registration : Search Patient By Name");
		invokeBrowser();
		landingPage=OpenApplication();
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
		opdRegistration.searchByName();
		Thread.sleep(3000);
	}
	
	@Test(priority = 2, enabled=false)
	public void ClickOpdRegistSearchByUhid() throws InterruptedException, IOException {
		logger = report.createTest("OPD Registration : Search Patient By UHID");
		invokeBrowser();
		landingPage=OpenApplication();
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
		opdRegistration.searchByUhid();
		Thread.sleep(3000);
	}
	
	@Test(priority=3, enabled=true)
	public void verifyMobileInput() throws InterruptedException, IOException {
		logger = report.createTest("OPD Registration : Patient Registration");
		invokeBrowser();
		landingPage=OpenApplication();
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
		opdRegistration.patientMobile();
		Thread.sleep(2000);
		opdRegistration.patientFname();
		Thread.sleep(2000);
		opdRegistration.patientDob();
		Thread.sleep(2000);
		opdRegistration.patientAddres();
		Thread.sleep(2000);
		opdRegistration.selectState();
		Thread.sleep(2000);
		opdRegistration.selectDist();
		Thread.sleep(3000);
		opdRegistration.clickSearchButton();
		Thread.sleep(10000);
	}	
}
