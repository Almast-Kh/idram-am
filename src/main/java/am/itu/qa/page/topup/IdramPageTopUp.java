package am.itu.qa.page.topup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import am.itu.qa.page.topup.IdramTopUpPageConstant.*;
import am.itu.qa.page.base.IdramBasePage;

public class IdramPageTopUp extends IdramBasePage{

	public IdramPageTopUp(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath ="//a[contains(@id, 'refill') ]")
	private WebElement topupBtn;

	
	
	
	
	public  IdramTopupResult topUpMenu() {
		
		topupBtn.click();
		
		return new IdramTopupResult(this.driver);
		
	}
	



}
