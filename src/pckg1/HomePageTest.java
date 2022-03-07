package pckg1;

import org.testng.annotations.Test;

public class HomePageTest {

	@Test(dependsOnMethods={"test6","test7"})
	public void test3() {
		System.out.println("Inside test-3");
	}
	
	@Test
	public void test6() {
		System.out.println("Inside test-6");
	}
}
