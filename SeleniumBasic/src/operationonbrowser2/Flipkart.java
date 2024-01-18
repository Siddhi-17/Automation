package operationonbrowser2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creating the instance for required browser.
		WebDriver driver = new ChromeDriver();
		// enter application url
		driver.get("https://www.flipkart.com/");
		// get application title
		String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String actualtitle = driver.getTitle();
		System.out.println("page title is: " + actualtitle);

		System.out.println("Is home oage opened?: " + actualtitle.equals(expectedtitle));

		driver.close();
	}

}
