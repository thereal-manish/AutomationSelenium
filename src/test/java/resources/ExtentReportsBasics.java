package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsBasics {

	public static ExtentReports getExtentReports() {

		// Extent Spark Reporter
		String path = System.getProperty("user.dir") + "\\reports\\ExtentReport.html";

		ExtentSparkReporter er = new ExtentSparkReporter(path);
		er.config().setReportName("CashDry test results");
		er.config().setDocumentTitle("CashDry test results");

		// Extent Reports
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(er);
		extent.setSystemInfo("Tester", "Team - CashDry");
		
		return extent;

	}
}
