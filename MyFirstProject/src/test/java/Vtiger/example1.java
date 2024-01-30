package Vtiger;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example1 {
	@Test(priority = 1)
	public void vtiger() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("admin", Keys.ENTER);

		// tapping on hamburger option
		driver.findElement(By.xpath("//div[@id='appnavigator']/div/span")).click();

		// click on marketing option
		driver.findElement(By.xpath("//span[text()=' MARKETING']")).click();

		// select contact option
		driver.findElement(By.xpath("//div[@id='mCSB_1_container']/li[3]/a/span/i")).click();

		// click on the add contact option
		driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();

		// fill field for 1st name
		driver.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys("Siddhi");
		driver.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys("Hande");
		driver.findElement(By.xpath("//div[@class='modal-overlay-footer clearfix']/div/div/button")).click();

		// click on contacts
		driver.findElement(By.xpath("//h4[text()=' Contacts ']")).click();

		// click on check box
		driver.findElement(By.xpath("//div[@id='table-content']/form/table/tbody//tr[1]/td[1]/div/span[1]/input"))
				.click();

		// click on edit button to edit the profile
		driver.findElement(By.id("Contacts_listView_massAction_LBL_EDIT")).click();

		// edit field title
	driver.findElement(By.id("Contacts_editView_fieldName_mobile")).sendKeys("1234567876");

		//driver.findElement(By.id("include_in_mass_edit_title")).click();
		driver.findElement(By.xpath("//form[@id='massEdit']/div/footer/center/button")).click();
		//driver.findElement(By.xpath("//form[@id='massEdit']/div/footer/center/button")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div[2]/button")).click();
	
		
		//delete
	driver.findElement(By.id("Contacts_listView_massAction_LBL_DELETE")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();

	}
}
