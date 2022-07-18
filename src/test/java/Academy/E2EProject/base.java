package Academy.E2EProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializDriver() throws IOException {
		
		//Chrome
		
		//Firefox
		
		//ie
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Eclips\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if(browsername.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\Chromedriver.exe");
			driver = new ChromeDriver();
			
		//	driver.get("https://www.facebook.com/");
			
		}		
		
		if(browsername.contains("firefox"))
		{
			
		}
		
		if(browsername.contains("ie"))
		{
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;		
	}
	
	public String getScreenShotPath(String testcaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destFile = System.getProperty("user.dir")+"\\reports\\"+testcaseName+".png";
		FileUtils.copyFile(source,new File(destFile));
		return destFile;
	}
	
//	@BeforeTest
//	public void login() throws IOException {
//		driver=initializDriver();
//		driver.get(prop.getProperty("url"));
//	}
//	
//	@AfterTest
//	public void close() {
//		driver.close();
//	}

}
