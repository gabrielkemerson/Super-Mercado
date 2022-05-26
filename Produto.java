package Supermercado;

public class Produto {
	
	private String nome, tipo, marca, fornecedor;
	private int validade, quantidade, cod_bar;
	private double precoVenda, precoCompra;
	
	
	//SET'S
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public void setValidade(int validade) {
		this.validade = validade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setCod_bar(int cod) {
		this.cod_bar = cod;
	}
	
	public void setPrecoVenda(double preço) {
		this.precoVenda = preço;
	}
	
	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}
	
	//GET'S
	public String getNome() {
		return nome;
	}
	public String getTipo() {
		return tipo;
	}
	public String getMarca() {
		return marca;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public int getValidade() {
		return validade;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public int getCod_bar() {
		return cod_bar;
	}
	
	public double getPrecoVenda() {
		return precoVenda;
	}
	
	public double getPrecoCompra() {
		return precoCompra;
	}
	
	
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", tipo=" + tipo + ", marca=" + marca + ", fornecedor=" + fornecedor
				+ ", validade=" + validade + ", quantidade=" + quantidade + ", codigo de barras=" + cod_bar + "]";
	}
	
	
	
}
