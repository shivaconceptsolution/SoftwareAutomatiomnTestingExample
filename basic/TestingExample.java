package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TestingExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		WebElement ele = driver.findElement(By.linkText("Home"));
		WebElement td_home = driver.findElement(By.xpath("//html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]"));
		System.out.println("Befor mouseover "+td_home.getCssValue("background-color"));
		Actions obj = new Actions(driver);
        Action ac = obj.moveToElement(ele).build();
        ac.perform();
        System.out.println("After mouseover"+td_home.getCssValue("background-color"));
        
	}

}
