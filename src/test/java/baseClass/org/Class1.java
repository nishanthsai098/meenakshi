package baseClass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 {
 public static WebDriver driver;
	public void getDriver(String browserName) {
		try {
			if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRINIVAS\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			}
			
			else if(browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRINIVAS\\eclipse-workspace\\Maven\\Driver\\geckodriver.exe");
				driver=new FirefoxDriver();
	}
			
			
			else if(browserName.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRINIVAS\\eclipse-workspace\\Maven\\Driver\\geckodriver.exe");
				WebDriver driver = new EdgeDriver();
		}
			
			else {
				System.out.println("invalid browser");
			}
			
	//driver.manage().window().maximize();
			
				} catch (Exception e) {
			System.out.println(e);
		}

	}
	public void typeText(WebElement txtuserName, String string) {
		driver.get("https://en-gb.facebook.com/login/web/");
		
	}
	public void btnClick(WebElement btnLogin) {
		// TODO Auto-generated method stub
		
	}
	public void launhUrl(String string) {
		// TODO Auto-generated method stub
		
	}
	
	}
	
		
	


