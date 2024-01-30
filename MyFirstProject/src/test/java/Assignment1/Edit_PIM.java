package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Edit_PIM {
  @Test
  public void editPIM() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
	  driver.findElement(By.xpath("//span[text()='PIM']")).click();
	  driver.findElement(By.xpath("//a[text()='Employee List']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("siddhi kailas hande");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();	  
	  driver.findElement(By.xpath("//a[text()='Employee List']")).click();
	  driver.findElement(By.xpath("//div[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("2837");
	  driver.findElement(By.xpath("//div[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
  }
}
