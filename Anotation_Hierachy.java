package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

/*Order of all Annotation Execution
Im before Suite ->Im before Test ->Im before Class -> Im before Method -> Im Test-> Im after Method -> Im after Class -> Im after Test

Order of only @Test Execution -> follow alphabetical order*/

/**
 * If multiple test annotation happen the order of execution is
 * beforeSuite -> beforeTest ->beforeClass -> beforeMethod -> Test 1 -> afterMethod -> beforeMethod -> Test 2 -> afterMethod -> afterClass -> after Test -> after Suite
*/
//every @ Test must contain @before method and @after Method
//Test NG annotatons except below mention annotations are @parameter , @Data Provider







 






public class Anotation_Hierachy {
	
	 @Test
	  public void test1() {
		  
		  System.out.println("Im Test 1");
	  }
	
  @Test
  public void test2() {   //add multiple test anotations @Test
	  
	  System.out.println("Im Test 2 ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Im before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("Im after Method");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("Im before Class");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("Im after Class");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Im before Test");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("Im after Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("Im before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("Im after Suite");
  }

}
