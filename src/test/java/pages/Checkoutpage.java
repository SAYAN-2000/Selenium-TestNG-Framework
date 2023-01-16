package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import io.qameta.allure.Step;


public class Checkoutpage extends BasePage {
	private By fname=By.cssSelector("input[id='first-name']");
	private By lname=By.cssSelector("input[id='last-name']");
	private By postalcode= By.cssSelector("input[id='postal-code']");
	private By cont = By.cssSelector("input[id='continue']");
	private By cancel = By.cssSelector("button[id=cancel]");
	
	public Checkoutpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	@Step("Filling first-name")
	public void fillFirstname(String a)
	{
		this.driver.findElement(fname).sendKeys(a);		
	}
	
	@Step("Filling last-name")
	public void fillLastname(String a)
	{
		this.driver.findElement(lname).sendKeys(a);
	}
	
	@Step("Filling Postal-code")
	public void fillPostalcode(String a)
	{
		this.driver.findElement(postalcode).sendKeys(a);
	}
	
	@SuppressWarnings("deprecation")
	@Step("Click Continue")
	public void clickcont()
	{
		this.driver.findElement(cont).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@SuppressWarnings("deprecation")
	@Step("Click Cancel Button")
	public void clickcancel()
	{
		this.driver.findElement(cancel).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
}
