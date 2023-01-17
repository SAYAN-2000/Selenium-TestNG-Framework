package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import org.testng.annotations.Test;

import base.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.Homepage;
import pages.Shoppingpage;
import utils.Dataprovider;

@Feature("Feature: Filter Data Functionality")
@Severity(SeverityLevel.NORMAL)

public class TC_03ValidatingtheFilterSection extends BaseTest {
	private Homepage homepage = new Homepage(driver);
	private Shoppingpage shoppingpage = new Shoppingpage(driver);

	@Test(dataProvider = "filter_data", dataProviderClass = Dataprovider.class)
	public void FilteranItem(String usr, String pwd, String list, String param) throws InterruptedException {

		homepage.geturl();
		homepage.fillDetails(usr, pwd);
		homepage.clickLogin();
		shoppingpage.clickandSort(param);
		List<String> myList = new ArrayList<String>(Arrays.asList(list.split(", ")));
		Assert.assertEquals(shoppingpage.printItems(param), myList);

	}

}
