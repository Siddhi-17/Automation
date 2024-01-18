package DropdownHandelling1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class example1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// open browser and url
		WebDriver driver = example1.setup("chrome", "https://demo.automationtesting.in/Register.html");
		WebElement dropdown = driver.findElement(By.id("yearbox"));
		Select year = new Select(dropdown);

//check whether the dropdown is multiselect or not

		System.out.println("the dropdown is multiselect? " + year.isMultiple());

//check the default selected option

		System.out.println("The initial value of the dropdown is: " + year.getFirstSelectedOption().getText());

		List<WebElement> yearlist = year.getOptions();
		System.out.println("the total count of the year in the yearlist is: " + yearlist.size());

//print the total year list

		for (int i = 0; i < yearlist.size(); i++) {
			System.out.println("number of the year is: " + yearlist.get(i).getText());

			// select value from dropdown
		}
		year.selectByIndex(3);
		Thread.sleep(2000);

//or

		year.selectByValue("1920");
		Thread.sleep(2000);

//or

		year.selectByVisibleText("1924");
		Thread.sleep(2000);

		System.out.println("After selecting value from dropdown: " + year.getFirstSelectedOption().getText());

//validate year order

		String Expectedyearlist = "year; 1916; 1917; 1918; 1919; 1920; 1921; 1922; 1923; 1924; 1925; 1926; 1927; 1928; 1929; 1930; 1931; 1932; 1933; 1934; 1935; 1936; 1937; 1938; 1939; 1940; 1941; 1942; 1943; 1944; 1945; 1946; 1947; 1948; 1949; 1950; 1951; 1952; 1953; 1954; 1955; 1956; 1957; 1958; 1959; 1960; 1961; 1962; 1963; 1964; 1965; 1966; 1967; 1968; 1969; 1970; 1971; 1972; 1973; 1974; 1975; 1976; 1977; 1978; 1979; 1980; 1981; 1982; 1983; 1984; 1985; 1986; 1987; 1988; 1989; 1990; 1991; 1992; 1993; 1994; 1995; 1996; 1997; 1998; 1999; 2000; 2001; 2002; 2003; 2004; 2005; 2006; 2007; 2008; 2009; 2010; 2011; 2012; 2013; 2014; 2015";
		String Actualyearlist = "";

		// printing all listed years

		for (int i = 0; i < yearlist.size(); i++) {
			if (i < yearlist.size() - 1) {
				Actualyearlist = Actualyearlist + yearlist.get(i).getText() + "; ";
			} else {
				Actualyearlist = Actualyearlist + yearlist.get(i).getText();
			}
		}
		System.out.println("are year list is in order? " + Actualyearlist.equals(Expectedyearlist));
	}

	public static WebDriver setup(String browserName, String appUrl) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(appUrl);
		return driver;
	}
}
