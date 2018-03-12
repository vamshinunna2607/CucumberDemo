package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination {

	WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_already_on_login_page()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vamsh\\eclipse-workspace\\SeliniumDemo\\Lib\\geckodriver\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("https://www.freecrm.com");
	}
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM()
	{
		String s = driver.getTitle();
		Assert.assertEquals("Free CRM for Any Business: Online Customer Relationship Software", s);
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[1]")).sendKeys("naveenk");
	    driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[2]")).sendKeys("test@123");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
	    
	}

//	@Then("^user is on home page$")
//	public void user_is_on_home_page() throws Throwable {
//	    String title = driver.getTitle();
//	    System.out.println("title is"+title);
//	    Assert.assertEquals("CRMPRO",title);
//	    
//	}


	
	
}
