package am.itu.qa.page.lang;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import am.itu.qa.page.base.IdramBasePage;

public class IdramChangLangPage extends IdramBasePage {

	public IdramChangLangPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="LANG_RES")
	private WebElement changres;
	
	

	public boolean changRes() {
		return changres.isDisplayed();

	}
	
	
	
	

}
