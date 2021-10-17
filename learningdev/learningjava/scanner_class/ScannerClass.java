package scanner_class;

import java.util.Scanner;
public class ScannerClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        String s1, s2, s3;
        
        System.out.print("Digite um número Inteiro: ");
        x = sc.nextInt();
        sc.nextLine(); // Sempre após o uso um comando diferente do nextLine() adiciona-se um nextLine() para que o programa funcione de forma esperada.
        System.out.print("String 1: ");
        s1 = sc.nextLine();
        System.out.print("String 2: ");
        s2 = sc.nextLine();
        System.out.print("String 3: ");
        s3 = sc.nextLine();

        System.out.println("\nDados Digitados:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        sc.close();
  
    }

}
