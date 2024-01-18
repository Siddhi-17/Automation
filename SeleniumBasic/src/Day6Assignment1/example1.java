package Day6Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/testing/login.do");

		driver.findElement(By.id("loginButton")).click();

		WebElement usernameinputfield = driver.findElement(By.id("username"));
		Point usernameinputfieldcords = usernameinputfield.getLocation();
		int usernameinputfield_X = usernameinputfieldcords.getX();
		int usernameinputfield_Y = usernameinputfieldcords.getY();
		System.out.println("userinputfield 'X' cordinate: " + usernameinputfield_X);
		System.out.println("userinputfield 'Y' cordinate: " + usernameinputfield_Y);
		
		WebElement errorMsg=driver.findElement(By.className("errormsg"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(errorMsg));
		
		Point errorMsgCords=errorMsg.getLocation();
		int errorMsg_X=errorMsgCords.getX();
		int errorMsg_Y=errorMsgCords.getY();
		System.out.println("errorMsg 'x' cordinate: "+errorMsg_X);
		System.out.println("errorMsg 'y' cordinate: "+errorMsg_Y);
		
		System.out.println("is error message getting displayed above username input field? "+(errorMsg_Y<usernameinputfield_Y));


	}

}
