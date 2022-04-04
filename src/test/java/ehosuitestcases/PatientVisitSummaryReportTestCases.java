package ehosuitestcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageClasses.AdminHome;
import PageClasses.LandingPage;
import PageClasses.LoginPage;
import PageClasses.OpdRegistration;
import PageClasses.PatientVisitSummaryReport;
import PageClasses.Reports;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;

public class PatientVisitSummaryReportTestCases extends BaseTestClass {
	
	LandingPage landingPage;
	LoginPage loginPage;
	AdminHome adminHome;
	OpdRegistration opdRegistration;
	Reports reports;
	PatientVisitSummaryReport patientVisitSummaryReport;
	
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
		patientVisitSummaryReport=opdRegistration.patientVisitSummryReport();
		Thread.sleep(2000);
		patientVisitSummaryReport.sDateAndEndDate();
		Thread.sleep(2000);
		patientVisitSummaryReport.patientDept();
		Thread.sleep(2000);
		patientVisitSummaryReport.patientUnit();
		Thread.sleep(20000);
		patientVisitSummaryReport.patientClinic();
		Thread.sleep(20000);
		patientVisitSummaryReport.patientDr();
		Thread.sleep(20000);
		patientVisitSummaryReport.clickGenerateButton();
		Thread.sleep(20000);
	}

}
