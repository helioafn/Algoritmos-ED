/*
* Elabore um programa que calcule e armazene uma raiz de base qualquer com indice qualquer
* */
package capitulo3;

import java.util.Scanner;

public class ExercicioX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        double raizEnesima;
        System.out.println("Insira a base da raiz:");
        a = input.nextInt();
        System.out.println("Insira o indice da raiz:");
        b = input.nextInt();

        raizEnesima = Math.pow(a, (1.0/b));

        System.out.printf("%d^(1/%d): %f", a, b, raizEnesima);
    }
}
