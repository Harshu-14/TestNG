package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_OHRM_PageFact {

	WebDriver driver;

	public Login_OHRM_PageFact(WebDriver idriver)
	{
		driver= idriver;
		PageFactory.initElements(driver, this);
	}


	// Repository

	@FindBy (name="username") WebElement userNM;
	@FindBy (name="password") WebElement pwd;
	@FindBy (xpath ="//button[@type='submit']") WebElement login;


	//By userNM = By.name("username");
	//By pwd = By.name("password");
	//By login = By.xpath("//button[@type='submit']");

		public void URL()
		{
			driver.get("\"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\"");
		}

		public void enterUserName(String un)
		{
			userNM.sendKeys(un);
		}

		public void enterPassword(String pw)
		{
			pwd.sendKeys(pw);
		}

		public void clickonLoginButton()
		{
			login.click();
		}
}
