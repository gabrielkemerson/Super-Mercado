package Supermercado;
import java.util.Scanner;
//import java.util.InputMismatchException;


public class Main {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		Estoque estoque = new Estoque();
		Fornecedor atacadao = new Fornecedor();
	
		Vendas v1 = new Vendas(estoque);
		
		atacadao.setCnpj("123.456.777/0000-10");
		atacadao.setEndereco("Patos-PB Centri N 44");
		atacadao.setRazaoSocial("Atacadão 123123123000");
		
		
		
		
		estoque.CadastrarProuto(atacadao, "Feijão", 5.23, 300, "cereais", "Carioca", 232025, 0000);
		
		estoque.CadastrarProuto(atacadao, "Arroz", 3.20, 400, "cereais", "Caçarola", 222024, 1111);
		
		v1.setPreco("cereais", 50);
		
		v1.Vender(40028922, 290);    
		
		
		
		
		
		
		//estoque.ExibirProduto(0);
		//estoque.ExibirProduto(1);
		
		
	}
}
