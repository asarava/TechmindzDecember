package com.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class CartPage extends TestBase{

	Wrapper objWrapper = new Wrapper();
	
	@FindBy(xpath = "//*[text()='Cart']")
	WebElement pCart;
	@FindBy(xpath = "//*[text()='Products']")
	WebElement pVerifyCart;
	
	@FindBy(xpath = "//a[text()='Delete']")
	WebElement pDelteItem;
	@FindBy(id = "totalp")
	WebElement pTotal;
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickCartButton() {
		objWrapper.waitForElement(driver,pCart);
		pCart.click();
	}
	
	public String verifyCartButton() {
		objWrapper.waitForElement(driver, pVerifyCart);
		String pActualText = pVerifyCart.getText();
		return (pActualText);
	}
	
	public void clickToDeleteItem() {
		objWrapper.waitForElement(driver,pDelteItem);
		pDelteItem.click();
	}
	
	public int getTotalPrice()
	{
		List<WebElement> pAllItemPrice = driver.findElements(By.xpath("//td[3]"));
		
		int pProductTotal = 0;
		
		for(WebElement pItem: pAllItemPrice)
		{
			pProductTotal+=Integer.parseInt(pItem.getText());
		}
		
		return pProductTotal;
	}
	
	public int getTotal()
	{
		return Integer.parseInt(pTotal.getText());	
	}
}
