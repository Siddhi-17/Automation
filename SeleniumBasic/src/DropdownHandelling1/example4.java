package DropdownHandelling1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class example4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = example1.setup("chrome", "https://demo.automationtesting.in/Register.html");

		// find element
		WebElement dropdown = driver.findElement(By.id("daybox"));

//create the object for select
		Select day = new Select(dropdown);

//check for multiselection 
		System.out.println("is this dropdown is multiselect? " + day.isMultiple());

//initial value of dropdown
		System.out.println("the initial valye of the dropdown is: " + day.getFirstSelectedOption().getText());

		List<WebElement> daylist = day.getOptions();
		System.out.println("the number od days are: " + daylist.size());

		// now print all the days present in the list

		for (int i = 0; i < daylist.size(); i++) {
			System.out.println("the list of the days are: " + daylist.get(i).getText());
		}

		// selecting values from dropdown list
		day.selectByIndex(1);
		Thread.sleep(1000);

		// or

		day.selectByValue("5");
		Thread.sleep(1000);

		// or
		day.selectByVisibleText("10");
		Thread.sleep(1000);
		System.out.println("after selecting value from dropdown: " + day.getFirstSelectedOption().getText());
		
		//validate day order
		String ecpecteddayorder="Day; 1; 2; 3; 4; 5; 6; 7; 8; 9; 10; 11; 12; 13; 14; 15; 16; 17; 18; 19; 20; 21; 22; 23; 24; 25; 26; 27; 28; 29; 30; 31";
		String actualdayorder="";
		
		for(int i=0;i<daylist.size();i++) {
			if(i<daylist.size()-1) {
				actualdayorder=actualdayorder+daylist.get(i).getText()+"; ";
			}else {
				actualdayorder=actualdayorder+daylist.get(i).getText();
			}
	}
	System.out.println("are skill option in order? "+actualdayorder.equals(ecpecteddayorder));
}
	}
