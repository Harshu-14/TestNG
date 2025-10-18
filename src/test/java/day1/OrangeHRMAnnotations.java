package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangeHRMAnnotations {
	WebDriver driver;

	@BeforeSuite
	public void setUp()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	}

	@Test(priority = 1)
	public void login()
	{
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("Admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Test(priority = 2)
	public void verifyHomePage()
	{
	  String dash = driver.findElement(By.xpath("//div[@id='app']/descendant::h6")).getText();
	  /*if(dash.equals("Dashboard"))
	  {
		  System.out.println("Test Case is Passed, as we have loggedin successfully");
	  }
	  else
	  {
		  System.out.println("Test Case Failed");
	  }*/
	  Assert.assertEquals(dash, "Dashboard","I am doing it delebrately");
	}

	@Test(priority = 3)
	public void Logout() throws InterruptedException
	{
		driver.findElement(By.className("")).click();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(null);
	}

	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
