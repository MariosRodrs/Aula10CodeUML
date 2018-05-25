package Exerc08;

import java.util.Date;
import java.util.List;

public class Banco {
	private String nome;
	private Date dataFuncacao;
	private String publico;
	private List<Conta> contas;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataFuncacao() {
		return dataFuncacao;
	}

	public void setDataFuncacao(Date dataFuncacao) {
		this.dataFuncacao = dataFuncacao;
	}

	public String getPublico() {
		return publico;
	}

	public void setPublico(String publico) {
		this.publico = publico;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	
	public Boolean isPublico() {
		return isPublico();
	}

}
