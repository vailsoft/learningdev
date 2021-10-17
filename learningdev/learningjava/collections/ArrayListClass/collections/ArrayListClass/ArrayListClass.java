package collections.ArrayListClass;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayListClass {
	public static void main(String[] args) {

		// Instanciando os Objetos Aluno
		Aluno aluno1 = new Aluno("Victória Nunes Feitosa", 'F', LocalDate.of(1997, 5, 2));
		Aluno aluno2 = new Aluno("Paulo Ricardo Silva Valentim", 'M', LocalDate.of(1987, 12, 22));
		Aluno aluno3 = new Aluno("Bruno Almeida Lima Silva", 'M', LocalDate.of(1998, 8, 15));
		Aluno aluno4 = new Aluno("Ricardo Felismino Alencar", 'M', LocalDate.of(1985, 10, 12));
		Aluno aluno5 = new Aluno("Alberta Alencar Sobral", 'F', LocalDate.of(1996, 5, 17));
		Aluno aluno6 = new Aluno("Vailson dos Santos Silva", 'M', LocalDate.of(1995, 5, 1));
		Aluno aluno7 = new Aluno("Cícera Karlieny da Silva", 'F', LocalDate.of(2002, 9, 18));

		// Criado a lista de Alunos
		List<Aluno> alunos = new ArrayList<>();

		// Adicionando alunos ao ArrayList .add()
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		alunos.add(aluno5);
		alunos.add(aluno6);
		alunos.add(aluno7);

		// Percorrendo lista
		System.out.println("Alunos adicionados a lista:");
		Aluno.mostrarAlunos((ArrayList<Aluno>) alunos);

		// Removendo Alunos da Lista .remove()
		System.out.println("\nVamos remover o Bruno da lista (Aluno index: 2)");
		Aluno.removerAluno((ArrayList<Aluno>) alunos, 2);
		Aluno.mostrarAlunos((ArrayList<Aluno>) alunos);

		/*
		 * Percorrendo lista com lambda function alunos.forEach(aluno -> {
		 * System.out.println(aluno); });
		 */

		// Acessando elementos da lista .get
		System.out.printf("\nO primeiro aluno da lista é %s\n", alunos.get(0));
		System.out.printf("O último aluno da lista é %s\n", alunos.get(alunos.size() - 1));

		// Ordenando alunos
		// Ascendente
		Aluno.mostrarAlunosEmOrdem((ArrayList<Aluno>) alunos, "a");
		// Descendente
		Aluno.mostrarAlunosEmOrdem((ArrayList<Aluno>) alunos, "d");

		// Filtrando
		System.out.println("\nImprimindo só as mulheres");
		Aluno.listarPorSexo((ArrayList<Aluno>) alunos, 'F');

		System.out.println("\nImprimindo só os homens");
		Aluno.listarPorSexo((ArrayList<Aluno>) alunos, 'M');

		// Listando alunos que começam com determinada Letra
		Aluno.listarPelaLetraInicial((ArrayList<Aluno>) alunos, "V");

	}
}
