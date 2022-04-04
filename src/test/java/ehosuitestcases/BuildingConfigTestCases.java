package ehosuitestcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageClasses.AdminHome;
import PageClasses.BuildingConfiguration;
import PageClasses.HealthFacilityConfi;
import PageClasses.LandingPage;
import PageClasses.LoginPage;
import PageClasses.ManageUsers;
import baseClasses.BaseTestClass;

public class BuildingConfigTestCases extends BaseTestClass {

	LandingPage landingPage;
	LoginPage loginPage;
	AdminHome adminHome;
	HealthFacilityConfi healthFacilityConfig;
	ManageUsers manageUsers;
	BuildingConfiguration buildingConfiguration;

	@Test(priority=0, enabled=true)
	public void addBuildingDetail() throws InterruptedException, IOException {
		logger = report.createTest("Building Configuration in HFC");
		invokeBrowser();
		landingPage = OpenApplication();
		loginPage = landingPage.clickLoginButton();
		Thread.sleep(5000);
		loginPage.doLogin();
		Thread.sleep(15000);
		loginPage.clickCaptchaTextBox();
		adminHome = loginPage.clickLoginButton();
		healthFacilityConfig = adminHome.clickHealthFacilityConfig();
		healthFacilityConfig.clickConfigMenu();
		Thread.sleep(2000);
		buildingConfiguration = healthFacilityConfig.clickBuildingConfiguration();
		Thread.sleep(2000);
		buildingConfiguration.buildingName();
		buildingConfiguration.blockName();
		buildingConfiguration.floorName();
		buildingConfiguration.prefixRumName();
		buildingConfiguration.sufixRumName();
		buildingConfiguration.startRumNo();
		buildingConfiguration.endRumNo();
		buildingConfiguration.addRoom();
		buildingConfiguration.saveBuilding();
	}
	
	@Test(priority=1, enabled=true)
	public void deleteBlock() throws InterruptedException, IOException {
		logger = report.createTest("Add Multiple Block & Remove Them");
		invokeBrowser();
		landingPage = OpenApplication();
		loginPage = landingPage.clickLoginButton();
		Thread.sleep(5000);
		loginPage.doLogin();
		Thread.sleep(15000);
		loginPage.clickCaptchaTextBox();
		adminHome = loginPage.clickLoginButton();
		healthFacilityConfig = adminHome.clickHealthFacilityConfig();
		healthFacilityConfig.clickConfigMenu();
		Thread.sleep(2000);
		buildingConfiguration = healthFacilityConfig.clickBuildingConfiguration();
		Thread.sleep(2000);
		buildingConfiguration.buildingName();
		Thread.sleep(1000);
		buildingConfiguration.blockName();
		Thread.sleep(2000);
		buildingConfiguration.addBlock();
		Thread.sleep(2000);
		buildingConfiguration.secondBlockName();
		Thread.sleep(2000);
		buildingConfiguration.deleteBlock();
		Thread.sleep(2000);
	}
	
	@Test(priority=2, enabled=true)
	public void deleteFloor() throws InterruptedException, IOException {
		logger = report.createTest("Building Configuration in HFC");
		invokeBrowser();
		landingPage = OpenApplication();
		loginPage = landingPage.clickLoginButton();
		Thread.sleep(5000);
		loginPage.doLogin();
		Thread.sleep(15000);
		loginPage.clickCaptchaTextBox();
		adminHome = loginPage.clickLoginButton();
		Thread.sleep(2000);
		healthFacilityConfig = adminHome.clickHealthFacilityConfig();
		healthFacilityConfig.clickConfigMenu();
		Thread.sleep(2000);
		buildingConfiguration = healthFacilityConfig.clickBuildingConfiguration();
		Thread.sleep(2000);
		buildingConfiguration.buildingName();
		Thread.sleep(1000);
		buildingConfiguration.floorName();
		Thread.sleep(2000);
		buildingConfiguration.addFloor();
		Thread.sleep(2000);
		buildingConfiguration.SecondflorName();
		Thread.sleep(2000);
		buildingConfiguration.deleteFloor();
		Thread.sleep(2000);
	}

}
