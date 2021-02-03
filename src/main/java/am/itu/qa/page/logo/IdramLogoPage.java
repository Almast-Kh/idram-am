package am.itu.qa.page.logo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.page.base.IdramBasePage;
import am.itu.qa.page.main.IdramMainPage;
import am.itu.qa.page.search.SearchPageResult;

public class IdramLogoPage extends IdramBasePage{

	public IdramLogoPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath= "LOGO_ICON")
	private WebElement logoIcon;
	
	@FindBy(xpath= "MIDRAM")
	private WebElement midram;



public IdramLogoPage logo() {
	
	   logoIcon.click();
	   midram.isDisplayed();
	
	 return new IdramLogoPage(this.driver);
	
	

}
}





