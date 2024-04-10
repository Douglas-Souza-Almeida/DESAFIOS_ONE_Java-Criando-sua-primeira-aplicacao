public class Menu {
    //função para exibir o menu principal da aplicação
    public static void menu() {
        System.out.println("""
                                              MENU PRINCIPAL
                =================================================================================
                1 - EXIBIR DADOS CADASTRAIS
                2 - SALDO EM CONTA
                3 - DEPÓSITO
                4 - RETIRADA
                5 - SAIR
                ---------------------------------------------------------------------------------""");
        System.out.printf("Informe a opção desejada: ");
    }
}
