package br.com.deguste.model.entity;

import java.util.Date;

import javax.faces.bean.ManagedBean;
@ManagedBean
public class Funcionario {
	private String nome;
	private Date dataAdmissao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	
}
