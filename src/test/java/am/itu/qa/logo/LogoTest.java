package am.itu.qa.logo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.idrambase.IdramBaseTest;
import am.itu.qa.page.logo.IdramLogoPage;
import am.itu.qa.page.main.IdramMainPage;

public class LogoTest extends IdramBaseTest{
	
	
	@Test(priority = 1)
	public void logoTest() throws InterruptedException {
		
		/*
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='img-block']")).isDisplayed());
		driver.findElement(By.xpath("//div[@class='img-block']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='flex nav-wrapper mla desktop']")).isDisplayed());
		driver.findElement(By.xpath("//div[@class='flex nav-wrapper mla desktop']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//img[@src='assets/img/qr.png']")).isDisplayed());
		
		*/
		
        
		IdramLogoPage page= new IdramLogoPage(driver);
	         page.logo();
		Thread.sleep(3000);
		
		
		
	}

	

}
