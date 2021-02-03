package am.itu.qa.cashback;

import am.itu.qa.idrambase.IdramBaseTest;
import am.itu.qa.page.cashback.IdramPageCashback;

public class IdramCashbackTest extends IdramBaseTest{
	
	public void cashbackTest() {
		
		IdramPageCashback cash= new IdramPageCashback(driver);
		
	     cash.isCashbackDisp();
	
		
		
	}
	
	

}
