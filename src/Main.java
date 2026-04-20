import java.util.Scanner;
import util.Conta;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do titular: ");
        String nome = sc.nextLine();

        Conta conta = new Conta(0, nome);

        int opcao;

        do {
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Valor: ");
                double valor = sc.nextDouble();
                conta.depositar(valor);

            } else if (opcao == 2) {
                System.out.print("Valor: ");
                double valor = sc.nextDouble();
                conta.sacar(valor);

            } else if (opcao == 3) {
                System.out.println("Saldo: " + conta.getSaldo());
            }

        } while (opcao != 0);

        sc.close();
    }
}