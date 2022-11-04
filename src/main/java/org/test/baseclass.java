package org.test;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public static WebDriver driver;
	public static WebDriver chromebrowser() {
      WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
	  return driver;
	}
	public static  WebDriver firefoxbrowser() {
	WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver();
	return driver;
	}
	public static WebDriver edgebrowser() {
	WebDriverManager.edgedriver().setup();
	 driver=new EdgeDriver();
		return driver;
	}
	public static void urlLaunch(String url) {
	 driver.get(url);
	 driver.manage().window().maximize();
	}
	public static void implicitywait(int a) {
		driver.manage().timeouts().implicitlyWait(a,TimeUnit.SECONDS);
	}
	
	public static void SendKeys(WebElement e,String a) {
     e.sendKeys(a);
	}
	public static void click(WebElement e) {
	 e.click();
	}
	public static void quit() {
	 driver.quit();

	}
	public static void threadsleep(int a) throws InterruptedException {
		Thread.sleep(a);
	}
	
	
	
	public static String getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		}
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;

	}
	public static String getAttribute(WebElement e) {
	String attribute = e.getAttribute("value");
	return attribute;
}
	public static void moveToElement(WebElement e) {
	Actions a=new Actions(driver);
	a.moveToElement(e).perform();
}
	public static void dragandDrop(WebElement src,WebElement target) {
		Actions a=new Actions(driver);
        a.dragAndDrop(src, target).perform();
	}
	public static void Contextclick() {
         Actions a=new Actions(driver);
         a.contextClick().perform();
	}
	public static void Actionclick() {
        Actions a=new Actions(driver);
        a.click().perform();
	}
	public static void SelectByIndex(WebElement e,int a) {
		Select s=new Select(e);
		s.selectByIndex(a);
	}
	public static void SelectByValue(WebElement e,int a) {
		Select s=new Select(e);
		s.selectByIndex(a);
	}
	public static void SelectByVisibletext(WebElement e,String a) {
		Select s=new Select(e);
		s.selectByVisibleText("a");
	}
	public static void Getoption(WebElement e) {
	 Select s=new Select(e);
	 s.getOptions();
	}
	public static void getAllSelectedOptions(WebElement e) {
		Select s=new Select(e);
		s.getAllSelectedOptions();
	}
	public static void getFirstSelectedOption(WebElement e) {
		Select s=new Select(e);
		s.getFirstSelectedOption();
	}
	public static void isMultiple(WebElement e) {
	 Select s=new Select(e);
	 s.isMultiple();
}
	public static void deselectByIndex(WebElement e,int a) {
		 Select s=new Select(e);
		 s.deselectByIndex(a);	
		 }
	public static void deselectByValue(WebElement e, int a) {
		Select s=new Select(e);
		s.deselectByValue("a");
	}
	public static void deselectByVisibleText(WebElement e) {
		Select s=new Select(e);
         s.deselectByVisibleText("a");
	}
	public static void deselectAll(WebElement e) {
		Select s=new Select(e);
		s.deselectAll();
	}
	public static void SwitchToWindow(int a) {
	  Set<String> allid = driver.getWindowHandles();
	  List<String> li=new LinkedList<String>();
	  li.addAll(allid);
	  driver.switchTo().window(li.get(a));
	}
	
}

	
	


