package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest{
	
	@Test
	public void launchBrowser()
	{
		
		driver.get("https://facebook.com");
		sleep();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
	
		
	}
	
//	@Test
	public void navigationMethods()
	{
		driver.get("https://facebook.com");
		sleep();
		Navigation nav=driver.navigate();
		nav.to("https://amazon.com");
		
		driver.navigate().to("http://hdfcbank.com");
		sleep();
		driver.navigate().back();
		sleep();
		driver.navigate().refresh();
		sleep();
		driver.navigate().forward();
		
		
	}
	
	

}
