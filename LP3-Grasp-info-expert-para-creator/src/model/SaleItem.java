package model;

public class SaleItem {
	private double qty;
	Product product;
	
//	public SaleItem(double qty, Product product ) {
//		this.qty=qty;
//		this.product = product;
//		
//	}
	
	public SaleItem(int idProduto) {
		
		DataBase bd = new DataBase();
		this.product = bd.selectProduto(idProduto);
		
		
	}

	Product cookies = new Product("Cookies de chocolate 140g",4.50);
	Product water = new Product("Agua mineral garrafa 510ml",1.00);
	Product milk  = new Product ("Leite 1L vaquita",5.89);
	

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
	public String toString() {
		return "Qty: "+getQty() + " | Desc: " + product.getDescription() + " | $ Un: "+product.getPrice() + " | Subtotal: "+subTotal();
		
	}
	

}