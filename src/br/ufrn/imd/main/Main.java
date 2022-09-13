package br.ufrn.imd.main;

import java.util.Scanner;

import br.ufrn.imd.domino.Aluno;
import br.ufrn.imd.domino.Curso;
import br.ufrn.imd.domino.Disciplina;


public class Main {

	public static void main(String[] args) {

		Aluno luiz = new Aluno();
		Curso adm = new Curso();
		Disciplina adm0169 = new Disciplina();
		Disciplina adm0170 = new Disciplina();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome do aluno: ");
		luiz.setNome(scanner.nextLine());
		System.out.println("Digite a matricula do aluno: ");
		luiz.setMatricula(scanner.nextLine());
		System.out.println("Digite o cpf do aluno: ");
		luiz.setCpf(scanner.nextLine());
		System.out.println("Digite o ira do aluno: ");
		luiz.setIra(scanner.nextDouble());

				
		System.out.println("Digite o nome do curso: ");
		scanner.nextLine();
		adm.setDescricao(scanner.nextLine());

		luiz.setCurso(adm);

		System.out.println("Digite a descriçao da disciplina: ");
		adm0169.setDescricao(scanner.nextLine());
		adm0169.setCurso(adm);
		adm0169.setId(1);

		luiz.solicitarMatricula(adm0169);

		for (Disciplina d : luiz.listarDisciplinas()) {
			System.out.println(d);
		}

		System.out.println("Digite a descriçao da disciplina: ");
		adm0170.setDescricao(scanner.nextLine());
		adm0170.setCurso(adm);
		adm0170.setId(2);

		luiz.solicitarMatricula(adm0170);
		luiz.trancarMatricula(adm0169);

		for (Disciplina d : luiz.listarDisciplinas()) {
			System.out.println(d);
		}

		scanner.close();
	}
}
