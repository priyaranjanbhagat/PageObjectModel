package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	// PageFactory or Object Repository

	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/form/div/div[4]")
	WebElement loginBtn;
	
	public LoginPage() {
	PageFactory.initElements(driver, this);
	}
}
