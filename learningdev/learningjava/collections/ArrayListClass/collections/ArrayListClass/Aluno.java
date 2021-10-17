package collections.ArrayListClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aluno {

	private String nome;
	private Character sexo;
	private LocalDate nascimento;

	public Aluno(String nome, Character sexo, LocalDate nascimento) {
		this.setNome(nome);
		this.setSexo(sexo);
		this.setNascimento(nascimento);
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Character getSexo() {
		return this.sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public LocalDate getNascimento() {
		return this.nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return nome;
	}

	// Mostrar Lista de alunos
	public static void mostrarAlunos(ArrayList<Aluno> a) {
		a.forEach(System.out::println);
	}

	public static void mostrarAlunosEmOrdem(ArrayList<Aluno> alunos, String ordem) {
		List<String> listaNomeAlunos = new ArrayList<>();
		alunos.forEach(aluno -> {
			listaNomeAlunos.add(aluno.getNome());
		});
		// Collections.sort - Ordena itens de uma collection
		switch (ordem) {
		case "a": {
			Collections.sort(listaNomeAlunos);
			System.out.println("\nAlunos ordenados (Ascendente)");
			listaNomeAlunos.forEach(System.out::println);
			break;
		}
		case "d": {
			System.out.println("\nAlunos ordenados (Descendente)");
			// reverseOrder - Ordena itens de uma Coleção na ordem reversa
			Collections.sort(listaNomeAlunos, Collections.reverseOrder());
			listaNomeAlunos.forEach(System.out::println);
			break;
		}
		default: {
			System.out.println("Ordem incorreta");
			break;
		}
		}
	}

	// Remover aluno
	public static void removerAluno(ArrayList<Aluno> lista, int index) {
		lista.remove(index);
	}

	// Listando alunos que começam com determinada Letra
	public static void listarPelaLetraInicial(ArrayList<Aluno> lista, String character) {
		System.out.printf("\nImprimindo só os alunos que iniciam com a letra %s\n", character);
		lista.stream().filter(aluno -> aluno.getNome().startsWith(character)).forEach(System.out::println);
	}

	// Listar por sexo
	public static void listarPorSexo(ArrayList<Aluno> alunos, Character sexo) {
		alunos.stream().filter(aluno -> aluno.getSexo().equals(sexo)).forEach(System.out::println);
	}

}
