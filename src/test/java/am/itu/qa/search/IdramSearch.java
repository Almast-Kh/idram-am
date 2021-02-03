package am.itu.qa.search;

import static am.itu.qa.idrambase.MyIdramConstatns.*;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import am.itu.qa.idrambase.IdramBaseTest;
import am.itu.qa.page.search.IdramPageSearch;
import am.itu.qa.page.search.SearchPageResult;

public class IdramSearch extends IdramBaseTest {

	/*
	 * public void search() throws InterruptedException {
	 * driver.findElement(By.xpath("//img[@src='imgs/new/search.png']")).click();
	 * Assert.assertTrue(driver.findElement(By.xpath("//input[@id='search-header']")
	 * ).isDisplayed());
	 * 
	 * // mutqagrel chisht bar
	 * driver.findElement(By.xpath("//input[@id='search-header']")).clear();
	 * driver.findElement(By.xpath("//input[@id='search-header']")).sendKeys(
	 * CORECT_WORD);
	 * driver.findElement(By.xpath("//input[@id='search-header']")).submit();
	 * Thread.sleep(3000); Assert.assertTrue(driver.findElement(By.
	 * xpath("//div[text()='The following materials are found']")).isDisplayed());
	 * 
	 * // mutqagrel voch chisht bar
	 * 
	 * driver.findElement(By.xpath("//input[@id='search-header']")).clear();
	 * driver.findElement(By.xpath("//input[@id='search-header']")).sendKeys(
	 * INCORECT_WORD);
	 * driver.findElement(By.xpath("//input[@id='search-header']")).submit();
	 * Thread.sleep(3000); Assert.assertTrue(driver.findElement(By.
	 * xpath("//div[text()='Your se arch returned no results.']")).isDisplayed());
	 * 
	 * 
	 * }
	 */

	@Test
	public void idramSearchTest() throws InterruptedException {
		Thread.sleep(3000);
		// 1.testing serach
		// .click search button ant displayed search field
		// .clear text ant insert corect text
		//
		IdramPageSearch search = new IdramPageSearch(this.driver);
 
		SearchPageResult res = search.inputWord(CORECT_WORD);
		Thread.sleep(5000);
			
		Assert.assertTrue(res.searchRes());
				
		Assert.assertTrue(res.verifyNoResultsFound());
		Thread.sleep(3000);	}
}
