package am.itu.qa.page.pay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import am.itu.qa.page.base.IdramBasePage;
import am.itu.qa.page.login.IdramLoginPage;

public class IdramPagePayResult extends IdramBasePage {

	public IdramPagePayResult(WebDriver driver) {
		super(driver);
			}

		
	@FindBy(xpath= "//span[text()='Telephone']")
	private WebElement iconTelepon;
	
	public IdramLoginPage iconTeleponFound() {
		iconTelepon.click();
	 return new IdramLoginPage(this.driver);
	
			 
	  }
	
}
