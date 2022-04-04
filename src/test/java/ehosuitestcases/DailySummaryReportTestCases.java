package ehosuitestcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageClasses.AdminHome;
import PageClasses.DailySummaryReport;
import PageClasses.LandingPage;
import PageClasses.LoginPage;
import PageClasses.OpdRegistration;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;

public class DailySummaryReportTestCases extends BaseTestClass {
	
	LandingPage landingPage;
	LoginPage loginPage;
	AdminHome adminHome;
	OpdRegistration opdRegistration;
	DailySummaryReport dailySummaryReport;
	
	@Test(priority=0, enabled=true)
	public void getDailySummaryReport() throws InterruptedException, IOException {
		logger = report.createTest("OPD Registration : Get Daily Summary Report");
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
		Thread.sleep(2000);
		dailySummaryReport.enterStartDate();
		Thread.sleep(2000);
		dailySummaryReport.enterEndDate();
		Thread.sleep(2000);
		dailySummaryReport.clickGenerateButton();
		Thread.sleep(20000);
	}
	
	@Test(priority=1, enabled=true)
	public void dailySummaryReportFormReset() throws InterruptedException, IOException {
		logger = report.createTest("OPD Registration : Get Daily Summary Report Form Reset");
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
		Thread.sleep(2000);
		dailySummaryReport.enterStartDate();
		Thread.sleep(2000);
		dailySummaryReport.enterEndDate();
		Thread.sleep(2000);
		dailySummaryReport.clickResetButton();
		Thread.sleep(20000);
	}

}
