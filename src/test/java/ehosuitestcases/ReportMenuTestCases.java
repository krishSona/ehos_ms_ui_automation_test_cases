package ehosuitestcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageClasses.AdminHome;
import PageClasses.DailyCollectionReport;
import PageClasses.DailySummaryReport;
import PageClasses.LandingPage;
import PageClasses.LoginPage;
import PageClasses.OpdRegistration;
import PageClasses.PatientVisitSummaryReport;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;

public class ReportMenuTestCases extends BaseTestClass{
	
	LandingPage landingPage;
	LoginPage loginPage;
	AdminHome adminHome;
	OpdRegistration opdRegistration;
	DailySummaryReport dailySummaryReport;
	PatientVisitSummaryReport patientVisitSummaryReport;
	DailyCollectionReport dailyCollectionReport;
	
	
	@Test(priority=0, enabled=false)
	public void clickDsummaryReport() throws InterruptedException, IOException {
		logger = report.createTest("OPD Registration : Open Daily Summary Report");
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
		dailySummaryReport=opdRegistration.dailySummaryReport();
	}
	
	@Test(priority=1, enabled=false)
	public void clickPatientVsummaryReport() throws InterruptedException, IOException {
		logger = report.createTest("OPD Registration : Open Patient Visit Summary Report");
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
		patientVisitSummaryReport=opdRegistration.patientVisitSummryReport();
	}
	
	@Test(priority=2)
	public void clickDailyCollectionreport() throws InterruptedException, IOException {
		logger = report.createTest("OPD Registration : Open Daily Collction Report");
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
		dailyCollectionReport=opdRegistration.dailyCreport();
		Thread.sleep(20000);
	}

}
