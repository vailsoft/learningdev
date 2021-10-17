package equals;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Vailson",26,"11357263457");
        Pessoa pessoa2 = new Pessoa("Vailson",26,"11357263457");

        System.out.printf("pessoa1 == pessoa2: %b\n",pessoa1.equals(pessoa2)); // Retorna True
    }
}
