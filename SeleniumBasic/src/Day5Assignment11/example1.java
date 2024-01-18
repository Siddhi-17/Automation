package Day5Assignment11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("admin");
		driver.findElement(By.className("button")).click();
		
		//signout
		driver.findElement(By.className("userName")).click();
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();

	}

}
