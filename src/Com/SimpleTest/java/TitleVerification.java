package Com.SimpleTest.java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TitleVerification {
	public static WebDriver driver;
	static Properties properties;
	@BeforeSuite
	public void setUp() throws IOException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	 
	 
	 @Test
	 public void OpenBrowser() {
	         
	        
		// Entering the URL
			driver.get("https://codesync.in/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	         
	         String expectedTitle = "CodeSync – Learn to Code at Your Own Pace – Tutorials on Angular, Ionic, PHP, Laravel, CSS & More";
	         String originalTitle = driver.getTitle();
	         Assert.assertEquals(originalTitle, expectedTitle);
}
	 }
