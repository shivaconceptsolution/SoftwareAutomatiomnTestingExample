package testingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ActionClassExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://newtours.demoaut.com/");
	    WebElement link_home = driver.findElement(By.linkText("Home"));
	    WebElement td_home = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]"));
	   String color = td_home.getCssValue("background-color");
	   System.out.print("Before Mouser over Color is "+color);
	   Actions action = new Actions(driver);
	   Action mousemove = action.moveToElement(link_home).build();
	   mousemove.perform();
	   String color1 = td_home.getCssValue("background-color");
	   System.out.print("After Mouser over Color is "+color1);
	   
	   
	    

	}

}
