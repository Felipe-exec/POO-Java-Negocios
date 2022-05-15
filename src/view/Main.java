package view;

import model.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Empresa comidasltda = new Empresa("comidasLTDA", "30.450.325/0001-20");
		Funcionario renato = new Funcionario("Renato");
		Funcionario levi = new Funcionario("Levi");
		Funcionario caio = new Funcionario("Caio");
		
		renato.setCpf("152.385.075-24");
		renato.setSalario(3500.00);

		levi.setCpf("731.355.300-06");
		levi.setSalario(2800.00);

		caio.setCpf("900.801.221-82");
		caio.setSalario(2800.00);
		
		
		comidasltda.setFuncionario(renato);
		comidasltda.setFuncionario(levi);
		comidasltda.setFuncionario(caio);
		
		System.out.println("Nome: " + renato.getNome());
		System.out.println("CPF: " + renato.getCpf());
		System.out.println("Salario: " + renato.getSalario());
		
		System.out.println("-------------------------------------");
		
		System.out.println("Nome: " + levi.getNome());
		System.out.println("CPF: " + levi.getCpf());
		System.out.println("Salario: " + levi.getSalario());
		
		System.out.println("-------------------------------------");
		
		System.out.println("Nome: " + caio.getNome());
		System.out.println("CPF: " + caio.getCpf());
		System.out.println("Salario: " + caio.getSalario());
		
		System.out.println("-------------------------------------");
		
		System.out.println("Nome da empresa: " + comidasltda.getNome());
		System.out.println("CNPJ: " + comidasltda.getCnpj());
		
		
		for (Funcionario funcionario : comidasltda.getFuncionario()) 
		{
            System.out.println(funcionario.getNome());
		} 
	}

}
