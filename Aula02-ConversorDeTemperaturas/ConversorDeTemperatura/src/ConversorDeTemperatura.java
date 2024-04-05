/*
Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit. Utilize variáveis para representar
 os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit.
 Fórmula: (temperatura + 1.8) + 32.]
 Crie uma variável inteira para exibir a temperatura em Fahrenheit sem casas decimais.
 */

//importando a biblioteca para armazenar o valor digitado
import java.util.Scanner;

public class ConversorDeTemperatura {

    public static void main (String[] args) {
        //variável para armazenar o valor digitado
        Scanner grauCelsius = new Scanner(System.in);
        //mensagem solicitando a temperatura em graus celsius
        System.out.printf("Informe a temperatura em graus Celsius: ");
        //armazenando o valor recebido na variável para conversão
        double tempCelsius = grauCelsius.nextDouble();
        //convertendo o valor para fahreheint
        double tempFahrenheit = (tempCelsius * 1.8) + 32;
        //convertendo o valor de casas decimais para número inteiro
        int exibeConversao = (int) tempFahrenheit;
        //exibindo dados na tela
        System.out.println(String.format("""
                Temperatura em Celsius: %.2f
                Temperatura em Fahrenheit: %.2f
                Temperadura Fahrenheit sem casas decimais: %d""", tempCelsius, tempFahrenheit, exibeConversao));
        grauCelsius.close();
    }
}
