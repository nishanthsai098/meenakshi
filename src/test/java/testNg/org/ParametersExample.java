package testNg.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class ParametersExample {
	WebDriver driver;
	
@BeforeClass
private void beforeclass( ) {
   System.setProperty("webdriver.chrome.driver","C:\\Users\\SRINIVAS\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get("https://adactinhotelapp.com/");
   
}

 @org.testng.annotations.Parameters ({"username"})
 @Test
 private void tc0(String s1) {
	WebElement txtusername = driver.findElement(By.id("username"));
    txtusername.sendKeys(s1);
}
 
 
 @org.testng.annotations.Parameters({"password"})
 @Test
 private void tc1(String s2) {
	 WebElement txtpassword = driver.findElement(By.id("password"));
     txtpassword.sendKeys(s2);	

}
   @org.testng.annotations.Parameters({"login"})
   @Test
   private void tc2( String s3) {
	   WebElement btnlogin = driver.findElement(By.id("login"));
       btnlogin.click();	

}
   
   @org.testng.annotations.Parameters({"location"})
   @Test
   private void tc3(String s4) {
	WebElement location = driver.findElement(By.id("location"));
	location.sendKeys(s4);

}
   
   @org.testng.annotations.Parameters({"hotels"})
   @Test
   private void tc4( String s5) {
	WebElement hotel = driver.findElement(By.id("hotels"));
	hotel.sendKeys(s5);
} 
   
   @org.testng.annotations.Parameters({"room_type"})
   @Test
   private void tc5(  String s6) {
	WebElement roomtype = driver.findElement(By.id("room_type"));
	roomtype.sendKeys(s6);
} 
   
   
   @org.testng.annotations.Parameters({"room_nos"})
   @Test
   private void tc6(  String s6) {
	WebElement roomno = driver.findElement(By.id("room_nos"));
	
	roomno.sendKeys(s6);
}
   
   @org.testng.annotations.Parameters({"datepick_in"})
   @Test
   private void tc7(  String s7) {
	WebElement datepickin = driver.findElement(By.id("datepick_in"));
	datepickin.clear();
	datepickin.sendKeys(s7);
	
}
   
   @org.testng.annotations.Parameters({"datepick_out"})
   @Test
   private void tc8(  String s8) {
	WebElement datepickout = driver.findElement(By.id("datepick_out"));
	datepickout.sendKeys(s8);
}
   
   @org.testng.annotations.Parameters({"adult_room"})
   @Test
   private void tc9(  String s9) {
	WebElement adultroom = driver.findElement(By.id("adult_room"));
	adultroom.sendKeys(s9);
}
   
   @org.testng.annotations.Parameters({"child_room"})
   @Test
   private void tc10(  String s10) {
	WebElement childroom = driver.findElement(By.id("child_room"));
	childroom.sendKeys(s10);
}
 
   
   @org.testng.annotations.Parameters({"submit"})
   @Test
   private void tc11( String s11 ) {
	WebElement btn = driver.findElement(By.id("submit"));
	btn.click();;
}
   
   


}
