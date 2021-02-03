package am.itu.qa.idrambase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
//import static am.itu.qa.idrambase.IdramBaseConst.*;


public class IdramBaseTest {
	
	protected WebDriver driver;

	
	@Parameters({"browser"})
	@BeforeClass
	 public void openBrowser(String browser) {
		System.out.println("Browser is running   "+ browser );
		if(browser.equals("chrome")) {
			driver= new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver= new FirefoxDriver();
		}
		else if(browser.equals("ie")) {
			driver= new InternetExplorerDriver();
		}
		 
 
//		System.setProperty("webdriver.chrome.webdriver","C:\\Windows\\chromedriver.exe");
	//	driver= new ChromeDriver();
		driver.get("https://web.idram.am/new/en");
		
		
	
		 
		 
	 }
	@AfterClass
	public void cleanup() {
		
		driver.quit();
	}
	 
}
