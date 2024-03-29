package mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openlorealurl_Test {

	WebDriver driver;
	@Test
	public void openUrl()
	{
		new ChromeDriver();
		
		driver.get("https://www.lorealparis.co.in/");
	}
}
