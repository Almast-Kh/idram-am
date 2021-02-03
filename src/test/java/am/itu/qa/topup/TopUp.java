package am.itu.qa.topup;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
//import static am.itu.qa.page.topup.IdramTopUpPageConstant.*;
import am.itu.qa.idrambase.IdramBaseTest;
import am.itu.qa.page.login.IdramLoginPage;
import am.itu.qa.page.main.IdramMainPage;
import am.itu.qa.page.topup.IdramPageTopUp;
import am.itu.qa.page.topup.IdramTopupResult;

public class TopUp extends IdramBaseTest {
	
	
	@Test
	public void topUp() throws InterruptedException{
		Thread.sleep(3000);
		
		// gtnel TopUp taby ev 
	/*	Assert.assertTrue(driver.findElement(By.xpath("//a[@id='refill']")).isDisplayed());
		driver.findElement(By.xpath("//a[@id='refill']")).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Attached Bank Card']")).isDisplayed());
		driver.findElement(By.xpath("//span[text()='Attached Bank Card']")).click();
		*/
		
		IdramPageTopUp top= new IdramPageTopUp(driver);		
	    top.topUpMenu();
		Thread.sleep(3000);
		IdramTopupResult topres= new IdramTopupResult(this.driver);
	     topres.topUpResult();
		
		Thread.sleep(3000);
	}

}
