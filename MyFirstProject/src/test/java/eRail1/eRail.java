package eRail1;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class eRail {
	@Test
	public void catering() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://erail.in/");
		String homeWinId = driver.getWindowHandle();
		System.out.println("Home window id:" + homeWinId);
		System.out.println("Home page title:" + driver.getTitle());
		driver.findElement(By.xpath("//a[text()='eCatering']")).click();
		Set<String> allWinIds = driver.getWindowHandles();
		System.out.println("Opened window ids:" + allWinIds);
		allWinIds.remove(homeWinId);
		Iterator<String> itr = allWinIds.iterator();
		String cateringWin = itr.next();
		System.out.println("Catering window id:" + cateringWin);
		driver.switchTo().window(cateringWin);

		WebElement PNR = driver.findElement(By.xpath("//input[@placeholder='Search Train or Station to explore']"));
//wait.until(ExpectedConditions.visibilityOf(PNR));
		PNR.click();// sendKeys("12627");
		driver.findElement(By.xpath("//input[@placeholder='Start typing Nagpur, NGP, Rajdhani']")).sendKeys("12627");
		//driver.findElement(By.xpath("//*[@id=\"modal\"]/div[6]/div/div/div[1]/div[2]/input")).sendKeys("12627");
		driver.findElement(By.xpath("//button[text()='12627']")).click();
		WebElement dateSelect = driver.findElement(By.xpath("//input[@placeholder='Boarding Date']"));
		dateSelect.click();

		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
				Keys.ENTER);
		WebElement boardingStation = driver.findElement(By.xpath("//select[@placeholder='Boarding Station']"));
		//boardingStation.click();
		Select select = new Select(boardingStation);
//List<We>
		select.selectByValue("ET");
		driver.findElement(By.xpath("//button[text()='FIND FOOD']")).click();
		List<WebElement> hotelList = driver
				.findElements(By.cssSelector(".flex.bg-white.min-h-43.shadow-md>*:nth-child(2)>div>h5"));
		System.out.println("Hotel list:" + hotelList.size());
		for (int i = 0; i < hotelList.size(); i++) {
			System.out.println(hotelList.get(i).getText());
		}
		System.out.println("Done");
//driver.findElement(By.xpath("//button[text()='Submit']")).click();
// Set<String> allWinIds1=driver.getWindowHandles();
// System.out.println("Opened window ids:"+allWinIds1);
//driver.close();

	}

}
