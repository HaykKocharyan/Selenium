package com.amazon;

import org.openqa.selenium.NoSuchElementException;

public class DocumentToProducts implements Converter<Document, ProductList>  {

	public ProductList Execute(Document document) {
		ProductList result = new ProductList();
		
		ElementList productTags = document.FindAllByCssSelector(".s-result-item.s-asin");
		
		for (Element tag : productTags) {
			String name = tag.FindByCssSelector(".a-section .a-size-mini a span").GetText();
			double price = 0;
			
			try {
				Element wholePrice = tag.FindByCssSelector(".a-price .a-price-whole");
				Element fractionPrice = tag.FindByCssSelector(".a-price .a-price-fraction");
				
				String PriceText = wholePrice.GetText() + "." + fractionPrice.GetText();
				price = Double.parseDouble(PriceText.replace("$", "").replace(",", ""));
			}catch (NoSuchElementException e) {
			
			}
			
			Product newProduct = new Product(name, price);
			result.add( newProduct );
		}
		
		return result;
	}
}