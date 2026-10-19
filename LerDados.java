 import java.util.Scanner;
 public class LerDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = teclado.nextLine();

        System.out.print("Idade: ");
        int idade = teclado.nextInt();

        System.out.print("Altura (m): ");
        double altura = teclado.nextDouble();

        System.out.println("Olá," + nome + "! Tem "+idade+" anos.");
        teclado.close();
    }
 }
