package Academy.E2EProject;

import java.io.IOException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;

public class ValidationTitle extends base{
	public WebDriver driver;
	public static Logger log =  LogManager.getLogger(ValidationTitle.class.getName());
	@BeforeTest
	public void login() throws IOException {
		driver=initializDriver();
		log.info("driver is initialize");
		driver.get(prop.getProperty("url"));
		log.info("navigated to Homepage");
	}
	@Test
	public void title() throws IOException {
		
		
		LandingPage lp = new LandingPage(driver);
		Assert.assertEquals(lp.getTitle().getText(),"FEATURED COURSES123");
		//Assert.assertTrue(true);
		log.info("validated text step");
		
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
	
	
}
