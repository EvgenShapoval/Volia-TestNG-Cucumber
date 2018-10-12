package runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
 
@CucumberOptions(
		features="src/test/resources/feature",
		glue={"steps"},
		format=
				{"pretty",
				"html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:target/cucumber-reports/re-run.txt"}
		)
public class RunTest {
	public static WebDriver driver;
	private TestNGCucumberRunner testRunner;
	
	@BeforeClass
	public void setUP()	{
		System.setProperty("webdriver.chrome.driver", "D:/soft/java/chromedriver.exe");
		driver = new ChromeDriver();
		testRunner = new TestNGCucumberRunner(RunTest.class);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	
	@Test(description="login",dataProvider="features")
	public void login(CucumberFeatureWrapper cFeature){
		testRunner.runCucumber(cFeature.getCucumberFeature());
		}
	
	@DataProvider(name="features")
	public Object[][] getFeatures(){
		return testRunner.provideFeatures();
		}
	
	@AfterClass
    public void tear() {
        driver.quit();
    }
	
	public void tearDown() {
		testRunner.finish();
	}
}
