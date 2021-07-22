package testNg.org;

import org.testng.annotations.DataProvider;

public class Class1 {
	
	public static void username() {
		}
	
	
	
	@DataProvider(name="mydata")
	
	private static Object[][] getdata() {
		return new Object[][] {
			
			{"hijavaa","welcomejavaa"},{"hiselenium","welcomeselenium"}};
		

	}
	
		
	}


