package ehosuitestcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageClasses.AdminHome;
import PageClasses.LandingPage;
import PageClasses.LoginPage;
import PageClasses.OpdConfig;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;

public class OpdClinicConfigTestCases extends BaseTestClass {
	
	LandingPage landingPage;
	LoginPage loginPage;
	AdminHome adminHome;
	OpdConfig opdConfig;
	
	@Test(priority=0, enabled=true)
	public void addClinic() throws InterruptedException, IOException {
		logger = report.createTest("Manage Users 'Add User Form Reset'");
		invokeBrowser();
		landingPage=OpenApplication();
		Thread.sleep(2000);
		loginPage = landingPage.clickLoginButton();
		Thread.sleep(5000);
		loginPage.doLogin();
		Thread.sleep(15000);
		loginPage.clickCaptchaTextBox();
		adminHome=loginPage.clickLoginButton();
		Thread.sleep(5000);
		opdConfig=adminHome.clickOpdConfig();
		Thread.sleep(2000);
		opdConfig.selectDepartment();
		Thread.sleep(2000);
		opdConfig.clinicName();
		Thread.sleep(2000);
		opdConfig.putTagLine();
		Thread.sleep(2000);
		opdConfig.saveClinic();
		Thread.sleep(2000);
		opdConfig.clickOk();
	}
}
