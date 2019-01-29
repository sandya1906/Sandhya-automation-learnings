package Automation;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Practng {
	SoftAssert softassert=new SoftAssert();
	@Test
	public void test(){
		String expected="ABC";
		String actual="ABCD";
		System.out.println("hello");
		//Assert.assertEquals(actual, expected);
		softassert.assertEquals(actual, expected);
		System.out.println("hello123");
		softassert.assertAll();
	}
   @Test
public void test1(){
	
	System.out.println("hello1");	
}
}


