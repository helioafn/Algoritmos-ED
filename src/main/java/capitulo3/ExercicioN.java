/*
*   Ler três valores inteiros do usuário, calcule o quadrado da soma dos trÊs números
* */
package capitulo3;
import java.util.Scanner;
public class ExercicioN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, resultado;

        System.out.println("Insira um valor inteiro para A:");
        a = input.nextInt();
        System.out.println("Insira um valor inteiro para B:");
        b = input.nextInt();
        System.out.println("Insira um valor inteiro para C:");
        c = input.nextInt();

        resultado = (a + b + c);
        resultado *= resultado;

        System.out.printf("(%d+%d+%d)²=%d\n",a, b, c, resultado);
    }
}
