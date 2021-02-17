package am.itu.qa.page.transfer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.page.base.IdramBasePage;

public class IdramPageTransfer extends IdramBasePage {

	public IdramPageTransfer(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath ="//a[@id='withdraw']")
	private WebElement transferBtn;
	
	@FindBy(xpath ="//a[@id='service25']")
	private WebElement cardIcon;
	
	@FindBy(xpath ="//span[@data-tr-code='auth_login_signup']")
	private WebElement cardLog;
	
	
	
	public void transferValid() {
		transferBtn.click();
		cardIcon.isDisplayed();
		cardIcon.click();
		cardLog.isDisplayed();
		
		
		
		
	}
	}
	
	
	
	


