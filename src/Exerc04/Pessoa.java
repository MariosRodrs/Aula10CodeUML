package Exerc04;

import java.util.List;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private Sexo sexo;
	private List<Telefone> telefones;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public List<Telefone> getTelefone() {
		return telefones;
	}
	public void setTelefone(List<Telefone> telefone) {
		this.telefones = telefone;
	}
	
}
