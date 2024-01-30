package DDTExcel;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class orangeHRMLoginfail extends SeleniumUtility{
	String appUrl;
	String username;
	String password;
	static int row=3;
	static String expTitle;
	static String actTitle;
	String filepath="E:\\AutomationSession\\workspace\\MyFirstProject\\src\\test\\resources\\testData\\TextFile.xlsx";
	@BeforeMethod
	public void getData()
	{
		appUrl=ExcelUtility.getCellValue(filepath, "Sheet4", row, 0);
		username=ExcelUtility.getCellValue(filepath, "Sheet4", row, 1);
		password=ExcelUtility.getCellValue(filepath, "Sheet4", row, 2);
		expTitle=ExcelUtility.getCellValue(filepath, "Sheet4", row, 3);
		
	}
	@Test
	public void testOrangeHRMLogin()
	{
		setUp("chrome", appUrl);
		typeInput(driver.findElement(By.name("username")), username);
		typeInput(driver.findElement(By.name("password")), password);
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
		actTitle=getCurrentTitleOfApplication();
		Assert.assertEquals(actTitle,expTitle);
	}
	@AfterMethod
	public void cleanUp1()
	{
		ExcelUtility.updateExcelContent(filepath, "Sheet4", row,3,actTitle);//row=5
		if(actTitle.equals(expTitle))
		{
			ExcelUtility.updateExcelContent(filepath, "Sheet4", row,5, "PASSED");
		}
		else
			ExcelUtility.updateExcelContent(filepath, "Sheet4", row,5,"FAiled");
	}
	@Override
	public void cleanUp() {
		// TODO Auto-generated method stub
		super.cleanUp();
	}
	

}

