package share;

import java.util.Scanner;

public class Executa {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
	Scanner entrada = new Scanner(System.in)) {
		System.out.println("=====Cadastro Instituição=====");
		
		Instituição instituição = new Instituição();
		System.out.println("Informe o nome da instituição: ");
		instituição.setNome(entrada.nextLine());
		System.out.println("Informe o Endereço: ");
		instituição.setEndereco(entrada.nextLine());
		System.out.println("Informe o cep : ");
		instituição.setCep(entrada.nextLine());
		System.out.println("Informe o Cnpj: ");
		instituição.setCnpj(entrada.nextLine());
		
		
		System.out.println("======Cadastro Doador======");
		
		Doador doador = new Doador();
		System.out.println("Informe seu nome: ");
		doador.setNome(entrada.nextLine());
		System.out.println("Informe o Endereço: ");
		doador.setEndereco(entrada.nextLine());
		System.out.println("Informe seu CPF: ");
		doador.setCPF(entrada.nextLine());
		
		
		System.out.println("======Cadastro Doação======");
		
		Doação doação = new Doação();
		System.out.println("Informe o Aparelho para doação: ");
		doação.setAparelho(entrada.nextLine());
		System.out.println("Informe a Marca do Aparelho: ");
		doação.setMarca(entrada.nextLine());
		System.out.println("Informe a descrição: ");
		doador.setDescricao(entrada.nextLine());
		
		
		
		System.out.println("========== Share ========");
		System.out.println("------------------------------------");
		System.out.println("==========Dados da Instituição==========");
		System.out.println("Nome: " + instituição.getNome());
		System.out.println("CNPJ: " + instituição.getCnpj());
		System.out.println("Endereço: " + instituição.getEndereco());
		
		
		System.out.println("=========Dados do Doador=========");
		System.out.println("Nome: " + doador.getNome());
		System.out.println("CPF: " + doador.getCPF());
		System.out.println("Endereço: " + doador.getEndereco());
	}
	}
}
	


