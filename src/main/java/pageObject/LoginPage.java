package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	By username = By.xpath("//*[@id='user_email']");
	By passWord = By.xpath("//*[@id='user_password']");
	By loginButton = By.xpath("//*[@id='hero']/div/form/div[3]/input");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getuname() {
		return driver.findElement(username);
	}
	
	public WebElement getpasswd() {
		return driver.findElement(passWord);
	}
	
	public WebElement getloginButton() {
		return driver.findElement(loginButton);
	}

}
