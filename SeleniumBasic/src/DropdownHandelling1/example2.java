package DropdownHandelling1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class example2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = example1.setup("chrome", "https://demo.automationtesting.in/Register.html");
		WebElement dropdown1 = driver.findElement(By.cssSelector("select[placeholder=Month]"));
//WebElement dropdown1 = driver.findElement(By.cssSelector("select[class=form-control]"));

		// creating the object for select
		Select month = new Select(dropdown1);

		// check wheter the drop down is multi selectable or not
		System.out.println("is dropdown is multiselect? " + month.isMultiple());

		// get the initial value from the drop down
		System.out.println("the inital value of the drop down is: " + month.getFirstSelectedOption().getText());

		List<WebElement> monthlist = month.getOptions();
		System.out.println("list of the months are: " + monthlist.size());

		for (int i = 0; i < monthlist.size(); i++) {
			System.out.println("months " + monthlist.get(i).getText());
		}
		// select options from dropdown

		month.selectByIndex(1);
		Thread.sleep(2000);

		month.selectByValue("April");
		Thread.sleep(2000);

		month.selectByVisibleText("May");
		Thread.sleep(2000);

		System.out.println("after selecting the value from the dropdown: " + month.getFirstSelectedOption().getText());
		// validate skill order

		String expectedmonthlist = "Month, January, February, March, April, May, June, July, August, September, October, November, December";
		String actualmonthlist = "";
		for (int i = 0; i < monthlist.size(); i++) {
			if (i < monthlist.size() - 1) {
				actualmonthlist = actualmonthlist + monthlist.get(i).getText() + ", ";
			} else {
				actualmonthlist = actualmonthlist + monthlist.get(i).getText();
			}
		}
		System.out.println("are skill option in order? " + actualmonthlist.equals(expectedmonthlist));
	}

}
