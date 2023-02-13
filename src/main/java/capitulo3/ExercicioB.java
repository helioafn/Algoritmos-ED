/*
*  Ler uma temperatura em graus Fahrenheit e apresenta-lá em convertida em graus Celsius.
* Formula da conversão: ((F - 32) * 5) / 9
* */

package capitulo3;
import java.util.Scanner;
public class ExercicioB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a temperatura em Fahrenheit:");
        double fahrenheit = input.nextDouble();
        double celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.printf("%.1fºF convertidos para Celsius são: %.1fºC\n", fahrenheit, celsius);
    }
}
