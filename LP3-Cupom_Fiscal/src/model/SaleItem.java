package model;

public class SaleItem {
	private double qty;
	Product product;
	
	public SaleItem(double qty, Product product ) {
		this.qty=qty;
		
	}

	public double getQty() {
		return qty;
	}

	public void setQty(double qty) {
		this.qty = qty;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double subTotal() {
		return qty*product.getPrice();
	}
	
	@Override
	public String toString() {
		return "QT: " + getQty() + "Description: " + getProduct();
	}
	
}
