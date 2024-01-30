package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Create_PIM {
  @Test(priority=1)
  public void create() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
	  
	  driver.findElement(By.xpath("//span[text()='PIM']")).click();
	  driver.findElement(By.linkText("Add Employee")).click();
	  driver.findElement(By.name("firstName")).sendKeys("siddhi");
	  driver.findElement(By.name("middleName")).sendKeys("kailas");
	  driver.findElement(By.name("lastName")).sendKeys("hande");
	 driver.findElement(By.cssSelector(".orangehrm-employee-form>div>*:nth-child(2)>div>div>*:nth-child(2)>input")).clear();
	 //driver.findElement(By.cssSelector(".orangehrm-employee-form>div>*:nth-child(2)>div>div>*:nth-child(2)>input")).sendKeys("2837");
 Thread.sleep(2000);
	 driver.findElement(By.className("orangehrm-left-space")).click();
	  System.out.println("PIM Created successfully");
	  driver.findElement(By.xpath("//a[text()='Employee List']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("siddhi kailas hande");
	  //driver.findElement(By.xpath("//div[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();	  
	  driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("siddhi kailas hande");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();	  
	  driver.findElement(By.xpath("//a[text()='Employee List']")).click();
	  driver.findElement(By.xpath("//div[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("0284");

	  driver.findElement(By.xpath("//div[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
	  Thread.sleep(1000);
	//delete data
	  driver.findElement(By.className("bi-trash")).click();
	  driver.findElement(By.xpath("//div[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")).click();
  }
  
}
