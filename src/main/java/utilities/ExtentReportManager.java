package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
	
	// public static ExtentHtmlReporter htmlReporter
	public static ExtentReports report;

	public static ExtentReports getReportInstance() {
		
		if(report==null) {
			String reportName=DateUtil.getTimeStamp() + ".html";
			ExtentSparkReporter htmlReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/" + reportName);
			report = new ExtentReports();
			report.attachReporter(htmlReporter);
			
			report.setSystemInfo("OS", "Linux");
			report.setSystemInfo("Enviroment", "UAT");
			report.setSystemInfo("Enviroment", "UAT");
			report.setSystemInfo("Build Number", "0.1");
			report.setSystemInfo("Browser", "chrome");
			
			htmlReporter.config().setDocumentTitle("UAT UI Automation Result");
			htmlReporter.config().setReportName("All Headline Test Report");
			
			
		}
		return report;
	}

}
