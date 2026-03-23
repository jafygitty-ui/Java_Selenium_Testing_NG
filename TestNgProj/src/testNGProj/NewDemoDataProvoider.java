package testNGProj;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class NewDemoDataProvoider {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  WebDriver dr=new ChromeDriver();
	  dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(5000);
	  dr.findElement(By.name("username")).sendKeys(n);
	  Thread.sleep(5000);
	  dr.findElement(By.name("password")).sendKeys(s);
	  dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
	  
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "JAFFRIN", "1234" },
      new Object[] { "FARHAN", "5678" },
    };
  }
}
