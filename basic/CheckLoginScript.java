package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckLoginScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://shivaconceptsolution.com/restaurant/public/");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("admin@gmail.com");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("12345");
		WebElement btn=driver.findElement(By.xpath("//html/body/div/div/div[2]/div/form/button"));
		btn.click();
		
		

	}

}
