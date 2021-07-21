package testNg.org;

import org.testng.annotations.Test;

public class ParellelExcution {
	@Test
	private void tc0() {
		System.out.println("m0");
		System.out.println(Thread.currentThread().getId());

	}
@Test
	private void tc1() {
		System.out.println("m1");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc2() {
		System.out.println("m2");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc3() {
		System.out.println("m3");
		System.out.println(Thread.currentThread().getId());

	}
	
	}

         // adv of parallel excution is time reduce

               // parallel excution  have 3 ways

                        //1.classes

                             //2.methods

                                   //3.tests





