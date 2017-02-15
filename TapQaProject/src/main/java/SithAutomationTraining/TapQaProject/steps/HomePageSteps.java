package SithAutomationTraining.TapQaProject.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class HomePageSteps {

	public static WebDriver driver = null;

	 @Given("^I go to the tapqa homepage$")
	    public void i_go_to_the_tapqa_homepage() throws Throwable {
		// Create a new instance of the Firefox driver

		 //TODO Ask Channing about enabling different browsers
			driver = new ChromeDriver();
			//driver = new FirefoxDriver();
			driver.manage().window().maximize();
			// Put a Implicit wait, this means that any search for elements on the
			// page could take the time the implicit wait is set for before throwing
			// exception

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://www.tapqa.com");		 
	    }
	    
	 @And("^I click on the \"(Solutions|About|Explore|Careers|Contact Us)\" header link$")
	    public void i_click_on_the_something_header_link(String headerLink) throws Throwable {
	    	driver.findElement(By.xpath("(//a/span[text()='"+ headerLink +"'])[1]")).click();   
	    }
}
