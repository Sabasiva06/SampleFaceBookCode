package org.locator;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class Login extends LibGlobal {

	public Login() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindAll({ @FindBy(id = "email"), @FindBy(xpath = "//input[@id='mail']") })
	private WebElement txtUserName;

	public WebElement getTxtUserName() {
		return txtUserName;
	}
	


}
