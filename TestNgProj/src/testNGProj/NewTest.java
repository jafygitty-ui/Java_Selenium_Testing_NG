package testNGProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://practice.expandtesting.com/login");
	d.manage().window().maximize();
	System.out.println(d.getTitle());
	System.out.println(d.getCurrentUrl());
//	WebElement unm=d.findElement(By.name("username"));
//	unm.click();
//	unm.sendKeys("practice");
//	WebElement pwd=d.findElement(By.name("password"));
//	pwd.click();
//	pwd.sendKeys("SuperSecretPassword!");  
//	WebElement btn=d.findElement(By.id("submit-login"));
//	btn.click();	  
  }
}
