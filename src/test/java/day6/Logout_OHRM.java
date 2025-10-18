package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout_OHRM {

	WebDriver driver;// Global Variable

	public Logout_OHRM(WebDriver driver) // Local Variable
	{
		this.driver = driver;
	}

	//Repository

	By profile = By.className("oxd-userdropdown-tab");
	By logout = By.linkText("Logout");

	public void clickonProfile()
	{
		driver.findElement(profile).click();
	}

	public void clickonLogout()
	{
		driver.findElement(logout).click();
	}


}
