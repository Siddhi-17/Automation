package erailAssignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class example1{
  @Test
  public void erail () throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 //url
	 driver.get("https://erail.in/");
	 
	 //get the current window unique id
	 String homepagewinid=driver.getWindowHandle();
	 System.out.println("the home page id is: "+homepagewinid);
	 
	 //click on eCatering
	 driver.findElement(By.xpath("//a[text()='eCatering']")).click();
	 
//Thread.sleep(5000);
	 
     // get all windows unique IDs which are opened by selenium current instance
	 Set<String> allwinid=driver.getWindowHandles();
	 System.out.println("the both window ids are: "+allwinid);
	 
    // get only child window id and remove home window id
	 allwinid.remove(homepagewinid);
	 System.out.println("after removing home window id, the only child window id is: "+allwinid);
	 
	 //now getting switch to the child window
	 driver.switchTo().window(allwinid.iterator().next());
	 
	 
	 //now you are allow to identify the any element from child window
	 driver.findElement(By.className("//div[@id='page-container']/div[1]/div[1]/div[2]/div/div[2]/div[1]/div/input")).click();
	 
	 //send keys
	 //driver.findElement(By.className("form-input pl-12  text-sm")).sendKeys("12627");
   
	 //select karnataka
	 //driver.findElement(By.xpath("//div[@id='modal']/div[6]/div/div/div[2]/div/button")).click();

  }
}
