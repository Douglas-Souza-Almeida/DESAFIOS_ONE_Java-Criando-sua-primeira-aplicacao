//importando biblioteca scanner
import java.util.Scanner;

public class DesafiosAula01 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        /*
        Crie um projeto Java no IntelliJ que deve conter uma classe chamada Perfil, com o método main, que ao
        executar deverá imprimir um cumprimento personalizado no console. Por exemplo, "Olá, [Seu Nome]!".
        */
        System.out.println("1. Crie um projeto Java no IntelliJ que deve conter uma classe chamada Perfil, com o " +
                "método " +
                "main, que ao executar deverá imprimir um cumprimento personalizado no console. Por exemplo, \"Olá, " +
                "[Seu Nome]!\".");
        //solicitando o nome ao usuário
        System.out.printf("Informe seu nome: ");
        String name = input.next();
        //criando objeto Perfil
        Perfil greeting = new Perfil();
        //exibindo mensagem na tela
        System.out.println(greeting.main(name));
        System.out.println("""
                
                """);
        /*
        Modifique o programa para imprimir uma segunda mensagem de cumprimento personalizada. Por exemplo, "Tudo bem?".
         */
        System.out.println("2. Modifique o programa para imprimir uma segunda mensagem de cumprimento personalizada. " +
                "Por" +
                " exemplo, \"Tudo bem?\".");
        //exibindo mensagem na tela
        System.out.println(greeting.main(name) + " Tudo bem?");
        System.out.println("""
                
                """);
        /*
        Crie uma classe chamada Estudos para imprimir anotações de estudos no console.
         */
        System.out.println("3. Crie uma classe chamada Estudos para imprimir anotações de estudos no console.");
        //solicitando informações para o usuário
        System.out.printf("Informe a disciplina: ");
        //salvando informações
        String discipline = input.next();
        input.nextLine();
        System.out.printf("Insira as anotações: ");
        //salvando informações
        String text = input.nextLine();
        //criando objeto
        Estudos notes = new Estudos();
        //exibindo dados na tela
        System.out.println("""
        SUAS ANOTAÇÕES
        """ + notes.annotation(discipline, text));
        System.out.println("""
                
                """);
        /*
        Crie uma classe Soma em Java para imprimir no console o resultado da operação 10 + 5. Certifique-se de que o
        resultado seja exibido sem o uso de aspas, apresentando o valor "15" ao invés da expressão "10+5".
         */
        System.out.println("4. Crie uma classe Soma em Java para imprimir no console o resultado da operação 10 + 5. " +
                "Certifique-se de que o resultado seja exibido sem o uso de aspas, apresentando o valor \"15\" ao " +
                "invés da expressão \"10+5\".");
        //criando objeto
        Soma addition = new Soma();
        //constantes
        int A = 10;
        int B = 5;
        //exibindo dados na tela
        System.out.println(String.format("%d + %d = %d", A, B, addition.sum(A, B)));
        System.out.println("""
                
                """);
        /*
        Crie uma classe Subtração para imprimir o resultado de 10 - 5 no console.
         */
        System.out.println("5. Crie uma classe Subtração para imprimir o resultado de 10 - 5 no console.");
        //criando objeto
        Subtracao reduction = new Subtracao();
        //Constantes
        int C = 10;
        int D = 5;
        //exbindo dados na tela
        System.out.println(String.format("%d - %d = %d", C, D, reduction.subtraction(C, D)));
        input.close();
    }
}
