package tests_NG_without_cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public class BaseTest {

	protected static WebDriver driver;
		
	@BeforeClass
	public void beforeClassTest() {
		System.setProperty("webdriver.chrome.driver", "D:/soft/java/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterMethod
    public void cleanUp(){
        driver.manage().deleteAllCookies();
    }
	
	@AfterClass
    public void afterTest() {
		driver.quit();
	}
}
