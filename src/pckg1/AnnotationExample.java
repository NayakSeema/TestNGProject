package pckg1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExample {
	
	@BeforeTest	
	public void beforeT() {
		 System.out.println("Inside Before Method");
}
	
	@BeforeMethod	
	public void beforeM() {
		 System.out.println("Inside Before Method");
}
	@Test(groups= {"sanity"},enabled = false, description = "to test all the login scenarios")
 public void text1() {
	 System.out.println("Inside The Test Case-1");
	}
	 
	 @Test
	 public void text2() {
		 System.out.println("Inside The Test Case-2");
 }
	 @AfterMethod	
		public void afterM() {
			 System.out.println("Inside After Method");
	}
}
