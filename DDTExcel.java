package scs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTExcel {
	ChromeDriver driver;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	@BeforeTest
	 public void TestSetup()
	{
		
		 System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://newtours.demoaut.com/");
		 driver.manage().window().maximize();
		
		
	}
	 
	 @Test
	 public void ReadData() throws IOException
	 {
		 // Import excel sheet.
		 File src=new File("d://scs.xlsx");
		 
		 // Load the file.
		 FileInputStream finput = new FileInputStream(src);
		 
		 // Load he workbook.
		workbook = new XSSFWorkbook(finput);
		 
	     // Load the sheet in which data is stored.
		 sheet= workbook.getSheetAt(0);
		 
		 for(int i=0; i<=sheet.getLastRowNum(); i++)
		 {
			 // Import data for Email.
			 cell = sheet.getRow(i).getCell(0);
			 cell.setCellType(CellType.STRING);
			 driver.findElement(By.name("userName")).sendKeys(cell.getStringCellValue());
			 
			 // Import data for password.
			 cell = sheet.getRow(i).getCell(1);
			 cell.setCellType(CellType.STRING);
			 driver.findElement(By.name("password")).sendKeys(cell.getStringCellValue());
			 WebElement we = driver.findElement(By.name("login"));
			 we.click();
			   		
	        }
	  } 
	
	}

