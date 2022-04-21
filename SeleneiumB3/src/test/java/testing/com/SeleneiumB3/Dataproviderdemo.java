package testing.com.SeleneiumB3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderdemo {
	
	@DataProvider(name="getData")
	public Object[][] getData()
	{
		return new Object[][] {
			
			{
				10,20
			},
			{
				85,65
			},
			{
				96,100
			}
		};
	}
	
	@Test(dataProvider="getData")
	public void myTest(int a,int b)
	{
		System.out.println(a+b);
	}

}
