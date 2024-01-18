package property_file_with_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.Seleniumutil;

public class example1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// load property file
		FileInputStream fis = new FileInputStream(".\\TestData\\AppData.properties");
		Properties prop = new Properties();// create property class
		prop.load(fis); // call load method

		WebDriver driver = Seleniumutil.setup("Chrome", prop.getProperty("url"));
		// firstname
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys(prop.getProperty("FirstName"));
		// last name
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(prop.getProperty("LastName"));
		// address
		driver.findElement(By.cssSelector("textarea.form-control")).sendKeys((prop.getProperty("Address")));
		// emailaddress
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(prop.getProperty("EmailAddress"));
		// Phone
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys(prop.getProperty("Phone"));
		// gender
		driver.findElement(By.cssSelector("input[value='FeMale']")).click();
		// hobbiess
		driver.findElement(By.id("checkbox1")).click();
		// skills
		/*WebElement skills = driver.findElement(By.cssSelector("#skills"));
		Select skill = new Select(skills);
		skill.selectByIndex(4);

		// country
		WebElement country = driver.findElement(By.id("countries"));
		Select countries = new Select(skills);
		countries.selectByIndex(2);*/
		// password
		// driver.findElement(By.cssSelector("input[id='firstpassword']")).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.cssSelector("#firstpassword")).sendKeys(prop.getProperty("Password"));
		//driver.findElement(By.id("firstpassword")).sendKeys(prop.getProperty("Password"));//getting 2 locators.
		// confirm password
		// driver.findElement(By.cssSelector("input[id='secondpassword']")).sendKeys(prop.getProperty("ConfrimPassword"));
		driver.findElement(By.cssSelector("#secondpassword")).sendKeys(prop.getProperty("Confirmpassword"));

		System.out.println("the registration for is filled successfully");

	}

}
