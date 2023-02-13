/*
* Ler dois números inteiros (a, b), armazenar e apresentar o resultado inteiro do quadrado da divisão de a por b
* */
package capitulo3;

import java.util.Scanner;

public class ExercicioZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        double quociente;
        System.out.println("Insira o numero inteiro A:");
        a = input.nextInt();
        System.out.println("Insira o numero inteiro B:");
        b = input.nextInt();

        quociente = ((double)a / b) * ((double)a / b);

        System.out.printf("(%d / %d)² = %f", a, b, quociente);

    }
}
