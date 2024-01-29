package stepdefinition;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class SwagLabOrderPlacement extends SeleniumUtility {
	Map<String,String> m2=new HashMap<String,String>();
	@Given("user is already loggin in SwagLab application")
	public void user_is_already_loggin_in_swag_lab_application() {
	   
	    setUp("chrome", "https://www.saucedemo.com/");
	    typeInput(driver.findElement(By.id("user-name")), "standard_user");
	    typeInput(driver.findElement(By.id("password")), "secret_sauce");
	    clickOnElement(driver.findElement(By.id("login-button")));
	    
	}

	@When("user selected two products and added them into the cart")
	public Map<String,String> user_selected_two_products_and_added_them_into_the_cart() {
	   List<WebElement> itemsOnHomePage=driver.findElements(By.xpath("//button[text()='Add to cart']"));
	   itemsOnHomePage.get(0).click();
	   itemsOnHomePage.get(2).click();
	   
	 //items purchased list
		  List<WebElement> itemsList=driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
		//concept of Independant(Item) n dependant child(Item price)
		  List<WebElement> pricesList=driver.findElements(By.xpath("//div[div[a[div[@class='inventory_item_name ']]]]/div[2]/div"));
		  //store product name n price inside the map
		  m2.put(itemsList.get(0).getText(), pricesList.get(0).getText());
		  m2.put(itemsList.get(2).getText(), pricesList.get(2).getText());
		  return m2;
	}

	@When("click on cart icon")
	public void click_on_cart_icon() {
	   
	    clickOnElement(driver.findElement(By.xpath("//div[@id='shopping_cart_container']")));
	}

	@Then("validate same products with price are getting displayed in checkout page")
	public void validate_same_products_with_price_are_getting_displayed_in_checkout_page() {
		Map<String,String> m3=new HashMap<String,String>();
		//items purchased list
		  List<WebElement> items=driver.findElements(By.cssSelector(".inventory_item_name"));
		//concept of Independant(Item) n dependant child(Item price)
		  List<WebElement> prices=driver.findElements(By.xpath("//div[a[div[@class='inventory_item_name']]]/div[2]/div"));
		  //store product name n price inside the map
		  
		  for(int i=0;i<items.size();i++)
		  {
			  m3.put(items.get(i).getText(), prices.get(i).getText());
		  }
		  Assert.assertTrue(m2.equals(m3),"Products mismatch");
	    
	}

	@When("user clicks on checkout button")
	public void user_clicks_on_checkout_button() {
	   
	    clickOnElement(driver.findElement(By.xpath("//button[@name='checkout']")));
	}

	@When("user provides information for delivery")
	public void user_provides_information_for_delivery() {
	   
	    typeInput(driver.findElement(By.id("first-name")),"Demo");
	    typeInput(driver.findElement(By.id("last-name")),"Test");
	    typeInput(driver.findElement(By.id("postal-code")),"123444");
	    
	}

	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() {
		clickOnElement(driver.findElement(By.id("continue")));
	    
	}

	@Then("validate added products with price are getting displayed")
	public void validate_added_products_with_price_are_getting_displayed() {
		//items purchased list
		  List<WebElement> items=driver.findElements(By.cssSelector(".inventory_item_name")); ////div[@class='inventory_item_name']
		  //concept of Independant(Item) n dependant child(Item price)
		  List<WebElement> prices=driver.findElements(By.xpath("//div[a[div[@class='inventory_item_name']]]/div[2]/div"));
		  //check total without tax
		  String itemsTotal=driver.findElement(By.cssSelector(".summary_subtotal_label")).getText();
		  Map<String,String> addedProductMap=new HashMap<String,String>();
		  addedProductMap.put(items.get(0).getText(), prices.get(0).getText());
		  addedProductMap.put(items.get(1).getText(), prices.get(1).getText());
		  Assert.assertTrue(m2.equals(addedProductMap),"Produsts after checkout doesnt match!!!");
	    
	}

	@When("user clicks on finish button")
	public void user_clicks_on_finish_button() {
	   clickOnElement(driver.findElement(By.id("finish")));
	    
	}

	@Then("user should be able to see {string}")
	public void user_should_be_able_to_see(String thanksMsg) {
	   
	    Assert.assertEquals(driver.findElement(By.xpath("//h2[text()='Thank you for your order!']")).getText(), thanksMsg);
	}

}
