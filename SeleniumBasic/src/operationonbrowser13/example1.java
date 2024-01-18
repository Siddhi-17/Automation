package operationonbrowser13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		// String pagetitle = driver.getTitle();
		// System.out.println("the page title is: " + pagetitle);
		// System.out.println("the char of pagetitle is: " + pagetitle.length());

		// String currenturl = driver.getCurrentUrl();
		// System.out.println("the current url is: " + currenturl);
		// System.out.println("the char of the current url is: " + currenturl.length());
		String sourcecode = driver.getPageSource();
		System.out.println("the source code of the page is: " + sourcecode);
		System.out.println("the char of source page is: " + sourcecode.length());
		driver.close();
	}

}
