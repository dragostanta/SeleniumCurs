package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		//System.setProperty("webdriber.chrome.driver", "path//chromedriver.exe")	
		driver =  new ChromeDriver();
		driver.manage().window().maximize();//face maximize la browser
		//driver.get("https://keybooks.ro/");
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);// bad practice
		driver.close();	}
	

}
