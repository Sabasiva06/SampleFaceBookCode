package org.sample;

import org.base.LibGlobal;
import org.locator.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample3 extends LibGlobal {
	@Test
	private void test11() {
		getChromeDriver();
		launchUlr("https://www.facebook.com/");

		Login l = new Login();
		enterTextByJs(l.getTxtUserName(), "hsbdjkasm");
	}

}
