package am.itu.qa.page.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.page.base.IdramBasePage;


public class IdramLoginPage extends IdramBasePage {

	public IdramLoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@type='tel']")
	private WebElement tel;
	
	@FindBy(xpath=	"LOGIN_BTN")
	private WebElement btn;
	

			
	@FindBy(xpath= "ERR_MES" )
	private WebElement errorMesag;
	
	public IdramLoginPage inputLogin(String telep) {
		
		tel.sendKeys(telep);
		btn.click();
	//	tel.clear();
		return new IdramLoginPage(this.driver );
	}

	
     public IdramLoginPage errorMesig() {
		
    	 errorMesag.isDisplayed();
		
      return new IdramLoginPage(this.driver );
        

	}
   
     }
	

	
		
	

