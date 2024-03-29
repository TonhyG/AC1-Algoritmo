package Aula5;
import java.util.Scanner;

public class MediaFinal {
    
    public static void main(String[] args) {
        
        //Informa o usuário o proposito do programa
        System.out.println("Este programa ira fazer a somas das suas notas e mostrar qual será sua média final no semestre.");
    
        //Solicita e recebe as notas do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota da AC1: ");
        double AC1 = scanner.nextDouble();

        System.out.print("Digite a nota da AC2: ");
        double AC2 = scanner.nextDouble();

        System.out.print("Digite a nota da AG: ");
        double AG = scanner.nextDouble();

        System.out.print("Digite a nota da AF: ");
        double AF = scanner.nextDouble();

        //Ira fazer o cálculo das notas e enviar a média final
        double NotaFinal = (AC1 * 0.15) + (AC2 * 0.30) + (AG * 0.10) + (AF * 0.45);
        System.out.println("A sua nota média neste semestre será =" + NotaFinal);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();

        
        

    }

}
