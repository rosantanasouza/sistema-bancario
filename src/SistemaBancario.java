import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeCliente = "John Doe";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        System.out.println("****iNFORMAÇÃO CLIENTE********");
        System.out.println("CLIENTE:        " + nomeCliente);
        System.out.println("TIPO CONTA:     " + tipoConta);
        System.out.println("SALDO:          " + saldo);
        System.out.println("******************************");

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("""                
                    **********MENU****************
                    DIGITE A OPÇÃO DA OPERAÇÃO:
                    1 - Consultar saldo
                    2 - Realizar saque
                    3 - Depositar valor
                    4 - Sair
                    ******************************
                    """);
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("--> Saldo atual: " + saldo + "\n");
                    break;

                case 2:
                    System.out.println("Digite o valor que deseja sacar:");
                    double valorSaque = scan.nextDouble();
                    if (valorSaque > saldo) {
                        System.out.println("Não é possível sacar um valor maior do que o saldo.\n" +
                                "Seu saldo é: " + saldo + "\n");
                    } else {
                        saldo = saldo - valorSaque;
                        System.out.println("--> Saque realizado com sucesso.");
                        System.out.println("Saldo atual: " + saldo + "\n");
                    }
                    break;

                case 3:
                    System.out.println("Digite o valor que deseja depositar:");
                    double valorDeposito = scan.nextDouble();
                    saldo = saldo + valorDeposito;
                    System.out.println("--> Deposito realizado com sucesso.");
                    System.out.println("Saldo atual: " + saldo + "\n");
                    break;

                case 4:
                    System.out.println("Conta bancária desconectada com segurança.");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, digite uma opção válida.\n");
                    break;
            }
        }
    }
}
