package SithAutomationTraining.TapQaProject.steps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;

public class Hooks {
	public static WebDriver driver = null;

	@Given("^I start a \"(Firefox|Chrome)\" browser$")
	public void startBrowser(String browserType) {
		if (browserType.equalsIgnoreCase("Firefox")){
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") 
					+ "/src/main/java/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/***
	 * Runs after each Scenario / Scenario Outline. Closes current instance of the driver browser (Firefox or Chrome)
	 */
	@After public void closeBrowser(){
		driver.close();
	}
}
