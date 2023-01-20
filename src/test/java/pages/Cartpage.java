package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import io.qameta.allure.Step;

public class Cartpage extends BasePage {
	private By bag = By.cssSelector("div[class='inventory_item_name']");
	private By checkout = By.cssSelector("button[id='checkout']");

	public Cartpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("deprecation")
	public void clickcheckout() {
		driver.findElement(checkout).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public String getbag() {
		String ans = driver.findElement(bag).getText();
		return ans;
	}

}
