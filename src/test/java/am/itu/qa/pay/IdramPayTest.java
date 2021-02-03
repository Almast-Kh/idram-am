package am.itu.qa.pay;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.idrambase.IdramBaseTest;
import am.itu.qa.page.pay.IdramPagePay;
import am.itu.qa.page.pay.IdramPagePayResult;

public class IdramPayTest extends IdramBaseTest {

	@Test
	public void payTest() throws InterruptedException {

		Thread.sleep(3000);
		IdramPagePay payon = new IdramPagePay(this.driver);
		payon.pay();
		Thread.sleep(3000);
		IdramPagePayResult result= new IdramPagePayResult(driver);
         result.iconTeleponFound();
 		Thread.sleep(3000);
		
		
	}

}
