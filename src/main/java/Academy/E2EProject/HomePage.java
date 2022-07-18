package Academy.E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;

public class HomePage extends base{
	public WebDriver driver;
	@BeforeTest
	public void login() throws IOException {
		driver=initializDriver();
		//driver.get(prop.getProperty("url"));
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
	
	
	@Test(dataProvider="getdata")
	public void basePathNavigation(String uname,String pwd,String text) throws IOException {
		//driver=initializDriver();
		//driver.get("https://www.qaclickacademy.com/");
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		lp.getlogin().click();
		
		LoginPage logp=new LoginPage(driver);
		logp.getuname().sendKeys(uname);
		logp.getpasswd().sendKeys(pwd);
		logp.getloginButton().click();
		System.out.println(text);
		//driver.close();
	}
	
	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data = new Object[2][3];
		data[0][0]="debasishroy999";
		data[0][1]="ranjit999";
		data[0][2]="Wrong Data entered";
		
		data[1][0]="ranjitroy999";
		data[1][1]="Deba999";
		data[1][2]="Correct Data entered";
		
		return data;
	}
	
	
}
