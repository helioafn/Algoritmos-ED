/*
*   Ler do usuario dois valores numericos inteiros a, b, que representam respectivamente a base e o expoente de uma potência,
*   armazenar o cálculo da potência em memória e exibir o resultado.
* */
package capitulo3;
import java.util.Scanner;

import static java.lang.Math.pow;

public class ExercicioV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, potencia;

        System.out.println("Insira o valor inteiro de A:");
        a = input.nextInt();
        System.out.println("Insira o valor inteiro de B:");
        b = input.nextInt();

        potencia = (int)pow(a, b);

        System.out.printf("%d^%d = %d", a, b, potencia);
    }
}
