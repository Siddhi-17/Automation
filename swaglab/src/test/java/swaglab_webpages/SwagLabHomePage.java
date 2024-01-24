package swaglab_webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SeleniumUtility;

public class SwagLabHomePage extends SeleniumUtility {
	public SwagLabHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="react-burger-menu-btn")
	private WebElement hamburger;
  
	@FindBy(id="logout_sidebar_link")
	private WebElement logoutButton;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")// item one(backpack) added
	private WebElement backpackadded;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")//item two(bikelight) added
	private WebElement bikelightadded;
	
	@FindBy(className="shopping_cart_link")
	private WebElement shoppingcartbutton;
	
	//now create the getter() method for all private elements

	public WebElement getHamburger() {
		return hamburger;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getBackpackadded() {
		return backpackadded;
	}

	public WebElement getBikelightadded() {
		return bikelightadded;
	}

	public WebElement getShoppingcartbutton() {
		return shoppingcartbutton;
	}
	
	//now create the method to click on the selected items.
	
	public void itemsaddedtocart() {
		clickOnElement(backpackadded);
		clickOnElement(bikelightadded);
		clickOnElement(shoppingcartbutton);
	}
	
	//create method to logout from application
	
	public void logoutfromapplication() {
		clickOnElement(hamburger);
		clickOnElement(logoutButton);
	}
	
	
}
