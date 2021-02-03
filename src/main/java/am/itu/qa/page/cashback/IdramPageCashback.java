package am.itu.qa.page.cashback;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.page.base.IdramBasePage;

public class IdramPageCashback extends IdramBasePage {

	public IdramPageCashback(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[@href='https://cashback.idram.am/']")
	private WebElement cashbackBtn;

	@FindBy(xpath = "//p[@class='home_top_second_title']")
	private WebElement cashbackPhrase;

	@FindBy(xpath = "//a[@class='text-uppercase br_r']")
	private WebElement loginBtn;

	@FindBy(xpath = "//span[text()='LOGIN | SIGNUP']")
	private WebElement mainloginBtn;
	
	
	public IdramPageCashback isCashbackDisp()
	{  
		cashbackBtn.click();
		cashbackPhrase.isDisplayed();
		loginBtn.click();
		mainloginBtn.isDisplayed();
		
		return new IdramPageCashback(this.driver);
		
		
		
	}


	public void isCashbackDisplLog() {
		// TODO Auto-generated method stub
		
	}

}
