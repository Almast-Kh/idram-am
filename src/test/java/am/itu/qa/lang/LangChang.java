package am.itu.qa.lang;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.idrambase.IdramBaseTest;
import am.itu.qa.page.lang.IdramChangLangPage;
import am.itu.qa.page.lang.IdramPageLang;

public class LangChang extends IdramBaseTest{
	
	@Test
	public void CheckLang() {
		
		/*Assert.assertTrue(driver.findElement(By.xpath("//a[@id='langru']")).isDisplayed());
		driver.findElement(By.xpath("//a[@id='langru']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//a[@id='langen']")).isDisplayed());
		driver.findElement(By.xpath("//a[@id='langen']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//a[@id='langam']")).isDisplayed());
		driver.findElement(By.xpath("//a[@id='langam']")).click();
		*/
		
		IdramPageLang changlang= new IdramPageLang(driver);
		 IdramChangLangPage lang= changlang.changeLang();
		 lang.changRes();
	}

}
