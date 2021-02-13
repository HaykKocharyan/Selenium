package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HTTPRequest {
	private Document _doc;
	
	public HTTPRequest (String URL) {
		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get(URL);
		_doc = new Document(driver);
	}
	
	public Document GetDocument() {
		return this._doc;
	}
	
}