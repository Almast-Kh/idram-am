package am.itu.qa.page.pay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import am.itu.qa.page.topup.*;

import am.itu.qa.page.base.IdramBasePage;

public class IdramPagePay extends IdramBasePage {

	public IdramPagePay(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[@id='pay']")
	private WebElement payBtn;

	public IdramPagePayResult pay() {
		payBtn.click();

		return new IdramPagePayResult(driver);

	}
}
