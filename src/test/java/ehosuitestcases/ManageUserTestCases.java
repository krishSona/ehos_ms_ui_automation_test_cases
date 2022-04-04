package ehosuitestcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import baseClasses.Details;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageClasses.AdminHome;
import PageClasses.HealthFacilityConfi;
import PageClasses.LandingPage;
import PageClasses.LoginPage;
import PageClasses.ManageUsers;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;


@Listeners(Listerners.TestNGListener.class) 
public class ManageUserTestCases extends BaseTestClass{
	
	LandingPage landingPage;
	LoginPage loginPage;
	AdminHome adminHome;
	HealthFacilityConfi healthFacilityConfig;
	ManageUsers manageUsers;
	
	@Test(priority=0, enabled=true)
	public void AddNewUserAsNurse() throws InterruptedException, IOException {
		logger = report.createTest("Manage Users 'Add new User'");
		invokeBrowser();
		landingPage=OpenApplication();
		Thread.sleep(2000);
		loginPage = landingPage.clickLoginButton();
		Thread.sleep(5000);
		logger.log(Status.PASS, "User Successfully Redirected To Login Page.");
		loginPage.doLogin();
		Thread.sleep(15000);
		loginPage.clickCaptchaTextBox();
		logger.log(Status.INFO, "Clicking Login Button From Login Page.");
		adminHome=loginPage.clickLoginButton();
		Thread.sleep(5000);
		logger.log(Status.PASS, "User Successfully Logged In.");
		logger.log(Status.INFO, "Clicking clickHealthFacilityConfig.");
		healthFacilityConfig=adminHome.clickHealthFacilityConfig();
		logger.log(Status.PASS, "User Redirected To Health Facility Config Page.");
		Thread.sleep(2000);
		manageUsers=healthFacilityConfig.clickManageUser();
		Thread.sleep(2000);
		manageUsers.titleSelection();
		Thread.sleep(2000);
		manageUsers.firstName();
		Thread.sleep(2000);
		manageUsers.genderSelection();
		manageUsers.dateOfBirth();
		manageUsers.addNewUser();
	}
		
	@Test(priority=1, enabled=true)
	public void resetManageUserForm() throws InterruptedException, IOException {
		logger = report.createTest("Manage Users 'Add User Form Reset'");
		invokeBrowser();
		landingPage=OpenApplication();
		Thread.sleep(2000);
		loginPage = landingPage.clickLoginButton();
		Thread.sleep(5000);
		logger.log(Status.PASS, "User Successfully Redirected To Login Page.");
		loginPage.doLogin();
		Thread.sleep(15000);
		loginPage.clickCaptchaTextBox();
		logger.log(Status.INFO, "Clicking Login Button From Login Page.");
		adminHome=loginPage.clickLoginButton();
		Thread.sleep(5000);
		logger.log(Status.PASS, "User Successfully Logged In.");
		logger.log(Status.INFO, "Clicking clickHealthFacilityConfig.");
		healthFacilityConfig=adminHome.clickHealthFacilityConfig();
		logger.log(Status.PASS, "User Redirected To Health Facility Config Page.");
		Thread.sleep(2000);
		manageUsers=healthFacilityConfig.clickManageUser();
		Thread.sleep(2000);
		manageUsers.titleSelection();
		Thread.sleep(2000);
		manageUsers.firstName();
		Thread.sleep(2000);
		manageUsers.genderSelection();
		Thread.sleep(2000);
		manageUsers.dateOfBirth();
		Thread.sleep(2000);
		manageUsers.NewUserFormReset();
		Thread.sleep(2000);
	}
	
	@Test(priority=2, enabled=true)
	public void updateUser() throws InterruptedException, IOException {
		logger = report.createTest("Update User Details In Manage Users");
		invokeBrowser();
		landingPage=OpenApplication();
		Thread.sleep(2000);
		loginPage = landingPage.clickLoginButton();
		Thread.sleep(5000);
		logger.log(Status.PASS, "User Successfully Redirected To Login Page.");
		loginPage.doLogin();
		Thread.sleep(15000);
		loginPage.clickCaptchaTextBox();
		logger.log(Status.INFO, "Clicking Login Button From Login Page.");
		adminHome=loginPage.clickLoginButton();
		Thread.sleep(5000);
		logger.log(Status.PASS, "User Successfully Logged In.");
		logger.log(Status.INFO, "Clicking clickHealthFacilityConfig.");
		healthFacilityConfig=adminHome.clickHealthFacilityConfig();
		logger.log(Status.PASS, "User Redirected To Health Facility Config Page.");
		Thread.sleep(2000);
		manageUsers=healthFacilityConfig.clickManageUser();
		manageUsers.userUpdate();
		Thread.sleep(2000);
	}
	
	@Test(priority=3, enabled=true)
	public void userStatusCheck() throws InterruptedException, IOException {
		logger = report.createTest("Update User Status In Manage User'");
		invokeBrowser();
		landingPage=OpenApplication();
		Thread.sleep(2000);
		loginPage = landingPage.clickLoginButton();
		Thread.sleep(5000);
		logger.log(Status.PASS, "User Successfully Redirected To Login Page.");
		loginPage.doLogin();
		Thread.sleep(15000);
		loginPage.clickCaptchaTextBox();
		logger.log(Status.INFO, "Clicking Login Button From Login Page.");
		adminHome=loginPage.clickLoginButton();
		Thread.sleep(5000);
		logger.log(Status.PASS, "User Successfully Logged In.");
		logger.log(Status.INFO, "Clicking clickHealthFacilityConfig.");
		healthFacilityConfig=adminHome.clickHealthFacilityConfig();
		logger.log(Status.PASS, "User Redirected To Health Facility Config Page.");
		Thread.sleep(2000);
		manageUsers=healthFacilityConfig.clickManageUser();
		Thread.sleep(1000);
		manageUsers.statusTogle();
		Thread.sleep(2000);
	}
	
	@Test(priority=4, enabled=true)
	public void searchUser() throws InterruptedException, IOException {
		logger = report.createTest("Search User In Manage User'");
		invokeBrowser();
		landingPage=OpenApplication();
		Thread.sleep(2000);
		loginPage = landingPage.clickLoginButton();
		Thread.sleep(5000);
		logger.log(Status.PASS, "User Successfully Redirected To Login Page.");
		loginPage.doLogin();
		Thread.sleep(15000);
		loginPage.clickCaptchaTextBox();
		logger.log(Status.INFO, "Clicking Login Button From Login Page.");
		adminHome=loginPage.clickLoginButton();
		Thread.sleep(5000);
		logger.log(Status.PASS, "User Successfully Logged In.");
		logger.log(Status.INFO, "Clicking clickHealthFacilityConfig.");
		healthFacilityConfig=adminHome.clickHealthFacilityConfig();
		logger.log(Status.PASS, "User Redirected To Health Facility Config Page.");
		Thread.sleep(2000);
		manageUsers=healthFacilityConfig.clickManageUser();
		manageUsers.clickSearchInputTextBox();
		Thread.sleep(3000);
	}
	
}
