package testingdemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/yahoo.html");
		WebElement downloadButton = driver.findElement(By.id("messenger-download"));
		 String sourceLocation = downloadButton.getAttribute("href"); 
		 String wget_command = "cmd /c C:\\wget.exe -P D: --no-check-certificate " + sourceLocation;
		 try {
		        Process exec = Runtime.getRuntime().exec(wget_command);
		        int exitVal = exec.waitFor();
		        System.out.println("Exit value: " + exitVal);
		        
		 } 
		 catch (InterruptedException | IOException ex) 
		 {
		        System.out.println(ex.toString());
		 } 
		 

	}

}
