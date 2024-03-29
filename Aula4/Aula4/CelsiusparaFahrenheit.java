package Aula4.Aula4;
import java.util.Scanner;

public class CelsiusparaFahrenheit{

    public static void main(String[] args){

        //Informa o proposito do programa
        System.out.println("Este programa realiza a conversão de celsius para fahrenheit.");

        //Solicita e rebebe a temperatura em celsius
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em celsius que deseja converter para fahrenheit: ");
        int TemperaturaCelsius = scanner.nextInt();

        //Calcular celsius para farhrenheit
        int TemperaturaFahrenheit = TemperaturaCelsius * 9/5 + 32;

        //Exibe o resultado
        System.out.println("A temperatura em fahrenheit é = " + TemperaturaFahrenheit);

         //Fecha scanner para não ter vazamento de recurso
         scanner.close();
    }
}