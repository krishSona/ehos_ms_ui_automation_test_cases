package PageClasses;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;

public class AdminHome extends BaseTestClass{

//	public AdminHome(WebDriver driver, ExtentTest logger, Properties prop) {
//		super(driver, logger, prop);
//	}
	
	public AdminHome() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Health Facility Configuration')]")
	WebElement healthFacilityConfig;
	
	public HealthFacilityConfi clickHealthFacilityConfig() {
		healthFacilityConfig.click();
//		HealthFacilityConfi healthFacilityConfig =new HealthFacilityConfi(driver, logger, prop);
//		PageFactory.initElements(driver, healthFacilityConfig);
		return new HealthFacilityConfi();
	}
	
	@FindBy(xpath = "//span[contains(text(),'OPD Configuration')]")
	WebElement oPdConfig;
	
	public OpdConfig clickOpdConfig() {
		oPdConfig.click();
//		OpdConfig oPdConfig =new OpdConfig(driver, logger, prop);
//		PageFactory.initElements(driver, oPdConfig);
		return new OpdConfig();
	}
	
	@FindBy(xpath = "//span[contains(text(),'OPD Clinic')]")
	WebElement oPdClinic;
	
	public OpdClinic clickOpdClinic() {
		oPdClinic.click();
//		OpdClinic oPdClinic =new OpdClinic(driver, logger, prop);
//		PageFactory.initElements(driver, oPdClinic);
		return new OpdClinic();
	}
	
	@FindBy(xpath = "//span[contains(text(),'OPD Registration')]")
	WebElement oPdRegistration;
	
	public OpdRegistration clickOpdRegistration() {
		oPdRegistration.click();
//		OpdRegistration oPdRegistration =new OpdRegistration(driver, logger, prop);
//		PageFactory.initElements(driver, oPdRegistration);
		return new OpdRegistration();
	}
}
