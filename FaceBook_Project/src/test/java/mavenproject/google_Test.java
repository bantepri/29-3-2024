package mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class google_Test {
@Test
public void google()
{
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	driver.close();
}
}
