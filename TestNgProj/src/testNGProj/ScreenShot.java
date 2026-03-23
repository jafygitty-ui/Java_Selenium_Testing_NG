package testNGProj;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	@Test
	public void f() throws InterruptedException, IOException {
		WebDriver dr = new ChromeDriver();
		Thread.sleep(2000);
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		File f = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
		File desfile = new File("C:\\Users\\jaffrin.farhan\\Desktop");
		FileUtils.copyFile(f, desfile);

	}
}