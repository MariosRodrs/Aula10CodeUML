package Exerc06;

import java.util.Date;
import java.util.List;

public class Restaurante {
	private String nome;
	private Boolean serveAlmoco;
	private Boolean serveJantar;
	private Boolean serveCafeManha;
	private Endereco endereco;
	private List<Telefone> telefones;
	private List<Pedido> pedidos;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getServeAlmoco() {
		return serveAlmoco;
	}

	public void setServeAlmoco(Boolean serveAlmoco) {
		this.serveAlmoco = serveAlmoco;
	}

	public Boolean getServeJantar() {
		return serveJantar;
	}

	public void setServeJantar(Boolean serveJantar) {
		this.serveJantar = serveJantar;
	}

	public Boolean getServeCafeManha() {
		return serveCafeManha;
	}

	public void setServeCafeManha(Boolean serveCafeManha) {
		this.serveCafeManha = serveCafeManha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	
	public void gerarRelatorioFaturam(Date dataInicial, Date dataFinal){
		
	}
	
}
