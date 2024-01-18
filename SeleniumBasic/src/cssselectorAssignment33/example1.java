package cssselectorAssignment33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. get device count from Phone Finder and print there names -
		// https://www.gsmarena.com/
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.gsmarena.com/");
		List<WebElement> devicelist = driver.findElements(By.cssSelector("div.brandmenu-v2.light.l-box.clearfix>ul>li>a"));
		System.out.println("the divuce list count is: " + devicelist.size());
		for (int i = 0; i < devicelist.size(); i++) {
			System.out.println("the device is: " + devicelist.get(i).getText());

		}
	}

}
