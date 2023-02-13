/*
*   Ler dois números inteiros e apresentar o resultado armazenado em memória do quadrado da diferença do primeiro
*   valor em relação ao segundo valor: (a - b)² -> (a - b)(a - b) = a²-ab-ba+ b² = a²-2ab+b²
* */
package capitulo3;
import java.util.Scanner;
public class ExercicioJ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.println("Insira o valor de A:");
        a = input.nextInt();
        System.out.println("Insira o valor de B:");
        b = input.nextInt();

        int resultado = (a * a) - (2 * a * b) + (b * b);

        System.out.printf("(%d - %d)² = %d\n", a, b, resultado);
    }
}
