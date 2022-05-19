package model;

import java.util.List;
import java.util.ArrayList;

public class Empresa 
{
	private String nome;
	private String cnpj;
	private List<Funcionario> funcionario;
	
	public Empresa(){ 
		this.funcionario = new ArrayList<Funcionario>();
	}
	
	public Empresa(String nome, String cnpj)
	{
		this.nome = nome;
		this.cnpj = cnpj;
		this.funcionario = new ArrayList<Funcionario>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario.add(funcionario);
	}
	
}
