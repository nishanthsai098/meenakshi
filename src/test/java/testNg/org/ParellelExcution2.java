package testNg.org;

import org.testng.annotations.Test;

public class ParellelExcution2 {
	@Test
	private void tc10() {
		System.out.println("10");
		System.out.println(Thread.currentThread().getId());

	}
@Test
	private void tc11() {
		System.out.println("11");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc12() {
		System.out.println("12");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc13() {
		System.out.println("13");
		System.out.println(Thread.currentThread().getId());

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
