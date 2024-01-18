package operationonbrowser12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String pagetitle = driver.getTitle();
		System.out.println("the page title is: " + pagetitle);
		System.out.println("the char of pagetitle is: " + pagetitle.length());

		String currenturl = driver.getCurrentUrl();
		System.out.println("the current url is: " + currenturl);
		System.out.println("the char of the current url is: " + currenturl.length());

		driver.close();
	}

}
