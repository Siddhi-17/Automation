package VtigerAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Vtigerlead extends SeleniumUtility {
	@BeforeTest
	public void openConnection() {
		setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		typeInput(driver.findElement(By.id("username")), "admin");
		typeInput(driver.findElement(By.id("password")), "admin");
		clickOnElement(driver.findElement(By.xpath("//button[text()='Sign in']")));
		System.out.println("Login successful");
	}

	@Test(priority = 1)
	public void createContact() throws InterruptedException {
		clickOnElement(driver.findElement(By.cssSelector("#appnavigator>div>span")));
		clickOnElement(driver.findElement(By.cssSelector("#MARKETING_modules_dropdownMenu")));
		clickOnElement(driver.findElement(By.xpath("//a[@title='Leads']")));
		// click on Add Lead
		clickOnElement(driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")));
		// enter firstname n lastname
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_firstname")), "xyz");
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_lastname")), "abc");
		clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));
		System.out.println("LEAD created successful");
		clickOnElement(driver.findElement(By.cssSelector(".Leads-module-action-content>div:nth-of-type(1)>p>a")));
		// checkbox
		clickOnElement(driver.findElement(By.cssSelector(".overflow-y>tr>td>div>span>input")));
		// click on edit pencil
		clickOnElement(driver.findElement(By.id("Leads_listView_massAction_LBL_EDIT")));
		// edit company name
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_company")), "pqr");
		clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));
		System.out.println("LEAD updated successfully!!");
		// select lead
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.cssSelector("#Leads_listView_row_1>td>div>span>input"))));
		Thread.sleep(1000);
		clickOnElement(driver.findElement(By.cssSelector("//tr[@id='Leads_listView_row_1']/td[1]/div/span[1]/input")));
		// click on delete pencil
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Leads_listView_massAction_LBL_DELETE"))));
		clickOnElement(driver.findElement(By.id("Leads_listView_massAction_LBL_DELETE")));
		// click on yes
		clickOnElement(driver.findElement(By.xpath("//button[text()='Yes']")));
		System.out.println("Lead deleted successfully");

	}

	@AfterTest(enabled = false)
	public void logOut() {
		driver.findElement(By.cssSelector(".fa.fa-user")).click();
		clickOnElement(driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")));
		cleanUp();
	}
}
