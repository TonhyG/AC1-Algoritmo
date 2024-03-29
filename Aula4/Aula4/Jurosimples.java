package Aula4.Aula4;
import java.util.Scanner;

public class Jurosimples {
    public static void main(String[] args) {
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza o calculo de juro simples.");

        // Solicita e recebe numero do capital
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero do capital: ");
        int numerocapital = scanner.nextInt();

        System.out.print("Digite o numero da taxa de juros: ");
        int numerotaxajuros = scanner.nextInt();

        System.out.print("Digite o numero do tempo: ");
        int numerotempo = scanner.nextInt();

        // Calcular juros simples 
        int resultadojurosimples = numerocapital * numerotaxajuros * numerotempo;

        // Exibe o resultado para o usuário
        System.out.println("O juros simples é " + resultadojurosimples);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}   
