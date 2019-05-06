package basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://shivaconceptsolution.com/test.html");
		Select s = new Select(driver.findElement(By.name("state")));
		s.selectByVisibleText("UP");
		s.selectByIndex(2);
		Select s1 = new Select(driver.findElement(By.name("country")));
		s1.selectByVisibleText("MP");
		s1.selectByVisibleText("UP");
		s1.deselectByVisibleText("UP");
		//s.selectByIndex(2);

	}

}
