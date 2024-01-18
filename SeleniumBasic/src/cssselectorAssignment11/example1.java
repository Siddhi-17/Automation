package cssselectorAssignment11;

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.espncricinfo.com/");
		List<WebElement> menuandnames = driver
				.findElements(By.cssSelector("div.ds-flex.ds-items-center.ds-justify-between.ds-flex-1>div>div>a"));
		System.out.println("the menu list count is: " + menuandnames.size());
		for (int i = 0; i < menuandnames.size(); i++) {
			System.out.println("" + menuandnames.get(i).getText());
		}

	}
}
