package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_OHRM {
	WebDriver driver;


	public Login_OHRM(WebDriver driver)
	{
		this.driver = driver;
	}

	// Repository
	By userNM = By.name("username");
	By pwd = By.name("password");
	By login = By.xpath("//button[@type='submit']");

	public void URL()
	{
		driver.get("\"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\"");
	}

	public void enterUserName(String un)
	{
		driver.findElement(userNM).sendKeys("un");
		driver.findElement(pwd).sendKeys("Admin123");
	}

	public void enterPassword(String pw)
	{
		driver.findElement(pwd).sendKeys("pw");
	}

	public void clickonLoginButton()
	{
		driver.findElement(login).click();
	}


}
