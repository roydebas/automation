package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By login = By.xpath("//*[text()='Login']");
	By Title = By.xpath("//*[@id='content']/div/div/h2");
	
	public WebElement getlogin() {
		return driver.findElement(login);
	}
	
	public WebElement getTitle() {
		return driver.findElement(Title);
	}
	
}
