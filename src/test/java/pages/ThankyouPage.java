package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import io.qameta.allure.Step;

public class ThankyouPage extends BasePage {
	private By logo = By.cssSelector("h2[class='complete-header']");
	public ThankyouPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@Step("Getting Logo Text")
	public String getLogo()
	{
		return this.driver.findElement(logo).getText();
	}

}
