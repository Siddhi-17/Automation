package day7assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// open the url
		driver.get("https://www.amazon.in/");

		// get page title
		String homepagetitle = driver.getTitle();
		System.out.println("The home page title is: " + homepagetitle);

		// click on any of the menu from home page
		driver.findElement(By.linkText("Sell")).click();

		// applying explicit wait.
		// String sellpagetitle="Amazon.in: CrossShop1";
		String sellpagetitle = driver.getTitle();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs(sellpagetitle));
		System.out.println("the sell page title is: " + sellpagetitle);

		// navigate back to the home page
		driver.navigate().back();
		String backhomepage=driver.getTitle();
		wait.until(ExpectedConditions.titleIs(backhomepage));
		System.out.println("the home page title after navigativing back is :" +backhomepage);

		System.out.println("is navigation back is successfull? " + homepagetitle.equals(backhomepage));
		
		driver.close();

	}

}
