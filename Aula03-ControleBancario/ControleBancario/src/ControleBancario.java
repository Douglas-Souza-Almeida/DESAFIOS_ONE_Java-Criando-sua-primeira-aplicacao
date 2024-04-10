//importando bibliotecas
import java.util.Scanner;

public class ControleBancario {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in); //iniciando scanner
        System.out.println("""
        +-------------------------------------------------------------------------------+
                                    SISTEMA DE CONTROLE BANCÁRIO
        =================================================================================
        """);
        System.out.printf("Informe o seu nome completo: ");
        String name = reading.nextLine(); //variável para salvar o nome de usuário
        System.out.println("""
                ---------------------------------------------------------------------------------
                Tipos de contas bancárias diponíveis para cadastro:
                1 - Corrente
                2 - Poupança
                ---------------------------------------------------------------------------------""");
        System.out.printf("Informe a opção desejada para o cadastro de sua conta: ");
        int accountType = reading.nextInt(); //variável para identificar o tipo de conta
        while (accountType != 1 && accountType != 2) {//validação da opção digitada para o tipo de conta
            System.out.println("Opção inválida...");
            System.out.println("""
                ---------------------------------------------------------------------------------
                Tipos de contas bancárias diponíveis para cadastro:
                1 - Corrente
                2 - Poupança
                ---------------------------------------------------------------------------------""");
            System.out.printf("Informe a opção desejada para o cadastro de sua conta: ");
            accountType = reading.nextInt();
        }
        System.out.printf("Informe o saldo inicial para esta conta: R$ ");
        double initialValue = reading.nextDouble(); //variável para guardar informações do saldo inicial da conta
        System.out.println(String.format("Olá, %s", name));
        double deposit = 0; //variável para salvar dados de depósito
        double withdrawal = 0; //variável para salvar dados de retirada
        double finalValue = initialValue; //variável para armazenar os dados de saldo em conta bancária

       HomeScreen.homeScreen(name, accountType, finalValue); //exibindo dados cadastrais em tela

       boolean exit = false; //variável para controle da condição de repetição

       while(!exit) {
           Menu.menu();//função para exibir o menu principal
           int optionMenu = reading.nextInt();
           switch (optionMenu) {
               case 1: //exibir dados cadastrais
                   HomeScreen.homeScreen(name, accountType, finalValue);
                   System.out.println("Pressione ENTER para retornar ao menu principal");
                   reading.nextLine(); //nova linha pendente para aguardar ação da tecla Enter
                   reading.nextLine(); //aguardar até que o usuário pressione
                   break;
               case 2: //exibir saldo em conta
                   System.out.println("SALDO EM CONTA: R$ " + finalValue);
                   break;
               case 3: //realizar depósito
                   System.out.printf("Informe o valor a ser depositado: R$ ");
                   deposit = reading.nextDouble();
                   finalValue += deposit;
                   System.out.println(String.format("""
                   DEPÓSITO REALIZADO!
                   SALDO EM CONTA: R$ %.2f""", finalValue));
                   break;
               case 4: //realizar retirada
                   System.out.printf("Informe o valor a ser retirado: R$ ");
                   withdrawal = reading.nextDouble();
                   if ((finalValue - withdrawal) < 0) {
                       System.out.println("[ERRO!]\n*** NÃO HÁ SALDO SUFICIENTE PARA ESTA TRANSAÇÃO ***");
                       System.out.println("Pressione ENTER para retornar ao menu principal");
                       reading.nextLine(); //nova linha pendente para aguardar ação da tecla Enter
                       reading.nextLine(); //aguardar até que o usuário pressione
                   } else {
                       finalValue -= withdrawal;
                       System.out.println(String.format("""
                   RETIRADA REALIZADA!
                   SALDO EM CONTA: R$ %.2f""", finalValue));
                   }
                   break;
               case 5: //sair
                   System.out.println("Obrigado por usar nosso sistema bancário.");
                   exit = true;
                   break;
               default:
                   System.out.println("Opção inválida...\n");
           }
       }
       reading.close();
    }
}
