package testing.com.SeleneiumB3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngTest {
	
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("i will execute before the start of the suite");
	}
	@AfterSuite
	public void  asuite()
	{
		System.out.println("I will execute after the end of the suite");
	}
	
	@BeforeClass
	public void bsclass()
	{
		System.out.println("i will execute before the start of the class");
	}
	@AfterClass
	public void  aclass()
	{
		System.out.println("I will execute after the end of the class");
	}
	
	@BeforeTest
	 public void bsTest()
	{
		System.out.println("i will execute before the start of the test");
	}
	@AfterTest
	public void  aTest()
	{
		System.out.println("I will execute after the end of the test");
	}
	
	@BeforeMethod
	 public void bsmethod()
	{
		System.out.println("i will execute before the start of the method");
	}
	@AfterMethod
	public void  amethod()
	{
		System.out.println("I will execute after the end of the method");
	}
	@Test
	public void m1()
	{
		System.out.println("this is my first test in test ng");
	}
	
	@Test
	public void m2()
	{
		System.out.println("this is my second test in test ng");
	}
	
	
	@Test
	public void m3()
	{
		System.out.println("this is my third test in test ng");
	}


}
