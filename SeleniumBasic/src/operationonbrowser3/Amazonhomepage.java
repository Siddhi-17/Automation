package operationonbrowser3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonhomepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating the instance for required browser.
		WebDriver driver = new ChromeDriver();
		// enter application url
		driver.get("https://www.amazon.in/");
		// get application title
		String expectedtitle = "Online Shopping Site in India:";
		String actualtitle = driver.getTitle();
		System.out.println("page title is: " + actualtitle);

		System.out.println("Is home oage opened?: " + actualtitle.equals(expectedtitle));

		driver.close();
	}

}
