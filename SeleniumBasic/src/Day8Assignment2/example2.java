package Day8Assignment2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Open browser
		WebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//get url
		driver.get("https://demo.automationtesting.in/Register.html");
		//findelements
		/*List<WebElement> elements=driver.findElements(By.className("ng-invalid-required"));
		System.out.println("identify the element count: "+elements.size());
		System.out.println("identify the element count: "+elements.get(0).getAttribute("placeholder"));
		System.out.println("identify the element count: "+elements.get(1).getAttribute("placeholder"));
		System.out.println("identify the element count: "+elements.get(2).getAttribute("placeholder"));
		System.out.println("identify the element count: "+elements.get(3).getAttribute("placeholder"));
		System.out.println("identify the element count: "+elements.get(4).getAttribute("placeholder"));
		System.out.println("identify the element count: "+elements.get(5).getAttribute("placeholder"));
		System.out.println("identify the element count: "+elements.get(6).getAttribute("placeholder"));
		System.out.println("identify the element count: "+elements.get(7).getAttribute("placeholder"));
		System.out.println("identify the element count: "+elements.get(8).getAttribute("placeholder"));
		System.out.println("identify the element count: "+elements.get(9).getAttribute("placeholder"));
		System.out.println("identify the element count: "+elements.get(10).getAttribute("placeholder"));
		System.out.println("identify the element count: "+elements.get(11).getAttribute("placeholder"));
		*/
		
		List<WebElement> elements=driver.findElements(By.tagName("input"));
		System.out.println("identify the size of elements: "+elements.size());
		/*System.out.println("1st element is: "+elements.get(0).getAttribute("placeholder"));
		System.out.println("2nd element is: "+elements.get(1).getAttribute("placeholder"));
		System.out.println("3rd element is: "+elements.get(2).getAttribute("placeholder"));
		System.out.println("4th element is: "+elements.get(3).getAttribute("placeholder"));
		System.out.println("5th element is: "+elements.get(4).getAttribute("placeholder"));
		System.out.println("6th element is: "+elements.get(5).getAttribute("placeholder"));
		System.out.println("7th element is: "+elements.get(6).getAttribute("placeholder"));
		System.out.println("8th element is: "+elements.get(7).getAttribute("placeholder"));
		System.out.println("9th element is: "+elements.get(8).getAttribute("placeholder"));
		System.out.println("10th element is: "+elements.get(9).getAttribute("placeholder"));
		System.out.println("11th element is: "+elements.get(10).getAttribute("placeholder"));
		System.out.println("12th element is: "+elements.get(11).getAttribute("placeholder"));
		*/
		
	for(int i=0;i<elements.size();i++) {
			System.out.println("the elements " +i+ " is: "+elements.get(i).getAttribute("placeholder"));
		}


elements.get(0).sendKeys("siddhi");
elements.get(1).sendKeys("hande");
elements.get(2).sendKeys("siddhikhande@gmail.com");
elements.get(3).sendKeys("7620668303");
elements.get(5).click();
elements.get(6).click();
elements.get(7).click();
elements.get(8).click();
elements.get(10).sendKeys("siddhi@123");
elements.get(11).sendKeys("siddhi@123");
	}

}
