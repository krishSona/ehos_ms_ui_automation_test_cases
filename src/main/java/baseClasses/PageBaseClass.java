package baseClasses;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import PageClasses.LandingPage;
import utilities.DateUtil;
import utilities.ExtentReportManager;

public class PageBaseClass extends BaseTestClass {

	public ExtentTest logger;
	
	public PageBaseClass() {
		PageFactory.initElements(driver, this);
	}

//	/*************** Open Application ***************/
//	public LandingPage OpenApplication() {
//		logger.log(Status.INFO, "Opening the website");
////		driver.navigate().to("http://nextgen.ehospital.nic.in/");
//		driver.get("https://nextgen.ehospital.nic.in/home");
//		String expectedTitle = "NextGen eHospital";
//		Assert.assertEquals(driver.getTitle(), expectedTitle);
//		logger.log(Status.PASS, "Application opened successfully");
//		LandingPage landingPage = new LandingPage(driver, logger, prop);
//		PageFactory.initElements(driver, landingPage);
//		return landingPage;
//	}
	
//	public PageBaseClass(WebDriver driver, ExtentTest logger, Properties prop) {
//		this.logger = logger;
//		this.driver = driver;
//		this.prop = prop;
//	}
	
	/*************** Get Page Title ***************/
	public void getTitle(String expectedTitle) {
		try {
			Assert.assertEquals(driver.getTitle(), expectedTitle);
			reportPass("Actual title : " + driver.getTitle() + "- equal to expected title : " + expectedTitle);
		} catch (Exception e) {
			// TODO: handle exception
			reportFail(e.getMessage());
		}
	}
	
	/************** WebElement IsDisplayed*********************/
	public void verifyElementIsDisplayed(WebElement webElement) {
		try {
			if(webElement.isDisplayed()) {
				reportPass("Email is displayed");
			}
			else {
				reportFail("Email not displayed");
			}
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
	} 
	
	/************** CheckBox IsSelected*********************/
	public void verifyCheckBoxIsSelected(WebElement webElement) {
		try {
			if(!webElement.isSelected()) {
				webElement.click();
			}
			else {
				reportFail("Email not displayed");
			}
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
	} 

	/************** Reporting Function *************/
	public void reportFail(String reportString) {
		logger.log(Status.FAIL, reportString);
		takeScreenShotOnFailure();
		Assert.fail(reportString);
	}

	public void reportPass(String reportString) {
		logger.log(Status.PASS, reportString);
	}

	/************** Capture Screen shot Function *************/

	public void takeScreenShotOnFailure() {
		TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
		File sourceFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir") + "/ScreenShots/" + DateUtil.getTimeStamp() + ".png");
		try {
			FileUtils.copyFile(sourceFile, destFile);
			logger.addScreenCaptureFromPath(
					System.getProperty("user.dir") + "/ScreenShots/" + DateUtil.getTimeStamp() + ".png");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
