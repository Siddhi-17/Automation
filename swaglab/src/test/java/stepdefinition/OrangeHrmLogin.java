package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class OrangeHrmLogin extends SeleniumUtility {

	@Given("user is on login OrangeHrm login page")
	public void user_is_on_OrangeHrm_login_page() {
		// setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enter a valid username as {string}")
	public void user_enter_a_valid_username_as(String username) {
		typeInput(driver.findElement(By.name("username")), username);
	}

	@When("user enter a valid password as {string}")
	public void user_enter_a_valid_password_as(String password) {
		typeInput(driver.findElement(By.name("password")), password);

	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
	}

	@Then("user should should be able to navigate to the Home page of OrangeHrm having {string} in URL")
	public void user_should_should_be_able_to_navigate_to_the_Home_page_of_OrangeHrm_having_in_URL(
			String expectedText) {
		String actualUrl = getCurrentUrlOfApplication();
		Assert.assertTrue(actualUrl.contains(expectedText), "Either login failed or Url Changed");
	}

	@Then("close the browser for OrnageHrm")
	public void close_the_browser_for_OrnageHrm() {
		cleanUp();

	}
}
