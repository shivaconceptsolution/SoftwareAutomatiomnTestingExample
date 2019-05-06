package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLocatorExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.shivaconceptsolution.com/test.html");
		WebElement el = driver.findElement(By.cssSelector("input.abc"));
		el.sendKeys("test@gmail.com");
      //  WebElement e3 = driver.findElement(By.tagName("input"));
       // e3.sendKeys("xyz");
		//WebElement e2 = driver.findElement(By.partialLinkText("Youtube"));
		//e2.click();
		//WebElement el = driver.findElement(By.className("abc"));
		//el.sendKeys("test@gmail.com");
		//WebElement e2 =driver.findElement(By.linkText("Click to view My Youtube channel"));
		//e2.click();

	}

}
