package testNg.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class2 {
	@Test(dataProvider="mydata",dataProviderClass = Class1.class)
	private void tc12(String s, String s1) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRINIVAS\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement txtusername = driver.findElement(By.id("twotabsearchtextbox"));
		txtusername.sendKeys("iphone 11");
		WebElement txtpass = driver.findElement(By.id("New Apple iPhone 12 (128GB) - Blue"));
		txtpass.sendKeys(s1);

	}

	}


