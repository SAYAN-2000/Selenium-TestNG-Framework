package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.BasePage;
import io.qameta.allure.Step;
import reusablemethods.urls;

public class Homepage extends BasePage {
	private By username = By.xpath("//input[@id='user-name']");
	private By password = By.xpath("//input[@id='password']");
	private By loginBtn = By.xpath("//input[@id='login-button']");
	private By message = By.tagName("h3");
	public Homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}
	
	
	@SuppressWarnings("deprecation")
	public String geturl()
	{
		driver.get(urls.geturl());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return this.driver.getCurrentUrl();
		
	}
	
	public void fillDetails(String usr, String pwd)
	{
		this.driver.findElement(username).sendKeys(usr);
		this.driver.findElement(password).sendKeys(pwd);
	}
	
	@SuppressWarnings("deprecation")
	public void clickLogin()
	{
		this.driver.findElement(loginBtn).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public String getmessage()
	{
		return this.driver.findElement(message).getText();
	}

}
