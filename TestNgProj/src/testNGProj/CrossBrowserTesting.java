package testNGProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
  WebDriver d;
	@Test
  @Parameters("browser")
  public void BrowserLaunch(String browser) {
	  if(browser.equalsIgnoreCase("chrome")) {
		  d=new ChromeDriver();
		  
	  }
	  else if(browser.equalsIgnoreCase("edge")) {
		  
		  d=new EdgeDriver();
		  
	  }  
	
	
	}
}
