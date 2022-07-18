package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
		static ExtentReports extent;
	
public static ExtentReports getReportObject() {
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		reporter.config().setReportName("Automation Result");
		reporter.config().setDocumentTitle("Test Result");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		return extent;
		
	}

//	@Test
//	public void initialdemo() {
//		ExtentTest test = extent.createTest("demo");
//		System.setProperty(
//				"webdriver.chrome.driver",
//				"D:\\Chromedriver\\Chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com");
//		System.out.println(driver.getTitle());
//		extent.flush();
//	}
	
}
