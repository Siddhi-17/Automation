package Day5Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/ ");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		// login button
		driver.findElement(By.className("orangehrm-login-button")).click();
		// validate home page
		String expectedresult = "OrangeHRM";
		String actualresult = driver.getTitle();
		System.out.println("Actual home page title is: " + actualresult);
		System.out.println("is login successfully?: " + actualresult.equals(expectedresult));
		// click on profile icon to signout

		driver.findElement(By.className("oxd-userdropdown-img")).click();
		
		// driver.findElement(By.className("oxd-userdropdown-link")).click();
		// driver.findElement(By.tagName("a")).click();
		driver.findElement(By.linkText("Logout")).click();

	}

}
