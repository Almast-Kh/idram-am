package am.itu.qa.transfer;

import org.testng.annotations.Test;

import am.itu.qa.idrambase.IdramBaseTest;
import am.itu.qa.page.transfer.IdramPageTransfer;

public class IdramTransfer extends IdramBaseTest{
	 
	@Test
	public void transfer() throws InterruptedException { 
		Thread.sleep(5000);
	IdramPageTransfer trans= new IdramPageTransfer(this.driver);
      trans.transferValid();
	

}}
