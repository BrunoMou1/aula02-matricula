package br.ufrn.imd.main;

import java.util.ArrayList;
import java.util.Calendar;

import br.ufrn.imd.domino.Aluno;
import br.ufrn.imd.domino.Curso;
import br.ufrn.imd.domino.Disciplina;

public class Main {

	public static void main(String[] args) {

		
		Aluno jose = new Aluno();
		jose.setNome("José da Silva");
		jose.setMatricula("20229393939");
		
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(Calendar.DATE, 19);
		dataNascimento.set(Calendar.MONTH, 06);
		dataNascimento.set(Calendar.YEAR, 1988);
		jose.setDataNascimento(dataNascimento.getTime());
		
		Curso bti = new Curso();
		bti.setDescricao("Bacharelado em Tecnologia da Informação");
		
		jose.setCurso(bti);
		
		Disciplina imd0040 = new Disciplina();
		imd0040.setCurso(bti);
		imd0040.setDescricao("Linguagens de programação II");
		
		jose.setDisciplinas(new ArrayList<Disciplina>());
		jose.getDisciplinas().add(imd0040);
		jose.setIra(9.6);
		
		System.out.println(jose);
		
		for (Disciplina d : jose.getDisciplinas()) {
			System.out.println(d);
		}
		
		//inserção interativa desses itens 
		//regras de negócio - implementação dos métodos de solicitar matrícula
		
	}

}
