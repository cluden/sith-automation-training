package SithAutomationTraining.TapQaProject.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ContactUsPageSteps {
	private WebDriver driver = Hooks.driver;

	@When("^I enter \"([^\"]*)\" in the Name field$")
	public void i_enter_something_in_the_name_field(String fullName) throws Throwable {
		driver.findElement(By.id("input_1_1")).sendKeys(fullName);
	}

	@When("^I enter \"([^\"]*)\" in the Email field$")
	public void i_enter_something_in_the_email_field(String email) throws Throwable {
		driver.findElement(By.id("input_1_2")).sendKeys(email);
	}

	@When("^I enter \"([^\"]*)\" in the Phone field$")
	public void i_enter_something_in_the_phone_field(String phone) throws Throwable {
		driver.findElement(By.id("input_1_3")).click();
		driver.findElement(By.id("input_1_3")).sendKeys(phone);
	}

	@When("^I select \"([^\"]*)\" in the How Did You Hear About Us dropdown$")
	public void i_select_something_in_the_how_did_you_hear_about_us_dropdown(String option) throws Throwable {
		Select dropdown = new Select(driver.findElement(By.id("input_1_5")));
		dropdown.selectByVisibleText(option);
	}

	@When("^I enter \"([^\"]*)\" in the Message field$")
	public void i_enter_something_in_the_message_field(String message) throws Throwable {
		driver.findElement(By.id("input_1_4")).sendKeys(message);
	}

	@When("^I click on the Submit button$")
	public void i_click_on_the_submit_button() throws Throwable {
		driver.findElement(By.id("gform_submit_button_1")).click();

	}

	@Then("^I get a confirmation message$")
	public void i_get_a_confirmation_message() throws Throwable {
		//gform_confirmation_message_1
		Assert.assertTrue("Message wasn't displayed!", driver.findElement(By.id("gform_confirmation_message_1")).getText()
				.equalsIgnoreCase("Thanks for contacting us! We will get in touch with you shortly."));
	}

}
