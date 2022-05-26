package Supermercado;

import java.util.ArrayList;
public class Estoque {

	private Fornecedor fornecedor;
	private Produto pro;
	
	
	ArrayList <Produto> produtos = new ArrayList <Produto>();
	
	
	public void CadastrarProuto(Fornecedor fornecedor, String nome, double preco, int quantidade, String tipo, String marca, int validade, int codBar) {
		produtos.add(pro = new Produto());
		
		pro.setNome(nome);
		pro.setPrecoCompra(preco);
		pro.setQuantidade(quantidade);
		pro.setTipo(tipo);
		pro.setMarca(marca);
		pro.setValidade(validade);
		pro.setCod_bar(codBar);
		
		pro.setFornecedor(fornecedor.getRazaoSocial());
		System.out.printf("Valor total da compra: %.2f\n", pro.getQuantidade() * pro.getPrecoCompra());
		System.out.println(" ");
	}
	
	
	//MUDANÇA FEITA !!!!!!!!!!!!
	public void setPrecoVenda(int produto, int porcentagem) {
		
		double valor;
		valor = porcentagem;
		
		valor /= 100;
		
		produtos.get(produto).setPrecoVenda(produtos.get(produto).getPrecoCompra() * valor + produtos.get(produto).getPrecoCompra());
		
	}

	
	public double getPrecoVenda(int indice) {
		
		return produtos.get(indice).getPrecoVenda();
	}
	// MUDANÇA FEITA !!!!!!!!!
	
	
	public int getSize() {
		return produtos.size();
	}
	
	//MUDANÇA FEITA !!!!!!!!

	public int getCodBar(int indice) {
		return produtos.get(indice).getCod_bar();
	}
	
	
	public String getTipoProduto(int indice) {
		return produtos.get(indice).getTipo();
	}
	
	public void setQuantidade(int indice,int quantidade) {
		produtos.get(indice).setQuantidade(quantidade);
	}
	
	public int getQuantidade(int indice) {
		return produtos.get(indice).getQuantidade();
	}
	
	
	public void ExibirProduto(int produto) {
		
		System.out.println("************PRODUTO**************");
		System.out.println("Fornecedor: " + produtos.get(produto).getFornecedor());
		System.out.println("Nome: " + produtos.get(produto).getNome());
		System.out.println("Preço de compra por unidade : " + produtos.get(produto).getPrecoCompra());
		System.out.printf("Preço de venda por unidade: %.2f \n" , produtos.get(produto).getPrecoVenda());
		System.out.println("Quantidade em estoque: " + produtos.get(produto).getQuantidade());
		System.out.println("Tipo de produto: " + produtos.get(produto).getTipo());
		System.out.println("Marca: " + produtos.get(produto).getMarca());
		System.out.println("Validade do produto: " + produtos.get(produto).getValidade());
		System.out.println("Código de barras: " + produtos.get(produto).getCod_bar());
		System.out.println("_________________________________");
	
	}
	
	
	
	
}
