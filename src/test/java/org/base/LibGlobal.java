package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;

	public static void getChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public static final String AUTOMATE_USERNAME = "nitishs5";
	  public static final String AUTOMATE_ACCESS_KEY = "V5jsZRBa3Bvq1s6YwXzu";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	 
	public static  void cloudExecution() throws MalformedURLException {
		 
		    DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("os_version", "7");
		    caps.setCapability("resolution", "1920x1080");
		    caps.setCapability("browser", "Chrome");
		    caps.setCapability("browser_version", "64.0");
		    caps.setCapability("os", "Windows");
		    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
		    caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
		     driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	}

	public static void getFireFoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	public static void launchUlr(String url) {
		driver.get(url);

	}

	public static void enterText(WebElement element, String data) {
		element.sendKeys(data);

	}

	public static void btnClick(WebElement element) {
		element.click();

	}

	public void close() {
		driver.close();

	}

	public void moveToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();

	}

	public void selectByValue(WebElement element, String value) {

		Select select = new Select(element);
		select.selectByValue(value);

	}

//	public String readValueFromExcel(String path, String SheetName, int rowNO, int cellNo) throws IOException {
//		File file = new File(path);
//		FileInputStream fileInputStream = new FileInputStream(file);
//		Workbook workbook = new XSSFWorkbook(fileInputStream);
//		Sheet sheet = workbook.getSheet(SheetName);
//		Row row = sheet.getRow(rowNO);
//		Cell cell = row.getCell(cellNo);
//		int cellType = cell.getCellType();
//		String value = "";
//		if (cellType == 1) {
//
//			value = cell.getStringCellValue();
//
//		} else if (DateUtil.isCellDateFormatted(cell)) {
//
//			Date dateCellValue = cell.getDateCellValue();
//			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//			value = dateFormat.format(dateCellValue);
//
//			System.out.println(value);
//		} else {
//			double numericCellValue = cell.getNumericCellValue();
//			long l = (long) numericCellValue;
//			value = String.valueOf(l);
//
//		}
//		return value;
//
//	}

	public static void enterTextByJs(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + data + "')", element);

	}

}
