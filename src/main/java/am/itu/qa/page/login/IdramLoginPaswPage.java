package am.itu.qa.page.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.page.base.IdramBasePage;

public class IdramLoginPaswPage extends IdramBasePage {

	public IdramLoginPaswPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath=	"PSW_FIELD")
	private WebElement psw;
	
	@FindBy(xpath=	"LOGIN_BTN")
	private WebElement btn;
     
	  public IdramLoginPaswPage inputPasw(String pasw) {
	 		
	 		psw.sendKeys(pasw);
	 		btn.click();
	 		
	 		return new IdramLoginPaswPage(this.driver);


}
	  }
