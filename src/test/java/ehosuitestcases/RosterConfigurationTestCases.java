package ehosuitestcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageClasses.AdminHome;
import PageClasses.LandingPage;
import PageClasses.LoginPage;
import PageClasses.OpdConfig;
import PageClasses.PatientRegistrationForm;
import PageClasses.RosterConfiguration;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;

public class RosterConfigurationTestCases extends BaseTestClass{
	
	LandingPage landingPage;
	LoginPage loginPage;
	AdminHome adminHome;
	OpdConfig opdConfig;
	PatientRegistrationForm patientRegistraionForm;
	RosterConfiguration rosterConfig;
	
	@Test(priority=0,enabled=true)
	public void addRoster() throws InterruptedException, IOException {
		logger = report.createTest("Manage Users 'Add User Form Reset'");
		invokeBrowser();
		landingPage=OpenApplication();
		Thread.sleep(2000);
     	loginPage = landingPage.clickLoginButton();
		Thread.sleep(5000);
		loginPage.doLogin();
		Thread.sleep(10000);
		loginPage.clickCaptchaTextBox();
		Thread.sleep(2000);
		adminHome=loginPage.clickLoginButton();
		Thread.sleep(4000);
		opdConfig=adminHome.clickOpdConfig();
		Thread.sleep(2000);
		rosterConfig=opdConfig.clickRosterConfig();
		Thread.sleep(2000);
		rosterConfig.selectDept();
		Thread.sleep(2000);
		rosterConfig.selectClinic();
		Thread.sleep(2000);
		rosterConfig.clickSearchButton();
		Thread.sleep(2000);
		rosterConfig.clickNewRoster();
		Thread.sleep(2000);
		rosterConfig.selectDate();
		Thread.sleep(10000);
		rosterConfig.unitSelection();
		Thread.sleep(2000);
		rosterConfig.selectDay();
		Thread.sleep(2000);
		rosterConfig.selectRoom();
		Thread.sleep(2000);
		rosterConfig.selectDr();
		Thread.sleep(2000);
		rosterConfig.saveRosterButton();
		Thread.sleep(3000);
	}
	
	@Test(priority=1,enabled=true)
	public void updateRoster() throws InterruptedException, IOException {
		logger = report.createTest("Manage Users 'Add User Form Reset'");
		invokeBrowser();
		landingPage=OpenApplication();
		Thread.sleep(2000);
     	loginPage = landingPage.clickLoginButton();
		Thread.sleep(5000);
		loginPage.doLogin();
		Thread.sleep(10000);
		loginPage.clickCaptchaTextBox();
		Thread.sleep(2000);
		adminHome=loginPage.clickLoginButton();
		Thread.sleep(4000);
		opdConfig=adminHome.clickOpdConfig();
		Thread.sleep(2000);
		rosterConfig=opdConfig.clickRosterConfig();
		Thread.sleep(2000);
		rosterConfig.selectDept();
		Thread.sleep(2000);
		rosterConfig.selectClinic();
		Thread.sleep(2000);
		rosterConfig.clickSearchButton();
		Thread.sleep(2000);
	}
}
