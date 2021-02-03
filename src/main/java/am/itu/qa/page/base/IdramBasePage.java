package am.itu.qa.page.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import am.itu.qa.page.login.IdramLoginPage;

public class IdramBasePage {
      protected WebDriver driver;
	
      public IdramBasePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}

}

	





	

	
	


