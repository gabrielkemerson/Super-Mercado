package Supermercado;

public class Vendas {
	
	private Produto produto;
	private Estoque estoque;
	int cereais;
	
	
	//MUDANÇA FEITA !!!!
	public Vendas (Estoque estoque) {
		this.estoque = estoque;
	}
	
	
	//MUDANÇA FEITA !!!!
	public void setPreco(String tipo, int porcentagem) {
		
		for(int c = 0 ; c < estoque.getSize(); c++) {
			
			
			if(estoque.getTipoProduto(c).equals(tipo)) {
				estoque.setPrecoVenda(c, porcentagem);
			}	
		}
	}
	
	
	public void Vender(int codBar, int quantidade) {
		
		int inProduto = 0;
		for (int c = 0; c < estoque.getSize(); c++) {
			
			if(estoque.getCodBar(c) == codBar) {
				inProduto = c;
			}
		}
		
		if(quantidade > estoque.getQuantidade(inProduto)) {
			System.out.println("O estoque é insuficiente para a compra");
			System.out.printf("Estoque atual: %d", estoque.getQuantidade(inProduto));
		}
		
		else {
			
			System.out.println("Valor total da venda: " + estoque.getPrecoVenda(inProduto) * quantidade);
			estoque.setQuantidade(inProduto, estoque.getQuantidade(inProduto) - quantidade);
			System.out.println("Venda realizada com sucesso!");
			System.out.printf("Estoque atual: %d", estoque.getQuantidade(inProduto));
		}
	}
	
	
	
	
	
	
	
	
}
