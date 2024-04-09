//importando bibliotecas
import java.util.Scanner;
public class DesafiosAula03 {
    public static void main(String[] args) {
        /*
        1. Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número
        positivo", caso contrário, exiba "Número negativo".
         */
        System.out.println("1. Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, " +
                "exiba \"Número positivo\", caso contrário, exiba \"Número negativo\".");
        //iniciando variável para leitura
        Scanner reading = new Scanner(System.in);
        //solicitando ao usuário o número
        System.out.printf("Informe um número: ");
        double number = reading.nextDouble();
        //condicao para verificar se é positivo ou negativo
        if (number > 0) {
            System.out.println("Você informou um número positivo.");
        } else {
            System.out.println("Você informou um número negativo.");
        }
        /*
        2.  Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando
        se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
         */
        System.out.println("2. Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma " +
                "mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.");
        //solicitando ao usuário os dados
        System.out.printf("Informe um número: ");
        double number1 = reading.nextDouble();
        System.out.printf("Informe outro número: ");
        double number2 = reading.nextDouble();
        //condição para verificar qual número é maior
        if (number1 > number2) {
            System.out.println(String.format("O número %.2f é maior.", number1));
        } else {
            if (number2 > number1) {
                System.out.println(String.format("O número %.2f é maior.", number2));
            } else {
                System.out.println("Os números são iguais.");
            }
        }
        /*
        3. Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do
        círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
         */
        System.out.printf("3. Crie um menu que oferece duas opções ao usuário: \"1. Calcular área do quadrado\" e \"2" +
                ". Calcular área do círculo\". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.");
        //solicitando ao usuário para selecionar uma opcao
        System.out.printf("""
    MENU PRINCIPAL
    1 - Calcular a área do quadrado
    2 - Calcular a área do círculo
    """);
        System.out.printf("Digite o número desejado para acessar a função: ");
        //leitura do valor digitado
        int numberSelected = reading.nextInt();
        //verificando se o valor informado é válido
        while (numberSelected != 1 && numberSelected != 2) {
            System.out.printf("""
                    Opção inválida.
                    Informe um valor válido para continuar...
                    MENU PRINCIPAL
                    1 - Calcular a área do quadrado
                    2 - Calcular a área do círculo
                    """);
            System.out.printf("Digite o número desejado para acessar a função: ");
            numberSelected = reading.nextInt();
        }
        //cálculo da áre do quadrado
         if (numberSelected == 1) {
             System.out.printf("Informe o valor de um dos lados do quadrado: ");
             double side = reading.nextDouble();
             double squareArea = side * side;
             System.out.println("O valor de área do quadrado é: " + squareArea);
         } else {
             //cálculo da área do círculo
             if (numberSelected == 2) {
                 System.out.printf("Informe o valor de raio do círculo: ");
                 double circleRadius = reading.nextDouble();
                 double circleArea = Math.PI * Math.pow(circleRadius, 2);
                 System.out.println("O valor de área do círculo é: " + circleArea);
             } else {
                 //mensagem de erro
                 System.out.println("Opção inválida.");
             }
         }
         /*
         4. Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
          */
        System.out.println("4. Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.");
        //solicitando ao usuário que informe um número
        System.out.printf("Informe um número para exibir a tabuada: ");
        int multiplicationNumber = reading.nextInt();
        //exibindo a tabuada
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d X %d = %d", multiplicationNumber, i, (multiplicationNumber*i)));
        }
        /*
        Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar
         e exiba uma mensagem correspondente.
         */
        System.out.println("5. Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se " +
                "o número é par ou ímpar e exiba uma mensagem correspondente.");
        //solicitando o número para o usuário
        System.out.printf("Informe um número inteiro: ");
        int evenOddNumber = reading.nextInt();
        //verificando se o número informado é par ou ímpar
        if (evenOddNumber % 2 == 0) {
            System.out.println("O número informado é par.");
        } else {
            System.out.println("O número informado é ímpar.");
        }
        /*
        6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
         */
        System.out.println("6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.");
        //solicitando ao usuário o número
        System.out.printf("Informe um número para calcular o fatorial: ");
        int numberFactorial = reading.nextInt();
        int factorial = 1;
        if (numberFactorial == 0) {
            System.out.println("O valor fatorial é 0");
        } else {
            for (int i = 1; i <= numberFactorial; i++) {
                factorial *= i;
            }
            System.out.println(String.format("O valor fatorial  é %d", factorial));
        }
    }
}
