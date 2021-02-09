package am.itu.qa.page.newpartner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.page.base.IdramBasePage;

public class IdramNewParnerResult extends IdramBasePage {

	public IdramNewParnerResult(WebDriver driver) {
		super(driver);
		
	}
	
	
	 
	 @FindBy(xpath="//input[@id='firstname-input']")
		private WebElement nameBtn;
	 
	 @FindBy(xpath="//button[@class='hs-form__actions__submit']")
		private WebElement sendBtn;
	 
	 @FindBy(xpath=" //div[@class='hs-form__error-rollup']")
		private WebElement errMesag;
	 
	
	 
	 
	 public void resultBlank() {
		 nameBtn.isDisplayed();
		 nameBtn.sendKeys("AAAA");
		 sendBtn.click();
		 errMesag.isDisplayed();
		 
		
		 
		 
	 }
	 
	 

}
