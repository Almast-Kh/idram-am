package am.itu.qa.headerlist;

import org.testng.annotations.Test;

import am.itu.qa.idrambase.IdramBaseTest;
import am.itu.qa.page.headerlist.IdramPageHeaderList;

public class IdramHeaderListTest extends IdramBaseTest {
	@Test
	public void headerListTest() throws InterruptedException {
		
		IdramPageHeaderList list= new IdramPageHeaderList(driver);
		Thread.sleep(5000);
		list.dispHeader();
		Thread.sleep(5000);
		list.headerList();
		Thread.sleep(5000);
		
	}
	

}
