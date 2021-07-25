package digiteseunome;
import java.util.Scanner;

public class ProgramaPessoa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Digite seu nome:");
        pessoa.setName(input.nextLine());
        System.out.printf("Olá, %s!",pessoa.getName());
    }
}
