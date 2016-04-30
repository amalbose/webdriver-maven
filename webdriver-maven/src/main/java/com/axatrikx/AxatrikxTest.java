package com.axatrikx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AxatrikxTest {

	private WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "res/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void testPageTitle() {
		driver.get("http://axatrikx.com");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Axatrikx - Automation Testing Guide", "Incorrect title");
	}
}
