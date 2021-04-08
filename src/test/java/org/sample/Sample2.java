package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 {
	
	@Test(invocationCount=10)
	private void tc0() {
		System.out.println("method");

	}
	
}
