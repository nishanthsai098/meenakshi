package locator.pom.org;

import org.openqa.selenium.WebElement;

import baseClass.org.Class1;

public class MavenBrowser extends Class1 {
	public static void main(String[] args) {
		
	Class1 global= new Class1();
		global.getDriver("chrome");
		global.launhUrl("https://en-gb.facebook.com/login/web/");
	
	LoginPage page= new LoginPage();
         WebElement txtUserName = page.getTxtUserName();    
         global.typeText(txtUserName, "javaa");
         WebElement txtPassword = page.getTxtPassword();
         global.typeText(txtPassword, "welcome javaa");
         WebElement btnLogin = page.getBtnLogin();
		global.btnClick(btnLogin);
		
	}
}
