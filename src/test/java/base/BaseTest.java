package base;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import factory.DriverManager;
import io.qameta.allure.Allure;

public class BaseTest {
	protected WebDriver driver;

	@BeforeMethod
	public void startDriver() {
		driver = new DriverManager().initilaizeDriver();
	}

	@AfterMethod
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.SUCCESS) {
			Allure.addAttachment("Any text",
					new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		}
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
