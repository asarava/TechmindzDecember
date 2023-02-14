package com.test;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.ProductPage;
import com.wrapper.Wrapper;

public class ProductTestCases extends TestBase {
	ProductPage productPage;

	public ProductTestCases() {
		super();
	}

	Wrapper objWrapper = new Wrapper();

	@BeforeClass
	public void setUp() {
		productPage = new ProductPage();
	}

	@Test(priority = 1)
	public void verifyProductAccess() {
		productPage.clickSamsungGalaxyS6();
		String pActualPdtText = productPage.verifyProduct();
		Assert.assertEquals(pActualPdtText, "Samsung galaxy s6", "Product page is not as expected - Assert Failed");
	}

	@Test(priority = 2)
	public void checkAddToCart() {
		productPage.clickAddToCart();
		objWrapper.waitForAlert(driver);
		Alert alert = driver.switchTo().alert();
		String pAlertText = alert.getText();
		Assert.assertEquals(pAlertText, "Product added.", "Product not added to cart - Assert Failed");
		alert.accept();
	}
}
