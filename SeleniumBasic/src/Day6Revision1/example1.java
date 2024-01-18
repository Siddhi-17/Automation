package Day6Revision1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium validation and browser operation:
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/testing/login.do");

		/*
		 * Validation: username input field is visible or not ---> isDisplayed()
		 * 'username' input field default value ---> getAttribute("placeholder")
		 * username input field is editable or not---> isEnabled()
		 */
		WebElement userinputfield = driver.findElement(By.id("username"));
		System.out.println("is user name input field is visible? " + userinputfield.isDisplayed());
		System.out.println("is user input field is editable? " + userinputfield.isDisplayed());
		System.out.println("default value for user name input field is: " + userinputfield.getAttribute("placeholder"));

		System.out.println("**********************************************************************************");
		/*
		 * Validation: password input field is visible or not ---> isDisplayed()
		 * 'password' input field default value ---> getAttribute("placeholder")
		 * password input field is editable or not---> isEnabled()
		 */

		WebElement passwordinputfield = driver.findElement(By.name("pwd"));
		System.out.println("the password name input field is visisble? " + passwordinputfield.isDisplayed());
		System.out.println("the password input field is editable? " + passwordinputfield.isDisplayed());
		System.out.println("the password input field is enabled? " + passwordinputfield.isEnabled());
		System.out.println(
				"default value for password name input field is: " + passwordinputfield.getAttribute("placeholder"));

		System.out
				.println("******************************************************************************************");

		// validtion for logincheckbox

		WebElement logincheckbox = driver.findElement(By.name("remember"));
		System.out.println("is check box field is visisble? " + logincheckbox.isDisplayed());
		System.out.println("is login check box is enabled? " + logincheckbox.isEnabled());
		System.out.println("is input field fo the checkbox is visible? " + logincheckbox.isDisplayed());
		System.out.println("is login check box is selected? " + logincheckbox.isSelected());

		System.out.println("*****************************************************************");

		// validation for login button
		/*
		 * * 'Login' button is present or not 
		 * 'Login' button is clickable or not 
		 * 'Login'button name is Login or not
		 */
		
		WebElement loginbutton= driver.findElement(By.id("loginButton"));
		System.out.println("is login button is present? "+loginbutton.isDisplayed());
		System.out.println("is login button is clickable? "+loginbutton.isEnabled());
		System.out.println("is login button name is login? "+loginbutton.isDisplayed());
		
		
		
		
		
		
		

	}

}
