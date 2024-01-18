package operationonbrowser11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
String pagetitle=driver.getTitle();
System.out.println("the page title is: "+pagetitle);
System.out.println("page title char count: "+pagetitle.length());

//get application current url from browser

String currenturl=driver.getCurrentUrl();
System.out.println("the application current url is: "+currenturl);
System.out.println("the application url length: "+currenturl.length());

String sourcecode=driver.getPageSource();
System.out.println("the source page is: "+sourcecode);
System.out.println("the char of soucrce code is: "+sourcecode.length());

driver.close();
	}

}
