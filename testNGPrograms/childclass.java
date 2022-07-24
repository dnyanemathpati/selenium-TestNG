package testNGprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class childclass extends parentClass {
	 @Test(dependsOnMethods = "launchbrowser")
	 public void login()
	 {
		  WebElement username= driver.findElement(By.xpath("//input[@id='email']"));
		  WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
		  WebElement login= driver.findElement(By.xpath("//button[@name='login']"));
		  username.sendKeys("krishna");
		  password.sendKeys("123456");
		  login.click();
	 }
	 
}
