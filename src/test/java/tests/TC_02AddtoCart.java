package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.Cartpage;
import pages.Homepage;
import pages.Shoppingpage;
import utils.Dataprovider;

@Feature("Feature: Add to Cart")
@Severity(SeverityLevel.CRITICAL)
public class TC_02AddtoCart extends BaseTest {

	@Test(dataProvider = "correct_credentials", dataProviderClass = Dataprovider.class)
	public void AddanItemtoCart(String usr, String pwd, String logo) throws InterruptedException {
		Homepage homepage = new Homepage(driver);
		Shoppingpage shoppingpage = new Shoppingpage(driver);
		Cartpage cartpage = new Cartpage(driver);
		homepage.geturl();
		homepage.fillDetails(usr, pwd);
		homepage.clickLogin();
		shoppingpage.getname();
		shoppingpage.clickaddtocart();
		shoppingpage.clickcarticon();
		Assert.assertEquals(cartpage.getbag(), shoppingpage.getname());

	}

}
