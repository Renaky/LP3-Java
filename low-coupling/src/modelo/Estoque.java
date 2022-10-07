package modelo;

public class Estoque {
	private BancoDados bd = BancoDados.getInstancia();
	
	private boolean temNoEstoque(Integer codProduto, int quantidade) {
		return bd.selectQuantidadeItemEstoque(codProduto) >= quantidade;	
		
	}
	
	public boolean retiraDoEstoque(Integer codProduto, int quantidade) {
		if(temNoEstoque(codProduto, quantidade)) {
			bd.diminuiQtdItemEstoque(codProduto, quantidade);
			return true;
		}
		return false;
		
	}
	
	public Produto selectProduto(int codProduto) {
		return bd.selectProduto(codProduto);
	}
	

}
