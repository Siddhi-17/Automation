package practiseprogram1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement userfield=driver.findElement(By.name("username"));
		System.out.println("is user name field is displayed? "+userfield.isDisplayed());
		System.out.println("is user field is enabled? "+userfield.isEnabled());
		System.out.println("the default value in the username field is: "+userfield.getAttribute("placeholder"));
		
		System.out.println("************************************************************");
		
		WebElement loginbutton=driver.findElement(By.className("orangehrm-login-button"));
		System.out.println("the text for the login button is: "+loginbutton.getText());
	}

}
