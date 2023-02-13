/*
*   Ler três numeros inteiros e apresentar como resultado final a soma dos quadrados dos trÊs números
* */
package capitulo3;
import java.util.Scanner;
public class ExercicioM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, resultado;

        System.out.println("Insira um valor inteiro para A:");
        a = input.nextInt();
        System.out.println("Insira um valor inteiro para B:");
        b = input.nextInt();
        System.out.println("Insira um valor inteiro para C:");
        c = input.nextInt();

        resultado = (a * a) + (b * b) + (c * c);
        System.out.printf("%d²+%d²+%d² = %d", a, b, c, resultado);
    }
}
