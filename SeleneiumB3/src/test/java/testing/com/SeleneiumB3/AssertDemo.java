package testing.com.SeleneiumB3;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	
	int a=101;
	
//	@Test
	public void evenPass()
	{
		Assert.assertTrue(a%2==0);
		System.out.println("After assertion");
	}
	
	@Test
	public void verify()
	{
		System.out.println("my test will pass if it is even");
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(1, 0);
		
		softAssert.assertEquals(2, 1);
		softAssert.assertAll();
		System.out.println("after softaasert");
		
	}

}
