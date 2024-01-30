package Alerthandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example2 {
  @Test
  public void HandlingAlertPopup() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		//as the required element is present inside the frame, so need to switch our control inside frame first
    driver.switchTo().frame("iframeResult");
    driver.findElement(By.xpath("//button[text()='Try it']")).click();
    System.out.println("the alert msg is: "+driver.switchTo().alert().getText());    
	driver.switchTo().alert().sendKeys("Pune");

    //driver.switchTo().alert().accept();
    //driver.switchTo().alert().dismiss();
  }
}