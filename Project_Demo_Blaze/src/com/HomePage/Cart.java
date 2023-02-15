package com.HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.TestBase;
import com.wrapper.Wrapper;

public class Cart extends TestBase{
	Wrapper wrapper=new Wrapper();
	@FindBy(xpath="//a[@onclick=\"showcart()\"]") WebElement pHomePageCartButton;
	@FindBy(xpath="//a[@id=\"cartur\"]") WebElement pHomePageCartButton1;
	@FindBy(xpath="(//div//h2)[1]") WebElement pCartHeading;
	@FindBy(xpath="(//a[@class=\"nav-link\"])[1]") WebElement pHomePageHomeButton;
	@FindBy(xpath="(//a[@href=\"prod.html?idp_=1\"])[2]") WebElement pHomePageProduct1;
	@FindBy(xpath="//a[@onclick=\"addToCart(1)\"]") WebElement pAddToCartButton;
	@FindBy(xpath="(//tr//td)[2]") WebElement pProductOnCart1;
	@FindBy(xpath="//button[@class=\"btn btn-success\"]") WebElement pPlaceTheOrderButton;
	@FindBy(xpath="(//a[@href=\"#\"])[8]") WebElement pDeleteProduct1;
	@FindBy(xpath="//button[@onclick=\"purchaseOrder()\"]") WebElement pPlaceTheOrderPurchaseButton;
	@FindBy(xpath="(//button[@class=\"btn btn-secondary\"])[3]") WebElement pPlaceTheOrderCloseButton;
	@FindBy(id="name") WebElement pCustomerName;
	@FindBy(id="country") WebElement pCuntry;
	@FindBy(id="city") WebElement pCity;
	@FindBy(id="card") WebElement pCreditCardNumber;
	@FindBy(id="month") WebElement pMonth;
	@FindBy(id="year") WebElement pYear;
	@FindBy(xpath="(//div//h2)[3]") WebElement pFinalPurchaseMessage;
	
	public Cart() {
		PageFactory.initElements(driver, this);
	}
	public void cartFunctionality() {
		wrapper.waitForElement(pHomePageCartButton1);
		wrapper.loopElementClick(pHomePageCartButton1);
		wrapper.waitForElementVisible(pCartHeading);
		wrapper.assRT(pCartHeading, "Products", "Cart funtinality not working", 0);
		pHomePageHomeButton.click();
	}
	public void addToCartFuntionlity() {
		wrapper.waitForElement(pHomePageProduct1);
		wrapper.loopElementClick(pHomePageProduct1);
		wrapper.waitForElement(pAddToCartButton);
		pAddToCartButton.click();
		wrapper.assRTAlert("Product added.", "Added product mismatch");
		wrapper.handleAlert(driver);
		wrapper.loopElementClick(pHomePageCartButton1);
		wrapper.waitForElement(pProductOnCart1);
		wrapper.assRT(pProductOnCart1, "Samsung galaxy s6", "Added product on cart missmatch", 0);
	}
	public void deleteProductFromCart() {
		pProductOnCart1.click();
	}
	public void placeTheOrderFunctionality() {
		pHomePageHomeButton.click();
		wrapper.waitForElement(pHomePageProduct1);
		wrapper.loopElementClick(pHomePageProduct1);
		wrapper.waitForElement(pAddToCartButton);
		pAddToCartButton.click();
		wrapper.handleAlert(driver);
		wrapper.loopElementClick(pHomePageCartButton1);
		wrapper.waitForElement(pPlaceTheOrderButton);
		pPlaceTheOrderButton.click();
	}
	public void purchaseTheOrderWhitoutFillingPlaceTheOrderForm() {
		wrapper.waitForElement(pPlaceTheOrderPurchaseButton);
		pPlaceTheOrderPurchaseButton.click();
		wrapper.assRTAlert("Please fill out Name and Creditcard.", " ");
		wrapper.handleAlert(driver);
		pPlaceTheOrderCloseButton.click();
	}
	public void purchaseTheProductWithUserDetails(String name,String cuntry,String city,String creditcard,String motnth,String year) {
		wrapper.waitForElement(pPlaceTheOrderButton);
		pPlaceTheOrderButton.click();
		wrapper.waitForElement(pCustomerName);
		wrapper.enterData(pCustomerName, name);
		wrapper.enterData(pCuntry, cuntry);
		wrapper.enterData(pCity, city);
		wrapper.enterData(pCreditCardNumber, creditcard);
		wrapper.enterData(pMonth, motnth);
		wrapper.enterData(pYear, year);
		pPlaceTheOrderPurchaseButton.click();
		wrapper.assRT(pFinalPurchaseMessage, "Thank you for your purchase!", "purchase not sucessfully competed", 0);
	}
}
