package com.amazon;

public class Main {

	public static void main(String[] args){
		final int PAGE_COUNT = 3;
		Document amazonPage = new HTTPRequest("https://www.amazon.com/s?bbn=16225007011&rh=n%3A16225007011%2Cn%3A172456&dc&qid=1612775756&rnid=16225007011&ref=lp_16225007011_nr_n_0")
				.GetDocument();	
		
		for (int i = 0; i < PAGE_COUNT; i++) {
			ProductList products = new DocumentToProducts().Execute(amazonPage);
			
			for (Product product : products) {
				if (product.GetPrice() < 500d) {
					new Display().Print(product.GetName() + " : [PRICE] : " + product.GetPrice());
				}
			}
			new Pagination(amazonPage).Next();
		}
	}
}