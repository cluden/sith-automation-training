package SithAutomationTraining.TapQaProject.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class HomePageSteps {

	private WebDriver driver = Hooks.driver;
	
	@Given("^I go to the tapqa homepage$")
	public void i_go_to_the_tapqa_homepage() throws Throwable {
		driver.get("http://www.tapqa.com");
	}

	@And("^I click on the \"(Solutions|About|Explore|Careers|Contact Us)\" header link$")
	public void i_click_on_the_something_header_link(String headerLink) throws Throwable {
		driver.findElement(By.xpath("(//a/span[text()='" + headerLink + "'])[1]")).click();
	}
}
