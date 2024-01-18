package operationonbrowser4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// creating the instance for required browser.
		WebDriver driver = new ChromeDriver();
		// enter application url
		driver.get("https://www.makemytrip.com/");
		// get application title
		String expectedtitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
		String actualtitle = driver.getTitle();
		System.out.println("page title is: " + actualtitle);

		System.out.println("Is home oage opened?: " + actualtitle.equals(expectedtitle));

		driver.close();
	}

}
