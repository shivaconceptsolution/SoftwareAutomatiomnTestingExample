package scs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBeforeAfter {
  
  @BeforeMethod
  public void display1()
  {
	  System.out.println("Before Method");
  }
  @AfterMethod
  public void display2()
  {
	  System.out.println("After Method");
  }
  @Test
  public void f() 
  {
	  System.out.println("Test Cases1");
  }
  @Test
  public void f1() 
  {
	  System.out.println("Test Cases2");
  }
  @Test
  public void f3() 
  {
	  System.out.println("Test Cases3");
  }
  @AfterTest
  public void fun2()
  {
	  System.out.println("After Test Cases");
  }
  @BeforeTest	
  public void fun1()
  {
	  System.out.println("Before Test Cases");
	  
  }
}
