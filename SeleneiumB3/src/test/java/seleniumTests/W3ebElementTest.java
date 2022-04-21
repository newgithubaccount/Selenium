package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class W3ebElementTest extends BaseTest{
	
	@Test
	public void webActions()
	{
		driver.get("https://facebook.com");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("dummyd411@gmail.com");
		
		System.out.println(username.getAttribute("data-testid"));
		System.out.println(username.getAttribute("placeholder"));
		driver.findElement(By.name("pass")).sendKeys("dummy@123");
		driver.findElement(By.name("pass")).clear();
		
		System.out.println(driver.findElement(By.xpath("//a[text()='Create a Page']")).getText());
		
		driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
		sleep();
		sleep();
	}

}
