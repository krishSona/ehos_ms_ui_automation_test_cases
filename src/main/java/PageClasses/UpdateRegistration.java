package PageClasses;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import baseClasses.Details;
import baseClasses.PageBaseClass;

public class UpdateRegistration extends PageBaseClass{

//	public UpdateRegistration(WebDriver driver, ExtentTest logger, Properties prop) {
//		super(driver, logger, prop);
//	}
	
	public UpdateRegistration() {
		PageFactory.initElements(driver, this);
	}
	
	Details details = new Details();
	
	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-update-patient[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement clickUhidTextBox;
	
	@FindBy(xpath = "//input[@id='mat-input-11']")
	private WebElement uhidTextBox;
	
	@FindBy(xpath = "//button[contains(text(),'Search')]")
	private WebElement searchButton;
	
	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-update-patient[1]/div[1]/form[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement clickMobileField;
	
	@FindBy(xpath = "//input[@id='mat-input-12']")
	private WebElement changeMobile;
	
	@FindBy(xpath = "//button[contains(text(),'Update')]")
	private WebElement updateButton;
	
	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-update-patient[1]/div[1]/form[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement clickTitle;
	
	@FindBy(xpath = "//span[contains(text(),'Dr.')]")
	private WebElement selectTitle;
	
	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-update-patient[1]/div[1]/form[2]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement clickFname;
	
	@FindBy(xpath = "//input[@id='mat-input-13']")
	private WebElement selectFn;
	
	@FindBy(xpath = "")
	private WebElement b;
	
	@FindBy(xpath = "")
	private WebElement c;
	
	@FindBy(xpath = "")
	private WebElement d;
	
	@FindBy(xpath = "")
	private WebElement e;
	
	public void findPatientDetails() {
		details.setUhidTextBox("20210000012");
		uhidTextBox.sendKeys(details.getUhidTextBox());
		searchButton.click();
	}
	
	public void updateMobileNo() {
		clickMobileField.click();
		changeMobile.clear();
		details.setChangeMobile("9811219731");
		changeMobile.sendKeys(details.getChangeMobile());
		clickTitle.click();
		selectTitle.click();
		clickFname.click();
		selectFn.clear();
		details.setSelectFn("Rohan");
		selectFn.sendKeys(details.getSelectFn());
		updateButton.click();
	}
	
	
}
