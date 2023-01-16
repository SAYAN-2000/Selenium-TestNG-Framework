package utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	@DataProvider(name="end_to_end")
	public Object[][] dpMethod() throws IOException
	{
		 Object[][] objarr= new Excelutils().getExcelData((System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\E2E_TC.xlsx"), "Sheet1");
		return objarr;
 	}
	@DataProvider(name="correct_credentials")
	public Object[][] dPMethod() throws IOException
	{
		 Object[][] objarr= new Excelutils().getExcelData((System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\LoginDetails.xlsx"), "Sheet1");
		return objarr;
 	}
	@DataProvider(name="filter_data")
	public Object[][] dPMethod1() throws IOException {
		Object[][] objarr = new Excelutils().getExcelData(
				(System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\Filter_Data.xlsx"), "Sheet1");
		return objarr;
	}

}
