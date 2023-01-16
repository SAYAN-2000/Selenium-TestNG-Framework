package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.Cartpage;
import pages.Checkoutoverview;
import pages.Checkoutpage;
import pages.Homepage;
import pages.Shoppingpage;
import pages.ThankyouPage;
import utils.Dataprovider;

@Feature("Feature: End to End Feature")
@Severity(SeverityLevel.NORMAL)
public class TC_04EndToEndScenario extends BaseTest {

	@Test(dataProvider = "end_to_end", dataProviderClass = Dataprovider.class)
	public void EndToEndTCValidation(String usr, String pwd, String fname, String lname, String pcode, String message)
			throws InterruptedException {
		Homepage homepage = new Homepage(driver);
		Shoppingpage shoppingpage = new Shoppingpage(driver);
		Cartpage cartpage = new Cartpage(driver);
		Checkoutpage checkout = new Checkoutpage(driver);
		Checkoutoverview checkoutoverview = new Checkoutoverview(driver);
		ThankyouPage thankyoupage = new ThankyouPage(driver);
		homepage.geturl();
		homepage.fillDetails(usr, pwd);
		homepage.clickLogin();
		shoppingpage.getname();
		shoppingpage.clickaddtocart();
		shoppingpage.clickcarticon();
		cartpage.clickcheckout();
		checkout.fillFirstname(fname);
		checkout.fillLastname(lname);
		checkout.fillPostalcode(pcode);
		checkout.clickcont();
		checkoutoverview.clickFinish();
		Assert.assertEquals(message, thankyoupage.getLogo());

	}

}
