package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.HomePage;

public class HomePageTestCases extends TestBase{
	HomePage homepage;
	public HomePageTestCases() {
		super();
	}
	@BeforeClass
	public void setUp() {
		initialization();
		homepage = new HomePage();
	}
	@Test(priority =1)
	public void Categories() {
		Assert.assertTrue(homepage.monitorsSlideDisplayed());
		Assert.assertTrue(homepage.laptopsSlideDisplayed());
		Assert.assertTrue(homepage.phonesSlideDisplayed());
	}
	@Test(priority =2)
	public void productDetails() {
		homepage.AddtoCart();
		String productname=homepage.getProductTagName();
		//System.out.println(productname);
		Assert.assertEquals(productname, "Product description", "passed");
		
	}
	@Test(priority =3)
	public void AddtoCart() {
		String textab=homepage.AddCart();
		//System.out.println(textab);
		Assert.assertEquals(textab, "Product added", "passed");
	}
	@Test(priority =4)
	public void SignUpFunctionality() {
		Assert.assertEquals(homepage.SignUp(), true);
	}
	@Test(priority =5)
	public void singUpWithEmptyFields() {
		homepage.ClickSignUpButton();
		
		Assert.assertEquals(homepage.SignUpBlank(), "Please fill out Username and Password.", "passed");
	}
	@Test(priority =6)
	public void singUpWithUsedUsernamePassword() {
		
		homepage.SignUpUsername("test");
		homepage.SignUpPassword("test");
		Assert.assertEquals(homepage.SignUpButton(), "This user already exist.", "passed");
		homepage.clearEnterText();
	}
	@Test(priority =7)
	public void SignUpWithUsernameOnly() {
		homepage.SignUsername("test12345");
		//homepage.SignUpWithUsername();
		Assert.assertEquals(homepage.SignUpButton(), "Please fill out Username and Password.", "passed");
		homepage.clearUsername();
	}
	@DataProvider(name = "dataprovider")
	public Object[][] dpMethod(){
		return new Object[][] {{"52636774748848488jj99jf884848","663737747ii838jfjfj48849494"},
		                       {"ydduudufufufuuyy8383jcjjfjjfff","hudududidehehhuwuwuuueueu"}
		                       };
	}
	@Test(priority =8,dataProvider = "dataprovider")
	public void SignUpLength(String a,String b) {
		homepage.SignUsernameLength(a);
		homepage.SignPasswordlength(b);
		String errormsg=homepage.SignUpLength();
		Assert.assertEquals(errormsg, "Enter Valid Username and Password", "failed");
		//homepage.clearEnterText();
	}
	@Test(priority =9)
	public void ValidSignUp() {
		homepage.ClickSignUp();
		homepage.SignUpUsername("demoproject8");
		homepage.SignUpPassword("password");
		//homepage.SignUpWithUsername();
		Assert.assertEquals(homepage.SignUpButton(), "Sign up successful.", "passed");
		
	}
	@Test(priority =10)
	public void LoginWithInvalidData() {
		homepage.clickLoginButton();
		homepage.loginUsernameEnterText("wha233sap3248383");
		homepage.loginPasswordEnterText("password");
		String textmsg=homepage.clickLogin();
		Assert.assertEquals(textmsg, "User does not exist.");
		homepage.clearLogin();
	}
	@Test(priority =11)
	public void LoginValidUnameInvalidPswd() {
		homepage.loginUsernameEnterText("test8956666");
		homepage.loginPasswordEnterText("hh8fhh783j");
		String textmsg=homepage.clickLogin();
		Assert.assertEquals(textmsg, "Wrong password.");
		homepage.clearLogin();
	}
	@Test(priority =12)
	public void LoginValidUnameValidPswd() {
		homepage.loginUsernameEnterText("demoproject8");
		homepage.loginPasswordEnterText("password");
		homepage.clickLoginactualdata();
		Assert.assertTrue(homepage.isWelcomeUserDisplayed());
	}
	@Test(priority =13)
	public void productVisible() {
		Assert.assertEquals(homepage.productVisible(), true);
	}
	@Test(priority =14)
	public void AddProductCart() {
		homepage.productadd();
		Assert.assertTrue(homepage.productDisplayedcart());
	}
	@Test(priority =15)
	public void placeOrderInvalidDeatils() {
		homepage.placeorder();
		homepage.pName("jjfjfjf");
		homepage.pCountry("uuueee");
		homepage.pCity("hhdhhhfhf");
		homepage.pCard("yyyyyryrryyrr");
		homepage.pMonth("jyro");
		homepage.pYear("38hd83");
		Assert.assertEquals(homepage.getSuccessMsg(),"Enter Valid Details!", "failed");
	}
	@Test(priority =16)
	public void OrderWithValidDetails() {
		homepage.clearPaymentDetails();
		homepage.pName("jjfjfjf");
		homepage.pCountry("uuueee");
		homepage.pCity("hhdhhhfhf");
		homepage.pCard("yyyyyryrryyrr");
		homepage.pMonth("jyro");
		homepage.pYear("38hd83");
		Assert.assertEquals(homepage.getSuccessMsg(),"Thank you for your purchase!", "passed");
	}
	@Test(priority =17)
	public void FirstItemDisplayedafterDeleting() {
		Assert.assertFalse(homepage.firstItemDisplayed());
	}
	@Test(priority =18)
	public void paymentClosebtn() {
		homepage.closeButtonAccesibility();
	}
	@Test(priority =19)
	public void aboutusAccesibility() {
		Assert.assertEquals(homepage.aboutUs(), true);
	}
	@Test(priority =20)
	public void playandpausevideo() {
		homepage.playpause();
	}
	@Test(priority =21)
	public void fullscreenvideo() {
		homepage.fullscreen();
	}
	@Test(priority =22)
	public void aboutUsClose() {
		Assert.assertEquals(homepage.aboutClosebtn(), true);
	}
	@Test(priority =23)
	public void contactfieldBlank() {
		homepage.ContactButton();
		Assert.assertEquals(homepage.SendMessage(), "please fill out the details!", "failed");
	}
	@Test(priority =24)
	public void contactfieldInvalidDetails() {
		homepage.clearcontactDeatails();
		homepage.EmailEnterText("yeyey");
		homepage.NameEnterText("hdjd,,,,,");
		homepage.MessageEntertext("qwertyuiopasdfghjklzxcvbnm");
		Assert.assertEquals(homepage.SendMessage(), "Enter valid Credentails!");
	}
	@Test(priority =25)
	public void contactfieldValidDetails() {
		homepage.clearcontactDeatails();
		homepage.EmailEnterText("ar@.com");
		homepage.NameEnterText("Radeon");
		homepage.MessageEntertext("AmdRadeonGraphics");
		Assert.assertEquals(homepage.SendMessage(), "Thanks for the message!!");
	}
	@Test(priority =26)
	public void LengthMessageContact() {
		homepage.clearcontactDeatails();
		homepage.EmailEnterText("ar@g.com");
		homepage.NameEnterText("hp");
		homepage.MessageEntertext("This separation is part of a conscious effort to have browser vendors take responsibility for the implementation for their browsers. Seleniummakesuse of these third party drivers where possible, but also provides its own drivers maintained by the project for the cases when this is not a reality.The Selenium framework ties all of these pieces together through a user-facing interface that enables the different browser backends to be used transparently, enabling cross-browser and cross-platform automation.Selenium setup is quite different from the setup of other commercial tools. Before you can start writing Selenium code, you have to install the language bindings libraries for your language of choice, the browser you want to use, and the driver for that browser.This separation is part of a conscious effort to have browser vendors take responsibility for the implementation for their browsers. Seleniummakesuse of these third party drivers where possible, but also provides its own drivers maintained by the project for the cases when this is not a reality.The Selenium framework ties all of these pieces together through a user-facing interface that enables the different browser backends to be used transparently, enabling cross-browser and cross-platform automation.Selenium setup is quite different from the setup of other commercial tools. Before you can start writing Selenium code, you have to install the language bindings libraries for your language of choice, the browser you want to use, and the driver for that browser.This separation is part of a conscious effort to have browser vendors take responsibility for the implementation for their browsers. Seleniummakesuse of these third party drivers where possible, but also provides its own drivers maintained by the project for the cases when this is not a reality.The Selenium framework ties all of these pieces together through a user-facing interface that enables the different browser backends to be used transparently, enabling cross-browser and cross-platform automation.Selenium setup is quite different from the setup of other commercial tools. Before you can start writing Selenium code, you have to install the language bindings libraries for your language of choice, the browser you want to use, and the driver for that browser.This separation is part of a conscious effort to have browser vendors take responsibility for the implementation for their browsers. Seleniummakesuse of these third party drivers where possible, but also provides its own drivers maintained by the project for the cases when this is not a reality.The Selenium framework ties all of these pieces together through a user-facing interface that enables the different browser backends to be used transparently, enabling cross-browser and cross-platform automation.Selenium setup is quite different from the setup of other commercial tools. Before you can start writing Selenium code, you have to install the language bindings libraries for your language of choice, the browser you want to use, and the driver for that browser.This separation is part of a conscious effort to have browser vendors take responsibility for the implementation for their browsers. Seleniummakesuse of these third party drivers where possible, but also provides its own drivers maintained by the project for the cases when this is not a reality.The Selenium framework ties all of these pieces together through a user-facing interface that enables the different browser backends to be used transparently, enabling cross-browser and cross-platform automation.Selenium setup is quite different from the setup of other commercial tools. Before you can start writing Selenium code, you have to install the language bindings libraries for your language of choice, the browser you want to use, and the driver for that browser.This separation is part of a conscious effort to have browser vendors take responsibility for the implementation for their browsers. Seleniummakesuse of these third party drivers where possible, but also provides its own drivers ");
		Assert.assertEquals(homepage.SendMessage(), "Message is not exceed 100 words.");
	}
	

}
