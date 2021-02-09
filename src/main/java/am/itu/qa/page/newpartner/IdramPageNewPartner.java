package am.itu.qa.page.newpartner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.page.base.IdramBasePage;

public class IdramPageNewPartner extends IdramBasePage{

	public IdramPageNewPartner(WebDriver driver) {
		super(driver);
		
	}
	


	@FindBy(xpath="//a[@href='https://idram.am/cashlesspayments/']")
		private WebElement contPayment;
	 
	 
	 
	 @FindBy(xpath="//a[@href='https://idram.app.link/contact-form']")
		private WebElement becomPartner;
	 
public IdramNewParnerResult  resultView()
{
	contPayment.click();
	becomPartner.isDisplayed();
	becomPartner.click();

return new IdramNewParnerResult(this.driver);
}

}
