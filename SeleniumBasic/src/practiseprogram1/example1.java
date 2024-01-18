package practiseprogram1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// UI VALIDATION:

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/testing/login.do");

		WebElement usernamefield = driver.findElement(By.name("username"));
		System.out.println("is user name input filed is deiplayed? " + usernamefield.isDisplayed());
		System.out.println("is user name input field is editable? " + usernamefield.isEnabled());
		System.out.println("the default value in the user name is: " + usernamefield.getAttribute("placeholder"));

		System.out.println("*****************************************************************************************");

		WebElement passwordfield = driver.findElement(By.name("pwd"));
		System.out.println("is password field is displayed? " + passwordfield.isDisplayed());
		System.out.println("is password field is enabled? " + passwordfield.isEnabled());
		System.out.println("default value is password field is: " + passwordfield.getAttribute("placeholder"));

		System.out
				.println("******************************************************************************************");

		WebElement checkboxfield = driver.findElement(By.name("remember"));
		System.out.println("is check box is displayed? " + checkboxfield.isDisplayed());
		System.out.println("is check box is enabled? " + checkboxfield.isEnabled());
		System.out.println("is check box is selected? " + checkboxfield.isSelected());

		// select the check box and then check for isSelected() method

		driver.findElement(By.name("remember")).click();

		System.out.println("Now check box is selected? " + checkboxfield.isSelected());

		System.out
				.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		WebElement loginbutton = driver.findElement(By.id("loginButton"));
		System.out.println("is login button is displayed? " + loginbutton.isDisplayed());
		System.out.println("is login button is enabled? " + loginbutton.isEnabled());
		System.out.println("the text on the login button is: " + loginbutton.getText());
	}

}
