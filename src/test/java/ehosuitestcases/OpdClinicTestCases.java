package ehosuitestcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageClasses.AdminHome;
import PageClasses.LandingPage;
import PageClasses.LoginPage;
import PageClasses.OpdClinic;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;

public class OpdClinicTestCases extends BaseTestClass {

	LandingPage landingPage;
	LoginPage loginPage;
	AdminHome adminHome;
	OpdClinic opdClinic;

	@Test(priority = 0, enabled=true)
	public void resetVitalForm() throws InterruptedException, IOException {
		logger = report.createTest("Reset Vital Details'");
		invokeBrowser();
		landingPage = OpenApplication();
		Thread.sleep(2000);
		loginPage = landingPage.clickLoginButton();
		Thread.sleep(5000);
		loginPage.OpdLoginCredential();
		Thread.sleep(15000);
		loginPage.clickCaptchaTextBox();
		adminHome = loginPage.clickLoginButton();
		Thread.sleep(2000);
		opdClinic = adminHome.clickOpdClinic();
		Thread.sleep(2000);
		opdClinic.searchByUhid();
		Thread.sleep(1000);
		opdClinic.checkPatientDetails();
		Thread.sleep(1000);
		opdClinic.vitalHeightDetails();
		Thread.sleep(1000);
		opdClinic.vitalWeightDetails();
		Thread.sleep(1000);
		opdClinic.vitalBodyTempDetails();
		Thread.sleep(1000);
		opdClinic.vitalBloodPresureSystolicDetail();
		Thread.sleep(1000);
		opdClinic.vitalBloodPresureDiastolic();
		Thread.sleep(1000);
		opdClinic.vitalRespirationRate();
		Thread.sleep(1000);
		opdClinic.vitalPulse();
		Thread.sleep(1000);
		opdClinic.resetVitalDetail();
		Thread.sleep(5000);
	}
	
	@Test(priority = 1, enabled=true)
	public void saveVitalDetails() throws InterruptedException, IOException {
		logger = report.createTest("Save Vital Details'");
		invokeBrowser();
		landingPage = OpenApplication();
		Thread.sleep(2000);
		loginPage = landingPage.clickLoginButton();
		Thread.sleep(5000);
		loginPage.OpdLoginCredential();
		Thread.sleep(15000);
		loginPage.clickCaptchaTextBox();
		adminHome = loginPage.clickLoginButton();
		Thread.sleep(2000);
		opdClinic = adminHome.clickOpdClinic();
		Thread.sleep(2000);
		opdClinic.searchByUhid();
		Thread.sleep(1000);
		opdClinic.checkPatientDetails();
		Thread.sleep(1000);
		opdClinic.vitalHeightDetails();
		Thread.sleep(1000);
		opdClinic.vitalWeightDetails();
		Thread.sleep(1000);
		opdClinic.vitalBodyTempDetails();
		Thread.sleep(1000);
		opdClinic.vitalBloodPresureSystolicDetail();
		Thread.sleep(1000);
		opdClinic.vitalBloodPresureDiastolic();
		Thread.sleep(1000);
		opdClinic.vitalRespirationRate();
		Thread.sleep(1000);
		opdClinic.vitalPulse();
		Thread.sleep(1000);
		opdClinic.saveVitalDetail();
		Thread.sleep(5000);
	}
	
	@Test(priority = 2, enabled=true)
	public void resetComplainDetails() throws InterruptedException, IOException {
		logger = report.createTest("Reset Complain Details'");
		invokeBrowser();
		landingPage = OpenApplication();
		Thread.sleep(2000);
		loginPage = landingPage.clickLoginButton();
		Thread.sleep(5000);
		loginPage.OpdLoginCredential();
		Thread.sleep(15000);
		loginPage.clickCaptchaTextBox();
		adminHome = loginPage.clickLoginButton();
		Thread.sleep(2000);
		opdClinic = adminHome.clickOpdClinic();
		Thread.sleep(2000);
		opdClinic.checkPatientDetails();
		Thread.sleep(1000);
		opdClinic.patientComplaintDetail();
		Thread.sleep(10000);
//		opdClinic.vitalHeightDetails();
//		Thread.sleep(1000);
//		opdClinic.vitalWeightDetails();
//		Thread.sleep(1000);
//		opdClinic.vitalBodyTempDetails();
//		Thread.sleep(1000);
//		opdClinic.vitalBloodPresureSystolicDetail();
//		Thread.sleep(1000);
//		opdClinic.vitalBloodPresureDiastolic();
//		Thread.sleep(1000);
//		opdClinic.vitalRespirationRate();
//		Thread.sleep(1000);
//		opdClinic.vitalPulse();
//		Thread.sleep(1000);
//		opdClinic.saveVitalDetail();
//		Thread.sleep(5000);
	}
}
