package swaglab_webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SeleniumUtility;

public class SwagLabLoginPage extends SeleniumUtility {

	// constructor
	public SwagLabLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username") // idnetify element for username input field from web page.
	private WebElement userNameInputField; // declared them private

	@FindBy(name = "password") // idnetify element for password input field from web page.
	private WebElement passwordInputField;

	@FindBy(css = ".submit-button") // cssSelector syntax for POM
	private WebElement loginButton;

	// To access the private data members we need getter method therefore create the
	// getter method below:

	public WebElement getUserNameInputField() {
		return userNameInputField;
	}

	public WebElement getPasswordInputField() {
		return passwordInputField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	// create method to do operation on login page
	public void LoginSwagLab(String username, String password) {
		typeInput(userNameInputField, username);
		typeInput(passwordInputField, password);
		clickOnElement(loginButton);
	}

	/*
	 * Identify needed elements -->usernameInputField -->passwordInputField
	 * -->loginButton
	 */

}
