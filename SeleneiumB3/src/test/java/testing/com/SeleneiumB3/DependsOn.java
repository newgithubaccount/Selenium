package testing.com.SeleneiumB3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {
	
	@Test
	public void login()
	{
		System.out.println("login functionality");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods="login")
	public void verufyOtion()
	{
		System.out.println("verify findfrinds inside homepage");
	}
}
