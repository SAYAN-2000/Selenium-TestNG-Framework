package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.Homepage;
import pages.Shoppingpage;
import utils.Dataprovider;

@Feature("Feature: Login Functionality")
@Severity(SeverityLevel.CRITICAL)
public class TC_01LoginWithCorrectData extends BaseTest {
	Homepage homepage = new Homepage(driver);
	Shoppingpage shopppingpage = new Shoppingpage(driver);

	@Test(dataProvider = "correct_credentials", dataProviderClass = Dataprovider.class)
	public void LoginUsingCredentials(String usr, String pwd, String logo) throws InterruptedException {

		homepage.geturl();
		homepage.fillDetails(usr, pwd);
		homepage.clickLogin();
		Assert.assertEquals(shopppingpage.getlogotext(), logo);

	}

}
