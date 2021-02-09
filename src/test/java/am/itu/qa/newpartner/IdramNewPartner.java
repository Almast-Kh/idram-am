package am.itu.qa.newpartner;

import org.testng.annotations.Test;

import am.itu.qa.idrambase.IdramBaseTest;
import am.itu.qa.page.newpartner.IdramNewParnerResult;
import am.itu.qa.page.newpartner.IdramPageNewPartner;

public class IdramNewPartner extends IdramBaseTest{
	
	@Test
	 public void newPartner() throws InterruptedException {
		Thread.sleep(5000);
		IdramPageNewPartner partner= new IdramPageNewPartner(this.driver);		
		Thread.sleep(5000);
		IdramNewParnerResult partRes= partner.resultView();
		Thread.sleep(5000);
		
		
		
	
	}

}
