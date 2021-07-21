package junittest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Basic {
	
	@BeforeClass
	 public static void beforeClass(){
		System.out.println("before class method");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class method");
	}
	
	@Before
	 public void before(){
        System.out.println("before the @test");
	}
	
	@After
	public void after() {
		System.out.println("after the @test");
	}
	
	@Test
	public void textMe() {
		System.out.println("this is main code");
	}
}
