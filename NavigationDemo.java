package scs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NavigationDemo {
  WebDriver driver;
  @Test(priority=2)
  public void f() {
	  WebElement ele = driver.findElement(By.partialLinkText("About"));
	  ele.click();
  }
  @Test(priority=1)
  public void f1() {
	  WebElement ele = driver.findElement(By.partialLinkText("Contact"));
	  ele.click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebElement ele = driver.findElement(By.linkText("Home"));
	  ele.click();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.navigate().back();
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://shivaconceptsolution.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
