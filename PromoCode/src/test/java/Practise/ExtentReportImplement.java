package Practise;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportImplement {
	ExtentHtmlReporter reportor;
	ExtentReports report;
	ExtentTest test;
	@BeforeSuite
	public void test1() {
		ExtentHtmlReporter reportor = new ExtentHtmlReporter("extentreport.html");
		report = new ExtentReports();
		report.attachReporter(reportor);
		test = report.createTest("OpenBrowser","THIS IS SAMPLE DISCRIPTION");
		test.log(Status.INFO, "test started");
		report.flush();
	}
}
