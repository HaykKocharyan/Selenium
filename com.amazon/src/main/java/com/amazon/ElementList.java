package com.amazon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;

public class ElementList implements Iterable<Element> {
	private List<Element> _elements = new ArrayList<Element>();
	
	public ElementList (Iterable<WebElement> elements) {
		// converting WebElement list to Element list
		for (WebElement element : elements) {
			this._elements.add(new Element(element));
		}
	}
	
	public Iterator<Element> iterator() {
		return _elements.iterator();
	}

}