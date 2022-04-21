package seleniumTests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class ScreenShots extends BaseTest{
	
	
	@Test
	public void capture() throws IOException
	{
		driver.get("https://facebook.com");
		TakesScreenshot tks=(TakesScreenshot) driver;
		File src=tks.getScreenshotAs(OutputType.FILE);
		File target=new File("./screen.jpeg");
		FileUtils.copyFile(src, target);
	}

}
