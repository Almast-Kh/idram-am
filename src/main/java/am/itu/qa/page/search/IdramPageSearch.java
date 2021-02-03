package am.itu.qa.page.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.page.base.IdramBasePage;

public class IdramPageSearch extends IdramBasePage{

	public IdramPageSearch(WebDriver driver) {
		super(driver);
	
	}
	 @FindBy(xpath="SEARCH_BUTTON]")
	private WebElement searchBtn;
	 
	 @FindBy(xpath="SEARCH_FIELD]")
	private WebElement searchField;
	
	public SearchPageResult inputWord(String SearchWord) {
		searchBtn.click();
		searchField.click();
		searchField.clear();
		searchField.sendKeys(SearchWord);
		searchField.submit();
		return new SearchPageResult(this.driver);
		
		
		
		
		
		
	}

}
