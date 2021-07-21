package testNg.org;

import org.testng.annotations.DataProvider;

public class Class1 {
	@DataProvider(name="mydata")
	private static Object[][] getdata() {
		return new Object[][] {
			
			{"hijavaa","welcomejavaa"},{"hiselenium","welcomeselenium"}};
		

	}
	
		
	}


