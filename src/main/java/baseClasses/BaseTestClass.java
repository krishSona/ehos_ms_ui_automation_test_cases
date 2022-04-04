package baseClasses;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.nextgen.actiondriver.Action;

//import ActionDriver.Action;
import PageClasses.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ExtentReportManager;

public class BaseTestClass {
	public static WebDriver driver;
	public ExtentReports report = ExtentReportManager.getReportInstance();
	public ExtentTest logger;
	public static Properties prop;

	@BeforeTest
	public void loadConfig() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"E:\\work_space\\ehos_ms_ui_automation_test_cases\\Configuration\\Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*************** Open Application ***************/
	public LandingPage OpenApplication() {
		driver.get("https://nextgen.ehospital.nic.in/home");
		String expectedTitle = "NextGen eHospital";
		Assert.assertEquals(driver.getTitle(), expectedTitle);
		return new LandingPage();
	}
	
	public void invokeBrowser() throws IOException {
		WebDriverManager.chromedriver().setup();
		String browserName = prop.getProperty("browser");
		try {

			if (browserName.equals("chrome")) {
				System.getProperty("webdriver.chrome.driver", "C:\\Users\\NICSI\\Desktop\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("mozila")) {
				System.getProperty("webdriver.gecko.driver", "/NextgenEHospital/src/main/java/drivers/geckodriver");
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("opera")) {
				System.getProperty("webdriver.opera.driver", "/NextgenEHospital/src/main/java/drivers/operadriver");
				driver = new OperaDriver();
			} else if (browserName.equalsIgnoreCase("IE")) {
				System.getProperty("webdriver.ie.driver", "/NextgenEHospital/src/main/java/drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				driver = new SafariDriver();
			}
		} catch (Exception e) {
			// reportFail(e.getMessage());
			System.out.println(e.getMessage());
		}
		
		Action.implicitWait(driver, 20);
		Action.pageLoadTimeOut(driver, 20);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void flushReport() {
		driver.quit();
	}

}
