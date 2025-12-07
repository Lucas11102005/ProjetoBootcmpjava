
import java.util.Scanner;

public class BancoTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome");
        String nomecliente = scanner.nextLine();

        System.out.println("Qual sua agência?");
        String agencia = scanner.nextLine();

        System.out.println("Informe o número da sua conta");
        int numeroconta = scanner.nextInt();

        double saldo = 200;
        System.out.println("Seu saldo disponível para saque:R$ " +  saldo);


    }
}
