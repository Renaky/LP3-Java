package view;

import model.Store;

public class Main {

	public static void main(String[] args) {
		
		Store store = new Store();
		store.addSaleItem(1, 5);
		store.addSaleItem(2, 5);
		store.addSaleItem(3, 5);
		
		
		
	
		
		for(String iv: store.getItems()) {
			System.out.println(iv);
		}
		
		System.out.println("Valor Total: " +store.getTotal());
		
	}

}