package testing.com.SeleneiumB3;

import org.testng.annotations.Test;

public class PirorityTest {
	@Test(priority=0)
	public void m4()
	{
		System.out.println("this is my 4th test in test ng");
	}
	
	@Test(priority=2)
	public void m3()
	{
		System.out.println("this is my 3rd test in test ng");
	}
	
	@Test(priority=1)
	public void abc()
	{
		System.out.println("this is my 4th test in test ng");
	}

}
