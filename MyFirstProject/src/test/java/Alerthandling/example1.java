package Alerthandling;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class example1 {
  @Test
  public void TestActiveElementConcept() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://demowebshop.tricentis.com/login");
	  
	  //validate bydefault cursor is point to the which field
	  WebElement activeobject=driver.switchTo().activeElement();
	  
	  //get the game of the the field where the cursor is pointing
	  String objectname=activeobject.getAttribute("name");
	  String expectedobjectname="Email";
	//  String expectedobjectname="Emai";---------> unsuccessful msg will triggered in console
	  
	  Assert.assertEquals(objectname,expectedobjectname,"cursor pointer validation is unsuccessful");
	  
	  activeobject.sendKeys("tester01@vomoto.com",Keys.TAB);
	  driver.switchTo().activeElement().sendKeys("Abc@12345",Keys.ENTER);
  }
}
