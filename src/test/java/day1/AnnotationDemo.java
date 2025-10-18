package day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo {


	@BeforeSuite
	public void bSuite()
	{
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void test()
	{
		System.out.println("Before Test");
	}

	@BeforeClass
	public void bclass()
	{
	     System.out.println("Before Class");
	}

	 @BeforeMethod
	 public void bmethod()
	 {
		 System.out.println("Before Method");
	 }

	 @Test
	 public void test1()
		{
		System.out.println("Test 1");
		}

	 @Test
	 public void test2()
		{
		System.out.println("Test 2");
		}

	 @AfterMethod
		public void aMethod()
		{
			System.out.println("After Method");
		}

	 @AfterClass
		public void aclass()
		{
			System.out.println("After Class");
		}

	 @AfterTest
		public void atest()
		{
			System.out.println("After Test");
		}

	 @AfterSuite
	   public void aSuite()
	   {
		System.out.println("After Suite");
	   }
	}
