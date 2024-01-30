package AdvanceTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.SeleniumUtility;

public class DataProviderMethod extends SeleniumUtility {
// for @dataprovider method: the number of parameter we have declared in the row same number of parameter we have pass in the @test method.
// for @parameterized method: we can pass any number of parameters.
	@Test(dataProvider = "getData") // using dataProvider method name
	public void setData(String username, String password) {
		System.out.println("you have provided username as::" + username);
		System.out.println("you have provided password as::" + password);
	}

	@Test(dataProvider = "testData") // using dataProvider param name
	//as we have pass the correct number of paramaters present in the row, therefore this @test method will execute properly.
	public void testLoginOfVtiger(String browser, String username,String password) {
		setUp(browser, "https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys(password, Keys.ENTER);
		driver.close();
	}
//OR
	/*@Test(dataProvider = "testData") // using dataProvider param name
	//as we haven't pass the correct number of paramaters present in the row, therefore this @test method will not execute properly so script get failed.
	public void testLoginOfVtiger(String browser, String username) {
		setUp(browser, "https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
	   // driver.findElement(By.id("password")).sendKeys(password, Keys.ENTER);
		driver.close();
	*/
	
	@DataProvider(name = "testData")
	public Object[][] getUserDetails() {
		/**
		 * Rows - Number of times your test has to be repeated. Columns - Number of
		 * parameters in test data.
		 */
		Object[][] data = new Object[3][3];
		// 1st row
		data[0][0] = "chrome";
		data[0][1] = "admin";
		data[0][2] = "admin";
		// 2rd row
		data[1][0] = "chrome";
		data[1][1] = "pass123";
		data[1][2] = "admin";
		// 3rd row
		data[2][0] = "chrome";
		data[2][1] = "";
		data[2][2] = "";
		return data;
	}

	@DataProvider
	public Object[][] getData() {
		/**
		 * Rows - Number of times your test has to be repeated. Columns - Number of
		 * parameters in test data.
		 */
		Object[][] data = new Object[3][2];

		// 1st row
		data[0][0] = "admin";
		data[0][1] = "admin";
		// 2nd row
		data[1][0] = "";
		data[1][1] = "";
		// 3rd row
		data[2][0] = "guestuser3";
		data[2][1] = "pass123";
		return data;
	}
}