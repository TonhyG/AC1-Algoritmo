package Aula4.Aula4;
import java.util.Scanner;

public class PerimetroRetangulo {

    public static void main(String[] args) {

        //Informa sobre o proposito do programa
        System.out.println("Este programa informa sobre o perimetro de um retandulo.");

        //Solicita e recebe o numero da base e altura desejada
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero da base: ");
        int NumeroBase = scanner.nextInt();
        System.out.print("Digite o numero da altura: ");
        int NumeroAltura = scanner.nextInt();

        //Calcula e exibe o perimetro do retangulo
        int ResultadoPerimetro = 2 * (NumeroBase + NumeroAltura);
        System.out.println("O perimetro =" + ResultadoPerimetro);

        //Fecha scanner para não ter vazamento de recurso
        scanner.close();
    }
}

