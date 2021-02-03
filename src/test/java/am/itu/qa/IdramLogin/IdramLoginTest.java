package am.itu.qa.IdramLogin;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static am.itu.qa.idrambase.MyIdramConstatns.*;

import am.itu.qa.idrambase.IdramBaseTest;
import am.itu.qa.page.login.IdramLoginPage;
import am.itu.qa.page.login.IdramLoginPaswPage;
import am.itu.qa.page.main.IdramMainPage;

public class IdramLoginTest extends IdramBaseTest {

	/*
	 * @Test(priority = 1) public void loginWithParams() {
	 * 
	 * driver.get("https://web.idram.am/new/en");
	 * Assert.assertTrue(driver.findElement(By.
	 * xpath("//a[@class='button-custom login']")).isDisplayed());
	 * driver.findElement(By.xpath("//a[@class='button-custom login']")).click();
	 * 
	 * 
	 * }
	 * 
	 * @Test(priority = 3) public void loginIncorectTel() throws
	 * InterruptedException {
	 * 
	 * Thread.sleep(3000);
	 * Assert.assertTrue(driver.findElement(By.xpath("//input[@id='username']")).
	 * isDisplayed());
	 * driver.findElement(By.xpath("//input[@id='username']")).sendKeys("44444");
	 * driver.findElement(By.xpath("//input[@id='username']")).submit();
	 * driver.findElement(By.xpath("cc")).isDisplayed();
	 * 
	 * }
	 * 
	 * @Parameters({"telephon"})
	 * 
	 * @Test(priority = 2) public void loginCorectTel(String telephon) throws
	 * InterruptedException { Thread.sleep(3000); System.out.println("loginTest" +
	 * telephon);
	 * Assert.assertTrue(driver.findElement(By.xpath("//input[@type='tel']")).
	 * isDisplayed());
	 * driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(telephon);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */

	@Test

	public void LoginTest() throws InterruptedException {
		IdramMainPage main = new IdramMainPage(driver);

		IdramLoginPage login = main.clickLoginBtn();
		Thread.sleep(5000);
		// incorect telephon

	  //login =login.inputLogin("4444");
	  // login.errorMesig();	
	
	//	Thread.sleep(3000);
   
		// corect telepon

	 login.inputLogin("93359083");
		Thread.sleep(3000);
		IdramLoginPaswPage pasw=new IdramLoginPaswPage(driver);
	    pasw.inputPasw("aaass");
		Thread.sleep(3000);

	}

}
