package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtwoexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/usidix/1");
		WebElement ele = driver.findElement(By.cssSelector("input[value=\"Go!\"]"));
		ele.click();
		String str = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(str);

	}

}
