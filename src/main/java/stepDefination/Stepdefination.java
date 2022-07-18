package stepDefination;

import org.testng.Assert;

import Academy.E2EProject.base;
import Academy.E2EProject.portalHomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LandingPage;
import pageObject.LoginPage;

public class Stepdefination extends base{
	
	@Given("^Initialize browser in chrome$")
	public void initialize_browser_in_chrome() throws Throwable {
		driver=initializDriver();   
	}

	@Given("^Navigating to \"([^\"]*)\" site$")
	public void navigating_to_site(String arg1) throws Throwable {
	    driver.get(arg1);
	   
	}

	@Given("^Click on login link$")
	public void click_on_login_link() throws Throwable {
		 LandingPage lp = new LandingPage(driver);
		 lp.getlogin().click(); 
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\" and logsin$")
	public void user_enter_and_and_logsin(String uname, String pwd) throws Throwable {
		LoginPage logp=new LoginPage(driver);
		logp.getuname().sendKeys(uname);
		logp.getpasswd().sendKeys(pwd);
		logp.getloginButton().click();
	}

	@Then("^verify that user is successfully login$")
	public void verify_that_user_is_successfully_login() throws Throwable {
		portalHomePage p = new portalHomePage(driver);
		//Assert.assertTrue(p.getsearchbox().isDisplayed());
		driver.close();
	}
	
	
	@When("^user1 enter (.+) and (.+) and logsin$")
    public void user1_enter_and_and_logsin(String username, String password) throws Throwable {
		LoginPage logp=new LoginPage(driver);
		logp.getuname().sendKeys(username);
		logp.getpasswd().sendKeys(password);
		logp.getloginButton().click();
	}
	

}
