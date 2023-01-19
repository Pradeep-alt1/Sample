package com.ui;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MPM extends Base {

public static void main(String[] args) throws InterruptedException {
	WebDriver d = getDriver();
	d.manage().window().maximize();
	loadUrl("http://mpm-qa.acheron-tech.com/home/MPM/portal");
	Thread.sleep(15000);
	
	WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(50));
	WebElement username = d.findElement(By.xpath("//input[@id='otds_username']"));
	wait.until(ExpectedConditions.elementToBeClickable(username));
	
	WebElement pass = d.findElement(By.xpath("//input[@id='otds_password']"));
	WebElement btn = d.findElement(By.xpath("//button[@id='loginbutton']"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	type(username, "Ben");
	type(pass, "Cordys@123");
	JavascriptExecutor js =(JavascriptExecutor)d;
	
	btnClick(btn);
	Thread.sleep(15000);

	WebElement newBtn = d.findElement(By.xpath("//span[text()=' New']"));
	wait.until(ExpectedConditions.elementToBeClickable(newBtn));
	btnClick(newBtn);
	WebElement camBtn = d.findElement(By.xpath("//span[text()='Create Campaign']"));
	wait.until(ExpectedConditions.elementToBeClickable(camBtn));
	btnClick(camBtn);
	WebElement projName = d.findElement(By.xpath("//input[@placeholder='Campaign Name']"));
	
	//js.executeScript("arguments[0].setAttribute('Value','MPM_proj15')", projName);
	
	//wait.until(ExpectedConditions.elementToBeClickable(projName));
	type(projName, "MPM_proj70");
	Actions actions = new Actions(d);
	
	WebElement startCal = d.findElement(By.xpath("(//button[@aria-label='Open calendar'])[1]"));
	boolean b = startCal.isDisplayed();
	System.out.println(b);
	Thread.sleep(5000);
	wait.until(ExpectedConditions.elementToBeClickable(startCal));
	actions.moveToElement(startCal)
    .click(startCal)
    .build()
    .perform();
	//js.executeScript("arguments[0].click", startCal);
//btnClick(startCal);
	WebElement stDate = d.findElement(By.xpath("//div[text()=' 29 ']"));
	
	wait.until(ExpectedConditions.elementToBeClickable(stDate));
	Thread.sleep(5000);
	btnClick(stDate);
	
	WebElement endCal = d.findElement(By.xpath("(//button[@aria-label='Open calendar'])[2]"));
	boolean b1 = endCal.isDisplayed();
	System.out.println(b1);
	wait.until(ExpectedConditions.elementToBeClickable(endCal));
	actions.moveToElement(endCal)
    .click(endCal)
    .build()
    .perform();
	//js.executeScript("arguments[0].click", endCal);
	WebElement nxt = d.findElement(By.xpath("//button[@aria-label='Next month']"));
	wait.until(ExpectedConditions.elementToBeClickable(nxt));
	Thread.sleep(5000);
	btnClick(nxt);
	WebElement endDate = d.findElement(By.xpath("//div[text()=' 30 ']"));
	wait.until(ExpectedConditions.elementToBeClickable(endDate));
	btnClick(endDate);
	WebElement tarMar = d.findElement(By.xpath("//input[@placeholder='Target Market']"));
	wait.until(ExpectedConditions.elementToBeClickable(tarMar));
	type(tarMar, "12");
	WebElement save = d.findElement(By.xpath("//span[text()='Save']"));
	wait.until(ExpectedConditions.elementToBeClickable(save));
	btnClick(save);
	
	Thread.sleep(10000);
	WebElement proj = d.findElement(By.xpath("//span[text()='Projects']"));
	wait.until(ExpectedConditions.elementToBeClickable(proj));
	Thread.sleep(5000);
	btnClick(proj);

	WebElement newBtn1 = d.findElement(By.xpath("//span[text()=' New']"));
	Thread.sleep(5000);
	wait.until(ExpectedConditions.elementToBeClickable(newBtn1));
	btnClick(newBtn1);
	
	
	WebElement blnkProj = d.findElement(By.xpath("//span[text()='Blank Project']"));
	Thread.sleep(5000);
	wait.until(ExpectedConditions.elementToBeClickable(blnkProj));
	btnClick(blnkProj);
	
	WebElement projNam = d.findElement(By.xpath("//input[@placeholder='Project Name']"));
	Thread.sleep(5000);
	wait.until(ExpectedConditions.elementToBeClickable(projNam));
	type(projNam, "Project2");
	
	WebElement team = d.findElement(By.xpath("//span[text()='Teams']"));
	Thread.sleep(5000);
	wait.until(ExpectedConditions.elementToBeClickable(team));
	btnClick(team);
	
	WebElement tem1 = d.findElement(By.xpath("//span[text()=' Team1 ']"));
	Thread.sleep(5000);
	wait.until(ExpectedConditions.elementToBeClickable(tem1));
	btnClick(tem1);
	
	WebElement owner = d.findElement(By.xpath("(//input[@role='combobox'])[4]"));
	Thread.sleep(5000);
	wait.until(ExpectedConditions.elementToBeClickable(owner));
	type(owner, "Adam Sandler (Adam@acheron-tech.com)");
	
	WebElement startCal1 = d.findElement(By.xpath("(//button[@aria-label='Open calendar'])[1]"));
	boolean b2 = startCal1.isDisplayed();
	System.out.println(b2);
	wait.until(ExpectedConditions.elementToBeClickable(startCal1));
	actions.moveToElement(startCal1)
    .click(startCal1)
    .build()
    .perform();
	
WebElement stDate1 = d.findElement(By.xpath("//div[text()=' 29 ']"));
	
	wait.until(ExpectedConditions.elementToBeClickable(stDate1));
	Thread.sleep(5000);
	btnClick(stDate1);
	
	WebElement endCal1 = d.findElement(By.xpath("(//button[@aria-label='Open calendar'])[2]"));
	boolean b3 = endCal1.isDisplayed();
	System.out.println(b3);
	wait.until(ExpectedConditions.elementToBeClickable(endCal1));
	actions.moveToElement(endCal1)
    .click(endCal1)
    .build()
    .perform();
	//js.executeScript("arguments[0].click", endCal);
	
	
	WebElement nxt1 = d.findElement(By.xpath("//button[@aria-label='Next month']"));
	wait.until(ExpectedConditions.elementToBeClickable(nxt1));
	Thread.sleep(5000);
	btnClick(nxt1);
	
	WebElement endDate1 = d.findElement(By.xpath("//div[text()=' 30 ']"));
	wait.until(ExpectedConditions.elementToBeClickable(endDate1));
	btnClick(endDate1);
	
	WebElement gfc = d.findElement(By.xpath("(//input[@type='number'])[2]"));
	Thread.sleep(5000);
	wait.until(ExpectedConditions.elementToBeClickable(gfc));
	type(gfc, "12");
	
	WebElement primeM = d.findElement(By.xpath("//input[@placeholder='Prime Market']"));
	Thread.sleep(5000);
	wait.until(ExpectedConditions.elementToBeClickable(primeM));
	js.executeScript("arguments[0].click", primeM);
	type(primeM, "12");
	
	WebElement startCal4 = d.findElement(By.xpath("(//button[@aria-label='Open calendar'])[3]"));
	boolean b4 = startCal4.isDisplayed();
	System.out.println(b4);
	wait.until(ExpectedConditions.elementToBeClickable(startCal4));
	actions.moveToElement(startCal4)
    .click(startCal4)
    .build()
    .perform();
	
WebElement stDate3 = d.findElement(By.xpath("//div[text()=' 29 ']"));
	
	wait.until(ExpectedConditions.elementToBeClickable(stDate3));
	Thread.sleep(5000);
	btnClick(stDate3);
	
	//WebElement save1 = d.findElement(By.xpath("//span[text()='Save']"));
	WebElement save2 = d.findElement(By.xpath("//span[text()='Save']"));
	wait.until(ExpectedConditions.elementToBeClickable(save2));
	btnClick(save2);
	


	/*btnClick(startCal);
	btnClick(stDate);
	btnClick(endCal);
	btnClick(nxt);
	btnClick(endDate);

	btnClick(save);*/
	
	
	
	
	
}
	
	
	
	
}
