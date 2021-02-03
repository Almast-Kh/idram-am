package am.itu.qa.page.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import am.itu.qa.page.base.IdramBasePage;

public class SearchPageResult extends IdramBasePage {

	public SearchPageResult(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath ="SEARCH_RES_XPATH")
	private WebElement searchres;
	
	@FindBy(xpath = "SEARCH_NORES_XPATH")
	private WebElement noResults;

	public boolean searchRes() {
		return searchres.isDisplayed();

	}
	
	public boolean verifyNoResultsFound() {
		return noResults.isDisplayed();

	}
}
