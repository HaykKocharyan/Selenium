package com.amazon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Document {
	private WebDriver _driver;
	
	public Document (WebDriver driver) {
		this._driver = driver;
	}
	
	public ElementList FindAllByCssSelector (String selector) {
		List<WebElement> webElementList = this._driver.findElements(By.cssSelector(selector));
		
		return new ElementList(webElementList);
	}
	
	public Element FindByCssSelector(String selector) {
		WebElement webElement = this._driver.findElement(By.cssSelector(selector));
		
		return new Element(webElement);
	}
	
	public void Navigate(String URL) {
		_driver.navigate().to(URL);
	}
	
	public void Wait(int seconds) {
		_driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	protected void finalize()
	{  
		this._driver.close();
	}
}
