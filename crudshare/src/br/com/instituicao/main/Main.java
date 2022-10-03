package br.com.instituicao.main;

import java.sql.SQLException;

import br.com.instituicao.dao.DoadorDAO;
import br.com.instituicao.dao.InstituicaoDAO;
import br.com.instituicao.model.Doador;
import br.com.instituicao.model.Instituicao;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		InstituicaoDAO instituicaoDAO = new InstituicaoDAO();
		Instituicao instituicao = new Instituicao();
		instituicao.setNome("Nome");
		instituicao.setEndereco("Endereço x");
		instituicao.setCEP("23242343-000");
		instituicao.setOficio("oficio1");
		instituicao.setCNPJ("CNPJ");
		// instituicaoDAO.save(instituicao);
		
		
		Instituicao c1 = new Instituicao();
			c1.setNome("Editado");
			c1.setEndereco("Endereço editado");
			c1.setCEP("11111");
			c1.setOficio("oficio editado");
			c1.setCNPJ("CNPJ");
			// instituicaoDAO.update(c1);
			
			
		// instituicaoDAO.deleteByCNPJ("CNPJ");
		
		
		for(Instituicao i: instituicaoDAO.getInstituicao()) {
			System.out.println("Instituicao: " + i.getNome());
			System.out.println("Endereço: " + i.getEndereco());
			System.out.println("CEP: " + i.getCEP());
			System.out.println("Ofício: " + i.getOficio());
			System.out.println("CNPJ: " + i.getCNPJ());
			System.out.println("=============");
		}
		
		DoadorDAO doadorDAO = new DoadorDAO();
			Doador doador = new Doador();
			doador.setCPF("CPF");
			doador.setEndereco("Endereco");
			doador.setNome("Nome");
			
			doadorDAO.save(doador);
			
			Doador d1 = new Doador();
			d1.setCPF("Editado");
			d1.setEndereco("Endereço editado");
			d1.setNome("Nome Editado");
			doadorDAO.update(d1);
			
			
			for(Doador i: doadorDAO.getDoador()) {
				System.out.println("CPF: " + i.getCPF());
				System.out.println("Endereço: " + i.getEndereco());
				System.out.println("Nome: " + i.getNome());
				System.out.println("=============");
			}
			
			// doadorDAO.deleteByCPF("CPF");
			
			
		

	}

}
