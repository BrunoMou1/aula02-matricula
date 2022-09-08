package br.ufrn.imd.main;

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
		imd0040.setId(1);
		imd0040.setCurso(bti);
		imd0040.setDescricao("Linguagens de programação II");
		
		jose.solicitarMatricula(imd0040);
		jose.setIra(9.6);
		
		Disciplina imd0404 = new Disciplina();
		imd0404.setId(2);
		imd0404.setCurso(bti);
		imd0404.setDescricao("Web I");
		
		jose.solicitarMatricula(imd0404);
		
		System.out.println(jose);
		
		
		for (Disciplina d : jose.listarDisciplinas()) {
			System.out.println(d);
		}
		
		Disciplina imd0404c = new Disciplina();
		imd0404c.setId(2);
		imd0404c.setCurso(bti);
		imd0404c.setDescricao("Web I");
		
		jose.trancarMatricula(imd0404c);
		
		for (Disciplina d : jose.listarDisciplinas()) {
			System.out.println(d);
		}
		
		//inserção interativa desses itens 
		//regras de negócio - implementação dos métodos de solicitar matrícula
		
	}

}
