package testNg.org;

import org.testng.annotations.Test;

public class ParellelExcution3 {
	@Test
	private void tc30() {
		System.out.println("30");
		System.out.println(Thread.currentThread().getId());

	}
@Test
	private void tc31() {
		System.out.println("31");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc32() {
		System.out.println("32");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc33() {
		System.out.println("33");
		System.out.println(Thread.currentThread().getId());

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
