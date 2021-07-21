package testNg.org;


//import org.junit.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestNG {
@Test
public void testme() {
	System.out.println("hi");
}
@BeforeMethod
public void beforemethod() {
	System.out.println("hello");
}
}
