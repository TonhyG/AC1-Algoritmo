package Aula4.Aula4;
import java.util.Scanner;

public class Areaquadrado {
    public static void main(String[] args) {
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza o calculo da area de um quadrado.");

        // Solicita e recebe o número do lado do quadrado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero do lado: ");
        int Numerolado = scanner.nextInt();

        // Calcular a area do quadrado 
        int resultadoarea = 2 * Numerolado;

        // Exibe o resultado para o usuário
        System.out.println("A área do quadrado = " + resultadoarea);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}   
