package testingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		WebElement ele = driver.findElement(By.name("cusid"));
		ele.sendKeys("1001");
		WebElement ele1 = driver.findElement(By.name("submit"));
        ele1.click();
        driver.switchTo().alert().accept();
       // driver.switchTo().alert().dismiss();
        
       String s= driver.switchTo().alert().getText();
       System.out.println(s);
       driver.switchTo().alert().accept();
       
       
       
        
	}

}
