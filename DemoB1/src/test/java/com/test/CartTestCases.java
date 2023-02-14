package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.CartPage;
import com.wrapper.Wrapper;

public class CartTestCases extends TestBase {
	CartPage cartPage;

	public CartTestCases() {
		super();
	}

	Wrapper objWrapper = new Wrapper();

	@BeforeClass
	public void setUp() {
		cartPage = new CartPage();
	}

	@Test(priority = 1)
	public void verifyCartAccess() {
		cartPage.clickCartButton();
	}

	@Test(priority = 2)
	public void verifyAddedProducts() {
		String pActualCartText = cartPage.verifyCartButton();
		Assert.assertEquals(pActualCartText, "Products", "Cart page is not as expected - Assert Failed");
	}
	
	@Test(priority = 3, enabled = false)
	public void verifyDeleteProduct() {
		cartPage.clickToDeleteItem();
	}
	
	@Test(priority = 3, enabled = false)
	public void valiadateTotalProductPrice()	{
		int actualData = cartPage.getTotalPrice();
		int expectedData = cartPage.getTotal();
		Assert.assertEquals(actualData,expectedData);
	}
}
