package practise1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//open the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// open url
		driver.get("https://online.actitime.com/testing/login.do");
		
		//validate username and password.
		driver.findElement(By.name("username")).sendKeys("tester01@vomoto.com");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//String expectedtitleafterlogin="actiTIME -  Enter Time-Track";
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.titleIs(expectedtitleafterlogin));
		
		//String actualtitleafterlogin=driver.getTitle();

		String expectedHomePageTitle="actiTIME - Enter Time-Track";
		//need to use conditional wait as page title taking time to update
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));//0-20sec
		
		String actualHomePageTitle=driver.getTitle();
		System.out.println("Actual Home page title is : "+actualHomePageTitle);
		System.out.println("is login successfully? "+actualHomePageTitle.equals(expectedHomePageTitle));
	
	}

}
