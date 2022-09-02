package view;


import model.Product;
import model.SaleItem;
import model.Store;

public class Main {

	public static void main(String[] args) {
		
		Product cookies = new Product("Cookies de chocolate 140g",4.50);
		Product water = new Product("Agua mineral garrafa 510ml",1.00);
		Product milk  = new Product ("Leite 1L vaquita",5.89);
		
		
		SaleItem i = new SaleItem(5, milk);
		SaleItem i2 = new SaleItem(3,water);
		SaleItem i3 = new SaleItem(10,cookies);
		
		Store sold = new Store("01/09/2022","22:10");
		sold.addSaleItem(i);
		sold.addSaleItem(i2);
		sold.addSaleItem(i3);
		
		for(SaleItem it: sold.getItems()) {
			System.out.println(it);
		}
		
		


	}

}