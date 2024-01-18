package Locators;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
		String ExpectedTitle = "Swag Labs";
		String ActualTitle = driver.getTitle();
		System.out.println("the expected title is: " + ExpectedTitle);
		System.out.println("the actual title is: " + ActualTitle);
		System.out.println("the page is opened? " + ActualTitle.equals(ExpectedTitle));

	}

}
