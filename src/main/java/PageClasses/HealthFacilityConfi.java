package PageClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;

import baseClasses.Details;
import baseClasses.PageBaseClass;

public class HealthFacilityConfi extends PageBaseClass {

//	public HealthFacilityConfi(WebDriver driver, ExtentTest logger, Properties prop) {
//		super(driver, logger, prop);
//	}
	Details details= new Details();

	public HealthFacilityConfi() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//app-header/div[1]/div[3]/a[1]/em[1]")
	WebElement homeButton;

	@FindBy(xpath = "//a[contains(text(),'Building Configuration')]")
	private WebElement buildingConfig;

	@FindBy(xpath = "/html/body/app-root/section/div/app-hospitalconfiguration/div/mat-tab-group/div/mat-tab-body[1]/div/mat-card/mat-card-content/form/div/div/div/div/div[1]/div/mat-chip-list/div/mat-chip[4]")
	private WebElement department;

	@FindBy(xpath = "//button[contains(text(),'ADD/UPDATE departments')]")
	private WebElement addDepartButton;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement configSaveButton;

	@FindBy(xpath = "//mat-tab-body/div[1]/mat-card[1]/mat-card-content[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement deptList;

	@FindBy(xpath = "//span[contains(text(),'Cardiology')]")
	private WebElement selectDept;

	@FindBy(xpath = "//input[@id='mat-input-3' and @formcontrolname='unit_name']")
	private WebElement unitNameTextBox;

	@FindBy(xpath = "//button[contains(text(),'Add/Update Unit')]")
	private WebElement unitAddButton;

	@FindBy(xpath = "//input[@id='mat-input-0' and @formcontrolname='basic_registration_charges']")
	private WebElement registrationCharTextBox;

	@FindBy(xpath = "//body/app-root[1]/app-sidenav[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/i[2]")
	private WebElement configMenu;

	@FindBy(xpath = "//a[contains(text(),'Manage Users')]")
	private WebElement manageUsers;
	
	@FindBy(xpath = "//div[contains(text(),'CONFIGURE UNITS')]")
	private WebElement unitConfi;
	
	@FindBy(xpath = "//div[contains(text(),'CONFIGURE REGISTRATION CHARGE AND LOGO')]")
	private WebElement registrationAndLogoConfi;

	SoftAssert sAssert = new SoftAssert();

	public AdminHome clickHomeButton() {
		homeButton.click();
		Assert.assertTrue(homeButton.isEnabled(), "Home Button enabled");
//		AdminHome adminHome = new AdminHome(driver, logger, prop);
//		PageFactory.initElements(driver, adminHome);
		return new AdminHome();
	}

	public BuildingConfiguration clickBuildingConfiguration() {
		buildingConfig.click();
		Assert.assertTrue(buildingConfig.isEnabled(), "Building config True");
		return new BuildingConfiguration();
	}

	public void selectDepartment() {
		department.click();
		sAssert.assertEquals(false, department.isEnabled());
	}

	public void addDepartment() {
		addDepartButton.click();
		sAssert.assertFalse(addDepartButton.isEnabled());
	}

	public void savaButton() {
		configSaveButton.click();
		sAssert.assertTrue(configSaveButton.isEnabled());
	}

	public void unitAddition() {
		unitConfi.click();
		deptList.click();
		selectDept.click();
		details.setUnitNameTextBox("Cardio Clinic1");
		unitNameTextBox.sendKeys(details.getUnitNameTextBox());
		unitAddButton.click();
	}

	public void clickConfigMenu() {
		configMenu.click();
		sAssert.assertEquals(false, configMenu.isEnabled());
	}

	public void registrationAndLogoConfi() {
		registrationAndLogoConfi.click();
		details.setRegistrationCharTextBox("5");
		registrationCharTextBox.sendKeys(details.getRegistrationCharTextBox());
	}
	
	public ManageUsers clickManageUser() {
		manageUsers.click();
		Assert.assertEquals(true, manageUsers.isEnabled());
//		ManageUsers manageUser = new ManageUsers(driver, logger, prop);
//		PageFactory.initElements(driver, manageUser);
		return new ManageUsers();
	}
}