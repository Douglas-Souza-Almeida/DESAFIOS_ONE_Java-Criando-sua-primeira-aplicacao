public class HomeScreen {
    //função para exibir a tela de dados cadastrais
    public static void homeScreen (String name, int accountType, double finalValue) {
        String account = "";
        switch (accountType) {
            case 1:
                account = "Corrente";
                break;
            case 2:
                account = "Poupança";
                break;
        }

        System.out.println(String.format("""
                +-------------------------------------------------------------------------------+
                                              DADOS DO CLIENTE
                =================================================================================
                NOME:             %s
                TIPO DE CONTA:    %s
                SALDO:            R$ %.2f
                +-------------------------------------------------------------------------------+
                """, name, account, finalValue));
    }
}
