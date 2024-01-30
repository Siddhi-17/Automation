package switchassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example1 {
  @Test
  public void select() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  //url
	  driver.get("https://jqueryui.com/autocomplete/");
	  driver.switchTo().frame(0);
	  driver.findElement(By.className("ui-autocomplete-input")).sendKeys("ja");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//ul[@id=\"ui-id-1\"]/li[1]")).click();
  }
}
