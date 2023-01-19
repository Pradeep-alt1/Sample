package com.ui;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.xml.stream.events.ElementTypeNames;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.graph.ElementOrder.Type;

public class Base {
static WebDriver driver;
public static WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pradeep V\\Desktop\\New folder\\Selenium\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	return driver;
}
	public static void loadUrl(String URL) {
		driver.get(URL);
	}
public static void type(WebElement element,String value) {
	element.sendKeys(value);

}
public static void btnClick(WebElement element) {
	element.click();
}
public static void screenShot(String name) throws IOException {

	TakesScreenshot scc =(TakesScreenshot)driver;
	File src = scc.getScreenshotAs(OutputType.FILE);
	System.out.println(src);
	File desc = new File("C:\\Users\\Pradeep V\\Desktop\\New folder\\Selenium\\Report"+name+".png");

	FileUtils.copyFile(src, desc);


}

	
	
	
}
