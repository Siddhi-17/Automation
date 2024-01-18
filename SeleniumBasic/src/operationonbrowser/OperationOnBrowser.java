package operationonbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OperationOnBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create instance to open the required browser
		WebDriver driver=new ChromeDriver();
		//enter application URL
		driver.get("https://www.google.com/");
		
		//get application title
		String pageTitle=driver.getTitle();
	System.out.println("page title is: "+pageTitle);
	System.out.println("page title char count: "+pageTitle.length());
	
	String CurrentUrl=driver.getCurrentUrl();
	System.out.println("current page url is: "+CurrentUrl);
	System.out.println("url char count is: "+CurrentUrl.length());
	
	//get application source code
	String Pagesource=driver.getPageSource();
	System.out.println("source code of the current page is: "+Pagesource);
	System.out.println("length of source code is: "+Pagesource.length());
	
	//automatically close the current browser instance
	driver.close();
	}

}
