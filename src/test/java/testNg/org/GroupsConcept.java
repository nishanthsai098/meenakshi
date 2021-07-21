package testNg.org;

import org.testng.annotations.Test;

public class GroupsConcept {
	 @Test(groups = "@smoke")
	 private void tc01() {
		System.out.println("method1");
		

	}
@Test(groups="@sanity", dependsOnGroups = "@smoke")
	 private void tc02() {
			System.out.println("method2");

		}
	 @Test(groups = "@reg")
	 private void tc03() {
			System.out.println("method3");

		}
	 @Test(groups = "@smoke")
	 private void tc04() {
			System.out.println("method4");

		}
	 @Test(groups = "@smoke")
	 private void tc05() {
			System.out.println("method5");

		}
	 
	 
	 
}
