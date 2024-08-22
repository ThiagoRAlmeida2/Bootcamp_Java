package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando e recebendo os dados do usuário
        System.out.print("Por favor, digite o número da Agência: ");
        int agencia = scanner.nextInt();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        scanner.nextLine(); // Limpeza do buffer do Scanner

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Fechar o Scanner
        scanner.close();

        // Exibindo a mensagem final com as informações inseridas
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numero
                + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);
    }
}

