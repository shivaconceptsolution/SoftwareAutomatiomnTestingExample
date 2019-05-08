package testingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		WebElement ele = driver.findElement(By.name("uploadfile_0"));
		ele.sendKeys("d://testdat2.txt");
		WebElement ele1 = driver.findElement(By.id("terms"));
		ele1.click();
		WebElement ele2 = driver.findElement(By.name("send"));
		ele2.click();
		//driver.close();

	}

}
