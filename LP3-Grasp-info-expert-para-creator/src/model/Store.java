package model;

import java.util.List;
import java.util.ArrayList;

public class Store {
	//Atributes
	private String date;
	private String hour;
	private List<SaleItem> items =
			new ArrayList<SaleItem>(); 
	private double total;
	SaleItem SaleItClass;
	
//methods
	public void setItems(List<SaleItem> items) {
		this.items=items;
	}
	//constructor

	public List<String> getItems() {
		List<String> itensFormatados = new ArrayList<String>();
		
		for(SaleItem iv: items) {
			String itemFormatado =  "Qty: "+iv.getQty() + " | Desc: " + iv.getProduct().getDescription() + ""
					+ " | $ Un: "+iv.getProduct().getPrice() + " | Subtotal: "+iv.subTotal();
			
			itensFormatados.add(itemFormatado);
			
		}
		return itensFormatados;
	}
	//methods
	public void addSaleItem(int idProduto, int quantidade) {
		SaleItem item = new SaleItem(idProduto);
		item.setQty(quantidade);
		items.add(item);
		total += item.subTotal();
		
		
	}
	// Somando o valor do subtotal e trazendo o total da venda
	
//	public double Total() {
//			
//		for(SaleItem s: getItems()) {
//			total += s.subTotal();
//			
//		}
//			
//		return getTotal();
//	
//	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public double getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return items.toString() + "Total:" + getTotal();
		
	}
	
}