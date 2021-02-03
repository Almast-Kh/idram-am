package am.itu.qa.page.topup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.page.base.IdramBasePage;
import am.itu.qa.page.login.IdramLoginPage;
import am.itu.qa.page.topup.IdramTopUpPageConstant.*;

public class IdramTopupResult extends IdramBasePage {

	public IdramTopupResult(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath ="//span[text()='Attached Bank Card']")
	private WebElement iconCard;

	@FindBy(xpath ="//span[text()='At Idram branches']")
	private WebElement iconBranches;

	public IdramLoginPage topUpResult() {
		iconCard.isDisplayed();
		iconCard.click();
		// iconCard.clear();

		// iconBranches.isDisplayed();
		// iconBranches.click();
		// iconBranches.clear();

		return new IdramLoginPage(this.driver);

	}
}