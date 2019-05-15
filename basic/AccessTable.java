package testingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SHIVA/Desktop/demo1.html");
		WebElement ele = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
		System.out.println(ele.getText());

	}

}
