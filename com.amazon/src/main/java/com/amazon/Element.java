package com.amazon;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Element {
	private WebElement _elem;
	
	public Element (WebElement element) {
		this._elem = element;
	}
	
	public ElementList FindAllByCssSelector(String selector) {
		List<WebElement> webElementList = this._elem.findElements(By.cssSelector(selector));

		return new ElementList(webElementList);
	}
	public Element FindByCssSelector(String selector) {
		WebElement webElement = this._elem.findElement(By.cssSelector(selector));
		return new Element(webElement);
	}
	
	public String GetText() {
		return _elem.getText();
	}
	
	public void Click() {
		_elem.click();
	}
	
	public void Write(CharSequence... charSequences) {
		_elem.sendKeys(charSequences);
	}
}