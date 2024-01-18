package cssselectorAssignment22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print device name and price from https://www.demoblaze.com/
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/");
		List<WebElement> devicesinfo = driver.findElements(By.cssSelector("div#tbodyid>div>div>div.card-block>h4"));
		List<WebElement> devicesprice = driver.findElements(By.cssSelector("div#tbodyid>div>div>div.card-block>h5"));

		System.out.println("the count of devices are: " + devicesinfo.size());
		for (int i = 0; i < devicesinfo.size(); i++) {
			System.out.println("" + devicesinfo.get(i).getText());
			System.out.println("" + devicesprice.get(i).getText());
		}
	}

}
