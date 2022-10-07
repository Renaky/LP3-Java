package visao;

import modelo.GerenciadorVenda;

public class Main {
	public static void main(String[] args) {
		
		GerenciadorVenda gv = new GerenciadorVenda();
		gv.abreVenda();
		
		gv.addItemVenda(1, 2);
		gv.addItemVenda(2, 3);
		gv.addItemVenda(3, 3);
		gv.setFormaPagamento("cc");
		
		for(String itemVenda : gv.getItensVenda()) {
			System.out.println(itemVenda);
		}
		
		System.out.printf("Total : %.2f\n", gv.getValorTotal());
		System.out.printf("Valor a pagar %.2f no %s\n ",
				gv.valorAPagar(), gv.formaPagamento());
		
		gv.fechaVenda();
			
		
	}
}
