package practise2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://online.actitime.com/testing/login.do");
		
		
		String logintitle = driver.getTitle();
		System.out.println("the login page title is: "+logintitle);

		driver.findElement(By.name("username")).sendKeys("tester01@vomoto.com");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		String expectedHomePageTitle= "actiTIME -  Enter Time-Track";

		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs(expectedhomepagetitle));
		
		String actualhomepagetitle=driver.getTitle();

		//System.out.println("the expected home page title is: "+expectedhomepagetitle);
		System.out.println("the actual home page title is: "+actualhomepagetitle);
		System.out.println("is home page is login successfully? "+actualhomepagetitle.equals(expectedhomepagetitle));
		*/
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));//0-20sec
		
		String actualHomePageTitle=driver.getTitle();
		System.out.println("Actual Home page title is : "+actualHomePageTitle);
		System.out.println("is login successfully? "+actualHomePageTitle.equals(expectedHomePageTitle));
	}

}
