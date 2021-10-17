package stream_filter_doublecollon;

import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(112,50,33,12,17,220);
        System.out.println("Imprimindo Números pares da lista: ");
        // Vamos filtrar e imprimir somente os números pares da lista
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        List<String> nomes = Arrays.asList("Paulo", "Lucas", "Mateus", "Marcos","Lisdária","Emanuelle", "Danielle");
        
        System.out.println("\nTeste Print 1: ");
        // Usando expressão lambda
        nomes.forEach(x->System.out.println(x));

        // Usando o operador double collon (::)
        System.out.println("\nTeste Print 2: ");
        nomes.forEach(System.out::println); 
        
        System.out.println();

	}
}

