package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;
import io.qameta.allure.Step;

public class Shoppingpage extends BasePage {

	private By logo = By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/span");
	private By getitemname = By.xpath("//div[@class='inventory_item_name']");
	private By addtocart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	private By cartbtn = By.className("shopping_cart_link");
	private By items = By.xpath("//div[contains(@class,'inventory_item_name' )]");
	private By sort_btn = By.cssSelector("select[class='product_sort_container']");
	public List<String> arr = new ArrayList<String>();

	public Shoppingpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Step("Getting the item Name")
	public String getname() {
		return this.driver.findElement(getitemname).getText();
	}

	@SuppressWarnings("deprecation")
	@Step("Click Add to Cart")
	public void clickaddtocart() {
		this.driver.findElement(addtocart).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@SuppressWarnings("deprecation")
	@Step("Click cart Icon")
	public void clickcarticon() {
		this.driver.findElement(cartbtn).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Step("Get All Items according to Filter Data")
	public List<String> printItems(String arg) {
		System.out.println("==========================================");
		System.out.println("The Output List Sorted By "+arg+" is-> ");
		List<WebElement> d = driver.findElements(items);
		for (WebElement e : d) {
			String str = e.getText().toString();
			System.out.println(str);
			arr.add(str);
		}
		System.out.println("==========================================");
		return arr;
	}

	@SuppressWarnings("deprecation")
	@Step("Click the Filter Dropdown accordingly")
	public void clickandSort(String param) {
		Select desc = new Select(driver.findElement(sort_btn));
		desc.selectByVisibleText(param);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	@Step("Get Logo From Text")
	public String getlogotext() {
		return driver.findElement(logo).getText();
	}

}
