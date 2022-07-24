package testNGprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {
	public WebDriver driver;
  @Test
  public void ChromeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\a2z\\eclipse-workspace\\Selenium_March_22\\Binary\\chromedriverS");
	  driver= new ChromeDriver();
	  driver.get("https://kite.zerodha.com/");
	  String expectedTitle ="Kite - Zerodha's fast and elegant flagship trading platform";
	  String ActualTitle =driver.getTitle();
	  SoftAssert sassert= new SoftAssert();
	  sassert.assertEquals(ActualTitle, expectedTitle);
	  WebElement KiteLogo = driver.findElement(By.xpath("//img[@src='/static/images/kite-logo.svg']"));
	  sassert.assertTrue(KiteLogo.isDisplayed());
	  System.out.println(KiteLogo.isDisplayed());
	  sassert.assertAll();
	  }
  @Test
  public void EdgeTest() {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\a2z\\eclipse-workspace\\Selenium_March_22\\Binary\\msedgedriver.exe");
	  driver= new EdgeDriver();
	  driver.get("https://www.facebook.com/");
	  String expectTitle ="Facebook - log in or sign up";
	  String ActTitle =driver.getTitle();
	  Assert.assertEquals(ActTitle, expectTitle);
	  
  }
}
