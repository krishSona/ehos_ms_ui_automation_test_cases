package PageClasses;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import baseClasses.Details;
import baseClasses.PageBaseClass;

public class DailySummaryReport extends PageBaseClass{

//	public DailySummaryReport(WebDriver driver, ExtentTest logger, Properties prop) {
//		super(driver, logger, prop);
//	}
	
	public DailySummaryReport() {
		PageFactory.initElements(driver, this);
	}
	
	Details details = new Details();
	
	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-daillysummaryreport[1]/div[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[4]")
	private WebElement clickStartDate;
	
	@FindBy(xpath = "//input[@id='mat-input-11']")
	private WebElement startTextBox;
	
	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-daillysummaryreport[1]/div[1]/div[1]/form[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[4]")
	private WebElement clickEndDate;
	
	@FindBy(xpath = "//input[@id='mat-input-12']")
	private WebElement endDateTextBox;
	
	@FindBy(xpath = "//button[contains(text(),'Generate Summary')]")
	private WebElement generateSummaryButton;
	
	@FindBy(xpath = "//button[contains(text(),'Reset')]")
	private WebElement resetButton;
	
	public void enterStartDate() {
		clickStartDate.click();
		details.setDailySummaryStartDateTextBox("01/12/2021");
		startTextBox.sendKeys(details.getDailySummaryStartDateTextBox());
	}
	
	public void enterEndDate() {
		clickEndDate.click();
		details.setDailySummaryEndDateTextBox("24/12/2021");
		endDateTextBox.sendKeys(details.getDailySummaryEndDateTextBox());
	}
	
	public void clickGenerateButton() {
		generateSummaryButton.click();
	}
	
	public void clickResetButton() {
		resetButton.click();
	}

}
