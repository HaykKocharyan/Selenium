package com.amazon;

public class Pagination {
	private Element _element;
	private Element _prevButton;
	private Element _nextButton;
	
	public Pagination (Document page) {
		this._element = page.FindByCssSelector(".a-pagination");
		
		this._prevButton = this._element.FindByCssSelector("li:first-of-type");
		this._nextButton = this._element.FindByCssSelector("li:last-of-type");
	}
	
	public void Next() {
		this._nextButton.Click();
	}
	
	public void Prev() {
		this._prevButton.Click();
	}
}