package br.com.glandata.main;

import br.com.glandata.model.Colaborador;
import br.com.glandata.model.FolhaPagamento;

public class GeraFolha {

	public static void main(String[] args) {

		Colaborador colaborador = new Colaborador("Camila", 123456);

		FolhaPagamento folha = new FolhaPagamento(colaborador);
		folha.setDiasTrabalhados(31);
		folha.setFaltas(1);
		folha.setSalarioDia(47.50f);

		System.out.println("O salário do colaborador " + folha.getColaborador().getNome() + " é: R$" + folha.salario());

	}

}
