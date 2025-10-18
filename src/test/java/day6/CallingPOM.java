package day6;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CallingPOM
{
    @Test
	public static void executeMethod() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Login_OHRM_PageFact ln = new Login_OHRM_PageFact(driver);
		Logout_OHRM lout = new Logout_OHRM(driver);

		ln.URL();
		ln.enterUserName("Admin");
		ln.enterPassword("Admin123");
		ln.clickonLoginButton();
		lout.clickonProfile();
		lout.clickonLogout();

	}

}
