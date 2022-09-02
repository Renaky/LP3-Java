package model;

import java.util.List;
import java.util.ArrayList;

public class Store {
	private String date;
	private String hour;
	private List<SaleItem> items; 
	private double total;


	public void setItems(List<SaleItem> items) {
		this.items=items;
	}
	
	public Store(String date, String hour) {
		this.date=date;
		this.hour=hour;
	//	this.items = new ArrayList<SaleItem>();
	//	addItemVenda(i);
		
	}

	public List<SaleItem> getItems() {
		return items;
	}
	
	public boolean addSaleItem(SaleItem item) {
		if(items == null)
			return false;
		
		return items.add(item);
	}
	// Somando o valor do subtotal e trazendo o total da venda
	public double Total() {
		for(SaleItem s: items) {
			total =+ s.subTotal();
		}
			
		return getTotal();
		
	}

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

	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return items.toString() + "Total:" + getTotal();
		
	}
	
}
