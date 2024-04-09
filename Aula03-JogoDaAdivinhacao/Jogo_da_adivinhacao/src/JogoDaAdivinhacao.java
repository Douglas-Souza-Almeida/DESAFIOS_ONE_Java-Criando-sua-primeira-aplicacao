//importando bibliotecas
import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        /*
        Agora é com você! Pratique os conceitos que foram ensinados ao longo dessa aula com o seguinte desafio: Crie
        um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para
        que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o
        número digitado pelo usuário é maior ou menor do que o número gerado.
         */
        //iniciando o scanner
        Scanner reading = new  Scanner(System.in);
        //variavel para realizar a leitura
        int randomNumber = new Random().nextInt(100);
        //somatória de tentativas
        int sumOfAttempt = 1;
        //solicitando ao usuário para que informe um número
        System.out.printf("Informe um número: ");
        //ralizando a leitura do número digitado e salvando o valor em variável
        int numberTyped = reading.nextInt();
        //inciando o laço de repetição até que o número correto seja digitado
        while(numberTyped != randomNumber) {
            //condicao para verificar se o número digitado é maior ou menor
            if (numberTyped > randomNumber) {
                System.out.println("O número informado é maior que o número secreto.");
            } else {
                System.out.println("O número informado é menor que o número secreto.");
            }
            //atualizando a somatória de tentativas
            sumOfAttempt++;
            //condição para verificar o limite de tentativas
            if (sumOfAttempt == 5) {
                System.out.printf("Você atingiu o limite de tentativas");
                break;
            } else {
                //solicitando ao usuário um novo número
                System.out.printf("Informe um número: ");
                numberTyped = reading.nextInt();
            }
        }
        //mensagem de acerto
        System.out.println(String.format("Parabéns! Você acertou o número secreto com %d tentativas.", sumOfAttempt));
        //finalizando o scanner
        reading.close();
    }
}
