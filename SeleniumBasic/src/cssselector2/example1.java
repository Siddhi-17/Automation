package cssselector2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		List<WebElement> suggestionlist = driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:nth-child(1)>div>span"));
		System.out.println("the suggestion counts are :" + suggestionlist.size());
		for (int i = 0; i < suggestionlist.size(); i++) {
			System.out.println("" + suggestionlist.get(i).getText());
		}
	}

}
