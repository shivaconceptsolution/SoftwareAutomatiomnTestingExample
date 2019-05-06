package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommandExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.shivaconceptsolution.com");
		
		WebElement we = driver.findElement(By.tagName("h1"));
		String str = we.getText();
		System.out.println(str);
		
				
				

	}

}
