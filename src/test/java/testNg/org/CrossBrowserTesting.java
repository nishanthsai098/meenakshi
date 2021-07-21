package testNg.org;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.beust.jcommander.Parameter;

public class CrossBrowserTesting {
	//WebDriver driver;

	@Parameters({"browser"})
	@Test
	private void tc0( String s) {
		if(s.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRINIVAS\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");
             WebDriver	 driver= new ChromeDriver();
            driver.manage().window().maximize();
		
		}
		else if(s.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\SRINIVAS\\eclipse-workspace\\Maven\\Driver\\geckodriver.exe");
		 WebDriver driver= new FirefoxDriver();
		 driver.manage().window().maximize();
		}
		
	

	}
}
