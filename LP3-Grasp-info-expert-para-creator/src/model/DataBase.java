package model;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
	private Map<Integer, String[]> produtos;
	
	public DataBase() {
		produtos = new HashMap<Integer, String[]>();
		
		produtos.put(1, new String[] {"Arroz","10"});
		produtos.put(2, new String[] {"Biscoito recheado","6"});
		produtos.put(3, new String[] {"Kinder-Eggs","70"});
	}
	
	public Product selectProduto(int idProduto) {
		if(produtos.containsKey(idProduto)) {
			Product p = new Product();
			p.setId(idProduto);
			
			String[]values = produtos.get(idProduto);
			p.setDescription(values[0]);
			p.setPrice(Integer.parseInt((values[1])));
			
			return p;
				
		
		}
		Product invalido = new Product();
		invalido.setDescription("Produto Invalido");
		invalido.setPrice(0);
		
		return invalido;
		
	}
}
