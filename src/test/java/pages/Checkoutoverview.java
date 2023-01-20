package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import io.qameta.allure.Step;

public class Checkoutoverview extends BasePage{
public Checkoutoverview(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

private By finish = By.cssSelector("button[id='finish']");

@SuppressWarnings("deprecation")
public void clickFinish()
{
	this.driver.findElement(finish).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

}
