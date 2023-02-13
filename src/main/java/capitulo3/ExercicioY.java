/*
*   Construir um program que leia um valor numerico inteiro e apresente como resultado armazenado em memória
*   os seus valores sucessor e antecessor.
* */
package capitulo3;

import java.util.Scanner;

public class ExercicioY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Insira um numero inteiro:");
        num = input.nextInt();

        int antecessorNum = num - 1;
        int sucessorNum = num + 1;

        System.out.printf("Numero: %d. Seu antecessor: %d. Seu sucessor: %d\n", num, antecessorNum, sucessorNum);
    }
}
