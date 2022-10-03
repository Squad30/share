package br.com.instituicao.model;

public class Instituicao {
	private String Nome;
	private String Endereco;
	private String CEP;
	private String Oficio;
	private String CNPJ;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getOficio() {
		return Oficio;
	}
	public void setOficio(String oficio) {
		Oficio = oficio;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
}
