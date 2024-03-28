import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String nome = "Jeferson Rodrigues";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("******************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n******************************");

        String menu = """
                
                **Digite sua opção**
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
      
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("Seu saldo atual é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que você deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não é possivel realizar essa transação, devido o saldo ser insuficiente.");
                }else {
                    saldo -= valor;
                    System.out.println("Seu saldo atual é: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Qual o valor à receber? ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Seu saldo atual é: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Digite um número válido.");
            }
        }

        System.out.println("Fim do Programa.");
    }
}
