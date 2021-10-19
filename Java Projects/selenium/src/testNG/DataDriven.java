package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class DataDriven {
	
	// test case 1
	@Test
	public void test1(){
	    System.out.println("test case 1");
	}

	 

	@Test 
	public void test2(){
	    System.out.println("test case 2");
	}

	 

	@BeforeMethod
	public void beforeMethod(){
	    System.out.println("BeforeMethod");
	}

	 

	@AfterMethod
	public void afterMethod(){
	    System.out.println("AfterMethod");
	}

	 

	@AfterClass
	public void afterClass(){
	    System.out.println("AfterClass");
	}

	 

	@BeforeClass
	public void beforeClass(){
	    System.out.println("before class");
	}

	 

	@AfterTest
	public void afterTest(){
	    System.out.println("afterTest");
	}

	 

	@BeforeTest
	public void beforeTest(){
	    System.out.println("beforeTest");
	}
	    
	@BeforeSuite
	public void BeforeSuite(){
	    System.out.println("BeforeSuite");
	}
	    
	@AfterSuite
	public void AfterSuite(){
	    System.out.println("AfterSuite");
	}

}
