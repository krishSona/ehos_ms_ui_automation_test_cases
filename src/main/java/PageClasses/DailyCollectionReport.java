package PageClasses;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import baseClasses.Details;
import baseClasses.PageBaseClass;

public class DailyCollectionReport extends PageBaseClass{

//	public DailyCollectionReport(WebDriver driver, ExtentTest logger, Properties prop) {
//		super(driver, logger, prop);
//	}
	
	public DailyCollectionReport() {
		PageFactory.initElements(driver, this);
	}
	
	Details details = new Details();

}
