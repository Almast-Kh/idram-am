package am.itu.qa.page.lang;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.page.base.IdramBasePage;
import am.itu.qa.page.main.IdramMainPage;

public class IdramPageLang extends IdramBasePage{

	public IdramPageLang(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="LANG_ARM")
	private WebElement langBtnArm;
	
	@FindBy(xpath="LANG_RU")
	private WebElement langBtnRu;
	
	@FindBy(xpath="LANG_EN")
	private WebElement langBtnEn;


   public IdramChangLangPage changeLang() {
	  
	   if(langBtnArm.isDisplayed()) {
		   langBtnArm.click(); 
	   }
	   else 
		   {langBtnRu.click();
	  
		   
	   langBtnEn.click();}
	   
	   return new IdramChangLangPage(this.driver);
   }


}
	   
	   
   



