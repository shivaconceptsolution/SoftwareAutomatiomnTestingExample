package testingdemo;

import java.util.*;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandlingCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		WebElement we = driver.findElement(By.partialLinkText("Click"));
		we.click();
		String MainWindow=driver.getWindowHandle();	
	    Set<String> s1=driver.getWindowHandles();
	    Iterator<String> i=s1.iterator();	
	    while(i.hasNext())
	    {
	    	String ChildWindow=i.next();	
	    	if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                    driver.switchTo().window(ChildWindow);	                                                                                                           
                    driver.findElement(By.name("emailid"))
                    .sendKeys("gaurav.3n@gmail.com");                			
                    driver.findElement(By.name("btnLogin")).click();			
                    driver.close();		
            }	
	    }
	    driver.switchTo().window(MainWindow);

	}

}
