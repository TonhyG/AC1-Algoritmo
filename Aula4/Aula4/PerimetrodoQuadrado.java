package Aula4.Aula4;
import java.util.Scanner;

public class PerimetrodoQuadrado {
    
    public static void main(String[] args) {
        
        //Informa qual o proposito do programa
        System.out.println("Este rpograma ira informa-lo qual o perimetro do quadrado.");

        //Solicita e recebe o numero dado pelo usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o comprimento do lado: ");
        int ComprimentoLado = scanner.nextInt();

        //Calcula e exibe o perimetro do quadrado
        int ResultadodoPerimetro = 4* ComprimentoLado;
        System.out.println("O perimetro do quadrado é = " + ResultadodoPerimetro);

        //Fecha scanner para não ter vazamento de recurso
         scanner.close();
    }

}
