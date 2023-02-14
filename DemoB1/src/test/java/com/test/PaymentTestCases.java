package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.PaymentPage;
import com.wrapper.Wrapper;

public class PaymentTestCases extends TestBase{
	PaymentPage paymentPage;
	
	public PaymentTestCases() {
		super();
	}
	Wrapper objWrapper = new Wrapper();
	
	@BeforeClass
	public void setUp() {
		paymentPage = new PaymentPage();
	}
	@DataProvider(name = "dataprovider1")
	public Object[][] dpMethod1() {
		return new Object[][] { { "Balu", "Korea","lke","fre435", "June", "2015"} };
	}
	 @Test
	 public void verifyPlacingOrder() {
	  paymentPage.clickToOrder(); 
	  }
	 
		@Test(priority = 2, dataProvider = "dataprovider1")
		public void verifyValidCustomer(String a, String b, String c, String d, String e, String f) {
			paymentPage.customerName(a);
			paymentPage.customerCountry(b);
			paymentPage.customerCity(c);
			paymentPage.customerCard(d);
			paymentPage.customerMonth(e);
			paymentPage.customerYear(f);
			paymentPage.clickToPurchase();
			paymentPage.clickPurchaseOK();
		}
		
	@Test(priority = 3)
	public void verifyValidCustomerLogout() {
		paymentPage.clickLogOutButton();
	}
}
