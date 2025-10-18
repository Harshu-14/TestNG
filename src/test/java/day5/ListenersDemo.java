package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListenersDemo {

	@Test(priority = 1)

	public void login()
	{
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("Admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Test
	public void testtobefailed()
	{
		Assert.assertTrue(false);
	}

	@Test
	public void testtobeskipped()
	{
		throw new SkipException("I am skipping it delebrately");
	}

}
