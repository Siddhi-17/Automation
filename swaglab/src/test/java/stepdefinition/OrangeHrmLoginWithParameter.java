package stepdefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class OrangeHrmLoginWithParameter extends SeleniumUtility{

	@Given("user is on login OrangeHRM login page")
	public void user_is_on_login_orange_hrm_login_page() {
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("^user enter a valid username as (.+) in OrangeHRM$")
	public void user_enter_a_valid_username_as_admin(String username) {
		typeInput(driver.findElement(By.name("username")), username);
	}

	@When("^user enter a valid password as (.+) in OrangeHRM$")
	public void user_enter_a_valid_password_as_admin123(String Password) {
		typeInput(driver.findElement(By.name("password")), Password);
	}

	@When("user click on login button")
	public void user_clicks_on_login_button() {
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
}

	@Then("^user should should be able to navigate to the Home page of OrangeHrm having (.+) in URL$")
	public void user_should_should_be_able_to_navigate_to_the_home_page_of_orange_hrm_having_dashboard_in_url(String url) {
		String actualUrl = getCurrentUrlOfApplication();
      Assert.assertTrue(actualUrl.contains(url), "Either login failed or Url Changed");
	}

	@Then("closes the browser for OrnageHRM")
	public void close_the_browser_for_ornage_hrm() {
	   cleanUp();
}
}