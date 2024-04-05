//importando a biblioteca para receber os dados digitados
import java.util.Scanner;


public class Desafios {
    public static void main (String[] args) {
        /*
        1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.
         */
        System.out.println("1. Crie um programa que realize a média de duas notas decimais e exiba o resultado");
        //iniciando o scanner para receber os dados
        Scanner dados = new Scanner(System.in);
        //mensagem solicitando ao usuário para informar o valor da nota
        System.out.printf("Informe a primeira nota: ");
        //armazenamento do valor na variável para calculo
        double nota1 = dados.nextDouble();
        //mensagem solicitando ao usuário para informar o valor da nota
        System.out.printf("Informe a segunda nota: ");
        //armazenamento do valor na variável para cálculo
        double nota2 = dados.nextDouble();
        //calculando a media das notas
        double media = (nota1 + nota2) / 2;
        //exibindo os dados na tela
        System.out.println(String.format("""
                Nota 1 = %.2f
                Nota 2 = %.2f
                Média entre as notas = %.2f""", nota1, nota2, media));
        /*
    2. Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e
    imprima o resultado.
     */
        System.out.println("""
                                
                """);
        System.out.println("2. Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da " +
                "variável double para int e imprima o resultado");
        //mensagem solicitando ao usuário para inserir um valor do tipo double
        System.out.printf ("Insira um número para uma variável com casas decimais: ");
        //realizando a leitura do valor informado
        double variavelDouble = dados.nextDouble();
        //mensagem solicitando ao usuario para inserir um valor do tipo int
        System.out.printf("Insira um número inteiro para uma variável: ");
        //realizando a leitura do valor informado
        int variavelInt = dados.nextInt();
        //realizando o cast das variáveis
        double variavelCast = variavelInt + variavelDouble;
        //exibindo os dados em tela
        System.out.println(String.format("""
                Valor double: %.2f
                Valor inteiro: %d
                Valor de cast: %.2f""", variavelDouble, variavelInt, variavelCast));
        /*
        Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas
        variáveis e concatene-as em uma mensagem
         */
        System.out.println("""
                                
                """);
        System.out.println("3. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). " +
                "Atribua valores a essas variáveis e concatene-as em uma mensagem");
        //mensagem solicitando ao usuário para inserir uma letra
        System.out.printf("Informe uma letra: ");
        //armazenando a letra em uma variável
        String letra = dados.next();
        //selecionando a primeira letra para obter-se o tipo char
        char caractere = letra.charAt(0);
        //mensagem solicitando ao usuário para inserir uma palavra
        System.out.printf("Digite uma palavra: ");
        //armazenando a palavra em variável
        String palavra = dados.next();
        //exibindo os dados em uma frase em tela
        System.out.println(String.format("Você digitou a letra \"%c\" e a palavra \"%s\"", caractere, palavra));
        /*
        Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor
        total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem
         */
        System.out.println("""
                               
                """);
        System.out.println("4. Declare uma variável do tipo double precoProduto e uma variável do tipo int " +
                "(quantidade). " +
                "Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em " +
                "uma mensagem");
        //solicitando os dados ao usuário
        System.out.printf("Informe o valor unitário do produto: ");
        //realizando a leitura do valor informado
        double precoProduto = dados.nextDouble();
        //solicitando ao usuário a quantidade
        System.out.printf("Informe a quantidade: ");
        //realizando a leitura da quantidade informada
        int quantidade = dados.nextInt();
        //calculando valor total
        double total = precoProduto * quantidade;
        //exibindo dados em tela
        System.out.println(String.format("""
                Quantidade: %d
                Valor unitário: %.2f
                Valor total: %.2f""", quantidade, precoProduto, total));
        /*
        Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere
        que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e
        imprima o resultado formatado
         */
        System.out.println("""
                                
                """);
        System.out.println("5. Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a " +
                "essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do " +
                "valor em dólares para reais e imprima o resultado formatado");
        //solicitando o valor em dólares ao usuário
        System.out.printf("Informe o valor em dólares: ");
        //realizando a leitura do valor informado
        double valorEmDolares = dados.nextDouble();
        //instanciando a classe conversor
        ConversorDolar conversor = new ConversorDolar();
        //calculando a conversão
        double valorEmReais = conversor.converterDolarParaReal (valorEmDolares);
        //exibindo os dados na tela
        System.out.println(String.format("""
                Valor em dólares: U$ %.2f
                Valor em Reais: R$ %.2f""", valorEmDolares, valorEmReais));
        /*
        Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o
         preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua
         um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais,
          aplique-o ao preço original e imprima o novo preço com desconto
         */
        System.out.println("""
                                
                """);
        System.out.println("6. Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa " +
                "variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo " +
                "double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para" +
                " 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com " +
                "deconto");
        //solicitando ao usuário que informe o valor original do produto
        System.out.printf("Informe o valor original do produto: ");
        //realizando a leitura do valor
        double precoOriginal = dados.nextDouble();
        //solicitando ao usuário para que informe o percentual de desconto
        System.out.printf("Informe o percentual de desconto: ");
        //realizando a leitura do valor
        double percentualDesconto = dados.nextDouble();
        //instanciando a classe para calcular os valores
        CalcularDesconto calcularDesconto = new CalcularDesconto();
        //cálculo do valor final
        double valorFinal = calcularDesconto.calcularValorFinal(precoOriginal, percentualDesconto);
        //cálculo do valor de desconto
        double valorDesconto = calcularDesconto.calcularValorDesconto(precoOriginal, percentualDesconto);
        //exibindo valores na tela
        System.out.println(String.format("""
                Valor original: R$ %.2f
                Percentual de desconto: R$ %.2f
                Valor de desconto: R$ %.2f
                Valor final: R$ %.2f""", precoOriginal, percentualDesconto, valorDesconto, valorFinal));
        dados.close();
    }
}
