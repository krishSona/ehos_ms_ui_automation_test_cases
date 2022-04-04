package PageClasses;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import baseClasses.Details;
import baseClasses.PageBaseClass;

public class Reports extends PageBaseClass{
	
//	public Reports(WebDriver driver, ExtentTest logger, Properties prop) {
//		super(driver, logger, prop);
//		// TODO Auto-generated constructor stub
//	}
	
	public Reports() {
		PageFactory.initElements(driver, this);
	}
	
	Details details = new Details();

	@FindBy(xpath = "//span[contains(text(),'Daily Summary Report')]")
	private WebElement dailySreport;
	
	@FindBy(xpath = "//span[contains(text(),'Daily Summary Report')]")
	private WebElement pVsReport;
	
	@FindBy(xpath = "//span[contains(text(),'Daily Collection Report')]")
	private WebElement dCreport;
	
	public DailySummaryReport dSummaryReport() {
		dailySreport.click();
//		DailySummaryReport dailySummaryReport = new DailySummaryReport(driver, logger, prop);
//		PageFactory.initElements(driver, dailySummaryReport);
		return new DailySummaryReport();
	}
	
	public PatientVisitSummaryReport pVsummaryReport() {
		pVsReport.click();
//		PatientVisitSummaryReport patientVisitSummaryReport = new PatientVisitSummaryReport(driver, logger, prop);
//		PageFactory.initElements(driver, patientVisitSummaryReport);
		return new PatientVisitSummaryReport();
	}
	
	public DailyCollectionReport dailyCreport() {
		dCreport.click();
//		DailyCollectionReport dailyCollectionReport = new DailyCollectionReport(driver, logger, prop);
//		PageFactory.initElements(driver, dailyCollectionReport);
		return new DailyCollectionReport();
	}

}
