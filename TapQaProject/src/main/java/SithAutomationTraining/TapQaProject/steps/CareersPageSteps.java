package SithAutomationTraining.TapQaProject.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CareersPageSteps {
	private static WebDriver driver = HomePageSteps.driver;

	@When("^I enter \"([^\"]*)\" in the Keywords field$")
    public void i_enter_something_in_the_keywords_field(String keyword) throws Throwable {
		driver.findElement(By.id("search_keywords")).sendKeys(keyword);
    }
	
	@Then("^the text \"([^\"]*)\" is displayed in Keywords field$")
    public void the_text_something_is_displayed_in_keywords_field(String enteredText) throws Throwable {
        Assert.assertEquals(enteredText, driver.findElement(By.id("search_keywords")).getAttribute("value"));
    }
}
	


