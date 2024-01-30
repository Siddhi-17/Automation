package swag;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class example1 {
  @Test
  public void swag() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.saucedemo.com/");
	  //enter username and password
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  
	  //login the page
	  driver.findElement(By.id("login-button")).click();
	  
	  //add to cart
	  driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	  driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	  
	  //click on the shopping cart button
	  driver.findElement(By.className("shopping_cart_link")).click();
	  
	  //click on the checkout button
	  driver.findElement(By.className("checkout_button")).click();
	  
	  //fill the personal details
	  driver.findElement(By.id("first-name")).sendKeys("Siddhi");
	  driver.findElement(By.id("last-name")).sendKeys("Hande");
	  driver.findElement(By.id("postal-code")).sendKeys("411014");
	  driver.findElement(By.className("cart_button")).click();
	  
	  //click on finish
	 driver.findElement(By.xpath("//button[text()='Finish']")).click();
	  
	
	  
	    String expectedthankyoumsg="Thank you for your order!";
		WebElement thankyoumsg=driver.findElement(By.className("complete-header"));
	
		System.out.println("Is thankyou message is displayed? "+thankyoumsg.isDisplayed());
		System.out.println("is msg displayed correctly? "+thankyoumsg.equals(expectedthankyoumsg));

		Assert.assertEquals(driver.findElement(By.xpath("//h2[text()='Thank you for your order!']")).getText(), "Thank you for your order!","Assertion Failed");
		  System.out.println("Order placed successfully!");
	  
	  driver.findElement(By.id("back-to-products")).click();

  }
}
