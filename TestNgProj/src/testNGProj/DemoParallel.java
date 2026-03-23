package testNGProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DemoParallel {
    WebDriver d;
	@Test
  public void Chrome() {
	  d=new ChromeDriver();
	  d.get("https://www.google.com");
  }
  @Test
  public void Edge () {
	  d=new EdgeDriver();
	  d.get("https://www.gmail.com");
  }
}
