package am.itu.qa.page.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.page.base.IdramBasePage;
import am.itu.qa.page.login.IdramLoginPage;

public class IdramMainPage extends IdramBasePage{

	public IdramMainPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[@class='button-custom login']")
	private WebElement loginBtn;
	
	
	
  	
     public IdramLoginPage clickLoginBtn() {
    	 loginBtn.click();
	    return new IdramLoginPage(this.driver);
}
}
	
	
	
	
	


