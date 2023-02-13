/*
* Ler uma temperatura em graus Celsius e apresenta-lá convertida em graus Fahrenheit
* Fórmula da conversão Cº -> Fº: C * 9 / 5 + 32
* */
package capitulo3;
import java.util.Scanner;
public class ExercicioA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a temperatura em graus Celsius a ser convertida:");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9) / 5 + 32;

        System.out.printf("%.1fºC convertidos para Fahrenheit são %.1fºF\n", celsius, fahrenheit);
    }
}
