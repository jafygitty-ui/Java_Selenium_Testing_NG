package testNGProj;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {
  @Test(dataProvider = "dp")
  public void f(String un, String pwd) {
	  WebDriver d=  new ChromeDriver();
	  d.get("https://practice.expandtesting.com/login");
	  d.findElement(By.name("username")).sendKeys(un);
	  d.findElement(By.name("password")).sendKeys(pwd);
  }
 
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abcd", "12455" },
      new Object[] { "manager", "80485608" },
    };
  }
}
