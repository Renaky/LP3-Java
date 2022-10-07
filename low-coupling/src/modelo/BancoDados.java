package modelo;

import java.util.HashMap;
import java.util.Map;

public class BancoDados {
	private Map<Integer, Produto> produtos = new HashMap<>();
	private Map<String, FormaDePagamento> formasDePagamento = new HashMap<>();
	private Map<Integer, ItemEstoque> itemsEstoque = new HashMap<>();
	
	private static BancoDados bd = new BancoDados();

	private BancoDados() {
		// Simula a tabela produtos
		Produto arroz = new Produto("Arroz", 5); 
		produtos.put(1, arroz);
		
		Produto feijao = new Produto("Feijao", 10);
		produtos.put(2, feijao);
		
		Produto milho = new Produto("Milho", 3);
		produtos.put(3, milho);
		
		Produto sal = new Produto("Sal", 2);
		produtos.put(4, sal);
		
		Produto acucar = new Produto("Acucar", 7); 
		produtos.put(5, acucar);
		
		Produto cafe = new Produto("Cafe", 12);
		produtos.put(6, cafe);
		
		Produto mel = new Produto("Mel", 20.5);
		produtos.put(7, mel);
		
		Produto pao = new Produto("Pão", 10);
		produtos.put(8, pao);
		
		// Simula a tabela de formas de pagamento
		PagamentoComDesconto dinheiro = new PagamentoComDesconto();
		dinheiro.setDescricao("Dinheiro");
		dinheiro.setTaxaDesconto(10);
		
		PagamentoComDesconto debito = new PagamentoComDesconto();
		debito.setDescricao("Debito");
		debito.setTaxaDesconto(5);
		
		PagamentoComJuros credito = new PagamentoComJuros();
		credito.setDescricao("Credito");
		credito.setTaxaJuros(0);
		
		formasDePagamento.put("di", dinheiro);
		formasDePagamento.put("cd", debito);
		formasDePagamento.put("cc", credito);
		
		//Simula o estoque
		itemsEstoque.put(1, new ItemEstoque(5, arroz));
		itemsEstoque.put(2, new ItemEstoque(3, feijao));
		itemsEstoque.put(3, new ItemEstoque(10, milho));
		itemsEstoque.put(4, new ItemEstoque(1, sal));
		itemsEstoque.put(5, new ItemEstoque(1, acucar));
		itemsEstoque.put(6, new ItemEstoque(1, cafe));
		itemsEstoque.put(7, new ItemEstoque(1, mel));
		itemsEstoque.put(8, new ItemEstoque(1, pao));
		
		
	}
	
	public static BancoDados getInstancia() {
		return bd;
	}
	
	public Produto selectProduto(Integer codigo){
		if (!this.produtos.containsKey(codigo)) {
			return new Produto("Produto Invalido", 0);
		}
		
		return this.produtos.get(codigo);
	}
	
	public FormaDePagamento selectFormaDePagamento(String forma){
		return formasDePagamento.get(forma);
	}
	public Integer selectQuantidadeItemEstoque(Integer codProduto) {
		ItemEstoque ie = itemsEstoque.get(codProduto);
		
		if(ie !=null) {
			int quantidadeItem = ie.getQuantidade();
			
			return quantidadeItem;
		}
		
		return 0;
		
		
	}

	public void diminuiQtdItemEstoque(Integer codProduto, int quantidade) {
		ItemEstoque ie = itemsEstoque.get(codProduto);
		if(ie ==null) {
			return;
		}
		
		 
		int qtdeAtual = ie.getQuantidade();
		ie.setQuantidade( qtdeAtual - quantidade);
		
	}
}
