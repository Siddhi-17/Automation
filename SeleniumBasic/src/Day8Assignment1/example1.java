package Day8Assignment1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// open browser
		WebDriver driver = new ChromeDriver();
//maximize browser
		driver.manage().window().maximize();
//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
//open url
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
//trying to identify name and password with single locator
		List<WebElement> elements = driver.findElements(By.className("used"));

		System.out.println("identified elements count: " + elements.size());
		System.out.println("1st element is: " + elements.get(0).getAttribute("placeholder"));
		System.out.println("2nd element is: " + elements.get(1).getAttribute("placeholder"));

		elements.get(0).clear();
		elements.get(1).clear();
		elements.get(0).sendKeys("admin");
		elements.get(1).sendKeys("admin");

		driver.findElement(By.className("button")).click();

	}

}
