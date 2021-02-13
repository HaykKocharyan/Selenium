package com.amazon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ProductList implements Iterable<Product> {
	private List<Product> _list = new ArrayList<Product>();
	
	public ProductList () {
	}
	
	public ProductList (Collection<Product> products) {
		
		this._list.addAll(products);
	}

	public Iterator<Product> iterator() {
		return this._list.iterator();
	}

	
	public boolean add (Product e) {
		return this._list.add(e);
	}
}