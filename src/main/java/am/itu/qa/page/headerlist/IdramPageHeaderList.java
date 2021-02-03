package am.itu.qa.page.headerlist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import am.itu.qa.page.base.IdramBasePage;

public class IdramPageHeaderList extends IdramBasePage{

	public IdramPageHeaderList(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[@href='en/page/1']")
	private WebElement  aboutBtn; 
	
	@FindBy(xpath="//a[@href='en/page/2']")
	private WebElement  forUserBtn; 
	
	@FindBy(xpath="//a[@href='en/page/3']")
	private WebElement toPartersBtn; 
 
	@FindBy(xpath="//a[@id='aboutustab3']")
	private WebElement  aboutBranches; 
	
	@FindBy(xpath="//div[@class='dIxMhd-bN97Pc-b3rLgd']")
	private WebElement  branchMap; 
	
	@FindBy(xpath="//div[@class='forusersbutton_c active']")
	private WebElement  forUserTarif; 
	
	@FindBy(xpath="//a[@id='partnerstab1']")
	private WebElement  howToPartner; 

	
	
	public void dispHeader() {
		
		aboutBtn.isDisplayed();
		forUserBtn.isDisplayed();
		toPartersBtn.isDisplayed();
		
	}
	
	public IdramPageHeaderList headerList() throws InterruptedException {
		
		aboutBtn.click();
		Thread.sleep(3000);
		aboutBranches.isDisplayed();
		aboutBranches.click();
	//	branchMap.isDisplayed();
		forUserBtn.click();
		forUserBtn.click();
	//	forUserTarif.isDisplayed();
		//forUserTarif.click();
		toPartersBtn.click();
		howToPartner.isDisplayed();
		
		
		return new IdramPageHeaderList(driver);
		
		
	}
	

 
	

}
